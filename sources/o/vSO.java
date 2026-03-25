package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.tradeuilib.imgs.OKRemoteImageResource;
import com.okinc.tradeuilib.imgs.RemoteSupportedScaleType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vSO extends AbstractC57668ymk {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public AbstractC48353uOi KWHzl;
    public java.lang.Float OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57674ymq
    public java.lang.Float OLrzqt() {
        return this.OLrzqt;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vSO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final vSO copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            vSO vso = new vSO();
            vso.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_inst_type", str), C56390yDp.OLrzqt("bot_inst_id", str2)));
            return vso;
        }
    }

    @Override // o.AbstractC57674ymq
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.KWHzl = (AbstractC48353uOi) DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.RKDWNf, viewGroup, false);
        valueOf();
        AbstractC48353uOi abstractC48353uOi = this.KWHzl;
        if (abstractC48353uOi == null) {
            Intrinsics.gEmmrt("");
            abstractC48353uOi = null;
        }
        android.view.View root = abstractC48353uOi.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    private final void valueOf() {
        KWHzl(C33070mpX.AYXKKw(C55688xof.Application.AlertControllerButtonHandler));
        OLrzqt(8);
        AbstractC48353uOi abstractC48353uOi = this.KWHzl;
        AbstractC48353uOi abstractC48353uOi2 = null;
        if (abstractC48353uOi == null) {
            Intrinsics.gEmmrt("");
            abstractC48353uOi = null;
        }
        C52794wYp c52794wYp = abstractC48353uOi.AEQbTJ;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        AbstractC48353uOi abstractC48353uOi3 = this.KWHzl;
        if (abstractC48353uOi3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48353uOi2 = abstractC48353uOi3;
        }
        android.widget.RelativeLayout relativeLayout = abstractC48353uOi2.OLrzqt;
        relativeLayout.setOnClickListener(new StateListAnimator(relativeLayout, 1000L, this));
    }

    @Override // o.AbstractC57668ymk, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC48353uOi abstractC48353uOi = this.KWHzl;
        if (abstractC48353uOi == null) {
            Intrinsics.gEmmrt("");
            abstractC48353uOi = null;
        }
        android.widget.ImageView imageView = abstractC48353uOi.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C49721utr.OLrzqt(imageView, OKRemoteImageResource.Resource.IC_ROBOT, getContext(), (2044 & 4) != 0 ? 0 : 0, (2044 & 8) != 0 ? RemoteSupportedScaleType.CENTER_INSIDE : null, (2044 & 16) != 0 ? null : null, (2044 & 32) != 0 ? -1 : 0, (2044 & 64) != 0 ? -1 : 0, (2044 & 128) != 0 ? null : null, (2044 & 256) != 0 ? null : null, (2044 & 512) != 0 ? false : false, (2044 & 1024) != 0 ? OKRemoteImageResource.EZpvd.getClass().getSimpleName() : "BotOrderFailedDialog");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [75=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void copydefault() {
        InterfaceC6804aWL interfaceC6804aWL;
        android.os.Bundle arguments = getArguments();
        final java.lang.Long l = null;
        java.lang.String string = arguments != null ? arguments.getString("bot_inst_type") : null;
        if (string != null) {
            switch (string.hashCode()) {
                case -2027980370:
                    if (string.equals("MARGIN")) {
                        l = 4487185L;
                    }
                    break;
                case -1956807563:
                    if (string.equals("OPTION")) {
                        l = 4487186L;
                    }
                    break;
                case 2552066:
                    if (string.equals("SPOT")) {
                        l = 4485189L;
                    }
                    break;
                case 2558355:
                    if (string.equals("SWAP")) {
                        l = 2890699L;
                    }
                    break;
                case 214415088:
                    if (string.equals("FUTURES")) {
                        l = 4485190L;
                    }
                    break;
            }
        }
        android.content.Context context = getContext();
        if (context == null || (interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class)) == null) {
            return;
        }
        interfaceC6804aWL.copydefault(context, C6805aWM.OLrzqt(new Function1() { // from class: o.vSN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vSO.EZpvd(l, (ChatBotRequest) obj);
            }
        }));
    }

    public static final Unit EZpvd(java.lang.Long l, ChatBotRequest chatBotRequest) {
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        chatBotRequest.setFaqGroupId(l);
        chatBotRequest.setFormSource(1);
        return Unit.INSTANCE;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ vSO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vSO vso) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = vso;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.dismiss();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ vSO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vSO vso) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = vso;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.copydefault();
            }
        }
    }
}
