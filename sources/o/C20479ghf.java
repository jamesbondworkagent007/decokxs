package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ghf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20479ghf extends androidx.fragment.app.Fragment {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public Function0<Unit> AEQbTJ;
    public Function0<Unit> OLrzqt;
    public AbstractC16607enC copydefault;

    /* JADX INFO: renamed from: o.ghf$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ghf.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C20479ghf KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            C20479ghf c20479ghf = new C20479ghf();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("to_address", str);
            bundle.putString("similar_address", str2);
            c20479ghf.setArguments(bundle);
            c20479ghf.OLrzqt = function0;
            c20479ghf.AEQbTJ = function02;
            return c20479ghf;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC16607enC abstractC16607enCCopydefault = AbstractC16607enC.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16607enCCopydefault, "");
        this.copydefault = abstractC16607enCCopydefault;
        return abstractC16607enCCopydefault.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        C57468yiw c57468yiw;
        RecyclerView recyclerView;
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, getViewLifecycleOwner(), false, new Function1() { // from class: o.ghg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20479ghf.AEQbTJ(this.copydefault, (OnBackPressedCallback) obj);
                }
            }, 2, null);
        }
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("to_address") : null;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("similar_address") : null;
        AbstractC16607enC abstractC16607enC = this.copydefault;
        if (abstractC16607enC != null && (recyclerView = abstractC16607enC.EZpvd) != null) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.UNDaji);
            C14079deg c14079deg = C14079deg.EZpvd;
            recyclerView.setAdapter(new StateListAnimator(yDY.gEmmrt(new ActionBar(strAYXKKw, c14079deg.copydefault(string, string2)), new ActionBar(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DXTac), c14079deg.copydefault(string2, string)))));
        }
        AbstractC16607enC abstractC16607enC2 = this.copydefault;
        if (abstractC16607enC2 != null && (c57468yiw = abstractC16607enC2.copydefault) != null) {
            c57468yiw.copydefault().setOKDSSize(52);
            c57468yiw.copydefault().setOKDSType(49);
            c57468yiw.EZpvd().setOKDSSize(52);
            c57468yiw.EZpvd().setOKDSType(260);
            c57468yiw.setPrimaryButtonText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient));
            c57468yiw.setSecondaryButtonText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession));
            c57468yiw.setPrimaryButtonCallBack(new Function0() { // from class: o.ghj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20479ghf.KWHzl(this.AEQbTJ);
                }
            });
            c57468yiw.setSecondaryButtonCallBack(new Function0() { // from class: o.ghl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20479ghf.OLrzqt(this.KWHzl);
                }
            });
        }
        view.post(new java.lang.Runnable() { // from class: o.ghi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C20479ghf.gEmmrt(this.KWHzl);
            }
        });
    }

    public static final Unit AEQbTJ(C20479ghf c20479ghf, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        FragmentActivity activity = c20479ghf.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C20479ghf c20479ghf) {
        C32866mlf.onEvent$default("Confirmationpage_SimilarAddressTransferAlert_Popup_View", (TrackChannel[]) null, new Function1() { // from class: o.ghc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20479ghf.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        Function0<Unit> function0 = c20479ghf.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("is_click_continue_link", "true", true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C20479ghf c20479ghf) {
        C32866mlf.onEvent$default("Confirmationpage_SimilarAddressTransferAlert_Popup_View", (TrackChannel[]) null, new Function1() { // from class: o.ghd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20479ghf.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        Function0<Unit> function0 = c20479ghf.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("is_click_cancel_link", "true", true);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(C20479ghf c20479ghf) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c20479ghf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.ghf$ActionBar */
    public static final class ActionBar {
        public final java.lang.CharSequence EZpvd;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.CharSequence charSequence, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.copydefault;
            }
            if ((i & 2) != 0) {
                charSequence = actionBar.EZpvd;
            }
            return actionBar.KWHzl(str, charSequence);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            return new ActionBar(str, charSequence);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DescListItem(text=" + this.copydefault + ", desc=" + ((java.lang.Object) this.EZpvd) + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.copydefault = str;
            this.EZpvd = charSequence;
        }
    }

    /* JADX INFO: renamed from: o.ghf$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.Adapter<TaskDescription> {
        public final java.util.List<ActionBar> AEQbTJ;

        public StateListAnimator(@NotNull java.util.List<ActionBar> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.dXcUrg, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new TaskDescription(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.AEQbTJ.size();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            if (i < this.AEQbTJ.size()) {
                taskDescription.AEQbTJ(this.AEQbTJ.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: o.ghf$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.TextView KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.PlaybackStateCompatBuilder);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C13754dXa.ActionBar.getRccStateFromState);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById2;
        }

        public final void AEQbTJ(@NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            this.KWHzl.setText(actionBar.KWHzl());
            this.AEQbTJ.setText(actionBar.AEQbTJ());
        }
    }
}
