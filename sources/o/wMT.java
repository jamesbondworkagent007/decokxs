package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wMT {
    public static final wMT OLrzqt = new wMT();

    private wMT() {
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull android.view.ViewGroup viewGroup, java.util.List<TacticsInsideItemData> list, TacticsData tacticsData, Function0<Unit> function0, Function1<? super Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function1, Function1<? super Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function12, boolean z) {
        java.lang.Object objM7377constructorimpl;
        int i;
        int i2;
        LinearLayoutCompat linearLayoutCompat;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        try {
            Result.Application application = Result.Companion;
            OLrzqt.EZpvd(viewGroup);
            if (list == null) {
                return;
            }
            android.view.View childAt = viewGroup.getChildAt(0);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            childAt.setVisibility(z ? 0 : 8);
            int childCount = viewGroup.getChildCount();
            int i3 = 0;
            for (int i4 = !z ? 1 : 0; i4 < childCount && i3 < list.size(); i4++) {
                android.view.View childAt2 = viewGroup.getChildAt(i4);
                LinearLayoutCompat linearLayoutCompat2 = childAt2 instanceof LinearLayoutCompat ? (LinearLayoutCompat) childAt2 : null;
                if (linearLayoutCompat2 != null) {
                    int childCount2 = linearLayoutCompat2.getChildCount();
                    int i5 = i3;
                    int i6 = 0;
                    while (i6 < childCount2) {
                        android.view.View childAt3 = linearLayoutCompat2.getChildAt(i6);
                        android.widget.LinearLayout linearLayout = childAt3 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt3 : null;
                        if (linearLayout == null) {
                            i = i6;
                            i2 = childCount2;
                            linearLayoutCompat = linearLayoutCompat2;
                        } else {
                            if (i5 >= list.size()) {
                                break;
                            }
                            i = i6;
                            i2 = childCount2;
                            linearLayoutCompat = linearLayoutCompat2;
                            OLrzqt.copydefault(context, list.get(i5), linearLayout, tacticsData, function12, function1, function0);
                            i5++;
                        }
                        i6 = i + 1;
                        childCount2 = i2;
                        linearLayoutCompat2 = linearLayoutCompat;
                    }
                    i3 = i5;
                }
            }
            OLrzqt.copydefault(z, list.size(), viewGroup);
            viewGroup.setOnClickListener(null);
            viewGroup.setOnClickListener(new Activity(viewGroup, 1000L, function0));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("BotListFieldDataBinder", "error: " + thM7380exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View, java.lang.Object, o.xhi] */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.view.View, android.widget.TextView, androidx.appcompat.widget.AppCompatTextView, o.xhi] */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.view.View, o.wYD] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.widget.TextView, androidx.appcompat.widget.AppCompatTextView] */
    /* JADX WARN: Type inference failed for: r5v7, types: [o.xhi] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View] */
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
    public final void copydefault(android.content.Context context, TacticsInsideItemData tacticsInsideItemData, android.widget.LinearLayout linearLayout, TacticsData tacticsData, Function1<? super Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function1, Function1<? super Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function12, final Function0<Unit> function0) {
        boolean z;
        ?? r5;
        ?? r52;
        ?? r3;
        java.lang.Object objM7377constructorimpl;
        ?? r53;
        android.view.View viewFindViewById = linearLayout.findViewById(C48033uCm.Application.vqBjd);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        C55320xhi c55320xhi = (C55320xhi) viewFindViewById;
        android.view.View viewFindViewById2 = linearLayout.findViewById(C48033uCm.Application.zHQtTQ);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        ?? r14 = (C55320xhi) viewFindViewById2;
        android.view.View viewFindViewById3 = linearLayout.findViewById(C48033uCm.Application.abAflu);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        ?? r15 = (wYD) viewFindViewById3;
        ?? r13 = C48427uRL.OLrzqt(linearLayout).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(r13, "");
        c55320xhi.setOnClickListener(null);
        r14.setOnClickListener(null);
        r13.setOnClickListener(null);
        r15.setOnClickListener(null);
        linearLayout.setOnClickListener(null);
        TacticsUiConst.BotListSubItemType subItemType = tacticsInsideItemData.getSubItemType();
        if ((subItemType instanceof TacticsUiConst.BotListSubItemType.BotSubTip) || (subItemType instanceof TacticsUiConst.BotListSubItemType.BotSubPosition)) {
            c55320xhi.setShowUnderline(true);
            z = true;
            c55320xhi.setOnClickListener(new Application(c55320xhi, 1000L, function1, tacticsInsideItemData, tacticsData));
            r5 = 0;
        } else {
            c55320xhi.setShowUnderline(false);
            c55320xhi.setOnClickListener(null);
            r5 = 0;
            z = true;
        }
        r14.setShowUnderline(r5);
        r13.setShowUnderline(r5);
        r15.setVisibility(8);
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tacticsInsideItemData.getIvDrawableType()) || tacticsData == null) {
            ?? r54 = r13;
            r14.setOnClickListener(new View.OnClickListener() { // from class: o.wMW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wMT.AEQbTJ(function0, view);
                }
            });
            r54.setOnClickListener(new View.OnClickListener() { // from class: o.wMS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wMT.EZpvd(function0, view);
                }
            });
            r52 = r54;
        } else {
            int iCopydefault = copydefault(tacticsInsideItemData.getIvDrawableType());
            if (iCopydefault == -1) {
                ?? r55 = r13;
                r14.setShowUnderline(z);
                r55.setShowUnderline(z);
                r53 = r55;
            } else if (iCopydefault != 0) {
                r15.setVisibility(r5);
                r15.setIconDrawableRes(copydefault(tacticsInsideItemData.getIvDrawableType()));
                r15.OLrzqt().setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
                r53 = r13;
                r15.setOnClickListener(new StateListAnimator(r15, 1000L, function12, tacticsInsideItemData, tacticsData));
            } else {
                r53 = r13;
            }
            r14.setOnClickListener(new ActionBar(r14, 1000L, function12, tacticsInsideItemData, tacticsData));
            r53.setOnClickListener(new TaskDescription(r53, 1000L, function12, tacticsInsideItemData, tacticsData));
            r52 = r53;
        }
        if (function0 != null) {
            linearLayout.setOnClickListener(new FragmentManager(linearLayout, 1000L, function0));
        }
        if (tacticsInsideItemData.getTextStyle() != 0) {
            r3 = z;
            r14.setTextAppearance(context, tacticsInsideItemData.getTextStyle());
            r52.setTextAppearance(context, tacticsInsideItemData.getTextStyle());
        } else {
            r3 = z;
        }
        if (tacticsInsideItemData.getTvColorSecond() != 0 && tacticsInsideItemData.getTvSplitIndex() != -1) {
            try {
                Result.Application application = Result.Companion;
                android.text.SpannableString spannableString = new android.text.SpannableString(tacticsInsideItemData.getText());
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(tacticsInsideItemData.getTvColor()), 0, tacticsInsideItemData.getTvSplitIndex(), 33);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(tacticsInsideItemData.getTvColorSecond()), tacticsInsideItemData.getTvSplitIndex() + r3, tacticsInsideItemData.getText().length(), 33);
                r14.setText(spannableString);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                r14.setText(tacticsInsideItemData.getText());
                C55307xhV.AEQbTJ(r52, tacticsInsideItemData.getNextLineText());
                int tvColor = tacticsInsideItemData.getTvColor() != 0 ? tacticsInsideItemData.getTvColor() : C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn);
                r14.setTextColor(tvColor);
                r52.setTextColor(tvColor);
            }
            Result.m7376boximpl(objM7377constructorimpl);
        } else {
            r14.setText(tacticsInsideItemData.getText());
            C55307xhV.AEQbTJ(r52, tacticsInsideItemData.getNextLineText());
            int tvColor2 = tacticsInsideItemData.getTvColor() != 0 ? tacticsInsideItemData.getTvColor() : C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn);
            r14.setTextColor(tvColor2);
            r52.setTextColor(tvColor2);
        }
        c55320xhi.setText(tacticsInsideItemData.getTitle());
        c55320xhi.setMaxLines(5);
        c55320xhi.setEllipsize(TextUtils.TruncateAt.END);
    }

    public static final void AEQbTJ(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void EZpvd(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ Function1 AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ TacticsInsideItemData KWHzl;
        public final /* synthetic */ TacticsData OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function1 function1, TacticsInsideItemData tacticsInsideItemData, TacticsData tacticsData) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = function1;
            this.KWHzl = tacticsInsideItemData;
            this.OLrzqt = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function1 function1 = this.AEQbTJ;
                if (function1 != null) {
                    function1.invoke(new Triple(this.KWHzl.getIvDrawableType(), this.OLrzqt, this.KWHzl));
                }
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function0 OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ TacticsInsideItemData EZpvd;
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ TacticsData OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function1 function1, TacticsInsideItemData tacticsInsideItemData, TacticsData tacticsData) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = function1;
            this.EZpvd = tacticsInsideItemData;
            this.OLrzqt = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.KWHzl;
                if (function1 != null) {
                    function1.invoke(new Triple(this.EZpvd.getSubItemType(), this.OLrzqt, this.EZpvd));
                }
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.invoke();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ TacticsInsideItemData OLrzqt;
        public final /* synthetic */ TacticsData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function1 function1, TacticsInsideItemData tacticsInsideItemData, TacticsData tacticsData) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = function1;
            this.OLrzqt = tacticsInsideItemData;
            this.copydefault = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function1 function1 = this.KWHzl;
                if (function1 != null) {
                    function1.invoke(new Triple(this.OLrzqt.getIvDrawableType(), this.copydefault, this.OLrzqt));
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ TacticsInsideItemData AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ TacticsData KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function1 function1, TacticsInsideItemData tacticsInsideItemData, TacticsData tacticsData) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = function1;
            this.AEQbTJ = tacticsInsideItemData;
            this.KWHzl = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function1 function1 = this.copydefault;
                if (function1 != null) {
                    function1.invoke(new Triple(this.AEQbTJ.getIvDrawableType(), this.KWHzl, this.AEQbTJ));
                }
            }
        }
    }

    public final void copydefault(boolean z, int i, android.view.ViewGroup viewGroup) {
        kotlin.Pair pairOLrzqt;
        C55320xhi c55320xhi;
        C55320xhi c55320xhi2;
        C55320xhi c55320xhi3;
        C55320xhi c55320xhi4;
        C55320xhi c55320xhi5;
        C55320xhi c55320xhi6;
        if (z) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf((i / 3) + 1), java.lang.Integer.valueOf((i - 2) % 3));
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(((i + 2) / 3) + 1), java.lang.Integer.valueOf(i % 3));
        }
        int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
        int iIntValue2 = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        if (!(viewGroup instanceof android.view.ViewGroup)) {
            viewGroup = null;
        }
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = iIntValue; i2 < childCount; i2++) {
                android.view.View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    childAt.setVisibility(8);
                }
            }
            int i3 = iIntValue - 1;
            android.view.View childAt2 = viewGroup.getChildAt(i3);
            LinearLayoutCompat linearLayoutCompat = childAt2 instanceof LinearLayoutCompat ? (LinearLayoutCompat) childAt2 : null;
            android.view.View childAt3 = linearLayoutCompat != null ? linearLayoutCompat.getChildAt(1) : null;
            android.view.View childAt4 = viewGroup.getChildAt(i3);
            LinearLayoutCompat linearLayoutCompat2 = childAt4 instanceof LinearLayoutCompat ? (LinearLayoutCompat) childAt4 : null;
            android.view.View childAt5 = linearLayoutCompat2 != null ? linearLayoutCompat2.getChildAt(2) : null;
            if (iIntValue2 != 1) {
                if (iIntValue2 != 2) {
                    return;
                }
                if (childAt5 != null) {
                    childAt5.setVisibility(4);
                }
                if (childAt5 != null && (c55320xhi6 = (C55320xhi) childAt5.findViewById(C48033uCm.Application.vqBjd)) != null) {
                    c55320xhi6.setText("");
                }
                if (childAt5 == null || (c55320xhi5 = (C55320xhi) childAt5.findViewById(C48033uCm.Application.zHQtTQ)) == null) {
                    return;
                }
                c55320xhi5.setText("");
                return;
            }
            if (childAt3 != null) {
                childAt3.setVisibility(4);
            }
            if (childAt3 != null && (c55320xhi4 = (C55320xhi) childAt3.findViewById(C48033uCm.Application.vqBjd)) != null) {
                c55320xhi4.setText("");
            }
            if (childAt3 != null && (c55320xhi3 = (C55320xhi) childAt3.findViewById(C48033uCm.Application.zHQtTQ)) != null) {
                c55320xhi3.setText("");
            }
            if (childAt5 != null) {
                childAt5.setVisibility(4);
            }
            if (childAt5 != null && (c55320xhi2 = (C55320xhi) childAt5.findViewById(C48033uCm.Application.vqBjd)) != null) {
                c55320xhi2.setText("");
            }
            if (childAt5 == null || (c55320xhi = (C55320xhi) childAt5.findViewById(C48033uCm.Application.zHQtTQ)) == null) {
                return;
            }
            c55320xhi.setText("");
        }
    }

    public final void EZpvd(android.view.ViewGroup viewGroup) {
        android.view.View viewFindViewById = viewGroup.findViewById(C48033uCm.Application.requestPostMessageChannelWithExtras);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewFindViewById;
        android.view.View viewFindViewById2 = viewGroup.findViewById(C48033uCm.Application.updateVisuals);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) viewFindViewById2;
        linearLayout.setGravity(8388611);
        C55320xhi c55320xhi = (C55320xhi) linearLayout.findViewById(C48033uCm.Application.vqBjd);
        if (c55320xhi != null) {
            c55320xhi.setTextAlignment(5);
        }
        C55320xhi c55320xhi2 = (C55320xhi) linearLayout.findViewById(C48033uCm.Application.zHQtTQ);
        if (c55320xhi2 != null) {
            c55320xhi2.setTextAlignment(5);
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(C55298xhM.dp2px$default(6.0f, null, 1, null));
            marginLayoutParams.setMarginStart(0);
        } else {
            marginLayoutParams = null;
        }
        linearLayout.setLayoutParams(marginLayoutParams);
        linearLayout.setVisibility(0);
        int i = 8388613;
        linearLayout2.setGravity(8388613);
        C55320xhi c55320xhi3 = (C55320xhi) linearLayout2.findViewById(C48033uCm.Application.vqBjd);
        if (c55320xhi3 != null) {
            c55320xhi3.setTextAlignment(6);
        }
        C55320xhi c55320xhi4 = (C55320xhi) linearLayout2.findViewById(C48033uCm.Application.zHQtTQ);
        if (c55320xhi4 != null) {
            c55320xhi4.setTextAlignment(6);
        }
        ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.setMarginStart(C55298xhM.dp2px$default(6.0f, null, 1, null));
            marginLayoutParams2.setMarginEnd(0);
        } else {
            marginLayoutParams2 = null;
        }
        linearLayout2.setLayoutParams(marginLayoutParams2);
        linearLayout2.setVisibility(0);
        int childCount = viewGroup.getChildCount();
        int i2 = 1;
        while (i2 < childCount) {
            android.view.View childAt = viewGroup.getChildAt(i2);
            LinearLayoutCompat linearLayoutCompat = childAt instanceof LinearLayoutCompat ? (LinearLayoutCompat) childAt : null;
            if (linearLayoutCompat != null) {
                linearLayoutCompat.setVisibility(0);
                int childCount2 = linearLayoutCompat.getChildCount();
                int i3 = 0;
                while (i3 < childCount2) {
                    android.view.View childAt2 = linearLayoutCompat.getChildAt(i3);
                    android.widget.LinearLayout linearLayout3 = childAt2 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt2 : null;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(0);
                        if (i3 == 0) {
                            linearLayout3.setGravity(8388611);
                            C55320xhi c55320xhi5 = (C55320xhi) linearLayout3.findViewById(C48033uCm.Application.vqBjd);
                            if (c55320xhi5 != null) {
                                c55320xhi5.setTextAlignment(5);
                            }
                            C55320xhi c55320xhi6 = (C55320xhi) linearLayout3.findViewById(C48033uCm.Application.zHQtTQ);
                            if (c55320xhi6 != null) {
                                c55320xhi6.setTextAlignment(5);
                            }
                            ViewGroup.LayoutParams layoutParams3 = linearLayout3.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                            if (marginLayoutParams3 != null) {
                                marginLayoutParams3.setMarginEnd(C55298xhM.dp2px$default(4.0f, null, 1, null));
                                marginLayoutParams3.setMarginStart(0);
                            } else {
                                marginLayoutParams3 = null;
                            }
                            linearLayout3.setLayoutParams(marginLayoutParams3);
                        } else if (i3 == 1) {
                            linearLayout3.setGravity(8388611);
                            C55320xhi c55320xhi7 = (C55320xhi) linearLayout3.findViewById(C48033uCm.Application.vqBjd);
                            if (c55320xhi7 != null) {
                                c55320xhi7.setTextAlignment(5);
                            }
                            C55320xhi c55320xhi8 = (C55320xhi) linearLayout3.findViewById(C48033uCm.Application.zHQtTQ);
                            if (c55320xhi8 != null) {
                                c55320xhi8.setTextAlignment(5);
                            }
                            ViewGroup.LayoutParams layoutParams4 = linearLayout3.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                            if (marginLayoutParams4 != null) {
                                marginLayoutParams4.setMarginEnd(C55298xhM.dp2px$default(4.0f, null, 1, null));
                                marginLayoutParams4.setMarginStart(C55298xhM.dp2px$default(4.0f, null, 1, null));
                            } else {
                                marginLayoutParams4 = null;
                            }
                            linearLayout3.setLayoutParams(marginLayoutParams4);
                        } else {
                            linearLayout3.setGravity(i);
                            C55320xhi c55320xhi9 = (C55320xhi) linearLayout3.findViewById(C48033uCm.Application.vqBjd);
                            if (c55320xhi9 != null) {
                                c55320xhi9.setTextAlignment(6);
                            }
                            C55320xhi c55320xhi10 = (C55320xhi) linearLayout3.findViewById(C48033uCm.Application.zHQtTQ);
                            if (c55320xhi10 != null) {
                                c55320xhi10.setTextAlignment(6);
                            }
                            ViewGroup.LayoutParams layoutParams5 = linearLayout3.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                            if (marginLayoutParams5 != null) {
                                marginLayoutParams5.setMarginEnd(0);
                                marginLayoutParams5.setMarginStart(C55298xhM.dp2px$default(4.0f, null, 1, null));
                            } else {
                                marginLayoutParams5 = null;
                            }
                            linearLayout3.setLayoutParams(marginLayoutParams5);
                        }
                    }
                    i3++;
                    i = 8388613;
                }
            }
            i2++;
            i = 8388613;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r2.equals("arbitrage_auto_earn") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2.equals("WithdrawProfitIcon") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r2.equals("arbitrage_pnl_more") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        if (r2.equals("loan_interest_order") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return o.C52761wXj.TaskDescription.warmup;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return o.C52761wXj.TaskDescription.apHBvG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r2.equals("arbitrage_rewards_more") == false) goto L47;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int copydefault(java.lang.String str) {
        switch (str.hashCode()) {
            case -2015371680:
                if (str.equals("last_price")) {
                    return C52761wXj.TaskDescription.OFhtUX;
                }
            case -1967119875:
                return !str.equals("coin_current_value") ? 0 : -1;
            case -1632678308:
                if (str.equals("grid_out_of_range_warning")) {
                    return C52761wXj.TaskDescription.Dfv;
                }
            case -1036831448:
                break;
            case 223653149:
                if (!str.equals("coin_current_position")) {
                }
                break;
            case 1230585021:
                if (str.equals("extra_margin")) {
                    return C52761wXj.TaskDescription.reset;
                }
            case 1316365756:
                break;
            case 1594317834:
                if (!str.equals("coin_target_scale")) {
                }
                break;
            case 1637026727:
                break;
            case 1764334642:
                break;
            case 1968406406:
                break;
            case 1999465411:
                if (!str.equals("bot_sub_recurring_avg_price")) {
                }
                break;
        }
    }
}
