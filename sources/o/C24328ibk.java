package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.business.dexlogic.track.enums.DexHistoryDetailsFullPageClick;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ibk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24328ibk extends android.widget.FrameLayout {
    public C21634hGq OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24328ibk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24328ibk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24328ibk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24328ibk(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void KWHzl(android.content.Context context) {
        this.OLrzqt = C21634hGq.OLrzqt(android.view.LayoutInflater.from(context), this, true);
    }

    public final void setAccelerateSize(int i) {
        C21634hGq c21634hGq = this.OLrzqt;
        if (c21634hGq != null) {
            c21634hGq.AEQbTJ.setOKDSSize(i);
            c21634hGq.OLrzqt.setOKDSSize(i);
            c21634hGq.copydefault.setOKDSSize(i);
        }
    }

    public final void setOKDSType(int i) {
        C21634hGq c21634hGq = this.OLrzqt;
        if (c21634hGq != null) {
            c21634hGq.AEQbTJ.setOKDSType(i);
            c21634hGq.OLrzqt.setOKDSType(i);
            c21634hGq.copydefault.setOKDSType(i);
        }
    }

    public static /* synthetic */ void startCancelTx$default(C24328ibk c24328ibk, androidx.fragment.app.FragmentManager fragmentManager, WalletTxDetailBean walletTxDetailBean, java.lang.String str, yHO yho, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        c24328ibk.copydefault(fragmentManager, walletTxDetailBean, str, (yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit>) yho);
    }

    public final void copydefault(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final WalletTxDetailBean walletTxDetailBean, final java.lang.String str, final yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        C21634hGq c21634hGq = this.OLrzqt;
        if (c21634hGq != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c21634hGq.OLrzqt, 0L, new Function1() { // from class: o.ibm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24328ibk.AEQbTJ(this.EZpvd, walletTxDetailBean, str, fragmentManager, yho, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit AEQbTJ(C24328ibk c24328ibk, WalletTxDetailBean walletTxDetailBean, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, yHO yho, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c24328ibk.copydefault(DexHistoryDetailsFullPageClick.ButtonName.CANCEL.getValue(), walletTxDetailBean, str);
        ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).AEQbTJ(fragmentManager, walletTxDetailBean, yho);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void startSpeedUpTx$default(C24328ibk c24328ibk, androidx.fragment.app.FragmentManager fragmentManager, WalletTxDetailBean walletTxDetailBean, java.lang.String str, yHO yho, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        c24328ibk.EZpvd(fragmentManager, walletTxDetailBean, str, (yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit>) yho);
    }

    public final void EZpvd(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final WalletTxDetailBean walletTxDetailBean, final java.lang.String str, final yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        C21634hGq c21634hGq = this.OLrzqt;
        if (c21634hGq != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c21634hGq.AEQbTJ, 0L, new Function1() { // from class: o.ibj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24328ibk.gEmmrt(this.EZpvd, walletTxDetailBean, str, fragmentManager, yho, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit gEmmrt(C24328ibk c24328ibk, WalletTxDetailBean walletTxDetailBean, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, yHO yho, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c24328ibk.copydefault(DexHistoryDetailsFullPageClick.ButtonName.SPEED_UP.getValue(), walletTxDetailBean, str);
        ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).copydefault(fragmentManager, walletTxDetailBean, (yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit>) yho);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void startSpeedUpCancelTx$default(C24328ibk c24328ibk, androidx.fragment.app.FragmentManager fragmentManager, WalletTxDetailBean walletTxDetailBean, java.lang.String str, yHO yho, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        c24328ibk.KWHzl(fragmentManager, walletTxDetailBean, str, yho);
    }

    public final void KWHzl(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final WalletTxDetailBean walletTxDetailBean, final java.lang.String str, final yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        C21634hGq c21634hGq = this.OLrzqt;
        if (c21634hGq != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c21634hGq.copydefault, 0L, new Function1() { // from class: o.ibi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24328ibk.OLrzqt(this.OLrzqt, walletTxDetailBean, str, fragmentManager, yho, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit OLrzqt(C24328ibk c24328ibk, WalletTxDetailBean walletTxDetailBean, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, yHO yho, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c24328ibk.copydefault(DexHistoryDetailsFullPageClick.ButtonName.SPEED_UP_CANCEL.getValue(), walletTxDetailBean, str);
        ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).KWHzl(fragmentManager, walletTxDetailBean, yho);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void updateState$default(C24328ibk c24328ibk, AccelerateBean accelerateBean, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        c24328ibk.copydefault(accelerateBean, str, z, str2);
    }

    public final void copydefault(@NotNull AccelerateBean accelerateBean, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(accelerateBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C21634hGq c21634hGq = this.OLrzqt;
        if (c21634hGq != null) {
            if (accelerateBean.isNeedDismiss() || C22822hmc.EZpvd(str) || str2.length() == 0 || z || accelerateBean.isNotSingleSwap()) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            c21634hGq.OLrzqt.setVisibility(accelerateBean.isShowCancel() ? 0 : 8);
            c21634hGq.AEQbTJ.setVisibility(accelerateBean.isShowSpeedUp() ? 0 : 8);
            c21634hGq.copydefault.setVisibility(accelerateBean.isShowSpeedUpCancel() ? 0 : 8);
        }
    }

    public final void copydefault(final java.lang.String str, final WalletTxDetailBean walletTxDetailBean, final java.lang.String str2) {
        C32866mlf.onEvent$default("DEXHistoryDetail_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.ibh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24328ibk.EZpvd(walletTxDetailBean, str2, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(WalletTxDetailBean walletTxDetailBean, java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String address = walletTxDetailBean.getAddress();
        if (address == null) {
            address = "";
        }
        eventParamsList.put("wallet_address", address, false);
        if (str == null) {
            str = "";
        }
        eventParamsList.put("orderId", str, false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str2, true);
        return Unit.INSTANCE;
    }
}
