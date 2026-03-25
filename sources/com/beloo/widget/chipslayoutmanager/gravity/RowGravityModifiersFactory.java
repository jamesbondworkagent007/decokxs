package com.beloo.widget.chipslayoutmanager.gravity;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes21.dex */
public class RowGravityModifiersFactory implements IGravityModifiersFactory {
    private SparseArray<IGravityModifier> gravityModifierMap = new SparseArray<>();

    public RowGravityModifiersFactory() {
        CenterInRowGravityModifier centerInRowGravityModifier = new CenterInRowGravityModifier();
        TopGravityModifier topGravityModifier = new TopGravityModifier();
        BottomGravityModifier bottomGravityModifier = new BottomGravityModifier();
        this.gravityModifierMap.put(48, topGravityModifier);
        this.gravityModifierMap.put(80, bottomGravityModifier);
        this.gravityModifierMap.put(17, centerInRowGravityModifier);
        this.gravityModifierMap.put(16, centerInRowGravityModifier);
    }

    @Override // com.beloo.widget.chipslayoutmanager.gravity.IGravityModifiersFactory
    public IGravityModifier getGravityModifier(int i) {
        IGravityModifier iGravityModifier = this.gravityModifierMap.get(i);
        return iGravityModifier == null ? this.gravityModifierMap.get(16) : iGravityModifier;
    }
}
