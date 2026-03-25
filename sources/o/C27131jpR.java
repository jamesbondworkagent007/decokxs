package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.ui.widget.SpanningLinearLayoutManager;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import o.InterfaceC24173iXp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27131jpR extends android.widget.LinearLayout {
    public Function1<? super InvestPopUpData, Unit> AEQbTJ;
    public InterfaceC24173iXp EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27131jpR(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27131jpR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnReminderActionClick(@NotNull Function1<? super InvestPopUpData, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseNewLayout(boolean z) {
        if (this.copydefault != z) {
            this.copydefault = z;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:42) call: o.jpR.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27131jpR(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27131jpR(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.jpW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27131jpR.EZpvd(context, this);
            }
        });
    }

    private final iJZ EZpvd() {
        return (iJZ) this.KWHzl.getValue();
    }

    public static final iJZ EZpvd(android.content.Context context, C27131jpR c27131jpR) {
        return iJZ.OLrzqt(android.view.LayoutInflater.from(context), c27131jpR, true);
    }

    public final void setButtonState(@NotNull InterfaceC24173iXp interfaceC24173iXp) {
        Intrinsics.checkNotNullParameter(interfaceC24173iXp, "");
        this.EZpvd = interfaceC24173iXp;
        iJZ ijzEZpvd = EZpvd();
        if (interfaceC24173iXp instanceof InterfaceC24173iXp.Activity) {
            KWHzl((InterfaceC24173iXp.Activity) interfaceC24173iXp);
        } else {
            C24177iXt c24177iXtOLrzqt = C24174iXq.OLrzqt(interfaceC24173iXp);
            ijzEZpvd.OLrzqt.setTag(java.lang.Integer.valueOf(c24177iXtOLrzqt.AEQbTJ()));
            C52794wYp c52794wYp = ijzEZpvd.OLrzqt;
            DisplayText displayTextCopydefault = c24177iXtOLrzqt.copydefault();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYp.setText(displayTextCopydefault.getString(context));
            ijzEZpvd.OLrzqt.setEnabled(c24177iXtOLrzqt.djBIcL());
            java.util.List<android.view.View> listGEmmrt = yDY.gEmmrt(ijzEZpvd.copydefault, ijzEZpvd.KWHzl, ijzEZpvd.djBIcL, ijzEZpvd.AEQbTJ);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
            for (android.view.View view : listGEmmrt) {
                Intrinsics.copydefault(view);
                view.setVisibility(8);
                arrayList.add(Unit.INSTANCE);
            }
        }
        setTag(java.lang.Integer.valueOf(C24174iXq.OLrzqt(interfaceC24173iXp).AEQbTJ()));
    }

    public final void setOnCTAButtonClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C52794wYp c52794wYp = EZpvd().OLrzqt;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, function0));
    }

    public final void AEQbTJ() {
        C24177iXt c24177iXtKWHzl;
        InterfaceC24173iXp interfaceC24173iXp = this.EZpvd;
        if (interfaceC24173iXp == null || (c24177iXtKWHzl = C24174iXq.OLrzqt(interfaceC24173iXp)) == null) {
            c24177iXtKWHzl = iCP.KWHzl();
        }
        iJZ ijzEZpvd = EZpvd();
        DisplayText displayTextEZpvd = c24177iXtKWHzl.EZpvd();
        if (displayTextEZpvd != null) {
            C52794wYp c52794wYp = ijzEZpvd.OLrzqt;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYp.setText(displayTextEZpvd.getString(context));
            C52794wYp.startLoading$default(ijzEZpvd.OLrzqt, 0L, 1, null);
        }
    }

    public final void copydefault() {
        C24177iXt c24177iXtKWHzl;
        InterfaceC24173iXp interfaceC24173iXp = this.EZpvd;
        if (interfaceC24173iXp == null || (c24177iXtKWHzl = C24174iXq.OLrzqt(interfaceC24173iXp)) == null) {
            c24177iXtKWHzl = iCP.KWHzl();
        }
        iJZ ijzEZpvd = EZpvd();
        ijzEZpvd.OLrzqt.fIwbmz();
        C52794wYp c52794wYp = ijzEZpvd.OLrzqt;
        DisplayText displayTextCopydefault = c24177iXtKWHzl.copydefault();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c52794wYp.setText(displayTextCopydefault.getString(context));
    }

    private final void KWHzl(InterfaceC24173iXp.Activity activity) {
        iJZ ijzEZpvd = EZpvd();
        C24177iXt c24177iXtEZpvd = activity.EZpvd();
        ijzEZpvd.OLrzqt.setTag(java.lang.Integer.valueOf(c24177iXtEZpvd.AEQbTJ()));
        if (c24177iXtEZpvd.AhwBna()) {
            AEQbTJ();
        } else {
            copydefault();
            C52794wYp c52794wYp = ijzEZpvd.OLrzqt;
            DisplayText displayTextCopydefault = c24177iXtEZpvd.copydefault();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYp.setText(displayTextCopydefault.getString(context));
        }
        ijzEZpvd.OLrzqt.setEnabled(c24177iXtEZpvd.djBIcL());
        AEQbTJ(activity.AEQbTJ(), activity.copydefault());
        android.view.View view = ijzEZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c24177iXtEZpvd.KWHzl().getTipContent()) ? 0 : 8);
        OKReminder oKReminder = ijzEZpvd.KWHzl;
        Intrinsics.copydefault(oKReminder);
        oKReminder.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c24177iXtEZpvd.KWHzl().getTipContent()) ? 0 : 8);
        oKReminder.setStyle(c24177iXtEZpvd.OLrzqt());
        java.lang.String tipContent = c24177iXtEZpvd.KWHzl().getTipContent();
        if (tipContent != null) {
            oKReminder.setCloseIconVisibility(false);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) tipContent);
            InvestPopUpData popUpData = c24177iXtEZpvd.KWHzl().getPopUpData();
            if (popUpData != null) {
                if (!iTV.KWHzl().contains(pSC.AEQbTJ.AEQbTJ())) {
                    spannableStringBuilder.append((java.lang.CharSequence) " ");
                }
                java.lang.Object[] objArr = {new android.text.style.TextAppearanceSpan(oKReminder.getContext(), C52761wXj.LoaderManager.QOLQEE), new android.text.style.UnderlineSpan(), new Activity(popUpData), new android.text.style.ForegroundColorSpan(ContextCompat.getColor(oKReminder.getContext(), C52761wXj.Activity.fdOvFl))};
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((java.lang.CharSequence) oKReminder.getContext().getString(C25493ixk.FragmentManager.djBIcL));
                for (int i = 0; i < 4; i++) {
                    spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
                }
            }
            android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(new android.text.SpannedString(spannableStringBuilder));
            Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
            oKReminder.setMessage(spannableStringValueOf);
        }
    }

    /* JADX INFO: renamed from: o.jpR$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public final /* synthetic */ InvestPopUpData AEQbTJ;

        public Activity(InvestPopUpData investPopUpData) {
            this.AEQbTJ = investPopUpData;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = C27131jpR.this.AEQbTJ;
            if (function1 != null) {
                function1.invoke(this.AEQbTJ);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(true);
        }
    }

    public final void AEQbTJ(java.util.List<DisplayText> list, int i) {
        iJZ ijzEZpvd = EZpvd();
        android.widget.TextView textView = ijzEZpvd.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((this.copydefault || !(list.isEmpty() ^ true)) ? 8 : 0);
        if (list.isEmpty()) {
            return;
        }
        if (this.copydefault) {
            RecyclerView recyclerView = ijzEZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(0);
            final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            int i2 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                arrayList.add(new C27514jwd((DisplayText) obj, i2 == i, i2 < i));
                i2++;
            }
            RecyclerView recyclerView2 = ijzEZpvd.AEQbTJ;
            C59534zip c59534zip = new C59534zip();
            c59534zip.register(C27514jwd.class, new C27526jwp(new Function1() { // from class: o.jpU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C27131jpR.OLrzqt(arrayList, (C27514jwd) obj2));
                }
            }, new Function1() { // from class: o.jpV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C27131jpR.EZpvd(arrayList, (C27514jwd) obj2));
                }
            }));
            C27588jxy.AEQbTJ(c59534zip, arrayList);
            recyclerView2.setAdapter(c59534zip);
            android.content.Context context = recyclerView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            recyclerView2.setLayoutManager(new SpanningLinearLayoutManager(context, 0, 0, 0, 0, 30, null));
            return;
        }
        android.widget.TextView textView2 = ijzEZpvd.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        boolean zAEQbTJ = C55296xhK.AEQbTJ(textView2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i3 = 0;
        for (java.lang.Object obj2 : list) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(c27569jxf.EZpvd(i3));
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            arrayList2.add(c27569jxf.AEQbTJ(strAYXKKw + " " + ((DisplayText) obj2).getString(context2), i3 == 0, zAEQbTJ));
            i3++;
        }
        android.text.TextPaint paint = ijzEZpvd.djBIcL.getPaint();
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context context3 = ijzEZpvd.djBIcL.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iEZpvd = c33566myq.EZpvd(context3);
        int iDp2px$default = C55298xhM.dp2px$default(32.0f, null, 1, null);
        C27569jxf c27569jxf2 = C27569jxf.OLrzqt;
        java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>(arrayList2);
        Intrinsics.copydefault(paint);
        android.text.SpannableStringBuilder spannableStringBuilderCopydefault = c27569jxf2.copydefault(arrayList3, i, paint, iEZpvd - iDp2px$default, zAEQbTJ);
        if (spannableStringBuilderCopydefault != null) {
            ijzEZpvd.djBIcL.setText(spannableStringBuilderCopydefault);
        }
    }

    /* JADX INFO: renamed from: o.jpR$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function0 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }

    public static final boolean OLrzqt(java.util.List list, C27514jwd c27514jwd) {
        Intrinsics.checkNotNullParameter(c27514jwd, "");
        return list.indexOf(c27514jwd) == 0;
    }

    public static final boolean EZpvd(java.util.List list, C27514jwd c27514jwd) {
        Intrinsics.checkNotNullParameter(c27514jwd, "");
        return list.indexOf(c27514jwd) == yDY.AuCTel(list);
    }
}
