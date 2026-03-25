package com.beloo.widget.chipslayoutmanager.gravity;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes21.dex */
public class ColumnGravityModifiersFactory implements IGravityModifiersFactory {
    private SparseArray<IGravityModifier> gravityModifierMap = new SparseArray<>();

    public ColumnGravityModifiersFactory() {
        CenterInColumnGravityModifier centerInColumnGravityModifier = new CenterInColumnGravityModifier();
        this.gravityModifierMap.put(17, centerInColumnGravityModifier);
        this.gravityModifierMap.put(1, centerInColumnGravityModifier);
        this.gravityModifierMap.put(3, new LeftGravityModifier());
        this.gravityModifierMap.put(5, new RightGravityModifier());
    }

    @Override // com.beloo.widget.chipslayoutmanager.gravity.IGravityModifiersFactory
    public IGravityModifier getGravityModifier(int i) {
        IGravityModifier iGravityModifier = this.gravityModifierMap.get(i);
        return iGravityModifier == null ? this.gravityModifierMap.get(1) : iGravityModifier;
    }
}
