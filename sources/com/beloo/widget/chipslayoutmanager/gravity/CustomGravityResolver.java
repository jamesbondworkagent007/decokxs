package com.beloo.widget.chipslayoutmanager.gravity;

/* JADX INFO: loaded from: classes21.dex */
public class CustomGravityResolver implements IChildGravityResolver {
    private int gravity;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.gravity.IChildGravityResolver
    public int getItemGravity(int i) {
        return this.gravity;
    }

    public CustomGravityResolver(int i) {
        this.gravity = i;
    }
}
