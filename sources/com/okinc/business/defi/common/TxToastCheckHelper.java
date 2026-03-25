package com.okinc.business.defi.common;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentManager;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.net.bean.ClickType;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.common.TxToastCheckHelper;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C10332bmU;
import o.C10854bwM;
import o.C10856bwO;
import o.C13754dXa;
import o.C14079deg;
import o.C32866mlf;
import o.C33069mpW;
import o.C33129mqd;
import o.C52761wXj;
import o.C56390yDp;
import o.C56423yEv;
import o.C57599ylU;
import o.ViewOnClickListenerC21206gvQ;
import o.ViewOnClickListenerC21215gvZ;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class TxToastCheckHelper {
    public final Context AEQbTJ;
    public final StateListAnimator AYXKKw;
    public final List<TxToastCheckRes> AhwBna;
    public LinkedList<Integer> EZpvd;
    public boolean KWHzl;
    public final yHO<TxToastCheckRes, Boolean, Boolean, Unit> OLrzqt;
    public final String copydefault;
    public final FragmentManager djBIcL;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.yHO<? super com.okinc.business.defi.biz.net.bean.TxToastCheckRes, ? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public TxToastCheckHelper(@NotNull Context context, @NotNull FragmentManager fragmentManager, @NotNull StateListAnimator stateListAnimator, @NotNull List<TxToastCheckRes> list, @NotNull yHO<? super TxToastCheckRes, ? super Boolean, ? super Boolean, Unit> yho) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(yho, "");
        this.AEQbTJ = context;
        this.djBIcL = fragmentManager;
        this.AYXKKw = stateListAnimator;
        this.AhwBna = list;
        this.OLrzqt = yho;
        this.EZpvd = C10332bmU.Companion.KWHzl();
        this.copydefault = "TxToastCheckHelper";
    }

    public static /* synthetic */ void startCheck$default(TxToastCheckHelper txToastCheckHelper, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        txToastCheckHelper.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        this.KWHzl = z;
        AEQbTJ(OLrzqt(), Boolean.TRUE);
    }

    public final void AEQbTJ(final TxToastCheckRes txToastCheckRes, Boolean bool) {
        String string;
        String string2;
        String string3;
        if (txToastCheckRes == null) {
            this.OLrzqt.invoke(null, bool, null);
            return;
        }
        Integer checkType = txToastCheckRes.getCheckType();
        if (checkType != null && checkType.intValue() == 1) {
            if (Intrinsics.EZpvd(txToastCheckRes.getResult(), Boolean.TRUE)) {
                handleCheckPass$default(this, txToastCheckRes, null, 2, null);
                return;
            }
            handleCheckErr$default(this, txToastCheckRes, null, 2, null);
            if (C33129mqd.OLrzqt((CharSequence) txToastCheckRes.getMsg())) {
                if (Intrinsics.EZpvd(Looper.getMainLooper(), Looper.myLooper())) {
                    String msg = txToastCheckRes.getMsg();
                    if (msg != null) {
                        C57599ylU.copydefault(msg, 17, 0, 0);
                        return;
                    }
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.dfj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        TxToastCheckHelper.KWHzl(txToastCheckRes);
                    }
                });
                C10856bwO.EZpvd(this.copydefault, new WalletTxToastCheckHelperExceptionLog("current thread = " + Thread.currentThread().getName()));
                return;
            }
            C10856bwO.EZpvd(this.copydefault, new WalletTxToastCheckHelperExceptionLog("response.msg = \"" + txToastCheckRes.getMsg() + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR));
            return;
        }
        if (checkType != null && checkType.intValue() == 2) {
            if (!Intrinsics.EZpvd(txToastCheckRes.getResult(), Boolean.TRUE)) {
                C32866mlf.onEvent$default("Web3RiskBlocking_Sheet_Api_View", (TrackChannel[]) null, new Function1() { // from class: o.dfi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return TxToastCheckHelper.EZpvd(txToastCheckRes, (EventParamsList) obj);
                    }
                }, 1, (Object) null);
                DefiWalletVReminderDFragment.ActionBar actionBar = DefiWalletVReminderDFragment.Companion;
                int i = C52761wXj.TaskDescription.NRYds;
                String string4 = this.AEQbTJ.getString(C13754dXa.FragmentManager.AnimRes);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                if (this.AYXKKw.EZpvd()) {
                    string3 = this.AEQbTJ.getString(C13754dXa.FragmentManager.AppCompatDelegateImplActionBarDrawableToggleImpl);
                } else {
                    string3 = this.AEQbTJ.getString(C13754dXa.FragmentManager.fromParcel);
                }
                Intrinsics.copydefault((Object) string3);
                C14079deg c14079deg = C14079deg.EZpvd;
                String blackAddress = txToastCheckRes.getBlackAddress();
                if (blackAddress == null) {
                    blackAddress = "";
                }
                String strOLrzqt = C33069mpW.OLrzqt(string3, C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, C14079deg.getAddressStr$default(c14079deg, blackAddress, false, 2, null))));
                String string5 = this.AEQbTJ.getString(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaVisualMediaType);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                String string6 = this.AEQbTJ.getString(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaImageOnly);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                actionBar.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(i, null, string4, strOLrzqt, string5, string6, 2, null)).AEQbTJ(this.djBIcL, new Function1() { // from class: o.dfm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return TxToastCheckHelper.copydefault(this.OLrzqt, txToastCheckRes, (java.lang.Integer) obj);
                    }
                });
                return;
            }
            if (this.KWHzl && txToastCheckRes.isSimilarAddress()) {
                DefiWalletVReminderDFragment.ActionBar actionBar2 = DefiWalletVReminderDFragment.Companion;
                int i2 = C52761wXj.TaskDescription.NRYds;
                String string7 = this.AEQbTJ.getString(C13754dXa.FragmentManager.AnimRes);
                Intrinsics.checkNotNullExpressionValue(string7, "");
                String string8 = this.AEQbTJ.getString(C13754dXa.FragmentManager.MediaControllerCompatApi23TransportControls);
                Intrinsics.checkNotNullExpressionValue(string8, "");
                String strOLrzqt2 = C33069mpW.OLrzqt(string8, C56423yEv.EZpvd(C56390yDp.OLrzqt("contractaddress", C14079deg.getAddressStr$default(C14079deg.EZpvd, this.AYXKKw.AEQbTJ(), false, 2, null))));
                String string9 = this.AEQbTJ.getString(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaVisualMediaType);
                Intrinsics.checkNotNullExpressionValue(string9, "");
                String string10 = this.AEQbTJ.getString(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaImageOnly);
                Intrinsics.checkNotNullExpressionValue(string10, "");
                actionBar2.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(i2, null, string7, strOLrzqt2, string9, string10, 2, null)).AEQbTJ(this.djBIcL, new Function1() { // from class: o.dfl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return TxToastCheckHelper.AEQbTJ(this.AEQbTJ, txToastCheckRes, (java.lang.Integer) obj);
                    }
                });
                return;
            }
            handleCheckPass$default(this, txToastCheckRes, null, 2, null);
            return;
        }
        if (checkType != null && checkType.intValue() == 3) {
            if (Intrinsics.EZpvd(txToastCheckRes.getResult(), Boolean.TRUE)) {
                handleCheckPass$default(this, txToastCheckRes, null, 2, null);
                return;
            }
            DefiWalletVReminderDFragment.ActionBar actionBar3 = DefiWalletVReminderDFragment.Companion;
            int i3 = C52761wXj.TaskDescription.NRYds;
            String string11 = this.AEQbTJ.getString(C13754dXa.FragmentManager.AnimRes);
            Intrinsics.checkNotNullExpressionValue(string11, "");
            String strValueOf = String.valueOf(txToastCheckRes.getMsg());
            if (this.AYXKKw.EZpvd()) {
                string = this.AEQbTJ.getString(C13754dXa.FragmentManager.gdLjtZ);
            } else {
                string = this.AEQbTJ.getString(C13754dXa.FragmentManager.gdLjtZ);
            }
            String str = string;
            Intrinsics.copydefault((Object) str);
            if (this.AYXKKw.EZpvd()) {
                string2 = this.AEQbTJ.getString(C13754dXa.FragmentManager.sIqKDg);
            } else {
                string2 = this.AEQbTJ.getString(C13754dXa.FragmentManager.HJWChPOKBmQN);
            }
            String str2 = string2;
            Intrinsics.copydefault((Object) str2);
            actionBar3.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(i3, null, string11, strValueOf, str, str2, 2, null)).AEQbTJ(this.djBIcL, new Function1() { // from class: o.dfn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TxToastCheckHelper.AhwBna(this.OLrzqt, txToastCheckRes, (java.lang.Integer) obj);
                }
            });
            return;
        }
        if (checkType != null && checkType.intValue() == 4) {
            if (Intrinsics.EZpvd(txToastCheckRes.getResult(), Boolean.TRUE)) {
                handleCheckPass$default(this, txToastCheckRes, null, 2, null);
                return;
            } else {
                ViewOnClickListenerC21206gvQ.Companion.OLrzqt().OLrzqt(this.djBIcL, this.copydefault, new Application(txToastCheckRes));
                return;
            }
        }
        if (checkType == null || checkType.intValue() != 5) {
            if (checkType != null && checkType.intValue() == 6) {
                if (Intrinsics.EZpvd(txToastCheckRes.getResult(), Boolean.TRUE)) {
                    handleCheckPass$default(this, txToastCheckRes, null, 2, null);
                    return;
                } else {
                    handleCheckErr$default(this, txToastCheckRes, null, 2, null);
                    return;
                }
            }
            return;
        }
        if (Intrinsics.EZpvd(txToastCheckRes.getResult(), Boolean.TRUE)) {
            EZpvd(txToastCheckRes, Boolean.FALSE);
            return;
        }
        Integer toastType = txToastCheckRes.getToastType();
        if (toastType != null && toastType.intValue() == 1) {
            EZpvd(txToastCheckRes, Boolean.FALSE);
            return;
        }
        if ((toastType != null && toastType.intValue() == 2) || (toastType != null && toastType.intValue() == 3)) {
            ViewOnClickListenerC21215gvZ.Companion.copydefault(txToastCheckRes.getToastType(), txToastCheckRes.getPopUpTitle(), txToastCheckRes.getPopUpDesc(), txToastCheckRes.getPrimaryButtonName(), txToastCheckRes.getSecondaryButtonName()).KWHzl(this.djBIcL, this.copydefault, new Activity(txToastCheckRes));
        } else if (toastType != null && toastType.intValue() == 4) {
            ViewOnClickListenerC21215gvZ.Companion.copydefault(txToastCheckRes.getToastType(), txToastCheckRes.getPopUpTitle(), txToastCheckRes.getPopUpDesc(), txToastCheckRes.getPrimaryButtonName(), txToastCheckRes.getSecondaryButtonName()).KWHzl(this.djBIcL, this.copydefault, new ActionBar(txToastCheckRes));
        }
    }

    public static final void KWHzl(TxToastCheckRes txToastCheckRes) {
        String msg = txToastCheckRes.getMsg();
        if (msg != null) {
            C57599ylU.copydefault(msg, 17, 0, 0);
        }
    }

    public static final Unit EZpvd(TxToastCheckRes txToastCheckRes, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("resource", "app", true);
        String blackAddress = txToastCheckRes.getBlackAddress();
        EventParamsList.put$default(eventParamsList, "black_address", blackAddress == null ? "" : blackAddress, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(TxToastCheckHelper txToastCheckHelper, TxToastCheckRes txToastCheckRes, Integer num) {
        if ((num != null && num.intValue() == 1) || num == null || num.intValue() != 2) {
            handleCheckErr$default(txToastCheckHelper, txToastCheckRes, null, 2, null);
        } else {
            handleCheckPass$default(txToastCheckHelper, txToastCheckRes, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(TxToastCheckHelper txToastCheckHelper, TxToastCheckRes txToastCheckRes, Integer num) {
        if (num != null && num.intValue() == 1) {
            C32866mlf.onEvent$default("TransferSimilarAddressWarning_Pop_Reject_click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
            handleCheckErr$default(txToastCheckHelper, txToastCheckRes, null, 2, null);
        } else if (num != null && num.intValue() == 2) {
            handleCheckPass$default(txToastCheckHelper, txToastCheckRes, null, 2, null);
        } else {
            C32866mlf.onEvent$default("TransferSimilarAddressWarning_Pop_button_click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
            handleCheckErr$default(txToastCheckHelper, txToastCheckRes, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(TxToastCheckHelper txToastCheckHelper, TxToastCheckRes txToastCheckRes, Integer num) {
        if ((num != null && num.intValue() == 1) || num == null || num.intValue() != 2) {
            handleCheckErr$default(txToastCheckHelper, txToastCheckRes, null, 2, null);
        } else {
            handleCheckPass$default(txToastCheckHelper, txToastCheckRes, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements ViewOnClickListenerC21206gvQ.Application {
        public final /* synthetic */ TxToastCheckRes copydefault;

        public Application(TxToastCheckRes txToastCheckRes) {
            this.copydefault = txToastCheckRes;
        }

        @Override // o.ViewOnClickListenerC21206gvQ.Application
        public void copydefault(Bundle bundle) {
            Boolean boolValueOf = bundle != null ? Boolean.valueOf(bundle.getBoolean("tradeType")) : null;
            if (Intrinsics.EZpvd(boolValueOf, Boolean.TRUE)) {
                TxToastCheckHelper.handleCheckPass$default(TxToastCheckHelper.this, this.copydefault, null, 2, null);
            } else if (Intrinsics.EZpvd(boolValueOf, Boolean.FALSE)) {
                TxToastCheckHelper.handleCheckErr$default(TxToastCheckHelper.this, this.copydefault, null, 2, null);
            } else {
                TxToastCheckHelper.handleCheckCancel$default(TxToastCheckHelper.this, this.copydefault, null, 2, null);
            }
        }
    }

    public static final class Activity implements ViewOnClickListenerC21215gvZ.ActionBar {
        public final /* synthetic */ TxToastCheckRes copydefault;

        public Activity(TxToastCheckRes txToastCheckRes) {
            this.copydefault = txToastCheckRes;
        }

        @Override // o.ViewOnClickListenerC21215gvZ.ActionBar
        public void copydefault(Bundle bundle) {
            Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("clickType")) : null;
            int value = ClickType.CANCEL.getValue();
            if (numValueOf != null && numValueOf.intValue() == value) {
                TxToastCheckHelper.this.EZpvd(this.copydefault, Boolean.FALSE);
                return;
            }
            int value2 = ClickType.CONFIRM.getValue();
            if (numValueOf != null && numValueOf.intValue() == value2) {
                TxToastCheckHelper.this.EZpvd(this.copydefault, Boolean.TRUE);
            } else {
                TxToastCheckHelper.handleCheckCancel$default(TxToastCheckHelper.this, this.copydefault, null, 2, null);
            }
        }
    }

    public static final class ActionBar implements ViewOnClickListenerC21215gvZ.ActionBar {
        public final /* synthetic */ TxToastCheckRes KWHzl;

        public ActionBar(TxToastCheckRes txToastCheckRes) {
            this.KWHzl = txToastCheckRes;
        }

        @Override // o.ViewOnClickListenerC21215gvZ.ActionBar
        public void copydefault(Bundle bundle) {
            Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("clickType")) : null;
            int value = ClickType.CONFIRM.getValue();
            if (numValueOf != null && numValueOf.intValue() == value) {
                TxToastCheckHelper.this.EZpvd(this.KWHzl, Boolean.FALSE);
            } else {
                TxToastCheckHelper.handleCheckCancel$default(TxToastCheckHelper.this, this.KWHzl, null, 2, null);
            }
        }
    }

    public static /* synthetic */ void handleCheckPass$default(TxToastCheckHelper txToastCheckHelper, TxToastCheckRes txToastCheckRes, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        txToastCheckHelper.EZpvd(txToastCheckRes, bool);
    }

    public final void EZpvd(TxToastCheckRes txToastCheckRes, Boolean bool) {
        yHO<TxToastCheckRes, Boolean, Boolean, Unit> yho = this.OLrzqt;
        Boolean bool2 = Boolean.TRUE;
        yho.invoke(txToastCheckRes, bool2, bool);
        AEQbTJ(OLrzqt(), bool2);
    }

    public static /* synthetic */ void handleCheckErr$default(TxToastCheckHelper txToastCheckHelper, TxToastCheckRes txToastCheckRes, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        txToastCheckHelper.OLrzqt(txToastCheckRes, bool);
    }

    public final void OLrzqt(TxToastCheckRes txToastCheckRes, Boolean bool) {
        yHO<TxToastCheckRes, Boolean, Boolean, Unit> yho = this.OLrzqt;
        Boolean bool2 = Boolean.FALSE;
        yho.invoke(txToastCheckRes, bool2, bool);
        AEQbTJ(null, bool2);
    }

    public static /* synthetic */ void handleCheckCancel$default(TxToastCheckHelper txToastCheckHelper, TxToastCheckRes txToastCheckRes, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        txToastCheckHelper.KWHzl(txToastCheckRes, bool);
    }

    public final void KWHzl(TxToastCheckRes txToastCheckRes, Boolean bool) {
        this.OLrzqt.invoke(txToastCheckRes, null, bool);
        AEQbTJ(null, null);
    }

    public final TxToastCheckRes OLrzqt() {
        Integer numPoll = this.EZpvd.poll();
        Object obj = null;
        if (numPoll == null) {
            return null;
        }
        int iIntValue = numPoll.intValue();
        Iterator<T> it = this.AhwBna.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Integer checkType = ((TxToastCheckRes) next).getCheckType();
            if (checkType != null && checkType.intValue() == iIntValue) {
                obj = next;
                break;
            }
        }
        TxToastCheckRes txToastCheckRes = (TxToastCheckRes) obj;
        return txToastCheckRes == null ? OLrzqt() : txToastCheckRes;
    }

    public static final class StateListAnimator {
        public boolean AEQbTJ;
        public String EZpvd;
        public C10854bwM KWHzl;
        public String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, String str2, C10854bwM c10854bwM, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.EZpvd;
            }
            if ((i & 4) != 0) {
                c10854bwM = stateListAnimator.KWHzl;
            }
            if ((i & 8) != 0) {
                z = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.AEQbTJ(str, str2, c10854bwM, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull C10854bwM c10854bwM, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            return new StateListAnimator(str, str2, c10854bwM, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && this.AEQbTJ == stateListAnimator.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TxData(from=" + this.OLrzqt + ", to=" + this.EZpvd + ", coinMeta=" + this.KWHzl + ", isNormalTx=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull String str, @NotNull String str2, @NotNull C10854bwM c10854bwM, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            this.OLrzqt = str;
            this.EZpvd = str2;
            this.KWHzl = c10854bwM;
            this.AEQbTJ = z;
        }
    }

    public static final class WalletTxToastCheckHelperExceptionLog extends OKWException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WalletTxToastCheckHelperExceptionLog(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }
}
