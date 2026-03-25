package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bumptech.glide.Glide;
import com.okinc.business.invest_biz.data.bean.HomeActivityNewItem;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C25493ixk;
import o.C52761wXj;
import o.InterfaceC27342jtQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27339jtN extends android.widget.FrameLayout {
    public InterfaceC27344jtS OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27339jtN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27339jtN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItemRenderCallback(@NotNull InterfaceC27344jtS interfaceC27344jtS) {
        Intrinsics.checkNotNullParameter(interfaceC27344jtS, "");
        this.OLrzqt = interfaceC27344jtS;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.jtN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27339jtN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27339jtN(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jtL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27339jtN.AEQbTJ(context, this);
            }
        });
        wXI root = EZpvd().getRoot();
        root.setAutoTurningTime(4000L);
        root.KWHzl(-2);
        root.setConvertViewId(C25493ixk.Activity.DXXBbs);
        root.setConvertViewCallback(new Function2() { // from class: o.jtP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27339jtN.AEQbTJ(this.AEQbTJ, (ST) obj, obj2);
            }
        });
    }

    private final C23807iKa EZpvd() {
        return (C23807iKa) this.copydefault.getValue();
    }

    public static final C23807iKa AEQbTJ(android.content.Context context, C27339jtN c27339jtN) {
        return C23807iKa.KWHzl(android.view.LayoutInflater.from(context), c27339jtN, true);
    }

    public static final Unit AEQbTJ(C27339jtN c27339jtN, ST st, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(st, "");
        InterfaceC27342jtQ interfaceC27342jtQ = obj instanceof InterfaceC27342jtQ ? (InterfaceC27342jtQ) obj : null;
        C23769iIq c23769iIqOLrzqt = C23769iIq.OLrzqt(st.itemView);
        Intrinsics.checkNotNullExpressionValue(c23769iIqOLrzqt, "");
        if (interfaceC27342jtQ != null) {
            c27339jtN.KWHzl(c23769iIqOLrzqt, interfaceC27342jtQ);
        }
        return Unit.INSTANCE;
    }

    public final void setData(@NotNull java.util.List<? extends InterfaceC27342jtQ> list) {
        Intrinsics.checkNotNullParameter(list, "");
        wXI root = EZpvd().getRoot();
        root.setDataList(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list));
        if (list.size() > 1) {
            root.setCurrentPage(1, false);
        }
        OLrzqt();
        root.setAutoPlay(true);
    }

    public final void AEQbTJ() {
        EZpvd().getRoot().setAutoPlay(true);
    }

    public final void copydefault() {
        EZpvd().getRoot().setAutoPlay(false);
    }

    public final void OLrzqt() {
        android.view.View viewEZpvd;
        EZpvd().getRoot().getContext();
        InterfaceC52777wXz interfaceC52777wXzAEQbTJ = EZpvd().getRoot().AEQbTJ();
        if (interfaceC52777wXzAEQbTJ == null || (viewEZpvd = interfaceC52777wXzAEQbTJ.EZpvd()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewEZpvd.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            viewEZpvd.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public final void KWHzl(C23769iIq c23769iIq, InterfaceC27342jtQ interfaceC27342jtQ) {
        InterfaceC27344jtS interfaceC27344jtS = this.OLrzqt;
        if (interfaceC27344jtS != null) {
            interfaceC27344jtS.OLrzqt(interfaceC27342jtQ);
        }
        if (interfaceC27342jtQ instanceof InterfaceC27342jtQ.StateListAnimator) {
            OLrzqt(c23769iIq, (InterfaceC27342jtQ.StateListAnimator) interfaceC27342jtQ);
        }
    }

    public final void OLrzqt(C23769iIq c23769iIq, InterfaceC27342jtQ.StateListAnimator stateListAnimator) {
        android.widget.FrameLayout root = c23769iIq.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, stateListAnimator));
        android.widget.TextView textView = c23769iIq.KWHzl;
        java.lang.CharSequence charSequenceOLrzqt = "";
        if (stateListAnimator.AEQbTJ() != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            charSequenceOLrzqt = OLrzqt(context, stateListAnimator.AEQbTJ());
        }
        textView.setText(charSequenceOLrzqt);
        c23769iIq.EZpvd.setText(stateListAnimator.copydefault());
        C52794wYp c52794wYp = c23769iIq.EZpvd;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, stateListAnimator));
        Glide.KWHzl(c23769iIq.OLrzqt).EZpvd(stateListAnimator.KWHzl()).EZpvd(c23769iIq.OLrzqt);
    }

    public final java.lang.CharSequence OLrzqt(android.content.Context context, HomeActivityNewItem homeActivityNewItem) {
        java.lang.String str;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) homeActivityNewItem.getReplaceText()) && C33129mqd.OLrzqt((java.lang.CharSequence) homeActivityNewItem.getOriginalName())) {
            java.lang.String originalName = homeActivityNewItem.getOriginalName();
            java.lang.String replaceText = homeActivityNewItem.getReplaceText();
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) originalName, replaceText, 0, true, 2, (java.lang.Object) null);
            if (iIndexOf$default == -1) {
                java.lang.String originalName2 = homeActivityNewItem.getOriginalName();
                str = C33129mqd.OLrzqt((java.lang.CharSequence) originalName2) ? originalName2 : null;
                return str == null ? "" : str;
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            if (iIndexOf$default > 0) {
                java.lang.String strSubstring = originalName.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                spannableStringBuilder.append((java.lang.CharSequence) strSubstring);
            }
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(homeActivityNewItem.isReplaceNumber() ? C27577jxn.copydefault.copydefault(context) : C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) replaceText);
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            int length2 = iIndexOf$default + replaceText.length();
            if (length2 < originalName.length()) {
                java.lang.String strSubstring2 = originalName.substring(length2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                spannableStringBuilder.append((java.lang.CharSequence) strSubstring2);
            }
            return new android.text.SpannedString(spannableStringBuilder);
        }
        java.lang.String originalName3 = homeActivityNewItem.getOriginalName();
        str = C33129mqd.OLrzqt((java.lang.CharSequence) originalName3) ? originalName3 : null;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: o.jtN$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ InterfaceC27342jtQ.StateListAnimator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, InterfaceC27342jtQ.StateListAnimator stateListAnimator) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = stateListAnimator;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0<Unit> function0EZpvd = this.copydefault.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jtN$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ InterfaceC27342jtQ.StateListAnimator KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, InterfaceC27342jtQ.StateListAnimator stateListAnimator) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = stateListAnimator;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0<Unit> function0EZpvd = this.KWHzl.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
            }
        }
    }
}
