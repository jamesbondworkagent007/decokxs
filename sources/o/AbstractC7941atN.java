package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import o.AbstractC7780aqL;

/* JADX INFO: renamed from: o.atN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7941atN implements InterfaceC7947atT {
    public final AbstractC7780aqL EZpvd;
    public int OLrzqt;

    public AbstractC7941atN(AbstractC7780aqL abstractC7780aqL) {
        this.EZpvd = abstractC7780aqL;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: android.view.View */
    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: android.view.View */
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
    @Override // o.InterfaceC7947atT
    public void OLrzqt(int i, int i2) {
        int measuredHeight;
        AbstractC7780aqL.Activity activity;
        int i3;
        int i4;
        int i5;
        this.OLrzqt = 0;
        View.MeasureSpec.getMode(i);
        int paddingTop = this.EZpvd.getPaddingTop();
        int paddingBottom = this.EZpvd.getPaddingBottom();
        int paddingLeft = this.EZpvd.getPaddingLeft();
        int paddingRight = this.EZpvd.getPaddingRight();
        int childCount = this.EZpvd.getChildCount();
        int i6 = 0;
        int iCombineMeasuredStates = 0;
        int iMax = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < childCount) {
            android.view.View viewEZpvd = this.EZpvd.EZpvd(i7);
            if (viewEZpvd == 0 || viewEZpvd.getVisibility() == 8 || ((viewEZpvd instanceof InterfaceC7784aqP) && ((InterfaceC7784aqP) viewEZpvd).AEQbTJ())) {
                i4 = childCount;
                i5 = i6;
                iCombineMeasuredStates = iCombineMeasuredStates;
                iMax = iMax;
            } else {
                AbstractC7780aqL.Activity activity2 = (AbstractC7780aqL.Activity) viewEZpvd.getLayoutParams();
                i4 = childCount;
                i5 = i6;
                this.EZpvd.OLrzqt(viewEZpvd, i7, i, 0, i2, this.OLrzqt);
                int measuredHeight2 = viewEZpvd.getMeasuredHeight();
                int i10 = this.OLrzqt;
                this.OLrzqt = java.lang.Math.max(i10, measuredHeight2 + i10 + ((ViewGroup.MarginLayoutParams) activity2).topMargin + ((ViewGroup.MarginLayoutParams) activity2).bottomMargin);
                iMax = java.lang.Math.max(iMax, viewEZpvd.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) activity2).leftMargin + ((ViewGroup.MarginLayoutParams) activity2).rightMargin);
                iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, viewEZpvd.getMeasuredState());
                i9 += ((ViewGroup.MarginLayoutParams) activity2).topMargin + ((ViewGroup.MarginLayoutParams) activity2).bottomMargin;
                int i11 = activity2.copydefault;
                if (i11 <= 0 || ((ViewGroup.MarginLayoutParams) activity2).height >= 0) {
                    i9 += measuredHeight2;
                } else {
                    i6 = i5 + i11;
                    i8++;
                    i7++;
                    childCount = i4;
                }
            }
            i6 = i5;
            i7++;
            childCount = i4;
        }
        int i12 = iMax;
        int i13 = childCount;
        int i14 = i6;
        int i15 = this.OLrzqt + paddingTop + paddingBottom;
        this.OLrzqt = i15;
        this.OLrzqt = java.lang.Math.max(i15, this.EZpvd.getSuggestedMinimumHeight());
        int i16 = paddingLeft + paddingRight;
        int iMax2 = java.lang.Math.max(i12 + i16, this.EZpvd.getSuggestedMinimumWidth());
        int iResolveSizeAndState = android.view.View.resolveSizeAndState(this.OLrzqt, i2, 0);
        int iMax3 = i12;
        this.EZpvd.setMeasuredDimensionX(android.view.View.resolveSizeAndState(iMax2, i, iCombineMeasuredStates), iResolveSizeAndState);
        if (i8 <= 0 || (measuredHeight = ((this.EZpvd.getMeasuredHeight() - i9) - paddingTop) - paddingBottom) <= 0) {
            return;
        }
        float f = measuredHeight / i14;
        for (int i17 = 0; i17 < i13; i17++) {
            android.view.View viewEZpvd2 = this.EZpvd.EZpvd(i17);
            if (viewEZpvd2 != 0 && viewEZpvd2.getVisibility() != 8 && (i3 = (activity = (AbstractC7780aqL.Activity) viewEZpvd2.getLayoutParams()).copydefault) > 0 && ((ViewGroup.MarginLayoutParams) activity).height < 0) {
                int iMax4 = java.lang.Math.max((int) (i3 * f), viewEZpvd2.getMinimumHeight());
                if (viewEZpvd2 instanceof InterfaceC7776aqH) {
                    iMax4 = java.lang.Math.min(iMax4, ((InterfaceC7776aqH) viewEZpvd2).getMaxHeight());
                }
                viewEZpvd2.measure(android.view.ViewGroup.getChildMeasureSpec(i, ((ViewGroup.MarginLayoutParams) activity).leftMargin + i16 + ((ViewGroup.MarginLayoutParams) activity).rightMargin, ((ViewGroup.MarginLayoutParams) activity).width), View.MeasureSpec.makeMeasureSpec(iMax4, 1073741824));
                iMax3 = java.lang.Math.max(iMax3, viewEZpvd2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) activity).leftMargin + ((ViewGroup.MarginLayoutParams) activity).rightMargin);
            }
        }
        this.EZpvd.setMeasuredDimensionX(android.view.View.resolveSizeAndState(iMax3 + i16, i, 0), iResolveSizeAndState);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: android.view.View */
    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: android.view.View */
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
    @Override // o.InterfaceC7947atT
    public void AEQbTJ(int i, int i2) {
        int measuredWidth;
        AbstractC7780aqL.Activity activity;
        int i3;
        int i4;
        this.OLrzqt = 0;
        View.MeasureSpec.getMode(i2);
        int paddingTop = this.EZpvd.getPaddingTop();
        int paddingBottom = this.EZpvd.getPaddingBottom();
        int paddingLeft = this.EZpvd.getPaddingLeft();
        int paddingRight = this.EZpvd.getPaddingRight();
        int childCount = this.EZpvd.getChildCount();
        int i5 = 0;
        int iCombineMeasuredStates = 0;
        int iMax = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < childCount) {
            android.view.View viewEZpvd = this.EZpvd.EZpvd(i6);
            if (viewEZpvd == 0 || viewEZpvd.getVisibility() == 8 || ((viewEZpvd instanceof InterfaceC7784aqP) && ((InterfaceC7784aqP) viewEZpvd).KWHzl())) {
                i4 = childCount;
                iMax = iMax;
                i5 = i5;
                iCombineMeasuredStates = iCombineMeasuredStates;
            } else {
                AbstractC7780aqL.Activity activity2 = (AbstractC7780aqL.Activity) viewEZpvd.getLayoutParams();
                int i9 = i5;
                i4 = childCount;
                this.EZpvd.OLrzqt(viewEZpvd, i6, i, this.OLrzqt, i2, 0);
                int measuredWidth2 = viewEZpvd.getMeasuredWidth();
                int i10 = this.OLrzqt;
                this.OLrzqt = java.lang.Math.max(i10, measuredWidth2 + i10 + ((ViewGroup.MarginLayoutParams) activity2).leftMargin + ((ViewGroup.MarginLayoutParams) activity2).rightMargin);
                iMax = java.lang.Math.max(iMax, viewEZpvd.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) activity2).topMargin + ((ViewGroup.MarginLayoutParams) activity2).bottomMargin);
                iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, viewEZpvd.getMeasuredState());
                i8 += ((ViewGroup.MarginLayoutParams) activity2).leftMargin + ((ViewGroup.MarginLayoutParams) activity2).rightMargin;
                int i11 = activity2.copydefault;
                if (i11 <= 0 || ((ViewGroup.MarginLayoutParams) activity2).width >= 0) {
                    i8 += measuredWidth2;
                    i5 = i9;
                } else {
                    i5 = i9 + i11;
                    i7++;
                }
            }
            i6++;
            childCount = i4;
        }
        int i12 = i5;
        int i13 = iMax;
        int i14 = childCount;
        int i15 = this.OLrzqt + paddingLeft + paddingRight;
        this.OLrzqt = i15;
        this.OLrzqt = java.lang.Math.max(i15, this.EZpvd.getSuggestedMinimumWidth());
        int i16 = paddingTop + paddingBottom;
        int iMax2 = java.lang.Math.max(i13 + i16, this.EZpvd.getSuggestedMinimumHeight());
        int iResolveSizeAndState = android.view.View.resolveSizeAndState(this.OLrzqt, i, 0);
        int iMax3 = i13;
        this.EZpvd.setMeasuredDimensionX(iResolveSizeAndState, android.view.View.resolveSizeAndState(iMax2, i2, iCombineMeasuredStates));
        if (i7 <= 0 || (measuredWidth = ((this.EZpvd.getMeasuredWidth() - i8) - paddingLeft) - paddingRight) <= 0) {
            return;
        }
        float f = measuredWidth / i12;
        for (int i17 = 0; i17 < i14; i17++) {
            android.view.View viewEZpvd2 = this.EZpvd.EZpvd(i17);
            if (viewEZpvd2 != 0 && viewEZpvd2.getVisibility() != 8 && (i3 = (activity = (AbstractC7780aqL.Activity) viewEZpvd2.getLayoutParams()).copydefault) > 0 && ((ViewGroup.MarginLayoutParams) activity).width < 0) {
                int iMax4 = java.lang.Math.max((int) (i3 * f), viewEZpvd2.getMinimumWidth());
                if (viewEZpvd2 instanceof InterfaceC7776aqH) {
                    iMax4 = java.lang.Math.min(iMax4, ((InterfaceC7776aqH) viewEZpvd2).getMaxWidth());
                }
                viewEZpvd2.measure(View.MeasureSpec.makeMeasureSpec(iMax4, 1073741824), android.view.ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) activity).topMargin + i16 + ((ViewGroup.MarginLayoutParams) activity).bottomMargin, ((ViewGroup.MarginLayoutParams) activity).height));
                iMax3 = java.lang.Math.max(iMax3, viewEZpvd2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) activity).topMargin + ((ViewGroup.MarginLayoutParams) activity).bottomMargin);
            }
        }
        this.EZpvd.setMeasuredDimensionX(iResolveSizeAndState, android.view.View.resolveSizeAndState(iMax3 + i16, i2, 0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0178  */
    @Override // o.InterfaceC7947atT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(int i, int i2, int i3, int i4) {
        float f;
        boolean z;
        int iKWHzl;
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        int i8;
        int i9;
        int i10;
        char c;
        float f2;
        int i11;
        int i12;
        int i13;
        int i14;
        int paddingLeft = this.EZpvd.getPaddingLeft();
        int paddingTop = this.EZpvd.getPaddingTop();
        int paddingBottom = this.EZpvd.getPaddingBottom();
        int paddingRight = this.EZpvd.getPaddingRight();
        int i15 = i3 - i;
        int i16 = i15 - paddingRight;
        int i17 = (i15 - paddingLeft) - paddingRight;
        int childCount = this.EZpvd.getChildCount();
        int iValueOf = this.EZpvd.valueOf();
        char c2 = 0;
        if (iValueOf == 2) {
            f = paddingTop + (((i4 - i2) - this.OLrzqt) / 2.0f);
        } else if (iValueOf == 3) {
            f = ((paddingTop + i4) - i2) - this.OLrzqt;
        } else {
            if (iValueOf == 4 || iValueOf == 5 || iValueOf == 6) {
                f = paddingTop;
                z = true;
                iKWHzl = this.EZpvd.KWHzl();
                if (iKWHzl == 2) {
                    i5 = iKWHzl != 3 ? 8388611 : 8388613;
                } else {
                    i5 = 1;
                }
                int i18 = paddingTop;
                i6 = 0;
                i7 = 0;
                while (i6 < childCount) {
                    android.view.View childAt = this.EZpvd.getChildAt(i6);
                    if ((childAt instanceof InterfaceC7784aqP) && ((InterfaceC7784aqP) childAt).AEQbTJ()) {
                        i7++;
                    } else {
                        if (childAt != 0) {
                            if (childAt.getVisibility() != 8) {
                                int measuredWidth = childAt.getMeasuredWidth();
                                int measuredHeight2 = childAt.getMeasuredHeight();
                                AbstractC7780aqL.Activity activity = (AbstractC7780aqL.Activity) childAt.getLayoutParams();
                                int i19 = activity.KWHzl;
                                if (i19 < 0) {
                                    i19 = i5;
                                }
                                int layoutDirection = ViewCompat.getLayoutDirection(this.EZpvd);
                                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i19, layoutDirection) & 7;
                                i10 = paddingTop;
                                if (absoluteGravity != 1) {
                                    if (absoluteGravity != 3) {
                                        if (absoluteGravity == 5) {
                                            i13 = i16 - measuredWidth;
                                            i14 = ((ViewGroup.MarginLayoutParams) activity).rightMargin;
                                        } else {
                                            int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(i5, layoutDirection) & 7;
                                            if (absoluteGravity2 == 1) {
                                                f2 = ((paddingLeft + ((i17 - measuredWidth) / 2.0f)) + ((ViewGroup.MarginLayoutParams) activity).leftMargin) - ((ViewGroup.MarginLayoutParams) activity).rightMargin;
                                                c = 0;
                                            } else if (absoluteGravity2 == 5) {
                                                i13 = i16 - measuredWidth;
                                                i14 = ((ViewGroup.MarginLayoutParams) activity).rightMargin;
                                            } else {
                                                i11 = ((ViewGroup.MarginLayoutParams) activity).leftMargin;
                                            }
                                        }
                                        i12 = i13 - i14;
                                        f2 = i12;
                                        c = 0;
                                    } else {
                                        i11 = ((ViewGroup.MarginLayoutParams) activity).leftMargin;
                                    }
                                    i12 = i11 + paddingLeft;
                                    f2 = i12;
                                    c = 0;
                                } else {
                                    c = 0;
                                    f2 = ((paddingLeft + ((i17 - measuredWidth) / 2.0f)) + ((ViewGroup.MarginLayoutParams) activity).leftMargin) - ((ViewGroup.MarginLayoutParams) activity).rightMargin;
                                }
                                float f3 = ((ViewGroup.MarginLayoutParams) activity).topMargin + f;
                                i8 = i6;
                                i9 = i5;
                                OLrzqt(childAt, (int) java.lang.Math.ceil(f2), (int) java.lang.Math.ceil(f3), measuredWidth, measuredHeight2);
                                i18 += ((ViewGroup.MarginLayoutParams) activity).topMargin + measuredHeight2 + ((ViewGroup.MarginLayoutParams) activity).bottomMargin;
                                f = f3 + measuredHeight2 + r0;
                            } else {
                                i8 = i6;
                                i9 = i5;
                                i10 = paddingTop;
                                c = 0;
                            }
                        }
                        i6 = i8 + 1;
                        c2 = c;
                        paddingTop = i10;
                        i5 = i9;
                    }
                    i9 = i5;
                    i10 = paddingTop;
                    c = c2;
                    i8 = i6;
                    i6 = i8 + 1;
                    c2 = c;
                    paddingTop = i10;
                    i5 = i9;
                }
                int i20 = paddingTop;
                if (!(z && i7 == 0) && childCount > 0 && (measuredHeight = (this.EZpvd.getMeasuredHeight() - i18) - paddingBottom) > 0) {
                    float f4 = i20;
                    if (i7 <= 0) {
                        copydefault(f4, measuredHeight, i7, 0, childCount);
                        return;
                    } else {
                        OLrzqt(f4, measuredHeight, 0, childCount);
                        return;
                    }
                }
                return;
            }
            f = paddingTop;
        }
        z = false;
        iKWHzl = this.EZpvd.KWHzl();
        if (iKWHzl == 2) {
        }
        int i182 = paddingTop;
        i6 = 0;
        i7 = 0;
        while (i6 < childCount) {
        }
        int i202 = paddingTop;
        if (z) {
        }
        float f42 = i202;
        if (i7 <= 0) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public void copydefault(float f, float f2, int i, int i2, int i3) {
        float f3 = f2 / i;
        while (i2 < i3) {
            android.view.View childAt = this.EZpvd.getChildAt(i2);
            if (childAt != 0 && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                float measuredHeight = childAt.getMeasuredHeight();
                AbstractC7780aqL.Activity activity = (AbstractC7780aqL.Activity) childAt.getLayoutParams();
                float f4 = f + ((ViewGroup.MarginLayoutParams) activity).topMargin;
                if ((childAt instanceof InterfaceC7784aqP) && ((InterfaceC7784aqP) childAt).AEQbTJ() && EZpvd()) {
                    measuredHeight = f3;
                }
                OLrzqt(childAt, childAt.getLeft(), (int) java.lang.Math.ceil(f4), measuredWidth, (int) java.lang.Math.ceil(measuredHeight));
                f = f4 + measuredHeight + ((ViewGroup.MarginLayoutParams) activity).bottomMargin;
            }
            i2++;
        }
    }

    public void OLrzqt(float f, float f2, int i, int i2) {
        float f3;
        float f4;
        float f5;
        float f6;
        AbstractC7941atN abstractC7941atN = this;
        int i3 = i2 - i;
        int iValueOf = abstractC7941atN.EZpvd.valueOf();
        float f7 = 0.0f;
        if (iValueOf != 4) {
            if (iValueOf != 5) {
                if (iValueOf == 6) {
                    f7 = f2 / (i3 + 1);
                }
                f3 = f7;
                f4 = f3;
            } else {
                if (i3 > 1) {
                    f7 = f2 / i3;
                    f6 = f7 / 2.0f;
                } else {
                    f6 = f2 / 2.0f;
                }
                f4 = f6;
                f3 = f7;
            }
        } else if (i3 > 1) {
            f3 = f2 / (i3 - 1);
            f4 = 0.0f;
        } else {
            f3 = f7;
            f4 = f3;
        }
        int childCount = abstractC7941atN.EZpvd.getChildCount();
        float f8 = f;
        int i4 = i;
        while (i4 < i2 && i2 <= childCount) {
            android.view.View childAt = abstractC7941atN.EZpvd.getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                AbstractC7780aqL.Activity activity = (AbstractC7780aqL.Activity) childAt.getLayoutParams();
                if (i4 == i) {
                    f5 = ((ViewGroup.MarginLayoutParams) activity).topMargin + f4;
                } else {
                    f5 = ((ViewGroup.MarginLayoutParams) activity).topMargin + f3;
                }
                float f9 = f8 + f5;
                OLrzqt(childAt, childAt.getLeft(), (int) java.lang.Math.ceil(f9), measuredWidth, measuredHeight);
                f8 = f9 + measuredHeight + ((ViewGroup.MarginLayoutParams) activity).bottomMargin;
            }
            i4++;
            abstractC7941atN = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024b  */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r34v0, types: [o.atN] */
    @Override // o.InterfaceC7947atT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(int i, int i2, int i3, int i4) {
        android.view.View view;
        AbstractC7780aqL.Activity activity;
        int i5;
        float f;
        boolean z;
        int childCount;
        int i6;
        int i7;
        int i8;
        float f2;
        android.view.View view2;
        int i9;
        float f3;
        int i10;
        float f4;
        ?? r27;
        float f5;
        int i11;
        int i12;
        boolean zAhwBna = this.EZpvd.AhwBna();
        if (zAhwBna) {
            android.view.View viewAEQbTJ = this.EZpvd.AEQbTJ();
            int measuredWidth = viewAEQbTJ != null ? viewAEQbTJ.getMeasuredWidth() : 0;
            activity = viewAEQbTJ != null ? (AbstractC7780aqL.Activity) viewAEQbTJ.getLayoutParams() : null;
            view = viewAEQbTJ;
            i5 = measuredWidth;
        } else {
            view = null;
            activity = null;
            i5 = 0;
        }
        int measuredWidth2 = this.EZpvd.getMeasuredWidth();
        int paddingBottom = this.EZpvd.getPaddingBottom();
        int paddingTop = this.EZpvd.getPaddingTop();
        int paddingLeft = this.EZpvd.getPaddingLeft();
        int paddingRight = this.EZpvd.getPaddingRight();
        int i13 = i4 - i2;
        int i14 = i13 - paddingBottom;
        int i15 = (i13 - paddingTop) - paddingBottom;
        int iValueOf = this.EZpvd.valueOf();
        if (iValueOf == 2) {
            f = paddingLeft + (((i3 - i) - this.OLrzqt) / 2.0f);
        } else if (iValueOf == 3) {
            f = ((paddingLeft + i3) - i) - this.OLrzqt;
        } else {
            if (iValueOf == 4 || iValueOf == 5 || iValueOf == 6) {
                f = paddingLeft;
                z = true;
                int iKWHzl = this.EZpvd.KWHzl();
                int i16 = iKWHzl == 2 ? iKWHzl != 3 ? 48 : 80 : 16;
                childCount = this.EZpvd.getChildCount();
                float f6 = f;
                float f7 = 0.0f;
                int i17 = paddingLeft;
                i6 = 0;
                int i18 = 0;
                boolean z2 = false;
                while (i6 < childCount) {
                    ?? childAt = this.EZpvd.getChildAt(i6);
                    if ((childAt instanceof InterfaceC7784aqP) && ((InterfaceC7784aqP) childAt).KWHzl()) {
                        i18++;
                        i8 = i6;
                        view2 = view;
                        i9 = childCount;
                    } else {
                        if (childAt == 0 || childAt.getVisibility() == 8) {
                            i8 = i6;
                            f2 = f7;
                            view2 = view;
                            i9 = childCount;
                        } else {
                            int measuredWidth3 = childAt.getMeasuredWidth();
                            int measuredHeight = childAt.getMeasuredHeight();
                            AbstractC7780aqL.Activity activity2 = (AbstractC7780aqL.Activity) childAt.getLayoutParams();
                            int i19 = activity2.KWHzl;
                            if (i19 < 0) {
                                i19 = i16;
                            }
                            int i20 = i19 & WalletImportError.ERROR_CODE_AA_EXIST;
                            float f8 = f7;
                            if (i20 != 16) {
                                if (i20 == 48) {
                                    i11 = ((ViewGroup.MarginLayoutParams) activity2).topMargin;
                                } else if (i20 != 80) {
                                    int i21 = i16 & WalletImportError.ERROR_CODE_AA_EXIST;
                                    if (i21 == 16) {
                                        f3 = paddingTop + ((i15 - measuredHeight) / 2.0f) + ((ViewGroup.MarginLayoutParams) activity2).topMargin;
                                        i10 = ((ViewGroup.MarginLayoutParams) activity2).bottomMargin;
                                    } else if (i21 == 48) {
                                        i11 = ((ViewGroup.MarginLayoutParams) activity2).topMargin;
                                    } else {
                                        f4 = i21 != 80 ? paddingTop : (i14 - measuredHeight) - ((ViewGroup.MarginLayoutParams) activity2).bottomMargin;
                                        if (zAhwBna || view == null) {
                                            f2 = f8;
                                            r27 = childAt;
                                            i8 = i6;
                                        } else if (childAt == view && i6 < childCount - 1) {
                                            OLrzqt(childAt, 0, 0, 0, 0);
                                            f7 = f4;
                                            view2 = view;
                                            i9 = childCount;
                                            i8 = i6;
                                        } else {
                                            ?? r272 = childAt;
                                            int i22 = i6;
                                            int i23 = childCount;
                                            if (z2 || (EZpvd() && i17 + ((ViewGroup.MarginLayoutParams) activity2).leftMargin + measuredWidth3 + ((ViewGroup.MarginLayoutParams) activity2).rightMargin > measuredWidth2 - ((((ViewGroup.MarginLayoutParams) activity).leftMargin + i5) + ((ViewGroup.MarginLayoutParams) activity).rightMargin))) {
                                                if (i22 == i23 - 1) {
                                                    float f9 = f6 + ((ViewGroup.MarginLayoutParams) activity).leftMargin;
                                                    f5 = f8;
                                                    i8 = i22;
                                                    OLrzqt(view, (int) java.lang.Math.ceil(f9), (int) java.lang.Math.ceil(f8), i5, view.getMeasuredHeight());
                                                    f6 = f9 + i5 + r0;
                                                    i17 += ((ViewGroup.MarginLayoutParams) activity).leftMargin + i5 + ((ViewGroup.MarginLayoutParams) activity).rightMargin;
                                                } else {
                                                    f5 = f8;
                                                    i8 = i22;
                                                    OLrzqt(r272, 0, 0, 0, 0);
                                                }
                                                view2 = view;
                                                z2 = true;
                                                f7 = f5;
                                                i9 = i23;
                                            } else {
                                                childCount = i23;
                                                i8 = i22;
                                                f2 = f8;
                                                r27 = r272;
                                            }
                                        }
                                        float f10 = f6 + ((ViewGroup.MarginLayoutParams) activity2).leftMargin;
                                        view2 = view;
                                        i9 = childCount;
                                        OLrzqt(r27, (int) java.lang.Math.ceil(f10), (int) java.lang.Math.ceil(f4), measuredWidth3, measuredHeight);
                                        i17 += ((ViewGroup.MarginLayoutParams) activity2).leftMargin + measuredWidth3 + ((ViewGroup.MarginLayoutParams) activity2).rightMargin;
                                        f6 = f10 + measuredWidth3 + r0;
                                    }
                                } else {
                                    i12 = (i14 - measuredHeight) - ((ViewGroup.MarginLayoutParams) activity2).bottomMargin;
                                    f4 = i12;
                                    if (zAhwBna) {
                                        f2 = f8;
                                        r27 = childAt;
                                        i8 = i6;
                                        float f102 = f6 + ((ViewGroup.MarginLayoutParams) activity2).leftMargin;
                                        view2 = view;
                                        i9 = childCount;
                                        OLrzqt(r27, (int) java.lang.Math.ceil(f102), (int) java.lang.Math.ceil(f4), measuredWidth3, measuredHeight);
                                        i17 += ((ViewGroup.MarginLayoutParams) activity2).leftMargin + measuredWidth3 + ((ViewGroup.MarginLayoutParams) activity2).rightMargin;
                                        f6 = f102 + measuredWidth3 + r0;
                                    }
                                }
                                i12 = i11 + paddingTop;
                                f4 = i12;
                                if (zAhwBna) {
                                }
                            } else {
                                f3 = paddingTop + ((i15 - measuredHeight) / 2.0f) + ((ViewGroup.MarginLayoutParams) activity2).topMargin;
                                i10 = ((ViewGroup.MarginLayoutParams) activity2).bottomMargin;
                            }
                            f4 = f3 - i10;
                            if (zAhwBna) {
                            }
                        }
                        f7 = f2;
                    }
                    i6 = i8 + 1;
                    childCount = i9;
                    view = view2;
                }
                int i24 = childCount;
                if (zAhwBna) {
                    if ((z || i18 != 0) && i24 > 0 && (i7 = (measuredWidth2 - i17) - paddingRight) > 0) {
                        float f11 = paddingLeft;
                        if (i18 > 0) {
                            KWHzl(f11, i7, i18, 0, i24);
                            return;
                        } else {
                            copydefault(f11, i7, 0, i24);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            f = paddingLeft;
        }
        z = false;
        int iKWHzl2 = this.EZpvd.KWHzl();
        if (iKWHzl2 == 2) {
        }
        childCount = this.EZpvd.getChildCount();
        float f62 = f;
        float f72 = 0.0f;
        int i172 = paddingLeft;
        i6 = 0;
        int i182 = 0;
        boolean z22 = false;
        while (i6 < childCount) {
        }
        int i242 = childCount;
        if (zAhwBna) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public void KWHzl(float f, float f2, int i, int i2, int i3) {
        float f3 = f2 / i;
        while (i2 < i3) {
            android.view.View childAt = this.EZpvd.getChildAt(i2);
            if (childAt != 0 && childAt.getVisibility() != 8) {
                float measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                AbstractC7780aqL.Activity activity = (AbstractC7780aqL.Activity) childAt.getLayoutParams();
                float f4 = f + ((ViewGroup.MarginLayoutParams) activity).leftMargin;
                if ((childAt instanceof InterfaceC7784aqP) && ((InterfaceC7784aqP) childAt).KWHzl() && EZpvd()) {
                    measuredWidth = f3;
                }
                OLrzqt(childAt, (int) java.lang.Math.ceil(f4), childAt.getTop(), (int) java.lang.Math.ceil(measuredWidth), measuredHeight);
                f = f4 + measuredWidth + ((ViewGroup.MarginLayoutParams) activity).rightMargin;
            }
            i2++;
        }
    }

    public void copydefault(float f, float f2, int i, int i2) {
        float f3;
        float f4;
        float f5;
        float f6;
        int i3 = i2 - i;
        int iValueOf = this.EZpvd.valueOf();
        float f7 = 0.0f;
        if (iValueOf != 4) {
            if (iValueOf != 5) {
                if (iValueOf == 6) {
                    f7 = f2 / (i3 + 1);
                }
                f3 = f7;
                f4 = f3;
            } else {
                if (i3 > 1) {
                    f7 = f2 / i3;
                    f6 = f7 / 2.0f;
                } else {
                    f6 = f2 / 2.0f;
                }
                f4 = f6;
                f3 = f7;
            }
        } else if (i3 > 1) {
            f3 = f2 / (i3 - 1);
            f4 = 0.0f;
        } else {
            f3 = f7;
            f4 = f3;
        }
        int childCount = this.EZpvd.getChildCount();
        float f8 = f;
        for (int i4 = i; i4 < i2 && i2 <= childCount; i4++) {
            android.view.View childAt = this.EZpvd.getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                AbstractC7780aqL.Activity activity = (AbstractC7780aqL.Activity) childAt.getLayoutParams();
                if (i4 == i) {
                    f5 = ((ViewGroup.MarginLayoutParams) activity).leftMargin + f4;
                } else {
                    f5 = ((ViewGroup.MarginLayoutParams) activity).leftMargin + f3;
                }
                float f9 = f8 + f5;
                OLrzqt(childAt, (int) java.lang.Math.ceil(f9), childAt.getTop(), measuredWidth, measuredHeight);
                f8 = f9 + measuredWidth + ((ViewGroup.MarginLayoutParams) activity).rightMargin;
            }
        }
    }

    public boolean EZpvd() {
        return this.EZpvd.AYXKKw() == 0;
    }

    public void OLrzqt(android.view.View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }
}
