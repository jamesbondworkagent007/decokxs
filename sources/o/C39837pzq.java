package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import com.okinc.components.track.TrackChannel;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39837pzq extends ConstraintLayout {
    public InterfaceC58217yxC EZpvd;
    public final oPA KWHzl;
    public long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39837pzq(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC58217yxC copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCountDownDisposable(InterfaceC58217yxC interfaceC58217yxC) {
        this.EZpvd = interfaceC58217yxC;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 android.util.AttributeSet)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:33) call: o.pzq.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C39837pzq(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39837pzq(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.KWHzl = (oPA) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C35964oKf.Application.DQzvGNdrmXxu, this, true);
    }

    public static /* synthetic */ void setTitle$default(C39837pzq c39837pzq, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c39837pzq.setTitle(str);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        oPA opa = this.KWHzl;
        if (opa == null || (textView = opa.AEQbTJ) == null) {
            return;
        }
        textView.setText(str);
    }

    public static /* synthetic */ void setContent$default(C39837pzq c39837pzq, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c39837pzq.setContent(str);
    }

    public final void setContent(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        oPA opa = this.KWHzl;
        if (opa == null || (textView = opa.gEmmrt) == null) {
            return;
        }
        textView.setText(str);
    }

    public static /* synthetic */ void setImg$default(C39837pzq c39837pzq, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c39837pzq.setImg(str);
    }

    public final void setImg(@NotNull java.lang.String str) {
        oPA opa;
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || (opa = this.KWHzl) == null || (imageView = opa.copydefault) == null) {
            return;
        }
        C33054mpH.KWHzl(imageView, str);
    }

    public static /* synthetic */ void setClickSkill$default(C39837pzq c39837pzq, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c39837pzq.setClickSkill(str);
    }

    public final void setClickSkill(@NotNull final java.lang.String str) {
        android.widget.TextView textView;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            oPA opa = this.KWHzl;
            if (opa == null || (constraintLayout2 = opa.KWHzl) == null) {
                return;
            }
            constraintLayout2.setVisibility(8);
            return;
        }
        oPA opa2 = this.KWHzl;
        if (opa2 != null && (constraintLayout = opa2.KWHzl) != null) {
            constraintLayout.setVisibility(0);
        }
        oPA opa3 = this.KWHzl;
        if (opa3 == null || (textView = opa3.EZpvd) == null) {
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.pzu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39837pzq.setClickSkill$lambda$0(this.AEQbTJ, str, view);
            }
        });
    }

    public static final void setClickSkill$lambda$0(C39837pzq c39837pzq, java.lang.String str, android.view.View view) {
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = c39837pzq.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str)), null, 4, null);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("app_newlisting_countdown_ann_link_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    public final void setRemindText(int i) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        oPA opa = this.KWHzl;
        if (opa != null && (textView2 = opa.gEmmrt) != null) {
            textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
        }
        oPA opa2 = this.KWHzl;
        if (opa2 == null || (textView = opa2.gEmmrt) == null) {
            return;
        }
        textView.setText(C33070mpX.AYXKKw(i == 1 ? C35964oKf.Fragment.GQzpsZgQzpsZ : C35964oKf.Fragment.DXd));
    }

    public final void EZpvd() {
        pAP pap;
        oPA opa = this.KWHzl;
        if (opa != null && (pap = opa.OLrzqt) != null) {
            pap.setVisibility(8);
        }
        InterfaceC58217yxC interfaceC58217yxCCopydefault = copydefault();
        if (interfaceC58217yxCCopydefault != null) {
            interfaceC58217yxCCopydefault.dispose();
        }
    }

    public final void KWHzl() {
        pAP pap;
        oPA opa = this.KWHzl;
        if (opa == null || (pap = opa.OLrzqt) == null) {
            return;
        }
        pap.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pzq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void countdown$default(C39837pzq c39837pzq, long j, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        c39837pzq.KWHzl(j, (Function0<Unit>) function0);
    }

    public final void KWHzl(long j, final Function0<Unit> function0) {
        this.copydefault = j;
        InterfaceC58217yxC interfaceC58217yxCCopydefault = copydefault();
        if (interfaceC58217yxCCopydefault != null) {
            interfaceC58217yxCCopydefault.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, 1L, java.util.concurrent.TimeUnit.SECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.pzs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39837pzq.AEQbTJ(this.copydefault, function0, (java.lang.Long) obj);
            }
        };
        setCountDownDisposable(abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.pzt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C39837pzq.copydefault(function1, obj);
            }
        }));
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C39837pzq c39837pzq, Function0 function0, java.lang.Long l) {
        pAP pap;
        pAP pap2;
        long j = c39837pzq.copydefault;
        if (j <= 0) {
            c39837pzq.copydefault = 0L;
            InterfaceC58217yxC interfaceC58217yxCCopydefault = c39837pzq.copydefault();
            if (interfaceC58217yxCCopydefault != null) {
                interfaceC58217yxCCopydefault.dispose();
            }
            c39837pzq.KWHzl.OLrzqt.setTimeBg(true);
            oPA opa = c39837pzq.KWHzl;
            if (opa != null && (pap2 = opa.OLrzqt) != null) {
                pap2.setTime(0L);
            }
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            long j2 = j - 1;
            c39837pzq.copydefault = j2;
            oPA opa2 = c39837pzq.KWHzl;
            if (opa2 != null && (pap = opa2.OLrzqt) != null) {
                pap.setTime(C33129mqd.valueOf(java.lang.Long.valueOf(j2)));
            }
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        InterfaceC58217yxC interfaceC58217yxCCopydefault = copydefault();
        if (interfaceC58217yxCCopydefault != null) {
            interfaceC58217yxCCopydefault.dispose();
        }
    }
}
