package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.view.KeyEventDispatcher;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class nAC extends C32995moB {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public C59534zip AEQbTJ;
    public java.util.List<OKMessage> EZpvd;
    public java.util.List<OKConversation> OLrzqt;

    public interface Application {
        void EZpvd(@NotNull java.util.List<OKMessage> list, @NotNull java.util.List<OKConversation> list2);
    }

    public nAC() {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(OKConversation.class, new StateListAnimator());
        this.AEQbTJ = c59534zip;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nAC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.util.ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("list");
        Intrinsics.copydefault(parcelableArrayList);
        this.EZpvd = parcelableArrayList;
        java.util.ArrayList parcelableArrayList2 = requireArguments().getParcelableArrayList("conversation");
        Intrinsics.copydefault(parcelableArrayList2);
        this.OLrzqt = parcelableArrayList2;
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        java.util.List<OKMessage> list = this.EZpvd;
        if (list == null) {
            Intrinsics.gEmmrt("");
            list = null;
        }
        java.util.List<OKConversation> list2 = this.OLrzqt;
        if (list2 == null) {
            Intrinsics.gEmmrt("");
            list2 = null;
        }
        C33878nJe c33878nJeKWHzl = KWHzl(list, list2);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
        android.widget.LinearLayout root = c33878nJeKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        viewOnClickListenerC54939xaY.EZpvd(root);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.ibrGus), new View.OnClickListener() { // from class: o.nAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nAC.OLrzqt(this.KWHzl, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C35399nuc.LoaderManager.iwGUEr), new View.OnClickListener() { // from class: o.nAI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nAC.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return viewOnClickListenerC54939xaY;
    }

    public static final void OLrzqt(nAC nac, android.view.View view) {
        Application applicationKWHzl = nac.KWHzl();
        if (applicationKWHzl != null) {
            java.util.List<OKMessage> list = nac.EZpvd;
            java.util.List<OKConversation> list2 = null;
            if (list == null) {
                Intrinsics.gEmmrt("");
                list = null;
            }
            java.util.List<OKConversation> list3 = nac.OLrzqt;
            if (list3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                list2 = list3;
            }
            applicationKWHzl.EZpvd(list, list2);
        }
        nac.dismissAllowingStateLoss();
        FragmentActivity activity = nac.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final C33878nJe KWHzl(java.util.List<OKMessage> list, java.util.List<OKConversation> list2) {
        java.lang.CharSequence charSequenceAEQbTJ;
        C33878nJe c33878nJeEZpvd = C33878nJe.EZpvd(android.view.LayoutInflater.from(requireContext()));
        Intrinsics.checkNotNullExpressionValue(c33878nJeEZpvd, "");
        c33878nJeEZpvd.EZpvd.setLayoutManager(new GridLayoutManager(requireContext(), 5, 1, false));
        int iEZpvd = C33570myu.EZpvd(requireContext(), 12);
        c33878nJeEZpvd.EZpvd.addItemDecoration(new C33599mzW(5, iEZpvd, iEZpvd, false));
        this.AEQbTJ.setItems(list2);
        c33878nJeEZpvd.EZpvd.setAdapter(this.AEQbTJ);
        c33878nJeEZpvd.copydefault.setText(getString(C35399nuc.LoaderManager.fMBJsc));
        if (list.size() > 1) {
            c33878nJeEZpvd.copydefault.setText(C33069mpW.copydefault(this, C35399nuc.LoaderManager.apAOXX, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("count", java.lang.String.valueOf(list.size())))));
        } else if (list.size() == 1) {
            AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding> abstractC35703oAoEZpvd = C35696oAh.KWHzl.EZpvd(list.get(0));
            if (abstractC35703oAoEZpvd != null) {
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                charSequenceAEQbTJ = abstractC35703oAoEZpvd.AEQbTJ(contextRequireContext, list.get(0));
            } else {
                charSequenceAEQbTJ = null;
            }
            c33878nJeEZpvd.copydefault.setText(charSequenceAEQbTJ);
        }
        return c33878nJeEZpvd;
    }

    public final class StateListAnimator extends AbstractC43310rmq<OKConversation, nLD> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C35399nuc.Dialog.aHXSQp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return C35342ntX.djBIcL;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<nLD> c43312rms, @NotNull OKConversation oKConversation) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(oKConversation, "");
            super.onBindViewHolder((C43312rms) c43312rms, oKConversation);
            C35893oHp c35893oHp = ((nLD) c43312rms.OLrzqt()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.AEQbTJ(c35893oHp, oKConversation);
        }
    }

    public final Application KWHzl() {
        ActivityResultCaller parentFragment = getParentFragment();
        KeyEventDispatcher.Component activity = getActivity();
        if (parentFragment instanceof Application) {
            return (Application) parentFragment;
        }
        if (activity instanceof Application) {
            return (Application) activity;
        }
        return null;
    }
}
