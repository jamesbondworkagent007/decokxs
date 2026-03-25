package com.okinc.business.defi.wallet.home.onboarding.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.net.bean.CheckCreateAvailableResp;
import com.okinc.business.defi.biz.net.bean.NftCollection;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC43419rot;
import o.C10854bwM;
import o.C10948byA;
import o.C13754dXa;
import o.C13934dbu;
import o.C14687dqE;
import o.C14728dqt;
import o.C18192fdk;
import o.C33057mpK;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33492mxV;
import o.C52761wXj;
import o.C54862xYb;
import o.C55298xhM;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC18118fcP;
import o.InterfaceC18127fcY;
import o.pTB;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiOnboardingViewModel extends ViewModel {
    public final C18192fdk AEQbTJ;
    public final StateFlow<InterfaceC18118fcP> EZpvd;
    public final MutableStateFlow<InterfaceC18118fcP> KWHzl;
    public final C13934dbu OLrzqt;
    public final C10948byA copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC18118fcP> OLrzqt() {
        return this.EZpvd;
    }

    @yCM
    public DefiOnboardingViewModel(@NotNull C13934dbu c13934dbu, @NotNull C10948byA c10948byA) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        this.OLrzqt = c13934dbu;
        this.copydefault = c10948byA;
        MutableStateFlow<InterfaceC18118fcP> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC18118fcP.Application.AEQbTJ);
        this.KWHzl = MutableStateFlow;
        this.EZpvd = MutableStateFlow;
        this.AEQbTJ = new C18192fdk(c13934dbu);
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DefiOnboardingViewModel$loadData$1(this, null), 3, null);
    }

    public final List<DefiOnboardingTile> copydefault(List<NftCollection> list, String str) {
        List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.addAll(AEQbTJ());
        listOLrzqt.add(new DefiOnboardingTile.Activity(16.0f));
        listOLrzqt.addAll(copydefault());
        listOLrzqt.addAll(EZpvd(new DefiOnboardingTile.Activity(45.0f), new DefiOnboardingTile.Activity(24.0f)));
        if (!list.isEmpty()) {
            listOLrzqt.addAll(EZpvd(list));
            listOLrzqt.addAll(EZpvd(new DefiOnboardingTile.Activity(40.0f), new DefiOnboardingTile.Activity(0.0f)));
        }
        listOLrzqt.addAll(AEQbTJ(str));
        listOLrzqt.addAll(EZpvd(new DefiOnboardingTile.Activity(40.0f), new DefiOnboardingTile.Activity(0.0f)));
        if (!C14687dqE.OLrzqt.isConnected()) {
            listOLrzqt.addAll(EZpvd());
        }
        listOLrzqt.add(new DefiOnboardingTile.Activity(110.0f));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final List<DefiOnboardingTile> AEQbTJ() {
        StringBuilder sb = new StringBuilder();
        sb.append(C33070mpX.AYXKKw(C13754dXa.FragmentManager.applyOverrideConfiguration));
        C14687dqE c14687dqE = C14687dqE.OLrzqt;
        if (!c14687dqE.djBIcL()) {
            sb.append(" · ");
            sb.append(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplAutoTimeNightModeManager));
        }
        if (!c14687dqE.AkhnZx()) {
            sb.append(" · ");
            sb.append(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplAutoNightModeManager1));
        }
        if (!c14687dqE.isConnected()) {
            sb.append(" · ");
            sb.append(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplAutoNightModeManager));
        }
        if (!c14687dqE.AhwBna()) {
            sb.append(" · ");
            sb.append(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setup));
        }
        String string = sb.toString();
        List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(new DefiOnboardingTile.Activity(398.0f));
        listOLrzqt.add(new DefiOnboardingTile.TextTile(null, DefiOnboardingTile.TextTile.TextStyle.Header, null, 8388611, null, null, Integer.valueOf(C13754dXa.FragmentManager.lambdaexecute0), 53, null));
        listOLrzqt.add(new DefiOnboardingTile.Activity(8.0f));
        listOLrzqt.add(new DefiOnboardingTile.TextTile(null, DefiOnboardingTile.TextTile.TextStyle.Desc, string, 8388611, null, null, null, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, null));
        listOLrzqt.add(new DefiOnboardingTile.Activity(16.0f));
        if (!C14728dqt.KWHzl.OLrzqt()) {
            listOLrzqt.add(new DefiOnboardingTile.ButtonTile(InterfaceC18127fcY.StateListAnimator.AEQbTJ, DefiOnboardingTile.ButtonTile.ButtonStyle.Filled, DefiOnboardingTile.ButtonTile.ButtonWidth.MatchParent, DefiOnboardingTile.ButtonTile.ButtonHeight.DEFAULT, null, 0, 0, Integer.valueOf(C13754dXa.FragmentManager.onPanelClosed), WalletImportError.ERROR_CODE_AA_EXIST, null));
            listOLrzqt.add(new DefiOnboardingTile.Activity(12.0f));
        }
        listOLrzqt.add(new DefiOnboardingTile.ButtonTile(InterfaceC18127fcY.Application.AEQbTJ, DefiOnboardingTile.ButtonTile.ButtonStyle.Outlined, DefiOnboardingTile.ButtonTile.ButtonWidth.MatchParent, DefiOnboardingTile.ButtonTile.ButtonHeight.DEFAULT, null, 0, 0, Integer.valueOf(C13754dXa.FragmentManager.onNewIntent), WalletImportError.ERROR_CODE_AA_EXIST, null));
        listOLrzqt.add(new DefiOnboardingTile.Activity(24.0f));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final List<DefiOnboardingTile> copydefault() {
        Drawable drawable;
        List<C10854bwM> listDjBIcL = this.copydefault.djBIcL();
        List listOLrzqt = C56402yEa.OLrzqt();
        if (C33129mqd.KWHzl((Collection) listDjBIcL)) {
            listOLrzqt.add(new DefiOnboardingTile.Activity(34.0f));
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
            for (C10854bwM c10854bwM : listDjBIcL) {
                arrayList.add(new DefiOnboardingTile.TokenGroupTile.TokenInfo(c10854bwM.djBIcL(), c10854bwM.copydefault()));
            }
            listOLrzqt.add(new DefiOnboardingTile.TokenGroupTile(arrayList));
            listOLrzqt.add(new DefiOnboardingTile.Activity(53.0f));
            listOLrzqt.add(new DefiOnboardingTile.TextTile(null, DefiOnboardingTile.TextTile.TextStyle.Header, C33069mpW.copydefault(C13754dXa.FragmentManager.getFlagsValues, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", copydefault(listDjBIcL.size()) + Marker.ANY_NON_NULL_MARKER))), 8388611, null, null, null, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, null));
            listOLrzqt.add(new DefiOnboardingTile.Activity(24.0f));
            DefiOnboardingTile.TextTile.TextStyle textStyle = DefiOnboardingTile.TextTile.TextStyle.TextButton;
            String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultRegistry3);
            Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.onStatusChanged);
            if (drawableKWHzl != null) {
                C33057mpK.copydefault(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.DTeKQX));
                drawableKWHzl.setBounds(C55298xhM.dpInt$default(26, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(26, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(16, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(16, (Context) null, 1, (Object) null));
                Unit unit = Unit.INSTANCE;
                drawable = drawableKWHzl;
            } else {
                drawable = null;
            }
            listOLrzqt.add(new DefiOnboardingTile.TextTile(InterfaceC18127fcY.TaskDescription.C0849TaskDescription.copydefault, textStyle, strAYXKKw, 16, null, new DefiOnboardingTile.TextTile.Application(null, null, drawable, null, 11, null), null, 80, null));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final int copydefault(int i) {
        return (i / 10) * 10;
    }

    public final List<DefiOnboardingTile> EZpvd(List<NftCollection> list) {
        Drawable drawable;
        List listOLrzqt = C56402yEa.OLrzqt();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (NftCollection nftCollection : list) {
            arrayList.add(new DefiOnboardingTile.TaskDescription.ActionBar(nftCollection.getId(), nftCollection.getProjectName(), nftCollection.getChain(), nftCollection.getLastSoldNftImage()));
        }
        listOLrzqt.add(new DefiOnboardingTile.TaskDescription(arrayList));
        listOLrzqt.add(new DefiOnboardingTile.Activity(32.0f));
        listOLrzqt.add(new DefiOnboardingTile.TextTile(null, DefiOnboardingTile.TextTile.TextStyle.Header, null, 8388611, null, null, Integer.valueOf(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBase5), 53, null));
        listOLrzqt.add(new DefiOnboardingTile.Activity(17.0f));
        DefiOnboardingTile.TextTile.TextStyle textStyle = DefiOnboardingTile.TextTile.TextStyle.TextButton;
        String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplApi215);
        Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.onStatusChanged);
        if (drawableKWHzl != null) {
            C33057mpK.copydefault(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.DTeKQX));
            drawableKWHzl.setBounds(C55298xhM.dpInt$default(26, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(26, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(16, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(16, (Context) null, 1, (Object) null));
            Unit unit = Unit.INSTANCE;
            drawable = drawableKWHzl;
        } else {
            drawable = null;
        }
        listOLrzqt.add(new DefiOnboardingTile.TextTile(InterfaceC18127fcY.TaskDescription.Application.EZpvd, textStyle, strAYXKKw, TextAlign.LEFT, null, new DefiOnboardingTile.TextTile.Application(null, null, drawable, null, 11, null), null, 80, null));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final List<DefiOnboardingTile> AEQbTJ(String str) {
        Drawable drawable;
        List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(new DefiOnboardingTile.Activity(32.0f));
        listOLrzqt.add(new DefiOnboardingTile.StateListAnimator(null, null, Integer.valueOf(C13754dXa.Activity.OcIXYQ), C55298xhM.dpInt$default(261, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(32, (Context) null, 1, (Object) null), new Rect(C55298xhM.dpInt$default(20, (Context) null, 1, (Object) null), 0, 0, 0), 3, null));
        listOLrzqt.add(new DefiOnboardingTile.Activity(24.0f));
        listOLrzqt.add(new DefiOnboardingTile.StateListAnimator(null, null, Integer.valueOf(C13754dXa.Activity.QOLQEE), C55298xhM.dpInt$default(CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(58, (Context) null, 1, (Object) null), new Rect(C55298xhM.dpInt$default(20, (Context) null, 1, (Object) null), 0, 0, 0), 3, null));
        if (str != null) {
            listOLrzqt.add(new DefiOnboardingTile.Activity(16.0f));
            listOLrzqt.add(new DefiOnboardingTile.TextTile(null, DefiOnboardingTile.TextTile.TextStyle.Content, pTB.formatDownToFixed$default(C54862xYb.OLrzqt(str, Double.valueOf(0.1d)), 2, null, 2, null) + " USDT", 8388611, new DefiOnboardingTile.TextTile.TaskDescription(C55298xhM.dpInt$default(20, (Context) null, 1, (Object) null), 0, 0, 0), null, null, 97, null));
        }
        listOLrzqt.add(new DefiOnboardingTile.Activity(72.0f));
        listOLrzqt.add(new DefiOnboardingTile.TextTile(null, DefiOnboardingTile.TextTile.TextStyle.Header, null, 8388611, null, null, Integer.valueOf(C13754dXa.FragmentManager.fromMediaItemList), 53, null));
        listOLrzqt.add(new DefiOnboardingTile.Activity(24.0f));
        DefiOnboardingTile.TextTile.TextStyle textStyle = DefiOnboardingTile.TextTile.TextStyle.TextButton;
        String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplApi214);
        Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.onStatusChanged);
        if (drawableKWHzl != null) {
            C33057mpK.copydefault(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.DTeKQX));
            drawableKWHzl.setBounds(C55298xhM.dpInt$default(26, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(26, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(16, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(16, (Context) null, 1, (Object) null));
            Unit unit = Unit.INSTANCE;
            drawable = drawableKWHzl;
        } else {
            drawable = null;
        }
        listOLrzqt.add(new DefiOnboardingTile.TextTile(InterfaceC18127fcY.TaskDescription.ActionBar.OLrzqt, textStyle, strAYXKKw, 8388611, null, new DefiOnboardingTile.TextTile.Application(null, null, drawable, null, 11, null), null, 80, null));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final List<DefiOnboardingTile> EZpvd() {
        Drawable drawable;
        List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(new DefiOnboardingTile.StateListAnimator(null, ImageView.ScaleType.FIT_XY, Integer.valueOf(C13754dXa.Activity.sSMYrx), 0, C55298xhM.dpInt$default(276, (Context) null, 1, (Object) null), null, 41, null));
        listOLrzqt.add(new DefiOnboardingTile.Activity(48.0f));
        listOLrzqt.add(new DefiOnboardingTile.TextTile(null, DefiOnboardingTile.TextTile.TextStyle.Header, null, 8388611, null, null, Integer.valueOf(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1), 53, null));
        listOLrzqt.add(new DefiOnboardingTile.Activity(24.0f));
        DefiOnboardingTile.TextTile.TextStyle textStyle = DefiOnboardingTile.TextTile.TextStyle.TextButton;
        String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplApi217);
        Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.onStatusChanged);
        if (drawableKWHzl != null) {
            C33057mpK.copydefault(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.DTeKQX));
            drawableKWHzl.setBounds(C55298xhM.dpInt$default(26, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(26, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(16, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(16, (Context) null, 1, (Object) null));
            Unit unit = Unit.INSTANCE;
            drawable = drawableKWHzl;
        } else {
            drawable = null;
        }
        listOLrzqt.add(new DefiOnboardingTile.TextTile(InterfaceC18127fcY.TaskDescription.StateListAnimator.KWHzl, textStyle, strAYXKKw, 8388611, null, new DefiOnboardingTile.TextTile.Application(null, null, drawable, null, 11, null), null, 80, null));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public static /* synthetic */ List genSeparator$default(DefiOnboardingViewModel defiOnboardingViewModel, DefiOnboardingTile.Activity activity, DefiOnboardingTile.Activity activity2, int i, Object obj) {
        if ((i & 1) != 0) {
            activity = null;
        }
        if ((i & 2) != 0) {
            activity2 = null;
        }
        return defiOnboardingViewModel.EZpvd(activity, activity2);
    }

    public final List<DefiOnboardingTile> EZpvd(DefiOnboardingTile.Activity activity, DefiOnboardingTile.Activity activity2) {
        List listOLrzqt = C56402yEa.OLrzqt();
        if (activity != null) {
            listOLrzqt.add(activity);
        }
        listOLrzqt.add(new DefiOnboardingTile.Application(0.0f, 0, 3, null));
        if (activity2 != null) {
            listOLrzqt.add(activity2);
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final String KWHzl() {
        return C33492mxV.OLrzqt() ? "onboard_dark.lottie" : "onboard_light.lottie";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Continuation<? super Boolean> continuation) throws Throwable {
        DefiOnboardingViewModel$checkCreateAvailable$1 defiOnboardingViewModel$checkCreateAvailable$1;
        if (continuation instanceof DefiOnboardingViewModel$checkCreateAvailable$1) {
            defiOnboardingViewModel$checkCreateAvailable$1 = (DefiOnboardingViewModel$checkCreateAvailable$1) continuation;
            int i = defiOnboardingViewModel$checkCreateAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defiOnboardingViewModel$checkCreateAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                defiOnboardingViewModel$checkCreateAvailable$1 = new DefiOnboardingViewModel$checkCreateAvailable$1(this, continuation);
            }
        }
        Object objKWHzl = defiOnboardingViewModel$checkCreateAvailable$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = defiOnboardingViewModel$checkCreateAvailable$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C13934dbu c13934dbu = this.OLrzqt;
            defiOnboardingViewModel$checkCreateAvailable$1.label = 1;
            objKWHzl = c13934dbu.KWHzl(defiOnboardingViewModel$checkCreateAvailable$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        CheckCreateAvailableResp checkCreateAvailableResp = (CheckCreateAvailableResp) ((AbstractC43419rot) objKWHzl).copydefault();
        if (checkCreateAvailableResp == null) {
            return C56443yFo.KWHzl(false);
        }
        return C56443yFo.KWHzl(checkCreateAvailableResp.getCreateAvailable() == 1);
    }
}
