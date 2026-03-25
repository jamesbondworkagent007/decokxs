package com.okinc.business.defi.wallet.walletaddressbinding;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.business.defi.wallet.walletaddressbinding.WalletCefiBindingResultBottomSheet;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52794wYp;
import o.C55178xez;
import o.C56390yDp;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.wXQ;
import o.wXX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletCefiBindingResultBottomSheet extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CefiResultStatus.values().length];
            try {
                iArr[CefiResultStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CefiResultStatus.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CefiResultStatus.ALREADY_BOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
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
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("result_status") : null;
        CefiResultStatus cefiResultStatus = serializable instanceof CefiResultStatus ? (CefiResultStatus) serializable : null;
        if (cefiResultStatus == null) {
            return;
        }
        Context context = constraintLayout.getContext();
        Intrinsics.copydefault(context);
        constraintLayout.addView(EZpvd(context, cefiResultStatus), -1, -1);
    }

    public final C55178xez EZpvd(Context context, CefiResultStatus cefiResultStatus) {
        C55178xez c55178xez = new C55178xez(context, null, 2, null);
        c55178xez.copydefault().setGravity(8388611);
        ViewParent parent = c55178xez.AEQbTJ().getParent();
        Intrinsics.copydefault(parent, "");
        ((ViewGroup) parent).setVisibility(8);
        c55178xez.AEQbTJ().setVisibility(8);
        c55178xez.OLrzqt().setType(5);
        C52794wYp c52794wYpCopydefault = c55178xez.OLrzqt().copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.gJP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    WalletCefiBindingResultBottomSheet.OLrzqt(this.EZpvd, view);
                }
            });
        }
        int i = Activity.OLrzqt[cefiResultStatus.ordinal()];
        if (i == 1) {
            c55178xez.setStatus(4);
            c55178xez.KWHzl().setVisibility(0);
            c55178xez.setTitleText(context.getString(C13754dXa.FragmentManager.DzCpqu));
            c55178xez.setSubTitleText(context.getString(C13754dXa.FragmentManager.hwXsuq));
            C52794wYp c52794wYpCopydefault2 = c55178xez.OLrzqt().copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setText(context.getString(C13754dXa.FragmentManager.HJWChPhFGucI));
            }
        } else if (i == 2) {
            c55178xez.setStatus(3);
            c55178xez.KWHzl().setVisibility(0);
            c55178xez.setTitleText(context.getString(C13754dXa.FragmentManager.HJWChPiaHEvk));
            c55178xez.setSubTitleText(context.getString(C13754dXa.FragmentManager.aBDePw));
            C52794wYp c52794wYpCopydefault3 = c55178xez.OLrzqt().copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setText(context.getString(C13754dXa.FragmentManager.xxhdY));
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c55178xez.KWHzl().setVisibility(8);
            c55178xez.setTitleText(context.getString(C13754dXa.FragmentManager.DzCpqu));
            c55178xez.setSubTitleText(context.getString(C13754dXa.FragmentManager.UCQKYV));
            C52794wYp c52794wYpCopydefault4 = c55178xez.OLrzqt().copydefault();
            if (c52794wYpCopydefault4 != null) {
                c52794wYpCopydefault4.setText(context.getString(C13754dXa.FragmentManager.xxhdY));
            }
        }
        return c55178xez;
    }

    public static final void OLrzqt(WalletCefiBindingResultBottomSheet walletCefiBindingResultBottomSheet, View view) {
        walletCefiBindingResultBottomSheet.dismiss();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.walletaddressbinding.WalletCefiBindingResultBottomSheet.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ WalletCefiBindingResultBottomSheet newInstance$default(TaskDescription taskDescription, CefiResultStatus cefiResultStatus, DialogInterface.OnDismissListener onDismissListener, int i, Object obj) {
            if ((i & 2) != 0) {
                onDismissListener = null;
            }
            return taskDescription.OLrzqt(cefiResultStatus, onDismissListener);
        }

        public final WalletCefiBindingResultBottomSheet OLrzqt(@NotNull CefiResultStatus cefiResultStatus, DialogInterface.OnDismissListener onDismissListener) {
            Intrinsics.checkNotNullParameter(cefiResultStatus, "");
            WalletCefiBindingResultBottomSheet walletCefiBindingResultBottomSheet = new WalletCefiBindingResultBottomSheet();
            walletCefiBindingResultBottomSheet.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("result_status", cefiResultStatus)));
            walletCefiBindingResultBottomSheet.setOnDismissListener(onDismissListener);
            return walletCefiBindingResultBottomSheet;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CefiResultStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ CefiResultStatus[] $VALUES;
        public static final CefiResultStatus SUCCESS = new CefiResultStatus("SUCCESS", 0);
        public static final CefiResultStatus CANCEL = new CefiResultStatus("CANCEL", 1);
        public static final CefiResultStatus ALREADY_BOUND = new CefiResultStatus("ALREADY_BOUND", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ CefiResultStatus[] $values() {
            return new CefiResultStatus[]{SUCCESS, CANCEL, ALREADY_BOUND};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<CefiResultStatus> getEntries() {
            return $ENTRIES;
        }

        private CefiResultStatus(String str, int i) {
        }

        static {
            CefiResultStatus[] cefiResultStatusArr$values = $values();
            $VALUES = cefiResultStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(cefiResultStatusArr$values);
        }

        public static CefiResultStatus valueOf(String str) {
            return (CefiResultStatus) Enum.valueOf(CefiResultStatus.class, str);
        }

        public static CefiResultStatus[] values() {
            return (CefiResultStatus[]) $VALUES.clone();
        }
    }
}
