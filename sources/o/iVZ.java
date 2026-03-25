package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.iVX;

/* JADX INFO: loaded from: classes15.dex */
public final class iVZ extends iSE<iVX> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final ActionBar EZpvd = new ActionBar();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iVZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public iVZ() {
        super(EZpvd);
        register(iVX.StateListAnimator.class, C24142iWl.copydefault);
        register(iVX.Activity.class, C24138iWh.KWHzl);
        register(iVX.Application.class, C24141iWk.copydefault);
        register(iVX.TaskDescription.class, C24140iWj.copydefault);
        register(iVX.FragmentManager.class, C24143iWm.EZpvd);
        register(iVX.LoaderManager.class, C24144iWn.EZpvd);
        register(iVX.Dialog.class, C24147iWq.EZpvd);
        register(iVX.PendingIntent.class, C24145iWo.OLrzqt);
        register(iVX.VoiceInteractor.class, C24151iWu.KWHzl);
        register(iVX.Fragment.class, C24146iWp.KWHzl);
        register(iVX.AssistContent.class, C24152iWv.KWHzl);
    }

    public static final class ActionBar extends DiffUtil.ItemCallback<iVX> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(iVX ivx, iVX ivx2) {
            Intrinsics.checkNotNullParameter(ivx, "");
            Intrinsics.checkNotNullParameter(ivx2, "");
            return Intrinsics.EZpvd(ivx.getClass(), ivx2.getClass());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(iVX ivx, iVX ivx2) {
            Intrinsics.checkNotNullParameter(ivx, "");
            Intrinsics.checkNotNullParameter(ivx2, "");
            return Intrinsics.EZpvd(ivx, ivx2);
        }
    }
}
