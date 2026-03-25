package org.spongycastle.math.field;

/* JADX INFO: loaded from: classes25.dex */
public interface ExtensionField extends FiniteField {
    int getDegree();

    FiniteField getSubfield();
}
