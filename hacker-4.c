#include <stdio.h>
#include <stdlib.h>
#define MAX_HEIGHT 41

struct box
{
	int length,width,height;
};

typedef struct box box;

int get_volume(struct box box) {
	return box.length*box.width*box.height;
}

int is_lower_than_max_height(struct box box  ) {
	if(box.height<MAX_HEIGHT)
    return 1;
    else {
    return 0;
    }

}

int main()
{
	int n;
	scanf("%d", &n);
	box *boxes =(box*) malloc(n * sizeof(box));
	for (int i = 0; i < n; i++) {
		scanf("%d%d%d", &boxes[i].length, &boxes[i].width, &boxes[i].height);
	}
	for (int i = 0; i < n; i++) {
		if (is_lower_than_max_height(boxes[i])) {
			printf("%d\n", get_volume(boxes[i]));
		}
	}
	return 0;
}