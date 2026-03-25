package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aNV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6339aNV extends AbstractC6324aNG {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.aNV$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aNV.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C6339aNV EZpvd() {
            return new C6339aNV();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        KWHzl(AbstractC5658aAd.KWHzl(layoutInflater, viewGroup, false));
        ViewBinding viewBindingValueOf = valueOf();
        if (viewBindingValueOf != null) {
            return viewBindingValueOf.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new Activity());
    }

    /* JADX INFO: renamed from: o.aNV$Activity */
    public static final class Activity extends OnBackPressedCallback {
        public Activity() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            C6339aNV.this.DbNXlk();
        }
    }

    @Override // o.C6268aMD
    public void fetchVPNInfo() {
        ViewBinding viewBindingValueOf = valueOf();
        AbstractC5658aAd abstractC5658aAd = viewBindingValueOf instanceof AbstractC5658aAd ? (AbstractC5658aAd) viewBindingValueOf : null;
        if (abstractC5658aAd != null) {
            abstractC5658aAd.AEQbTJ.copydefault().setVisibility(8);
            abstractC5658aAd.AEQbTJ.setRightIconOnClickListener(new Function0() { // from class: o.aNU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C6339aNV.EZpvd(this.copydefault);
                }
            });
            OKReminder oKReminder = abstractC5658aAd.OLrzqt;
            Intrinsics.copydefault(oKReminder);
            oKReminder.setVisibility(0);
            java.lang.String string = getString(C8206ayP.Dialog.run);
            Intrinsics.checkNotNullExpressionValue(string, "");
            oKReminder.setTitle(string);
            oKReminder.setMessage(getString(C8206ayP.Dialog.DGOPHZ));
            oKReminder.setStyle(2);
            oKReminder.setCloseIconVisibility(false);
            C52794wYp c52794wYp = abstractC5658aAd.copydefault;
            Intrinsics.copydefault(c52794wYp);
            C6738aUz.EZpvd(c52794wYp);
            c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
            if (gEmmrt().ejfBZ() == PasskeyPromotionSource.LOGIN || gEmmrt().ejfBZ() == PasskeyPromotionSource.SIGNUP) {
                abstractC5658aAd.copydefault.setOKDSType(80);
            } else {
                abstractC5658aAd.copydefault.setOKDSType(257);
            }
            android.content.Context context = getContext();
            if (context != null) {
                android.widget.ImageView imageView = abstractC5658aAd.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/account/common/passkey/passkey_verified_illustration.webp", context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
            }
        }
    }

    public static final Unit EZpvd(C6339aNV c6339aNV) {
        c6339aNV.gEmmrt().AEQbTJ();
        return Unit.INSTANCE;
    }

    @Override // o.C6268aMD
    public void djBIcL() {
        AhwBna().OLrzqt((C6268aMD) this);
    }

    public final void DbNXlk() {
        if (getParentFragmentManager().getBackStackEntryCount() > 0) {
            getParentFragmentManager().popBackStack();
        } else {
            gEmmrt().AEQbTJ();
        }
    }

    @Override // o.C6268aMD, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        KWHzl((ViewBinding) null);
    }

    /* JADX INFO: renamed from: o.aNV$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C6339aNV OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C6339aNV c6339aNV) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c6339aNV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.AhwBna().OLrzqt((C6268aMD) this.OLrzqt);
            }
        }
    }
}
