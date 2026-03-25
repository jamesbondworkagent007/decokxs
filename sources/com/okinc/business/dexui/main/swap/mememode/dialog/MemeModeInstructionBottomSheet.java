package com.okinc.business.dexui.main.swap.mememode.dialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexui.main.swap.mememode.dialog.MemeModeInstructionBottomSheet;
import com.okinc.business.dexui.main.swap.mememode.dialog.adapter.MemeIntroType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC24309ibR;
import o.ActivityC21811hNe;
import o.C21576hEm;
import o.C23274hvD;
import o.C24313ibV;
import o.C24316ibY;
import o.C24317ibZ;
import o.C24372icb;
import o.C24373icc;
import o.C24374icd;
import o.C31200lpY;
import o.C33070mpX;
import o.C56392yDr;
import o.C7865arr;
import o.InterfaceC28107kPd;
import o.InterfaceC56387yDm;
import o.kMM;
import o.kMU;
import o.wXQ;
import o.wYF;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MemeModeInstructionBottomSheet extends AbstractC24309ibR {

    @yCM
    public InterfaceC28107kPd activityScopeCache;
    public Function0<Unit> gEmmrt;
    public C21576hEm valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AhwBna = 8;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ibP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MemeModeInstructionBottomSheet.valueOf(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ibX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MemeModeInstructionBottomSheet.EZpvd(this.KWHzl);
        }
    });

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MemeIntroType.values().length];
            try {
                iArr[MemeIntroType.MEME_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MemeIntroType.MEME_MODE_STRATEGY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeModeInstructionBottomSheet AEQbTJ(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.gEmmrt = function0;
        return this;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.swap.mememode.dialog.MemeModeInstructionBottomSheet.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final MemeModeInstructionBottomSheet OLrzqt(@NotNull MemeIntroType memeIntroType) {
            Intrinsics.checkNotNullParameter(memeIntroType, "");
            MemeModeInstructionBottomSheet memeModeInstructionBottomSheet = new MemeModeInstructionBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putSerializable("data", memeIntroType);
            memeModeInstructionBottomSheet.setArguments(bundle);
            return memeModeInstructionBottomSheet;
        }
    }

    /* JADX DEBUG: Possible override for method o.ibR.EZpvd()V */
    public final InterfaceC28107kPd EZpvd() {
        InterfaceC28107kPd interfaceC28107kPd = this.activityScopeCache;
        if (interfaceC28107kPd != null) {
            return interfaceC28107kPd;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final MemeIntroType djBIcL() {
        return (MemeIntroType) this.AYXKKw.getValue();
    }

    public static final MemeIntroType valueOf(MemeModeInstructionBottomSheet memeModeInstructionBottomSheet) {
        Object serializable;
        Bundle arguments = memeModeInstructionBottomSheet.getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("data", MemeIntroType.class);
            } else {
                serializable = (MemeIntroType) arguments.getSerializable("data");
            }
            MemeIntroType memeIntroType = (MemeIntroType) serializable;
            if (memeIntroType != null) {
                return memeIntroType;
            }
        }
        return MemeIntroType.MEME_MODE;
    }

    private final kMM AYXKKw() {
        return (kMM) this.djBIcL.getValue();
    }

    public static final kMM EZpvd(final MemeModeInstructionBottomSheet memeModeInstructionBottomSheet) {
        kMM kmm = new kMM();
        kmm.register(C24374icd.class, new C24316ibY(new Function0() { // from class: o.ibT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeModeInstructionBottomSheet.AEQbTJ(this.KWHzl);
            }
        }));
        kmm.register(C24317ibZ.class, new C24313ibV());
        kmm.register(C24373icc.class, new C24372icb());
        return kmm;
    }

    public static final Unit AEQbTJ(MemeModeInstructionBottomSheet memeModeInstructionBottomSheet) {
        Intent intent = new Intent(memeModeInstructionBottomSheet.requireContext(), (Class<?>) ActivityC21811hNe.class);
        C31200lpY.EZpvd(intent, memeModeInstructionBottomSheet.EZpvd().KWHzl());
        intent.putExtra("swap_type", "Web3_DEX_LIMIT_ORDER");
        memeModeInstructionBottomSheet.startActivity(intent);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.valueOf = C21576hEm.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
        this.gEmmrt = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.valueOf = null;
        super.onDestroyView();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        List<kMU> listValueOf;
        RecyclerView recyclerView;
        AppCompatTextView appCompatTextView;
        String strAYXKKw;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C21576hEm c21576hEm = this.valueOf;
        if (c21576hEm != null && (appCompatTextView = c21576hEm.OLrzqt) != null) {
            int i = ActionBar.EZpvd[djBIcL().ordinal()];
            if (i == 1) {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.setTitle);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.getItem);
            }
            appCompatTextView.setText(strAYXKKw);
        }
        C21576hEm c21576hEm2 = this.valueOf;
        if (c21576hEm2 != null && (recyclerView = c21576hEm2.copydefault) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            recyclerView.setAdapter(AYXKKw());
        }
        kMM kmmAYXKKw = AYXKKw();
        int i2 = ActionBar.EZpvd[djBIcL().ordinal()];
        if (i2 == 1) {
            listValueOf = valueOf();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listValueOf = AhwBna();
        }
        kMM.setData$default(kmmAYXKKw, listValueOf, null, 2, null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        ViewGroup.LayoutParams layoutParams = wyf.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) layoutParams, C7865arr.copydefault(8.0f));
        ViewGroup.LayoutParams layoutParams2 = wyf.getLayoutParams();
        Intrinsics.copydefault(layoutParams2, "");
        MarginLayoutParamsCompat.setMarginEnd((ViewGroup.MarginLayoutParams) layoutParams2, C7865arr.copydefault(8.0f));
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.QVAiDq));
        wyf.setOnClickListener(new View.OnClickListener() { // from class: o.ibQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MemeModeInstructionBottomSheet.copydefault(this.copydefault, view);
            }
        });
        wyf.setContentDescription("dex_meme_intro_ok_button");
    }

    public static final void copydefault(MemeModeInstructionBottomSheet memeModeInstructionBottomSheet, View view) {
        memeModeInstructionBottomSheet.dismissAllowingStateLoss();
    }

    public final List<kMU> AhwBna() {
        return yDY.gEmmrt(new C24373icc(C33070mpX.AYXKKw(C23274hvD.Fragment.subscribe), C33070mpX.AYXKKw(C23274hvD.Fragment.IconCompatParcelizer)), new C24373icc(C33070mpX.AYXKKw(C23274hvD.Fragment.search), C33070mpX.AYXKKw(C23274hvD.Fragment.disconnect)), new C24373icc(C33070mpX.AYXKKw(C23274hvD.Fragment.unsubscribe), C33070mpX.AYXKKw(C23274hvD.Fragment.connect)), new C24373icc(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatCallbackHandler), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompat)), new C24374icd(C33070mpX.AYXKKw(C23274hvD.Fragment.QOLQEE)));
    }

    public final List<kMU> valueOf() {
        return yDY.gEmmrt(new C24317ibZ(C33070mpX.AYXKKw(C23274hvD.Fragment.setSubtitle), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompat)), new C24317ibZ(C33070mpX.AYXKKw(C23274hvD.Fragment.fromParcel), C33070mpX.AYXKKw(C23274hvD.Fragment.onChildrenLoaded)), new C24317ibZ(C33070mpX.AYXKKw(C23274hvD.Fragment.setMediaUri), C33070mpX.AYXKKw(C23274hvD.Fragment.getMediaMetadata)));
    }
}
