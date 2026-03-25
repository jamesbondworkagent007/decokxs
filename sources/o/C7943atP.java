package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import o.AbstractC7780aqL;

/* JADX INFO: renamed from: o.atP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7943atP extends AbstractC7941atN {
    public int KWHzl;
    public android.util.SparseIntArray copydefault;

    public final int EZpvd(int i) {
        return i & 1048575;
    }

    public final int EZpvd(int i, int i2) {
        return (i << 24) | i2;
    }

    public final int KWHzl(int i) {
        return (i >> 24) & 4095;
    }

    public C7943atP(AbstractC7780aqL abstractC7780aqL) {
        super(abstractC7780aqL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: android.view.View */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.AbstractC7941atN, o.InterfaceC7947atT
    public void OLrzqt(int i, int i2) {
        int measuredHeight;
        AbstractC7780aqL.Activity activity;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int measuredHeight2;
        int i12;
        int i13;
        int iMax;
        int i14;
        int i15;
        int i16;
        int i17;
        if (EZpvd()) {
            super.OLrzqt(i, i2);
            return;
        }
        int childCount = this.EZpvd.getChildCount();
        android.util.SparseIntArray sparseIntArray = this.copydefault;
        if (sparseIntArray == null) {
            this.copydefault = new android.util.SparseIntArray();
        } else {
            sparseIntArray.clear();
        }
        int paddingTop = this.EZpvd.getPaddingTop();
        int paddingBottom = this.EZpvd.getPaddingBottom();
        int paddingLeft = this.EZpvd.getPaddingLeft();
        int paddingRight = this.EZpvd.getPaddingRight();
        int i18 = 0;
        this.KWHzl = 0;
        int iResolveSizeAndState = android.view.View.resolveSizeAndState(0, i2, 0);
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i23 < childCount) {
            android.view.View viewEZpvd = this.EZpvd.EZpvd(i23);
            if (viewEZpvd != 0) {
                int i27 = i19;
                int i28 = i20;
                if (viewEZpvd.getVisibility() == 8) {
                    i5 = i23;
                    i7 = paddingBottom;
                    i8 = i26;
                    i9 = i27;
                    i4 = i28;
                    i11 = i22;
                    i6 = iResolveSizeAndState;
                    i10 = i21;
                } else {
                    AbstractC7780aqL.Activity activity2 = (AbstractC7780aqL.Activity) viewEZpvd.getLayoutParams();
                    int i29 = i26;
                    int i30 = i21;
                    int i31 = i22;
                    int i32 = i23;
                    int i33 = iResolveSizeAndState;
                    this.EZpvd.OLrzqt(viewEZpvd, i23, i, 0, i2, 0);
                    if ((viewEZpvd instanceof InterfaceC7784aqP) && ((InterfaceC7784aqP) viewEZpvd).AEQbTJ()) {
                        i12 = i29;
                        measuredHeight2 = 0;
                    } else {
                        measuredHeight2 = viewEZpvd.getMeasuredHeight();
                        i12 = i29;
                    }
                    int iMax2 = java.lang.Math.max(i12, measuredHeight2 + i12 + ((ViewGroup.MarginLayoutParams) activity2).topMargin + ((ViewGroup.MarginLayoutParams) activity2).bottomMargin);
                    int iMax3 = java.lang.Math.max(i31, ((ViewGroup.MarginLayoutParams) activity2).topMargin + measuredHeight2 + ((ViewGroup.MarginLayoutParams) activity2).bottomMargin);
                    int measuredWidth = ((ViewGroup.MarginLayoutParams) activity2).leftMargin + ((ViewGroup.MarginLayoutParams) activity2).rightMargin + viewEZpvd.getMeasuredWidth();
                    int iCombineMeasuredStates = android.view.View.combineMeasuredStates(i30, viewEZpvd.getMeasuredState());
                    int i34 = ((ViewGroup.MarginLayoutParams) activity2).topMargin;
                    int i35 = ((ViewGroup.MarginLayoutParams) activity2).bottomMargin;
                    i25 += i34 + i35;
                    int i36 = activity2.copydefault;
                    if (i36 <= 0 || ((ViewGroup.MarginLayoutParams) activity2).height >= 0) {
                        i25 += measuredHeight2;
                        i13 = i28;
                    } else {
                        i13 = i36 + i28;
                        i24++;
                    }
                    if (paddingTop + paddingBottom + iMax2 > i33) {
                        if (i18 < i32) {
                            i14 = i13;
                            i15 = i32 - 1;
                        } else {
                            i14 = i13;
                            i15 = i18;
                        }
                        if (i18 == i32) {
                            this.KWHzl += measuredWidth;
                            this.copydefault.put(EZpvd(i18, iMax2), EZpvd(i15, measuredWidth));
                            i17 = i18 + 1;
                            i6 = i33;
                            i7 = paddingBottom;
                            i16 = 0;
                            i19 = 0;
                        } else {
                            i6 = i33;
                            i7 = paddingBottom;
                            this.KWHzl += i27;
                            this.copydefault.put(EZpvd(i18, iMax2 - ((i34 + measuredHeight2) + i35)), EZpvd(i15, i27));
                            int i37 = measuredHeight2 + ((ViewGroup.MarginLayoutParams) activity2).topMargin + ((ViewGroup.MarginLayoutParams) activity2).bottomMargin;
                            if (i32 == childCount - 1) {
                                this.KWHzl += measuredWidth;
                                this.copydefault.put(EZpvd(i32, i37), EZpvd(i32, measuredWidth));
                            }
                            i16 = i37;
                            i19 = measuredWidth;
                            i17 = i32;
                        }
                        i18 = i17;
                        i21 = iCombineMeasuredStates;
                        i22 = iMax3;
                        i20 = i14;
                        i26 = i16;
                        i5 = i32;
                    } else {
                        int i38 = i13;
                        i6 = i33;
                        i7 = paddingBottom;
                        if (i32 == childCount - 1) {
                            this.KWHzl += i27;
                            iMax = java.lang.Math.max(i27, measuredWidth);
                            this.copydefault.put(EZpvd(i18, iMax2), EZpvd(i32, iMax));
                        } else {
                            iMax = java.lang.Math.max(i27, measuredWidth);
                        }
                        i19 = iMax;
                        i5 = i32;
                        i21 = iCombineMeasuredStates;
                        i22 = iMax3;
                        i26 = iMax2;
                        i20 = i38;
                    }
                    i23 = i5 + 1;
                    iResolveSizeAndState = i6;
                    paddingBottom = i7;
                }
            } else {
                i4 = i20;
                i5 = i23;
                i6 = iResolveSizeAndState;
                i7 = paddingBottom;
                i8 = i26;
                i9 = i19;
                i10 = i21;
                i11 = i22;
            }
            i26 = i8;
            i22 = i11;
            i21 = i10;
            i20 = i4;
            i19 = i9;
            i23 = i5 + 1;
            iResolveSizeAndState = i6;
            paddingBottom = i7;
        }
        int i39 = i20;
        int i40 = paddingBottom;
        int iMax4 = java.lang.Math.max(i22, this.EZpvd.getSuggestedMinimumWidth());
        int iMax5 = this.KWHzl;
        int i41 = paddingLeft + paddingRight;
        int i42 = iMax5 + i41;
        this.KWHzl = i42;
        this.KWHzl = java.lang.Math.max(i42, this.EZpvd.getSuggestedMinimumWidth());
        int iResolveSizeAndState2 = android.view.View.resolveSizeAndState(iMax4, i2, 0);
        this.EZpvd.setMeasuredDimensionX(android.view.View.resolveSizeAndState(this.KWHzl, i, i21), iResolveSizeAndState2);
        if (i24 <= 0 || (measuredHeight = ((this.EZpvd.getMeasuredHeight() - i25) - paddingTop) - i40) <= 0) {
            return;
        }
        float f = measuredHeight / i39;
        for (int i43 = 0; i43 < childCount; i43++) {
            android.view.View viewEZpvd2 = this.EZpvd.EZpvd(i43);
            if (viewEZpvd2 != 0 && viewEZpvd2.getVisibility() != 8 && (i3 = (activity = (AbstractC7780aqL.Activity) viewEZpvd2.getLayoutParams()).copydefault) > 0 && ((ViewGroup.MarginLayoutParams) activity).height < 0) {
                int iMax6 = java.lang.Math.max((int) (i3 * f), viewEZpvd2.getMinimumHeight());
                if (viewEZpvd2 instanceof InterfaceC7776aqH) {
                    iMax6 = java.lang.Math.min(iMax6, ((InterfaceC7776aqH) viewEZpvd2).getMaxHeight());
                }
                viewEZpvd2.measure(android.view.ViewGroup.getChildMeasureSpec(i, ((ViewGroup.MarginLayoutParams) activity).leftMargin + i41 + ((ViewGroup.MarginLayoutParams) activity).rightMargin, ((ViewGroup.MarginLayoutParams) activity).width), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                iMax5 = java.lang.Math.max(iMax5, viewEZpvd2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) activity).leftMargin + ((ViewGroup.MarginLayoutParams) activity).rightMargin);
            }
        }
        this.EZpvd.setMeasuredDimensionX(android.view.View.resolveSizeAndState(iMax5 + i41, i, 0), iResolveSizeAndState2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: android.view.View */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.AbstractC7941atN, o.InterfaceC7947atT
    public void AEQbTJ(int i, int i2) {
        int measuredWidth;
        AbstractC7780aqL.Activity activity;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int measuredWidth2;
        int i11;
        int i12;
        int iMax;
        int i13;
        int i14;
        int i15;
        if (EZpvd()) {
            super.AEQbTJ(i, i2);
            return;
        }
        int childCount = this.EZpvd.getChildCount();
        android.util.SparseIntArray sparseIntArray = this.copydefault;
        if (sparseIntArray == null) {
            this.copydefault = new android.util.SparseIntArray();
        } else {
            sparseIntArray.clear();
        }
        int paddingTop = this.EZpvd.getPaddingTop();
        int paddingBottom = this.EZpvd.getPaddingBottom();
        int paddingLeft = this.EZpvd.getPaddingLeft();
        int paddingRight = this.EZpvd.getPaddingRight();
        int i16 = 0;
        this.KWHzl = 0;
        int iResolveSizeAndState = android.view.View.resolveSizeAndState(0, i, 0);
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i21 < childCount) {
            android.view.View viewEZpvd = this.EZpvd.EZpvd(i21);
            if (viewEZpvd != 0) {
                int i25 = i17;
                int i26 = i18;
                if (viewEZpvd.getVisibility() == 8) {
                    i5 = i21;
                    i7 = paddingRight;
                    i8 = i25;
                    i4 = i26;
                    i10 = i20;
                    i6 = iResolveSizeAndState;
                    i9 = i19;
                } else {
                    AbstractC7780aqL.Activity activity2 = (AbstractC7780aqL.Activity) viewEZpvd.getLayoutParams();
                    int i27 = i24;
                    int i28 = i19;
                    int i29 = i20;
                    int i30 = i21;
                    int i31 = iResolveSizeAndState;
                    this.EZpvd.OLrzqt(viewEZpvd, i21, i, 0, i2, 0);
                    if ((viewEZpvd instanceof InterfaceC7784aqP) && ((InterfaceC7784aqP) viewEZpvd).KWHzl()) {
                        i11 = i25;
                        measuredWidth2 = 0;
                    } else {
                        measuredWidth2 = viewEZpvd.getMeasuredWidth();
                        i11 = i25;
                    }
                    int iMax2 = java.lang.Math.max(i11, measuredWidth2 + i11 + ((ViewGroup.MarginLayoutParams) activity2).leftMargin + ((ViewGroup.MarginLayoutParams) activity2).rightMargin);
                    int iMax3 = java.lang.Math.max(i29, ((ViewGroup.MarginLayoutParams) activity2).leftMargin + measuredWidth2 + ((ViewGroup.MarginLayoutParams) activity2).rightMargin);
                    int measuredHeight = ((ViewGroup.MarginLayoutParams) activity2).topMargin + ((ViewGroup.MarginLayoutParams) activity2).bottomMargin + viewEZpvd.getMeasuredHeight();
                    int iCombineMeasuredStates = android.view.View.combineMeasuredStates(i28, android.view.View.combineMeasuredStates(i28, viewEZpvd.getMeasuredState()));
                    int i32 = ((ViewGroup.MarginLayoutParams) activity2).leftMargin;
                    int i33 = ((ViewGroup.MarginLayoutParams) activity2).rightMargin;
                    i23 += i32 + i33;
                    int i34 = activity2.copydefault;
                    if (i34 <= 0 || ((ViewGroup.MarginLayoutParams) activity2).width >= 0) {
                        i23 += measuredWidth2;
                        i12 = i26;
                    } else {
                        i22++;
                        i12 = i34 + i26;
                    }
                    if (paddingLeft + paddingRight + iMax2 > i31) {
                        int i35 = i12;
                        if (i27 < i30) {
                            i6 = i31;
                            i13 = i30 - 1;
                        } else {
                            i6 = i31;
                            i13 = i27;
                        }
                        if (i27 == i30) {
                            this.KWHzl += measuredHeight;
                            this.copydefault.put(EZpvd(i27, iMax2), EZpvd(i13, measuredHeight));
                            i15 = i27 + 1;
                            i7 = paddingRight;
                            i14 = 0;
                            i17 = 0;
                        } else {
                            i7 = paddingRight;
                            this.KWHzl += i16;
                            this.copydefault.put(EZpvd(i27, iMax2 - ((i32 + measuredWidth2) + i33)), EZpvd(i13, i16));
                            i17 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) activity2).leftMargin + ((ViewGroup.MarginLayoutParams) activity2).rightMargin;
                            if (i30 == childCount - 1) {
                                this.KWHzl += measuredHeight;
                                this.copydefault.put(EZpvd(i30, i17), EZpvd(i30, measuredHeight));
                            }
                            i14 = measuredHeight;
                            i15 = i30;
                        }
                        i16 = i14;
                        i5 = i30;
                        i19 = iCombineMeasuredStates;
                        i20 = iMax3;
                        i18 = i35;
                        i24 = i15;
                    } else {
                        int i36 = i12;
                        i6 = i31;
                        i7 = paddingRight;
                        if (i30 == childCount - 1) {
                            this.KWHzl += i16;
                            iMax = java.lang.Math.max(i16, measuredHeight);
                            this.copydefault.put(EZpvd(i27, iMax2), EZpvd(i30, iMax));
                        } else {
                            iMax = java.lang.Math.max(i16, measuredHeight);
                        }
                        i16 = iMax;
                        i17 = iMax2;
                        i5 = i30;
                        i20 = iMax3;
                        i18 = i36;
                        i24 = i27;
                        i19 = iCombineMeasuredStates;
                    }
                    i21 = i5 + 1;
                    iResolveSizeAndState = i6;
                    paddingRight = i7;
                }
            } else {
                i4 = i18;
                i5 = i21;
                i6 = iResolveSizeAndState;
                i7 = paddingRight;
                i8 = i17;
                i9 = i19;
                i10 = i20;
            }
            i17 = i8;
            i24 = i24;
            i20 = i10;
            i19 = i9;
            i18 = i4;
            i21 = i5 + 1;
            iResolveSizeAndState = i6;
            paddingRight = i7;
        }
        int i37 = i18;
        int i38 = paddingRight;
        int iMax4 = java.lang.Math.max(i20, this.EZpvd.getSuggestedMinimumWidth());
        int iMax5 = this.KWHzl;
        int i39 = paddingTop + paddingBottom;
        int i40 = iMax5 + i39;
        this.KWHzl = i40;
        this.KWHzl = java.lang.Math.max(i40, this.EZpvd.getSuggestedMinimumHeight());
        int iResolveSizeAndState2 = android.view.View.resolveSizeAndState(iMax4, i, 0);
        this.EZpvd.setMeasuredDimensionX(iResolveSizeAndState2, android.view.View.resolveSizeAndState(this.KWHzl, i2, i19));
        if (i22 <= 0 || (measuredWidth = ((this.EZpvd.getMeasuredWidth() - i23) - paddingLeft) - i38) <= 0) {
            return;
        }
        float f = measuredWidth / i37;
        for (int i41 = 0; i41 < childCount; i41++) {
            android.view.View viewEZpvd2 = this.EZpvd.EZpvd(i41);
            if (viewEZpvd2 != 0 && viewEZpvd2.getVisibility() != 8 && (i3 = (activity = (AbstractC7780aqL.Activity) viewEZpvd2.getLayoutParams()).copydefault) > 0 && ((ViewGroup.MarginLayoutParams) activity).width < 0) {
                int iMax6 = java.lang.Math.max((int) (i3 * f), viewEZpvd2.getMinimumWidth());
                if (viewEZpvd2 instanceof InterfaceC7776aqH) {
                    iMax6 = java.lang.Math.min(iMax6, ((InterfaceC7776aqH) viewEZpvd2).getMaxWidth());
                }
                viewEZpvd2.measure(View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824), android.view.ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) activity).topMargin + i39 + ((ViewGroup.MarginLayoutParams) activity).bottomMargin, ((ViewGroup.MarginLayoutParams) activity).height));
                iMax5 = java.lang.Math.max(iMax5, viewEZpvd2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) activity).topMargin + ((ViewGroup.MarginLayoutParams) activity).bottomMargin);
            }
        }
        this.EZpvd.setMeasuredDimensionX(iResolveSizeAndState2, android.view.View.resolveSizeAndState(iMax5 + i39, i2, 0));
    }

    @Override // o.AbstractC7941atN, o.InterfaceC7947atT
    public void copydefault(int i, int i2, int i3, int i4) {
        int i5;
        if (EZpvd()) {
            super.copydefault(i, i2, i3, i4);
            return;
        }
        int paddingLeft = this.EZpvd.getPaddingLeft();
        int paddingRight = this.EZpvd.getPaddingRight();
        int i6 = i3 - i;
        float fEZpvd = paddingLeft;
        int i7 = (i6 - paddingLeft) - paddingRight;
        int iKWHzl = this.EZpvd.KWHzl();
        if (iKWHzl != 2) {
            i5 = 3;
            if (iKWHzl == 3) {
                i5 = 5;
            }
        } else {
            i5 = 1;
        }
        if (this.KWHzl < i7) {
            int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i5, ViewCompat.getLayoutDirection(this.EZpvd)) & 7;
            if (absoluteGravity == 1) {
                fEZpvd += (i7 - this.KWHzl) / 2.0f;
            } else if (absoluteGravity == 5) {
                fEZpvd = (i6 - paddingRight) - this.KWHzl;
            }
        }
        for (int i8 = 0; i8 < this.copydefault.size(); i8++) {
            AEQbTJ(i2, fEZpvd, i4, this.copydefault.keyAt(i8), this.copydefault.valueAt(i8));
            fEZpvd += EZpvd(r6);
        }
        this.copydefault.clear();
    }

    @Override // o.AbstractC7941atN, o.InterfaceC7947atT
    public void OLrzqt(int i, int i2, int i3, int i4) {
        if (EZpvd()) {
            super.OLrzqt(i, i2, i3, i4);
            return;
        }
        int paddingBottom = this.EZpvd.getPaddingBottom();
        int paddingTop = this.EZpvd.getPaddingTop();
        float f = paddingTop;
        int i5 = i4 - i2;
        int i6 = (i5 - paddingTop) - paddingBottom;
        int iKWHzl = this.EZpvd.KWHzl();
        char c = iKWHzl != 2 ? iKWHzl != 3 ? '0' : 'P' : (char) 16;
        int i7 = this.KWHzl;
        if (i7 < i6) {
            int i8 = c & 'p';
            if (i8 == 16) {
                f += (i6 - i7) / 2.0f;
            } else if (i8 == 80) {
                f = (i5 - paddingBottom) - i7;
            }
        }
        float fEZpvd = f;
        for (int i9 = 0; i9 < this.copydefault.size(); i9++) {
            OLrzqt(i, fEZpvd, i3, this.copydefault.keyAt(i9), this.copydefault.valueAt(i9));
            fEZpvd += EZpvd(r6);
        }
        this.copydefault.clear();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(int i, float f, int i2, int i3, int i4) {
        float f2;
        boolean z;
        int i5;
        int i6;
        int measuredHeight;
        android.view.View childAt;
        float f3;
        int i7;
        int i8;
        int iKWHzl = KWHzl(i3);
        int iKWHzl2 = KWHzl(i4);
        int iEZpvd = EZpvd(i3);
        int iEZpvd2 = EZpvd(i4);
        int paddingTop = this.EZpvd.getPaddingTop();
        int iValueOf = this.EZpvd.valueOf();
        int i9 = 1;
        if (iValueOf == 2) {
            f2 = (((i2 - i) - iEZpvd) / 2.0f) + paddingTop;
        } else if (iValueOf == 3) {
            f2 = ((paddingTop + i2) - i) - iEZpvd;
        } else {
            if (iValueOf == 4 || iValueOf == 5 || iValueOf == 6) {
                f2 = paddingTop;
                z = true;
                int childCount = this.EZpvd.getChildCount();
                i5 = 0;
                i6 = iKWHzl;
                int i10 = paddingTop;
                while (i6 <= iKWHzl2 && iKWHzl2 < childCount) {
                    childAt = this.EZpvd.getChildAt(i6);
                    if (!(childAt instanceof InterfaceC7784aqP) && ((InterfaceC7784aqP) childAt).AEQbTJ() && EZpvd()) {
                        i5++;
                    } else {
                        if (childAt == 0 && childAt.getVisibility() != 8) {
                            int measuredWidth = childAt.getMeasuredWidth();
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i11 = iEZpvd2 - measuredWidth;
                            AbstractC7780aqL.Activity activity = (AbstractC7780aqL.Activity) childAt.getLayoutParams();
                            int i12 = activity.KWHzl;
                            if (i12 < 0) {
                                i12 = 8388659;
                            }
                            int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i12, ViewCompat.getLayoutDirection(this.EZpvd)) & 7;
                            if (absoluteGravity != i9) {
                                if (absoluteGravity == 5) {
                                    i8 = i11 - ((ViewGroup.MarginLayoutParams) activity).rightMargin;
                                } else {
                                    i8 = ((ViewGroup.MarginLayoutParams) activity).leftMargin;
                                }
                                f3 = i8;
                            } else {
                                f3 = ((i11 / 2.0f) + ((ViewGroup.MarginLayoutParams) activity).leftMargin) - ((ViewGroup.MarginLayoutParams) activity).rightMargin;
                            }
                            float f4 = ((ViewGroup.MarginLayoutParams) activity).topMargin + f2;
                            i7 = i6;
                            OLrzqt(childAt, java.lang.Math.round(f3 + f), (int) java.lang.Math.ceil(f4), measuredWidth, measuredHeight2);
                            i10 += ((ViewGroup.MarginLayoutParams) activity).topMargin + measuredHeight2 + ((ViewGroup.MarginLayoutParams) activity).bottomMargin;
                            f2 = f4 + measuredHeight2 + r0;
                        }
                        i6 = i7 + 1;
                        i9 = 1;
                    }
                    i6 = i7 + 1;
                    i9 = 1;
                }
                if (!(z && i5 == 0) && iKWHzl2 > 0 && (measuredHeight = this.EZpvd.getMeasuredHeight() - i10) > 0) {
                    float f5 = paddingTop;
                    if (i5 <= 0) {
                        copydefault(f5, measuredHeight, i5, iKWHzl, iKWHzl2 + 1);
                        return;
                    } else {
                        OLrzqt(f5, measuredHeight, iKWHzl, iKWHzl2 + 1);
                        return;
                    }
                }
                return;
            }
            f2 = paddingTop;
        }
        z = false;
        int childCount2 = this.EZpvd.getChildCount();
        i5 = 0;
        i6 = iKWHzl;
        int i102 = paddingTop;
        while (i6 <= iKWHzl2) {
            childAt = this.EZpvd.getChildAt(i6);
            if (!(childAt instanceof InterfaceC7784aqP)) {
                i7 = childAt == 0 ? i6 : i6;
            }
            i6 = i7 + 1;
            i9 = 1;
        }
        if (z) {
        }
        float f52 = paddingTop;
        if (i5 <= 0) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(int i, float f, int i2, int i3, int i4) {
        float f2;
        boolean z;
        int i5;
        int i6;
        int measuredWidth;
        android.view.View childAt;
        float f3;
        int i7;
        int i8;
        int iKWHzl = KWHzl(i3);
        int iKWHzl2 = KWHzl(i4);
        int iEZpvd = EZpvd(i3);
        int iEZpvd2 = EZpvd(i4);
        int paddingLeft = this.EZpvd.getPaddingLeft();
        int iValueOf = this.EZpvd.valueOf();
        float f4 = 2.0f;
        if (iValueOf == 2) {
            f2 = (((i2 - i) - iEZpvd) / 2.0f) + paddingLeft;
        } else if (iValueOf == 3) {
            f2 = ((paddingLeft + i2) - i) - iEZpvd;
        } else {
            if (iValueOf == 4 || iValueOf == 5 || iValueOf == 6) {
                f2 = paddingLeft;
                z = true;
                int childCount = this.EZpvd.getChildCount();
                i5 = 0;
                i6 = iKWHzl;
                int i9 = paddingLeft;
                while (i6 <= iKWHzl2 && iKWHzl2 < childCount) {
                    childAt = this.EZpvd.getChildAt(i6);
                    if (!(childAt instanceof InterfaceC7784aqP) && ((InterfaceC7784aqP) childAt).KWHzl() && EZpvd()) {
                        i5++;
                    } else {
                        if (childAt == 0 && childAt.getVisibility() != 8) {
                            int measuredWidth2 = childAt.getMeasuredWidth();
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i10 = iEZpvd2 - measuredHeight;
                            AbstractC7780aqL.Activity activity = (AbstractC7780aqL.Activity) childAt.getLayoutParams();
                            int i11 = activity.KWHzl;
                            if (i11 < 0) {
                                i11 = 8388659;
                            }
                            int i12 = i11 & WalletImportError.ERROR_CODE_AA_EXIST;
                            if (i12 != 16) {
                                if (i12 == 48) {
                                    i8 = ((ViewGroup.MarginLayoutParams) activity).topMargin;
                                } else if (i12 != 80) {
                                    f3 = 0.0f;
                                } else {
                                    i8 = i10 - ((ViewGroup.MarginLayoutParams) activity).bottomMargin;
                                }
                                f3 = i8;
                            } else {
                                f3 = ((i10 / f4) + ((ViewGroup.MarginLayoutParams) activity).topMargin) - ((ViewGroup.MarginLayoutParams) activity).bottomMargin;
                            }
                            float f5 = f2 + ((ViewGroup.MarginLayoutParams) activity).leftMargin;
                            i7 = i6;
                            OLrzqt(childAt, (int) java.lang.Math.ceil(f5), java.lang.Math.round(f3 + f), measuredWidth2, measuredHeight);
                            i9 += ((ViewGroup.MarginLayoutParams) activity).leftMargin + measuredWidth2 + ((ViewGroup.MarginLayoutParams) activity).rightMargin;
                            f2 = f5 + measuredWidth2 + r0;
                        }
                        i6 = i7 + 1;
                        f4 = 2.0f;
                    }
                    i6 = i7 + 1;
                    f4 = 2.0f;
                }
                if (!(z && i5 == 0) && iKWHzl2 > 0 && (measuredWidth = this.EZpvd.getMeasuredWidth() - i9) > 0) {
                    float f6 = paddingLeft;
                    if (i5 <= 0) {
                        KWHzl(f6, measuredWidth, i5, iKWHzl, iKWHzl2 + 1);
                        return;
                    } else {
                        copydefault(f6, measuredWidth, iKWHzl, iKWHzl2 + 1);
                        return;
                    }
                }
                return;
            }
            f2 = paddingLeft;
        }
        z = false;
        int childCount2 = this.EZpvd.getChildCount();
        i5 = 0;
        i6 = iKWHzl;
        int i92 = paddingLeft;
        while (i6 <= iKWHzl2) {
            childAt = this.EZpvd.getChildAt(i6);
            if (!(childAt instanceof InterfaceC7784aqP)) {
                i7 = childAt == 0 ? i6 : i6;
            }
            i6 = i7 + 1;
            f4 = 2.0f;
        }
        if (z) {
        }
        float f62 = paddingLeft;
        if (i5 <= 0) {
        }
    }
}
