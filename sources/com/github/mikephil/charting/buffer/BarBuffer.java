package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

/* JADX INFO: loaded from: classes2.dex */
public class BarBuffer extends AbstractBuffer<IBarDataSet> {
    protected float mBarWidth;
    protected boolean mContainsStacks;
    protected int mDataSetCount;
    protected int mDataSetIndex;
    protected boolean mInverted;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBarWidth(float f) {
        this.mBarWidth = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDataSet(int i) {
        this.mDataSetIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setInverted(boolean z) {
        this.mInverted = z;
    }

    public BarBuffer(int i, int i2, boolean z) {
        super(i);
        this.mDataSetIndex = 0;
        this.mInverted = false;
        this.mBarWidth = 1.0f;
        this.mDataSetCount = i2;
        this.mContainsStacks = z;
    }

    public void addBar(float f, float f2, float f3, float f4) {
        float[] fArr = this.buffer;
        int i = this.index;
        fArr[i] = f;
        fArr[i + 1] = f2;
        fArr[i + 2] = f3;
        this.index = i + 4;
        fArr[i + 3] = f4;
    }

    /* JADX DEBUG: Method merged with bridge method: feed(Ljava/lang/Object;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.buffer.AbstractBuffer
    public void feed(IBarDataSet iBarDataSet) {
        float f;
        float f2;
        float fAbs;
        float fAbs2;
        float f3;
        float entryCount = iBarDataSet.getEntryCount();
        float f4 = this.phaseX;
        float f5 = this.mBarWidth / 2.0f;
        for (int i = 0; i < entryCount * f4; i++) {
            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i);
            if (barEntry != null) {
                float x = barEntry.getX();
                float y = barEntry.getY();
                float[] yVals = barEntry.getYVals();
                float f6 = 0.0f;
                if (!this.mContainsStacks || yVals == null) {
                    if (this.mInverted) {
                        f = 0.0f;
                        f2 = y >= 0.0f ? y : 0.0f;
                        if (y > 0.0f) {
                            y = 0.0f;
                        }
                    } else {
                        f = 0.0f;
                        float f7 = y >= 0.0f ? y : 0.0f;
                        if (y > 0.0f) {
                            y = 0.0f;
                        }
                        float f8 = y;
                        y = f7;
                        f2 = f8;
                    }
                    if (y > f) {
                        y *= this.phaseY;
                    } else {
                        f2 *= this.phaseY;
                    }
                    addBar(x - f5, y, x + f5, f2);
                } else {
                    float f9 = -barEntry.getNegativeSum();
                    float f10 = 0.0f;
                    int i2 = 0;
                    while (i2 < yVals.length) {
                        float f11 = yVals[i2];
                        if (f11 == f6 && (f10 == f6 || f9 == f6)) {
                            fAbs = f11;
                            fAbs2 = f9;
                            f9 = fAbs;
                        } else if (f11 >= f6) {
                            fAbs = f11 + f10;
                            fAbs2 = f9;
                            f9 = f10;
                            f10 = fAbs;
                        } else {
                            fAbs = Math.abs(f11) + f9;
                            fAbs2 = Math.abs(f11) + f9;
                        }
                        if (this.mInverted) {
                            f3 = f9 >= fAbs ? f9 : fAbs;
                            if (f9 > fAbs) {
                                f9 = fAbs;
                            }
                        } else {
                            float f12 = f9 >= fAbs ? f9 : fAbs;
                            if (f9 > fAbs) {
                                f9 = fAbs;
                            }
                            float f13 = f12;
                            f3 = f9;
                            f9 = f13;
                        }
                        float f14 = this.phaseY;
                        addBar(x - f5, f9 * f14, x + f5, f3 * f14);
                        i2++;
                        f9 = fAbs2;
                        f6 = 0.0f;
                    }
                }
            }
        }
        reset();
    }
}
