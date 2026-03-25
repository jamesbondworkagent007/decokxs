package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.ok_app.api.ModeSwitchSourceEnum;
import com.okinc.core.ok_app.modeswitch.view.ModeSwitchBottomSheet$onCreateContent$1$1$1;
import com.okinc.core.ok_app.modeswitch.view.ModeSwitchBottomSheet$onCreateContent$2;
import com.okinc.core.ok_app.modeswitch.view.ModeSwitchBottomSheet$trySwitchMode$1;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C33123mqX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33469mwz extends wXX {
    public ModeSwitchSourceEnum KWHzl;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public abstract java.lang.String AEQbTJ();

    public abstract void EZpvd(@NotNull AbstractC33244msm abstractC33244msm, @NotNull C33302mtr c33302mtr);

    public abstract java.util.List<AbstractC33244msm> OLrzqt();

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.io.Serializable serializable = requireArguments().getSerializable("MODE_SWITCH_SOURCE_PARAM");
        ModeSwitchSourceEnum modeSwitchSourceEnum = null;
        ModeSwitchSourceEnum modeSwitchSourceEnum2 = serializable instanceof ModeSwitchSourceEnum ? (ModeSwitchSourceEnum) serializable : null;
        if (modeSwitchSourceEnum2 == null) {
            modeSwitchSourceEnum2 = ModeSwitchSourceEnum.UNKNOWN;
        }
        this.KWHzl = modeSwitchSourceEnum2;
        if (modeSwitchSourceEnum2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            modeSwitchSourceEnum = modeSwitchSourceEnum2;
        }
        pUU.EZpvd("ModeSwitch-BottomSheet", "ModeSwitchBottomSheet created with source=" + modeSwitchSourceEnum);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(5);
        wxq.setTitle(AEQbTJ());
        wxq.AEQbTJ().setVisibility(0);
        super.onCreateHeader(wxq);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        constraintLayout.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.hOMIpD));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        constraintLayout.addView(linearLayout);
        java.util.List<AbstractC33244msm> listOLrzqt = OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOLrzqt) {
            if (C33123mqX.Companion.KWHzl().AEQbTJ((AbstractC33244msm) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<kotlin.Pair> arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(C56390yDp.OLrzqt((AbstractC33244msm) it.next(), C33302mtr.OLrzqt(layoutInflaterFrom, linearLayout, true)));
        }
        for (kotlin.Pair pair : arrayList2) {
            AbstractC33244msm abstractC33244msm = (AbstractC33244msm) pair.component1();
            java.lang.Object objComponent2 = pair.component2();
            Intrinsics.checkNotNullExpressionValue(objComponent2, "");
            C33302mtr c33302mtr = (C33302mtr) objComponent2;
            EZpvd(abstractC33244msm, c33302mtr);
            c33302mtr.AEQbTJ.setSelected(Intrinsics.EZpvd(C33123mqX.Companion.KWHzl().AYXKKw().getValue(), abstractC33244msm));
            android.widget.LinearLayout root = c33302mtr.getRoot();
            root.setOnClickListener(new Application(root, 1000L, abstractC33244msm, this));
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new ModeSwitchBottomSheet$onCreateContent$2(arrayList2, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(AbstractC33244msm abstractC33244msm, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ModeSwitchBottomSheet$trySwitchMode$1 modeSwitchBottomSheet$trySwitchMode$1;
        boolean zBooleanValue;
        AbstractC33469mwz abstractC33469mwz;
        AbstractC33244msm abstractC33244msm2;
        AbstractC33244msm abstractC33244msm3;
        if (continuation instanceof ModeSwitchBottomSheet$trySwitchMode$1) {
            modeSwitchBottomSheet$trySwitchMode$1 = (ModeSwitchBottomSheet$trySwitchMode$1) continuation;
            int i = modeSwitchBottomSheet$trySwitchMode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                modeSwitchBottomSheet$trySwitchMode$1.label = i - Integer.MIN_VALUE;
            } else {
                modeSwitchBottomSheet$trySwitchMode$1 = new ModeSwitchBottomSheet$trySwitchMode$1(this, continuation);
            }
        }
        ModeSwitchBottomSheet$trySwitchMode$1 modeSwitchBottomSheet$trySwitchMode$12 = modeSwitchBottomSheet$trySwitchMode$1;
        java.lang.Object objSwitchToMode$default = modeSwitchBottomSheet$trySwitchMode$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = modeSwitchBottomSheet$trySwitchMode$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSwitchToMode$default);
            C33123mqX.TaskDescription taskDescription = C33123mqX.Companion;
            AbstractC33244msm value = taskDescription.KWHzl().AYXKKw().getValue();
            if (!Intrinsics.EZpvd(abstractC33244msm, value)) {
                pUU.KWHzl("ModeSwitch-BottomSheet", "trySwitchMode: User selected mode=" + abstractC33244msm);
                C33123mqX c33123mqXKWHzl = taskDescription.KWHzl();
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    modeSwitchBottomSheet$trySwitchMode$12.L$0 = this;
                    modeSwitchBottomSheet$trySwitchMode$12.L$1 = abstractC33244msm;
                    modeSwitchBottomSheet$trySwitchMode$12.L$2 = value;
                    modeSwitchBottomSheet$trySwitchMode$12.label = 1;
                    objSwitchToMode$default = C33123mqX.switchToMode$default(c33123mqXKWHzl, activity, abstractC33244msm, true, null, null, modeSwitchBottomSheet$trySwitchMode$12, 24, null);
                    if (objSwitchToMode$default == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC33469mwz = this;
                    abstractC33244msm2 = abstractC33244msm;
                    abstractC33244msm3 = value;
                } else {
                    pUU.valueOf("ModeSwitch-BottomSheet", "switchSubMode: Activity is null");
                    return Unit.INSTANCE;
                }
            } else {
                zBooleanValue = false;
                abstractC33469mwz = this;
                if (abstractC33469mwz.isAdded()) {
                    FragmentKt.setFragmentResult(abstractC33469mwz, "FRAGMENT_RESULT_KEY", BundleKt.bundleOf(C56390yDp.OLrzqt("FRAGMENT_RESULT_MODE_CHANGED", C56443yFo.KWHzl(zBooleanValue))));
                    abstractC33469mwz.dismissAllowingStateLoss();
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC33244msm3 = (AbstractC33244msm) modeSwitchBottomSheet$trySwitchMode$12.L$2;
            abstractC33244msm2 = (AbstractC33244msm) modeSwitchBottomSheet$trySwitchMode$12.L$1;
            abstractC33469mwz = (AbstractC33469mwz) modeSwitchBottomSheet$trySwitchMode$12.L$0;
            C56391yDq.AEQbTJ(objSwitchToMode$default);
        }
        zBooleanValue = ((java.lang.Boolean) objSwitchToMode$default).booleanValue();
        pUU.KWHzl("ModeSwitch-BottomSheet", "trySwitchMode: Switch complete, result=" + zBooleanValue + ", current mode=" + abstractC33244msm3);
        if (zBooleanValue) {
            abstractC33469mwz.EZpvd(abstractC33244msm2);
        }
        if (abstractC33469mwz.isAdded()) {
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(final AbstractC33244msm abstractC33244msm) {
        C32866mlf.onEvent$default("LiteHomepage_AppMode_Navigator_Click", (TrackChannel[]) null, new Function1() { // from class: o.mwA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC33469mwz.OLrzqt(this.KWHzl, abstractC33244msm, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(AbstractC33469mwz abstractC33469mwz, AbstractC33244msm abstractC33244msm, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        ModeSwitchSourceEnum modeSwitchSourceEnum = abstractC33469mwz.KWHzl;
        if (modeSwitchSourceEnum == null) {
            Intrinsics.gEmmrt("");
            modeSwitchSourceEnum = null;
        }
        EventParamsList.put$default(eventParamsList, "page", modeSwitchSourceEnum.getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, abstractC33244msm.EZpvd(), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.mwz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final AbstractC33469mwz EZpvd(@NotNull ModeSwitchSourceEnum modeSwitchSourceEnum) {
            AbstractC33469mwz c33465mwv;
            Intrinsics.checkNotNullParameter(modeSwitchSourceEnum, "");
            pUU.EZpvd("ModeSwitch-BottomSheet", "Creating ModeSwitchBottomSheet with source=" + modeSwitchSourceEnum);
            if (C33123mqX.Companion.KWHzl().fARcdN()) {
                c33465mwv = new C33420mwC();
            } else {
                c33465mwv = new C33465mwv();
            }
            c33465mwv.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("MODE_SWITCH_SOURCE_PARAM", modeSwitchSourceEnum)));
            return c33465mwv;
        }
    }

    /* JADX INFO: renamed from: o.mwz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ AbstractC33469mwz EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ AbstractC33244msm copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, AbstractC33244msm abstractC33244msm, AbstractC33469mwz abstractC33469mwz) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = abstractC33244msm;
            this.EZpvd = abstractC33469mwz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                pUU.KWHzl("ModeSwitch-BottomSheet", "mode card clicked: " + this.copydefault);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.EZpvd), null, null, new ModeSwitchBottomSheet$onCreateContent$1$1$1(this.EZpvd, this.copydefault, null), 3, null);
            }
        }
    }
}
