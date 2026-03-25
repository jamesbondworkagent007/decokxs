package com.okinc.wallet.widget.bottomsheet;

import android.R;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.wallet.widget.bottomsheet.DefiBottomSheetContainerTxConfirmBaseFragment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.C56391yDq;
import o.C57676yms;
import o.C6777aVl;
import o.pUU;
import o.rVN;
import o.xVW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class DefiBottomSheetContainerTxConfirmBaseFragment extends AbstractDialogInterfaceOnKeyListenerC57208yeA {
    public Float fIwbmz = Float.valueOf(0.96f);
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public static final Queue<WeakReference<DefiBottomSheetContainerTxConfirmBaseFragment>> AkhnZx = new LinkedList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA
    public void AEQbTJ(Float f) {
        this.fIwbmz = f;
    }

    public boolean EZpvd() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA, o.AbstractC57671ymn
    public Float OLrzqt() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String copydefault() {
        return "";
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.widget.bottomsheet.DefiBottomSheetContainerTxConfirmBaseFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            try {
                Result.Application application = Result.Companion;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(activity.findViewById(R.id.content));
                if (rootWindowInsets == null) {
                    return;
                }
                int i = rootWindowInsets.getInsets(WindowInsetsCompat.Type.statusBars()).top;
                int i2 = rootWindowInsets.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
                if (i2 > 0) {
                    AEQbTJ(Float.valueOf(1.0f));
                }
                float fCopydefault = (C57676yms.copydefault(activity) - i) - i2;
                Float fOLrzqt = OLrzqt();
                int iFloatValue = (int) (fCopydefault * (fOLrzqt != null ? fOLrzqt.floatValue() : 1.0f));
                ViewGroup.LayoutParams layoutParams = fARcdN().AEQbTJ.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, iFloatValue);
                } else {
                    layoutParams.height = iFloatValue;
                }
                fARcdN().AEQbTJ.setLayoutParams(layoutParams);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7376boximpl(objM7377constructorimpl);
        }
        view.post(new Runnable() { // from class: o.yeH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                DefiBottomSheetContainerTxConfirmBaseFragment.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(DefiBottomSheetContainerTxConfirmBaseFragment defiBottomSheetContainerTxConfirmBaseFragment) {
        rVN.reportFullyDrawn$default((Fragment) defiBottomSheetContainerTxConfirmBaseFragment, true, (String) null, 2, (Object) null);
    }

    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA
    public void EZpvd(@NotNull FragmentManager fragmentManager, @NotNull String str, @NotNull AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activity, "");
        super.EZpvd(fragmentManager, str, activity);
        if (EZpvd()) {
            Queue<WeakReference<DefiBottomSheetContainerTxConfirmBaseFragment>> queue = AkhnZx;
            queue.add(new WeakReference<>(this));
            if (queue.size() > 5) {
                String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(queue, null, null, null, 0, null, new Function1() { // from class: o.yeF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return DefiBottomSheetContainerTxConfirmBaseFragment.EZpvd(this.KWHzl, (WeakReference) obj);
                    }
                }, 31, null);
                C6777aVl.Companion.EZpvd(new DappInteractionContainerLog(strJoinToString$default));
                pUU.copydefault("DefiBottomSheetContainerTxConfirmBaseFragment", strJoinToString$default);
                queue.poll();
            }
        }
    }

    public static final CharSequence EZpvd(DefiBottomSheetContainerTxConfirmBaseFragment defiBottomSheetContainerTxConfirmBaseFragment, WeakReference weakReference) {
        return defiBottomSheetContainerTxConfirmBaseFragment.copydefault();
    }

    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA, o.C33003moJ, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (EZpvd()) {
            Iterator<WeakReference<DefiBottomSheetContainerTxConfirmBaseFragment>> it = AkhnZx.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd(it.next().get(), this)) {
                    it.remove();
                }
            }
        }
    }

    public static final class DappInteractionContainerLog extends OKWException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DappInteractionContainerLog(@NotNull String str) {
            super(str + " " + xVW.copydefault(), null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }
}
