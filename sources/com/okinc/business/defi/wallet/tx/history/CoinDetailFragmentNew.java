package com.okinc.business.defi.wallet.tx.history;

import android.content.ClipboardManager;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.appbar.OKAppBarLayoutBehavior;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoWalletInfo;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.biz.net.bean.AAStatus;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.business.defi.biz.net.bean.InvestmentDetailData;
import com.okinc.business.defi.biz.net.bean.QaItem;
import com.okinc.business.defi.biz.net.bean.RegisterStatusResp;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.WalletCoinLatestPnlResponse;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoResp;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.wallet.hardware.onekey.OneKeyModule;
import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.ActivityStatus;
import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.AddressRegisterStatus;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew;
import com.okinc.business.dex.api.bean.BridgeRedeemStatus;
import com.okinc.business.dex.api.bean.ChainRequest;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.SupportSwapCheck;
import com.okinc.business.dex.api.bean.TradeDetails;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.invest_api.bean.DeFiApyDataInfoData;
import com.okinc.business.invest_api.bean.DeFiRedeemParam;
import com.okinc.business.invest_api.bean.Web3CampaignBean;
import com.okinc.business.invest_api.bean.Web3CampaignResponse;
import com.okinc.business.invest_api.bean.Web3RewardToken;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.uilab.banner.OKAlertBanner;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.web.WebActivity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC33041mov;
import o.AbstractC12782ctV;
import o.AbstractC16521elW;
import o.AbstractC16741epe;
import o.AbstractC17052evX;
import o.AbstractC17082ewA;
import o.AbstractC17086ewE;
import o.AbstractC17931fXp;
import o.AbstractC19608gIr;
import o.AbstractC32998moE;
import o.AbstractC58185ywX;
import o.AbstractC58247yxg;
import o.AbstractC58260yxt;
import o.ActivityC10049bhC;
import o.ActivityC10355bmr;
import o.ActivityC13789dYi;
import o.ActivityC21019grp;
import o.ActivityC21325gxd;
import o.Bitmap;
import o.C10525bqB;
import o.C10854bwM;
import o.C10948byA;
import o.C10953byF;
import o.C10954byG;
import o.C11205cFp;
import o.C11600cUg;
import o.C12827cuN;
import o.C13754dXa;
import o.C13821dZn;
import o.C13852daR;
import o.C13934dbu;
import o.C14079deg;
import o.C14083dek;
import o.C14140dfo;
import o.C14316djE;
import o.C14317djF;
import o.C14318djG;
import o.C14322djK;
import o.C14325djN;
import o.C14687dqE;
import o.C14707dqY;
import o.C15715eSp;
import o.C15765eUl;
import o.C17089ewH;
import o.C17133ewz;
import o.C17928fXm;
import o.C17948fYf;
import o.C18177fdV;
import o.C19394gAt;
import o.C19420gBs;
import o.C19421gBt;
import o.C19443gCo;
import o.C19465gDj;
import o.C19503gEu;
import o.C19595gIe;
import o.C20690gle;
import o.C21321gxZ;
import o.C32866mlf;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33546myW;
import o.C33570myu;
import o.C43251rlk;
import o.C43312rms;
import o.C43316rmw;
import o.C43318rmy;
import o.C52761wXj;
import o.C52794wYp;
import o.C54862xYb;
import o.C54870xYj;
import o.C54873xYm;
import o.C55173xeu;
import o.C55296xhK;
import o.C55298xhM;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56402yEa;
import o.C56423yEv;
import o.C56424yEw;
import o.C56444yFp;
import o.C56524yIo;
import o.C58156yvv;
import o.C58216yxB;
import o.C58266yxz;
import o.C8003auW;
import o.C8039avH;
import o.C8322bAY;
import o.C9694baS;
import o.InterfaceC13915dbb;
import o.InterfaceC25423iwT;
import o.InterfaceC25429iwZ;
import o.InterfaceC25483ixa;
import o.InterfaceC54828xWv;
import o.InterfaceC54859xXz;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56445yFq;
import o.InterfaceC56514yIe;
import o.InterfaceC57900yrD;
import o.InterfaceC57903yrG;
import o.InterfaceC57934yrl;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC59531zim;
import o.InterfaceC9738bbJ;
import o.InterfaceC9742bbN;
import o.InterfaceC9773bbs;
import o.InterfaceC9857bdW;
import o.Point;
import o.ViewOnClickListenerC54939xaY;
import o.fPH;
import o.fPV;
import o.gAC;
import o.gAD;
import o.gAI;
import o.gBT;
import o.gBW;
import o.gBY;
import o.gCZ;
import o.gEQ;
import o.gFD;
import o.gFG;
import o.gFH;
import o.gKO;
import o.pUU;
import o.xZA;
import o.xZF;
import o.xZX;
import o.yBK;
import o.yBP;
import o.yDV;
import o.yDY;
import o.yHS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CoinDetailFragmentNew extends AbstractC32998moE {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public AbstractC16521elW AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public gBT AuCTelauCTel;
    public InterfaceC58217yxC AubY;
    public final InterfaceC56387yDm AwvSrB;
    public int AxsJAY;
    public final C19421gBt DbNXlk;
    public InvestmentDetailData djBIcL;
    public InterfaceC58217yxC ejfBZ;
    public int fARcdN;
    public long fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public final InterfaceC56387yDm gEmmrt;
    public boolean getFieldNames;
    public InterfaceC58217yxC getNewProxyInstance;
    public InterfaceC58217yxC hDKMBd;
    public int isConnected;
    public InterfaceC58217yxC iwGUEr;
    public final WalletTickerManager sSMYrx;
    public final ContentResolver uzCIH;
    public ButtonSetupState valueOf;
    public final InterfaceC56387yDm values;
    public boolean wlaJM;
    public final InterfaceC56387yDm zLjUOn;
    public final InterfaceC56387yDm zsXlph;
    public final InterfaceC56387yDm zuBGHE;
    public final String gHZMYf = CoinDetailFragmentNew.class.getName();
    public final int AuCTel = C13754dXa.TaskDescription.DUUtXg;
    public final C43316rmw OLrzqt = new C43316rmw();
    public final C58216yxB AhwBna = new C58216yxB();
    public final boolean fetchVPNInfo = C14687dqE.OLrzqt.isConnected();
    public final Function0<Unit> KWHzl = new Function0() { // from class: o.gyN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return CoinDetailFragmentNew.values();
        }
    };
    public final gBW copydefault = new gBY(null, 1, null);

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChainStatus.values().length];
            try {
                iArr[ChainStatus.CANNOT_TRANSFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChainStatus.UNREGISTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChainStatus.REGISTERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChainStatus.REGISTERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    public static final /* synthetic */ class DialogInterface implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DialogInterface(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public static final class IntentSender implements InterfaceC54859xXz {
        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AuCTel;
    }

    public static final class ApplicationInfo implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ CoinDetailFragmentNew KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ApplicationInfo(View view, long j, CoinDetailFragmentNew coinDetailFragmentNew) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = coinDetailFragmentNew;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.ORxRYg();
            }
        }
    }

    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ CoinDetailFragmentNew AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(View view, long j, CoinDetailFragmentNew coinDetailFragmentNew) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = coinDetailFragmentNew;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                gBT gbt = this.AEQbTJ.AuCTelauCTel;
                if (gbt != null) {
                    gbt.AkhnZx();
                }
            }
        }
    }

    public static final class ComponentCallbacks implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ CoinDetailFragmentNew OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks(View view, long j, CoinDetailFragmentNew coinDetailFragmentNew) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = coinDetailFragmentNew;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.OcIXYQ();
            }
        }
    }

    public static final class Context implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ CoinDetailFragmentNew KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Context(View view, long j, CoinDetailFragmentNew coinDetailFragmentNew) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = coinDetailFragmentNew;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.finit();
            }
        }
    }

    public static final class ContextWrapper implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ Web3CampaignBean KWHzl;
        public final /* synthetic */ CoinDetailFragmentNew OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContextWrapper(View view, long j, CoinDetailFragmentNew coinDetailFragmentNew, Web3CampaignBean web3CampaignBean) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = coinDetailFragmentNew;
            this.KWHzl = web3CampaignBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ(this.KWHzl);
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C10525bqB AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, C10525bqB c10525bqB) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c10525bqB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C17928fXm.KWHzl.AYXKKw().copydefault(this.AEQbTJ.values().DbNXlk());
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ CoinDetailFragmentNew AEQbTJ;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, CoinDetailFragmentNew coinDetailFragmentNew) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = coinDetailFragmentNew;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
            C10525bqB value;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                AbstractC16521elW abstractC16521elW = this.AEQbTJ.AYXKKw;
                if (abstractC16521elW == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW = null;
                }
                C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
                if (c19465gDjAEQbTJ == null || (mutableLiveDataOLrzqt = c19465gDjAEQbTJ.OLrzqt()) == null || (value = mutableLiveDataOLrzqt.getValue()) == null) {
                    return;
                }
                C15765eUl.Companion.copydefault(value.gEmmrt(), this.AEQbTJ.zLjUOn()).show(this.AEQbTJ.getChildFragmentManager(), "SwitchXLayerAddressBottomFragment");
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(View view, long j) {
            this.EZpvd = view;
            this.KWHzl = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C17928fXm.KWHzl.AEQbTJ().EZpvd();
            }
        }
    }

    public static final class Intent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ CoinDetailFragmentNew EZpvd;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Intent(View view, long j, CoinDetailFragmentNew coinDetailFragmentNew) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = coinDetailFragmentNew;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.copydefault(C13754dXa.FragmentManager.setDefaultImpl, C13754dXa.FragmentManager.getInterfaceDescriptor);
            }
        }
    }

    public static final class IntentFilter implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ CoinDetailFragmentNew KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public IntentFilter(View view, long j, CoinDetailFragmentNew coinDetailFragmentNew) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = coinDetailFragmentNew;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.QKVWgx();
            }
        }
    }

    public static final class ServiceConnection implements View.OnClickListener {
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ServiceConnection(View view, long j) {
            this.copydefault = view;
            this.OLrzqt = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
            }
        }
    }

    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ CoinDetailFragmentNew KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(View view, long j, CoinDetailFragmentNew coinDetailFragmentNew) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = coinDetailFragmentNew;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                gBT gbt = this.KWHzl.AuCTelauCTel;
                if (gbt != null) {
                    gbt.AkhnZx();
                }
            }
        }
    }

    public static final class SharedPreferences implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ CoinDetailFragmentNew EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedPreferences(View view, long j, CoinDetailFragmentNew coinDetailFragmentNew) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = coinDetailFragmentNew;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.QOLQEE();
            }
        }
    }

    public CoinDetailFragmentNew() {
        final Function0 function0 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19503gEu.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        Function0 function02 = new Function0() { // from class: o.gyM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CoinDetailFragmentNew.AkhnZx();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(gEQ.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function02);
        Function0 function04 = new Function0() { // from class: o.gyR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CoinDetailFragmentNew.hDKMBd();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function05 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function05.invoke();
            }
        });
        this.zsXlph = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(gFD.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$viewModels$default$9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function06 = function0;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function04);
        this.zuBGHE = C56392yDr.copydefault(new Function0() { // from class: o.gyT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CoinDetailFragmentNew.DTwDnp(this.AEQbTJ);
            }
        });
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.gyV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CoinDetailFragmentNew.fIwbmz();
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.gyS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CoinDetailFragmentNew.zuBGHE(this.AEQbTJ);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.gyW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CoinDetailFragmentNew.sSMYrx(this.OLrzqt);
            }
        });
        this.AwvSrB = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19443gCo.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$activityViewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$activityViewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function06 = function0;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$activityViewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.sSMYrx = new WalletTickerManager();
        this.zLjUOn = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(gFG.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$activityViewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$activityViewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function06 = function0;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew$special$$inlined$activityViewModels$default$9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.DbNXlk = new C19421gBt(null, 1, null);
        this.valueOf = ButtonSetupState.INITIAL;
        this.isConnected = 10;
        this.uzCIH = new ContentResolver();
        this.getFieldNames = true;
    }

    private final C19503gEu flVtFt() {
        return (C19503gEu) this.gEmmrt.getValue();
    }

    public static final Unit values() {
        ActivityC21325gxd.Companion.KWHzl(true);
        return Unit.INSTANCE;
    }

    public final gEQ AuCTelauCTel() {
        return (gEQ) this.AkhnZx.getValue();
    }

    public static final gEQ copydefault(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new gEQ(new C13934dbu());
    }

    public final gFD AwvSrB() {
        return (gFD) this.zsXlph.getValue();
    }

    public static final gFD AEQbTJ(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new gFD(new C13934dbu());
    }

    public final AbstractC17931fXp.Activity AxsJAY() {
        return (AbstractC17931fXp.Activity) this.zuBGHE.getValue();
    }

    public static final AbstractC17931fXp.Activity DTwDnp(final CoinDetailFragmentNew coinDetailFragmentNew) {
        return new AbstractC17931fXp.Activity() { // from class: o.gzP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractC17931fXp.Activity
            public final void copydefault() {
                CoinDetailFragmentNew.QbewEr(this.EZpvd);
            }
        };
    }

    public static final void QbewEr(CoinDetailFragmentNew coinDetailFragmentNew) {
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        OKAlertBanner oKAlertBanner = abstractC16521elW.copydefault;
        Intrinsics.checkNotNullExpressionValue(oKAlertBanner, "");
        oKAlertBanner.setVisibility(8);
    }

    private final List<InterfaceC9773bbs> gGvvIC() {
        return (List) this.fJNWhG.getValue();
    }

    public static final List fIwbmz() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
    }

    public static final class Activity extends WalletCoinAssetSubManager.TaskDescription {
        public Activity(String str, List<Long> list) {
            super(str, null, list, false, 10, null);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(List<WalletCoinAssetSubManager.SubResponse> list) {
            C10854bwM c10854bwMDjBIcL;
            Object next;
            Intrinsics.checkNotNullParameter(list, "");
            AbstractC16521elW abstractC16521elW = CoinDetailFragmentNew.this.AYXKKw;
            AbstractC16521elW abstractC16521elW2 = null;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
            if (c19465gDjAEQbTJ != null) {
                c19465gDjAEQbTJ.zLjUOn();
            }
            AbstractC16521elW abstractC16521elW3 = CoinDetailFragmentNew.this.AYXKKw;
            if (abstractC16521elW3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW3 = null;
            }
            C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW3.AEQbTJ();
            CoinDetailFragmentNew coinDetailFragmentNew = CoinDetailFragmentNew.this;
            if (c19465gDjAEQbTJ2 == null || (c10854bwMDjBIcL = c19465gDjAEQbTJ2.djBIcL()) == null || !c10854bwMDjBIcL.hUfVAv()) {
                return;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String address = ((WalletCoinAssetSubManager.SubResponse) next).getAddress();
                AbstractC16521elW abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW4 = null;
                }
                C19465gDj c19465gDjAEQbTJ3 = abstractC16521elW4.AEQbTJ();
                if (Intrinsics.EZpvd((Object) address, (Object) (c19465gDjAEQbTJ3 != null ? c19465gDjAEQbTJ3.AYXKKw() : null))) {
                    break;
                }
            }
            WalletCoinAssetSubManager.SubResponse subResponse = (WalletCoinAssetSubManager.SubResponse) next;
            if (subResponse != null && C33129mqd.OLrzqt((CharSequence) subResponse.getAvailableBalance()) && C33129mqd.OLrzqt((CharSequence) subResponse.getTransferableBalance())) {
                AbstractC16521elW abstractC16521elW5 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16521elW2 = abstractC16521elW5;
                }
                C19465gDj c19465gDjAEQbTJ4 = abstractC16521elW2.AEQbTJ();
                if (c19465gDjAEQbTJ4 != null) {
                    c19465gDjAEQbTJ4.AubY();
                }
            }
        }
    }

    public final Activity wlaJM() {
        return (Activity) this.AEQbTJ.getValue();
    }

    public static final Activity zuBGHE(CoinDetailFragmentNew coinDetailFragmentNew) {
        C10854bwM c10854bwMDjBIcL;
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        String str = "assetSub-coinDetail-" + ((c19465gDjAEQbTJ == null || (c10854bwMDjBIcL = c19465gDjAEQbTJ.djBIcL()) == null) ? null : Long.valueOf(c10854bwMDjBIcL.AhwBna()));
        AbstractC16521elW abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW2 = null;
        }
        C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW2.AEQbTJ();
        return coinDetailFragmentNew.new Activity(str, c19465gDjAEQbTJ2 != null ? c19465gDjAEQbTJ2.valueOf() : null);
    }

    public static final class PendingIntent extends xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> {
        public PendingIntent(String str, xZA xza) {
            super(str, xza);
        }

        public static final void AEQbTJ(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(final List<WalletTxHistorySubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl();
            final CoinDetailFragmentNew coinDetailFragmentNew = CoinDetailFragmentNew.this;
            final Function1 function1 = new Function1() { // from class: o.gAl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.PendingIntent.AEQbTJ(list, coinDetailFragmentNew, (InterfaceC9738bbJ) obj);
                }
            };
            abstractC58260yxtKWHzl.copydefault(new InterfaceC58227yxM() { // from class: o.gAo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    CoinDetailFragmentNew.PendingIntent.AEQbTJ(function1, obj);
                }
            });
        }

        public static final Unit AEQbTJ(List list, final CoinDetailFragmentNew coinDetailFragmentNew, InterfaceC9738bbJ interfaceC9738bbJ) {
            boolean z = interfaceC9738bbJ.QfsBiF() || interfaceC9738bbJ.zsXlph();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                WalletTxHistorySubManager.SubResponse subResponse = (WalletTxHistorySubManager.SubResponse) it.next();
                Intrinsics.copydefault(interfaceC9738bbJ, "");
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) interfaceC9738bbJ;
                String address = subResponse.getAddress();
                if (address == null) {
                    address = "";
                }
                if (abstractC12782ctV.DbNXlk(address)) {
                    if (z) {
                        subResponse.setShowCancel(false);
                        subResponse.setShowSpeedUp(false);
                        subResponse.setShowPending(false);
                    }
                    AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
                    if (abstractC16521elW == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW = null;
                    }
                    C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
                    if (c19465gDjAEQbTJ != null) {
                        c19465gDjAEQbTJ.AEQbTJ(subResponse, coinDetailFragmentNew.fARcdN <= 10, new Function0() { // from class: o.gAr
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return CoinDetailFragmentNew.PendingIntent.EZpvd(coinDetailFragmentNew);
                            }
                        });
                    }
                }
            }
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(CoinDetailFragmentNew coinDetailFragmentNew) {
            coinDetailFragmentNew.dvKsVJ();
            return Unit.INSTANCE;
        }
    }

    public final PendingIntent gHZMYf() {
        return (PendingIntent) this.values.getValue();
    }

    public static final PendingIntent sSMYrx(CoinDetailFragmentNew coinDetailFragmentNew) {
        String name = coinDetailFragmentNew.getClass().getName();
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        return coinDetailFragmentNew.new PendingIntent(name + "-" + (c19465gDjAEQbTJ != null ? c19465gDjAEQbTJ.AkhnZx() : null), new xZA(0L, 300L, null, 4, null));
    }

    public final C19443gCo zuBGHE() {
        return (C19443gCo) this.AwvSrB.getValue();
    }

    public final gFG sSMYrx() {
        return (gFG) this.zLjUOn.getValue();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() throws OKWException {
        final C10854bwM c10854bwMDjBIcL;
        super.onResume();
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        c11205cFp.zLjUOn().AEQbTJ(wlaJM());
        c11205cFp.AxsJAY().AEQbTJ(gHZMYf());
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null && (c10854bwMDjBIcL = c19465gDjAEQbTJ.djBIcL()) != null) {
            flVtFt().KWHzl(c10854bwMDjBIcL);
            InterfaceC58217yxC interfaceC58217yxC = this.AubY;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC58185ywX<WalletTickerManager.CoinPriceRes> abstractC58185ywXCopydefault = this.sSMYrx.copydefault("subTicker-coinDetail-" + c10854bwMDjBIcL.AhwBna(), new xZA(1000L, 1000L, null, 4, null), C56402yEa.EZpvd(new WalletTickerManager.CoinInfo(c10854bwMDjBIcL.fetchVPNInfo(), c10854bwMDjBIcL.AhwBna(), c10854bwMDjBIcL.OLrzqt(), false)));
            final Function1 function1 = new Function1() { // from class: o.gyF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.AEQbTJ(this.EZpvd, c10854bwMDjBIcL, (WalletTickerManager.CoinPriceRes) obj);
                }
            };
            InterfaceC58227yxM<? super WalletTickerManager.CoinPriceRes> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gyG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    CoinDetailFragmentNew.sSMYrx(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.gyC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.EZpvd((java.lang.Throwable) obj);
                }
            };
            this.AubY = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gyD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    CoinDetailFragmentNew.zuBGHE(function12, obj);
                }
            });
        }
        iZzfmt();
    }

    public static final void sSMYrx(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(CoinDetailFragmentNew coinDetailFragmentNew, C10854bwM c10854bwM, WalletTickerManager.CoinPriceRes coinPriceRes) {
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        C10525bqB value;
        WalletTickerManager.CoinPrice coinPriceAEQbTJ = coinDetailFragmentNew.sSMYrx.AEQbTJ(c10854bwM.AhwBna());
        if (coinPriceAEQbTJ == null) {
            return Unit.INSTANCE;
        }
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null && (mutableLiveDataOLrzqt = c19465gDjAEQbTJ.OLrzqt()) != null && (value = mutableLiveDataOLrzqt.getValue()) != null) {
            value.EZpvd(value.copydefault(), C54862xYb.convertToString$default(C54862xYb.OLrzqt(value.fIwbmz(), coinPriceAEQbTJ.getPrice()), false, null, null, 7, null), value.getNewProxyInstance(), value.zuBGHE(), value.ejfBZ(), value.sSMYrx(), value.gHZMYf(), value.zsXlph(), value.zLjUOn());
            coinDetailFragmentNew.AhwBna(value);
        }
        if (!c10854bwM.getNewProxyInstance() || !c10854bwM.giSNqX()) {
            coinDetailFragmentNew.flVtFt().KWHzl(coinPriceAEQbTJ);
        }
        coinDetailFragmentNew.flVtFt().EZpvd(c10854bwM.fetchVPNInfo(), c10854bwM.OLrzqt());
        coinDetailFragmentNew.flVtFt().copydefault(c10854bwM);
        return Unit.INSTANCE;
    }

    public static final void zuBGHE(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        c11205cFp.zLjUOn().OLrzqt(wlaJM());
        c11205cFp.AxsJAY().OLrzqt(gHZMYf());
        InterfaceC58217yxC interfaceC58217yxC = this.AubY;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final CoinDetailFragmentNew AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Bundle bundle = new Bundle();
            bundle.putString("metaId", str);
            bundle.putString("walletId", str2);
            bundle.putString("realChainId", str3);
            bundle.putString("tokenAddress", str4);
            bundle.putString("showAddress", str5);
            bundle.putBoolean("isNativeToken", z3);
            bundle.putBoolean("isShowFromCoin", z2);
            bundle.putBoolean("isTrackingWallet", z);
            bundle.putBoolean("can_show_recommended_investment", z4);
            bundle.putBoolean("showDetailInfo", z5);
            bundle.putString("coinType", str6);
            CoinDetailFragmentNew coinDetailFragmentNew = new CoinDetailFragmentNew();
            coinDetailFragmentNew.setArguments(bundle);
            return coinDetailFragmentNew;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        String string;
        AbstractC16521elW abstractC16521elW;
        C10854bwM c10854bwMDjBIcL;
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.AYXKKw = (AbstractC16521elW) viewDataBindingBind;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("showAddress")) == null) {
            string = "";
        }
        if (string.length() == 0) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return;
        }
        AbstractC16521elW abstractC16521elW2 = this.AYXKKw;
        AbstractC16521elW abstractC16521elW3 = null;
        if (abstractC16521elW2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        } else {
            abstractC16521elW = abstractC16521elW2;
        }
        C19465gDj c19465gDj = (C19465gDj) new ViewModelProvider(this).get(C19465gDj.class);
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("metaId") : null;
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("walletId") : null;
        Bundle arguments4 = getArguments();
        String string4 = arguments4 != null ? arguments4.getString("realChainId") : null;
        Bundle arguments5 = getArguments();
        String string5 = arguments5 != null ? arguments5.getString("tokenAddress") : null;
        Bundle arguments6 = getArguments();
        Boolean boolValueOf = arguments6 != null ? Boolean.valueOf(arguments6.getBoolean("isTrackingWallet")) : null;
        Bundle arguments7 = getArguments();
        Boolean boolValueOf2 = arguments7 != null ? Boolean.valueOf(arguments7.getBoolean("isShowFromCoin")) : null;
        Bundle arguments8 = getArguments();
        Boolean boolValueOf3 = arguments8 != null ? Boolean.valueOf(arguments8.getBoolean("isNativeToken")) : null;
        Bundle arguments9 = getArguments();
        c19465gDj.EZpvd(string2, string3, string4, string5, string, boolValueOf, boolValueOf2, boolValueOf3, arguments9 != null ? Boolean.valueOf(arguments9.getBoolean("can_show_recommended_investment")) : null);
        abstractC16521elW.KWHzl(c19465gDj);
        AbstractC16521elW abstractC16521elW4 = this.AYXKKw;
        if (abstractC16521elW4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW4 = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC16521elW4.KWHzl.getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            OKAppBarLayoutBehavior oKAppBarLayoutBehavior = new OKAppBarLayoutBehavior(null, null, 3, null);
            oKAppBarLayoutBehavior.setLimitId(C13754dXa.ActionBar.MenuRes);
            layoutParams2.setBehavior(oKAppBarLayoutBehavior);
            AbstractC16521elW abstractC16521elW5 = this.AYXKKw;
            if (abstractC16521elW5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW5 = null;
            }
            abstractC16521elW5.KWHzl.setLayoutParams(layoutParams2);
            AbstractC16521elW abstractC16521elW6 = this.AYXKKw;
            if (abstractC16521elW6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW6 = null;
            }
            abstractC16521elW6.KWHzl.requestLayout();
        }
        AbstractC16521elW abstractC16521elW7 = this.AYXKKw;
        if (abstractC16521elW7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW7 = null;
        }
        abstractC16521elW7.KWHzl.setOnClickListener(null);
        OLrzqt(string);
        AbstractC16521elW abstractC16521elW8 = this.AYXKKw;
        if (abstractC16521elW8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW3 = abstractC16521elW8;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW3.AEQbTJ();
        if (c19465gDjAEQbTJ != null && (c10854bwMDjBIcL = c19465gDjAEQbTJ.djBIcL()) != null) {
            flVtFt().EZpvd(c10854bwMDjBIcL.fetchVPNInfo(), c10854bwMDjBIcL.OLrzqt());
        }
        giSNqX();
    }

    private final void giSNqX() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(getViewLifecycleOwner().getLifecycle()), null, null, new CoinDetailFragmentNew$initObserver$1(this, null), 3, null);
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        TextView textView = abstractC16521elW.fetchVPNInfo;
        textView.setOnClickListener(new SharedElementCallback(textView, 1000L, this));
        AbstractC16521elW abstractC16521elW2 = this.AYXKKw;
        if (abstractC16521elW2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW2 = null;
        }
        ImageView imageView = abstractC16521elW2.OLrzqt;
        imageView.setOnClickListener(new AssistContent(imageView, 1000L, this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(getViewLifecycleOwner().getLifecycle()), null, null, new CoinDetailFragmentNew$initObserver$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(getViewLifecycleOwner().getLifecycle()), null, null, new CoinDetailFragmentNew$initObserver$5(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        if (context instanceof gBT) {
            this.AuCTelauCTel = (gBT) context;
        }
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return;
        }
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        abstractC16521elW.fJNWhG.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        this.valueOf = ButtonSetupState.INITIAL;
        this.djBIcL = null;
        AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW2 = abstractC16521elW3;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW2.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            c19465gDjAEQbTJ.AEQbTJ(str);
        }
        gasjUx();
        AxsJAYaxsJAY();
        QUSxYX();
        QbewEr();
        RJOkX();
        iRxXKY();
        QfsBiF();
        iwGUEr();
        djSkpj();
        hUfVAv();
        gkJEwt();
        dNCPSb();
        aKErDB();
        onVisible();
    }

    private final void iZzfmt() throws OKWException {
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        C10525bqB value;
        String strZLjUOn;
        if (ActivityC21325gxd.Companion.AEQbTJ()) {
            AbstractC16521elW abstractC16521elW = this.AYXKKw;
            AbstractC16521elW abstractC16521elW2 = null;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
            if (c19465gDjAEQbTJ == null || !c19465gDjAEQbTJ.values()) {
                return;
            }
            AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
            if (abstractC16521elW3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW3 = null;
            }
            C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW3.AEQbTJ();
            if (c19465gDjAEQbTJ2 != null && (mutableLiveDataOLrzqt = c19465gDjAEQbTJ2.OLrzqt()) != null && (value = mutableLiveDataOLrzqt.getValue()) != null) {
                AbstractC16521elW abstractC16521elW4 = this.AYXKKw;
                if (abstractC16521elW4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW4 = null;
                }
                TextView textView = abstractC16521elW4.AubY;
                if (EZpvd(value)) {
                    strZLjUOn = value.KWHzl().AEQbTJ(zLjUOn());
                } else {
                    strZLjUOn = zLjUOn();
                }
                textView.setText(strZLjUOn);
            }
            AbstractC16521elW abstractC16521elW5 = this.AYXKKw;
            if (abstractC16521elW5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW2 = abstractC16521elW5;
            }
            final C19465gDj c19465gDjAEQbTJ3 = abstractC16521elW2.AEQbTJ();
            if (c19465gDjAEQbTJ3 != null) {
                c19465gDjAEQbTJ3.EZpvd(true, new Function1() { // from class: o.gyn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return CoinDetailFragmentNew.copydefault(c19465gDjAEQbTJ3, (AbstractC12782ctV) obj);
                    }
                });
            }
        }
    }

    public static final Unit copydefault(C19465gDj c19465gDj, AbstractC12782ctV abstractC12782ctV) {
        c19465gDj.OLrzqt(false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void gasjUx() {
        Boolean newProxyInstance;
        boolean z;
        MutableLiveData<Boolean> mutableLiveDataAhwBna;
        C10854bwM c10854bwMDjBIcL;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        Boolean boolHDKMBd = c19465gDjAEQbTJ != null ? c19465gDjAEQbTJ.hDKMBd() : null;
        AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW3 = null;
        }
        C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW3.AEQbTJ();
        String strFetchVPNInfo = c19465gDjAEQbTJ2 != null ? c19465gDjAEQbTJ2.fetchVPNInfo() : null;
        AbstractC16521elW abstractC16521elW4 = this.AYXKKw;
        if (abstractC16521elW4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW4 = null;
        }
        C19465gDj c19465gDjAEQbTJ3 = abstractC16521elW4.AEQbTJ();
        String strDbNXlk = c19465gDjAEQbTJ3 != null ? c19465gDjAEQbTJ3.DbNXlk() : null;
        AbstractC16521elW abstractC16521elW5 = this.AYXKKw;
        if (abstractC16521elW5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW5 = null;
        }
        C19465gDj c19465gDjAEQbTJ4 = abstractC16521elW5.AEQbTJ();
        if (c19465gDjAEQbTJ4 == null || (newProxyInstance = c19465gDjAEQbTJ4.getNewProxyInstance()) == null) {
            return;
        }
        boolean zBooleanValue = newProxyInstance.booleanValue();
        AbstractC16521elW abstractC16521elW6 = this.AYXKKw;
        if (abstractC16521elW6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW6 = null;
        }
        C19465gDj c19465gDjAEQbTJ5 = abstractC16521elW6.AEQbTJ();
        Boolean fieldNames = c19465gDjAEQbTJ5 != null ? c19465gDjAEQbTJ5.getFieldNames() : null;
        AbstractC16521elW abstractC16521elW7 = this.AYXKKw;
        if (abstractC16521elW7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW7 = null;
        }
        C19465gDj c19465gDjAEQbTJ6 = abstractC16521elW7.AEQbTJ();
        if (c19465gDjAEQbTJ6 == null || (c10854bwMDjBIcL = c19465gDjAEQbTJ6.djBIcL()) == null) {
            z = false;
        } else {
            z = true;
            if (!C10854bwM.isXRCToken$default(c10854bwMDjBIcL, null, 1, null)) {
            }
        }
        copydefault(boolHDKMBd, strFetchVPNInfo, strDbNXlk, zBooleanValue, fieldNames, Boolean.valueOf(z));
        zsXlph();
        AbstractC16521elW abstractC16521elW8 = this.AYXKKw;
        if (abstractC16521elW8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW8 = null;
        }
        AbstractC58247yxg<Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16521elW8.ejfBZ);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CoinDetailFragmentNew.AhwBna(this.OLrzqt, obj);
            }
        });
        AbstractC16521elW abstractC16521elW9 = this.AYXKKw;
        if (abstractC16521elW9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW9 = null;
        }
        C8003auW.copydefault(abstractC16521elW9.fARcdN).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CoinDetailFragmentNew.valueOf(this.EZpvd, obj);
            }
        });
        AbstractC16521elW abstractC16521elW10 = this.AYXKKw;
        if (abstractC16521elW10 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW10 = null;
        }
        C8003auW.copydefault(abstractC16521elW10.AxsJAY).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CoinDetailFragmentNew.gEmmrt(this.KWHzl, obj);
            }
        });
        AbstractC16521elW abstractC16521elW11 = this.AYXKKw;
        if (abstractC16521elW11 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW11 = null;
        }
        C8003auW.copydefault(abstractC16521elW11.zLjUOn).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gzZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CoinDetailFragmentNew.AYXKKw(this.OLrzqt, obj);
            }
        });
        AbstractC16521elW abstractC16521elW12 = this.AYXKKw;
        if (abstractC16521elW12 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW12 = null;
        }
        C8003auW.copydefault(abstractC16521elW12.sSMYrx).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CoinDetailFragmentNew.AkhnZx(this.AEQbTJ, obj);
            }
        });
        AbstractC16521elW abstractC16521elW13 = this.AYXKKw;
        if (abstractC16521elW13 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW13 = null;
        }
        C8003auW.copydefault(abstractC16521elW13.AuCTel).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.gAg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CoinDetailFragmentNew.DbNXlk(this.copydefault, obj);
            }
        });
        AbstractC16521elW abstractC16521elW14 = this.AYXKKw;
        if (abstractC16521elW14 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW14 = null;
        }
        TextView textView = abstractC16521elW14.getNewProxyInstance;
        textView.setOnClickListener(new Fragment(textView, 1000L, this));
        AbstractC16521elW abstractC16521elW15 = this.AYXKKw;
        if (abstractC16521elW15 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW15 = null;
        }
        C19465gDj c19465gDjAEQbTJ7 = abstractC16521elW15.AEQbTJ();
        if (c19465gDjAEQbTJ7 != null && (mutableLiveDataAhwBna = c19465gDjAEQbTJ7.AhwBna()) != null) {
            mutableLiveDataAhwBna.observe(this, new DialogInterface(new Function1() { // from class: o.gAe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.OLrzqt(this.KWHzl, (java.lang.Boolean) obj);
                }
            }));
        }
        AbstractC16521elW abstractC16521elW16 = this.AYXKKw;
        if (abstractC16521elW16 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW2 = abstractC16521elW16;
        }
        abstractC16521elW2.gEmmrt.setOnAssetVisibilityToggled(new Function0() { // from class: o.gAf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CoinDetailFragmentNew.gHZMYf(this.KWHzl);
            }
        });
        getChildFragmentManager().setFragmentResultListener("switchXLayerAddressBottomFragmentRequestKey", this, new FragmentResultListener() { // from class: o.gAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) throws OKWException {
                CoinDetailFragmentNew.OLrzqt(this.AEQbTJ, str, bundle);
            }
        });
    }

    public static final void AhwBna(final CoinDetailFragmentNew coinDetailFragmentNew, Object obj) {
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            c19465gDjAEQbTJ.EZpvd(true, new Function1() { // from class: o.gzw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return CoinDetailFragmentNew.valueOf(this.AEQbTJ, (AbstractC12782ctV) obj2);
                }
            });
        }
    }

    public static final Unit valueOf(final CoinDetailFragmentNew coinDetailFragmentNew, AbstractC12782ctV abstractC12782ctV) {
        String strFIwbmz;
        String strAkhnZx;
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        C10525bqB value;
        if (abstractC12782ctV != null) {
            AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
            if (c19465gDjAEQbTJ != null && (mutableLiveDataOLrzqt = c19465gDjAEQbTJ.OLrzqt()) != null && (value = mutableLiveDataOLrzqt.getValue()) != null) {
                coinDetailFragmentNew.copydefault.OLrzqt("send", value);
            }
            if (coinDetailFragmentNew.getContext() != null) {
                C15715eSp c15715eSp = C15715eSp.AEQbTJ;
                android.content.Context contextRequireContext = coinDetailFragmentNew.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                if (c15715eSp.EZpvd(abstractC12782ctV, contextRequireContext, coinDetailFragmentNew.KWHzl)) {
                    return Unit.INSTANCE;
                }
            }
            if (abstractC12782ctV.getFieldNames() && abstractC12782ctV.fFgQHt() != AAStatus.Normal) {
                fPH fph = fPH.OLrzqt;
                android.content.Context contextRequireContext2 = coinDetailFragmentNew.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                fPH.showOwnerCheckFailedDialog$default(fph, contextRequireContext2, abstractC12782ctV.fFgQHt(), 1, null, 8, null);
                return Unit.INSTANCE;
            }
            if (abstractC12782ctV.QfsBiF()) {
                C55326xho.toast$default(C13754dXa.FragmentManager.HJWChPfvRMlC, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else if (abstractC12782ctV.zsXlph()) {
                coinDetailFragmentNew.RlQdEF();
            } else if (abstractC12782ctV.zLjUOn()) {
                AbstractC16521elW abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW2 = null;
                }
                C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW2.AEQbTJ();
                if (c19465gDjAEQbTJ2 == null || (strFIwbmz = c19465gDjAEQbTJ2.fIwbmz()) == null) {
                    return Unit.INSTANCE;
                }
                C10953byF c10953byF = C10953byF.KWHzl;
                AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW3 = null;
                }
                C19465gDj c19465gDjAEQbTJ3 = abstractC16521elW3.AEQbTJ();
                if (c19465gDjAEQbTJ3 != null && (strAkhnZx = c19465gDjAEQbTJ3.AkhnZx()) != null) {
                    long jEZpvd = c10953byF.EZpvd(strAkhnZx);
                    C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(jEZpvd));
                    if (c10854bwMKWHzl == null) {
                        C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(coinDetailFragmentNew, C13754dXa.FragmentManager.getExtraBinder, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainname", ""))), 0, 1, (Object) null);
                        return Unit.INSTANCE;
                    }
                    if (abstractC12782ctV.AxsJAY() && !xZX.OLrzqt.copydefault(c10854bwMKWHzl)) {
                        int i = C13754dXa.FragmentManager.getExtraBinder;
                        String strDjBIcL = c10854bwMKWHzl.djBIcL();
                        C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(coinDetailFragmentNew, i, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainname", strDjBIcL != null ? strDjBIcL : ""))), 0, 1, (Object) null);
                        return Unit.INSTANCE;
                    }
                    if (abstractC12782ctV.zuBGHE() && !OneKeyModule.OLrzqt.AEQbTJ(c10854bwMKWHzl)) {
                        int i2 = C13754dXa.FragmentManager.getExtraBinder;
                        String strDjBIcL2 = c10854bwMKWHzl.djBIcL();
                        C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(coinDetailFragmentNew, i2, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainname", strDjBIcL2 != null ? strDjBIcL2 : ""))), 0, 1, (Object) null);
                        return Unit.INSTANCE;
                    }
                    if (abstractC12782ctV.sSMYrx() && !LedgerSignHelper.AEQbTJ.KWHzl(c10854bwMKWHzl)) {
                        int i3 = C13754dXa.FragmentManager.getExtraBinder;
                        String strDjBIcL3 = c10854bwMKWHzl.djBIcL();
                        C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(coinDetailFragmentNew, i3, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainname", strDjBIcL3 != null ? strDjBIcL3 : ""))), 0, 1, (Object) null);
                        return Unit.INSTANCE;
                    }
                    if (abstractC12782ctV.getFieldNames() && c10854bwMKWHzl.QHmsKR()) {
                        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.setPosition, 0, 1, (Object) null);
                        return Unit.INSTANCE;
                    }
                    C10854bwM c10854bwMKWHzl2 = c10854bwMKWHzl.KWHzl();
                    if (c10854bwMKWHzl2 != null && c10854bwMKWHzl2.heceqZ()) {
                        C10525bqB c10525bqBEZpvd = abstractC12782ctV.EZpvd(jEZpvd, coinDetailFragmentNew.zLjUOn());
                        if (C33129mqd.valueOf(c10525bqBEZpvd != null ? c10525bqBEZpvd.copydefault() : null, "0")) {
                            C20690gle.OLrzqt.KWHzl((106 & 1) != 0 ? null : coinDetailFragmentNew, (106 & 2) != 0 ? null : null, strFIwbmz, (106 & 8) != 0 ? null : Long.valueOf(jEZpvd), coinDetailFragmentNew.zLjUOn(), (106 & 32) != 0 ? null : null, (106 & 64) != 0 ? false : false, (106 & 128) != 0 ? null : new Function1() { // from class: o.gzN
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return CoinDetailFragmentNew.valueOf(this.EZpvd, (android.os.Bundle) obj);
                                }
                            });
                        } else {
                            coinDetailFragmentNew.AEQbTJ(strFIwbmz, jEZpvd);
                        }
                    } else {
                        C10854bwM c10854bwMKWHzl3 = c10854bwMKWHzl.KWHzl();
                        if (c10854bwMKWHzl3 != null && c10854bwMKWHzl3.hCLrkq()) {
                            coinDetailFragmentNew.AEQbTJ(strFIwbmz, jEZpvd);
                        } else {
                            C10854bwM c10854bwMKWHzl4 = c10854bwMKWHzl.KWHzl();
                            if (c10854bwMKWHzl4 != null && c10854bwMKWHzl4.DCUTEIdCUTEI()) {
                                coinDetailFragmentNew.AEQbTJ(strFIwbmz, jEZpvd);
                            } else if (!c10854bwMKWHzl.hUfVAv()) {
                                C20690gle.OLrzqt.KWHzl((106 & 1) != 0 ? null : coinDetailFragmentNew, (106 & 2) != 0 ? null : null, strFIwbmz, (106 & 8) != 0 ? null : Long.valueOf(jEZpvd), coinDetailFragmentNew.zLjUOn(), (106 & 32) != 0 ? null : null, (106 & 64) != 0 ? false : false, (106 & 128) != 0 ? null : new Function1() { // from class: o.gzK
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return CoinDetailFragmentNew.gEmmrt(this.AEQbTJ, (android.os.Bundle) obj);
                                    }
                                });
                            } else {
                                android.content.Context context = coinDetailFragmentNew.getContext();
                                if (context != null) {
                                    coinDetailFragmentNew.startActivity(ActivityC13789dYi.ActionBar.getStartIntent$default(ActivityC13789dYi.Companion, context, c10854bwMKWHzl.AhwBna(), abstractC12782ctV.DbNXlk(), null, coinDetailFragmentNew.zLjUOn(), 8, null));
                                }
                            }
                        }
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                coinDetailFragmentNew.copydefault(abstractC12782ctV);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(CoinDetailFragmentNew coinDetailFragmentNew, Bundle bundle) {
        if (bundle != null && bundle.getBoolean("send_coin_status")) {
            refreshCoinHistory$default(coinDetailFragmentNew, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(CoinDetailFragmentNew coinDetailFragmentNew, Bundle bundle) {
        if (bundle != null && bundle.getBoolean("send_coin_status")) {
            refreshCoinHistory$default(coinDetailFragmentNew, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(final CoinDetailFragmentNew coinDetailFragmentNew, Object obj) {
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            c19465gDjAEQbTJ.EZpvd(true, new Function1() { // from class: o.gza
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return CoinDetailFragmentNew.AhwBna(this.OLrzqt, (AbstractC12782ctV) obj2);
                }
            });
        }
    }

    public static final Unit AhwBna(final CoinDetailFragmentNew coinDetailFragmentNew, AbstractC12782ctV abstractC12782ctV) {
        final String strFIwbmz;
        String strAkhnZx;
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        C10525bqB value;
        if (abstractC12782ctV != null) {
            AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
            AbstractC16521elW abstractC16521elW2 = null;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
            if (c19465gDjAEQbTJ != null && (mutableLiveDataOLrzqt = c19465gDjAEQbTJ.OLrzqt()) != null && (value = mutableLiveDataOLrzqt.getValue()) != null) {
                coinDetailFragmentNew.copydefault.OLrzqt("receive", value);
            }
            if (coinDetailFragmentNew.getContext() != null) {
                C15715eSp c15715eSp = C15715eSp.AEQbTJ;
                android.content.Context contextRequireContext = coinDetailFragmentNew.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                if (c15715eSp.EZpvd(abstractC12782ctV, contextRequireContext, coinDetailFragmentNew.KWHzl)) {
                    return Unit.INSTANCE;
                }
            }
            if (abstractC12782ctV.getFieldNames() && abstractC12782ctV.fFgQHt() != AAStatus.Normal) {
                fPH fph = fPH.OLrzqt;
                android.content.Context contextRequireContext2 = coinDetailFragmentNew.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                fPH.showOwnerCheckFailedDialog$default(fph, contextRequireContext2, abstractC12782ctV.fFgQHt(), 1, null, 8, null);
                return Unit.INSTANCE;
            }
            if (abstractC12782ctV.zsXlph()) {
                coinDetailFragmentNew.RlQdEF();
            } else if (abstractC12782ctV.zLjUOn()) {
                AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW3 = null;
                }
                C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW3.AEQbTJ();
                if (c19465gDjAEQbTJ2 == null || (strFIwbmz = c19465gDjAEQbTJ2.fIwbmz()) == null) {
                    return Unit.INSTANCE;
                }
                C10953byF c10953byF = C10953byF.KWHzl;
                AbstractC16521elW abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16521elW2 = abstractC16521elW4;
                }
                C19465gDj c19465gDjAEQbTJ3 = abstractC16521elW2.AEQbTJ();
                if (c19465gDjAEQbTJ3 != null && (strAkhnZx = c19465gDjAEQbTJ3.AkhnZx()) != null) {
                    final long jEZpvd = c10953byF.EZpvd(strAkhnZx);
                    AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXOLrzqt = fPV.OLrzqt.OLrzqt(jEZpvd, abstractC12782ctV);
                    final Function1 function1 = new Function1() { // from class: o.gzv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return CoinDetailFragmentNew.OLrzqt(this.copydefault, strFIwbmz, jEZpvd, (kotlin.Pair) obj);
                        }
                    };
                    InterfaceC58227yxM<? super Pair<Boolean, String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gzz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            CoinDetailFragmentNew.hDKMBd(function1, obj);
                        }
                    };
                    final Function1 function12 = new Function1() { // from class: o.gzB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return CoinDetailFragmentNew.OLrzqt(this.AEQbTJ, strFIwbmz, jEZpvd, (java.lang.Throwable) obj);
                        }
                    };
                    InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gzE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            CoinDetailFragmentNew.uzCIH(function12, obj);
                        }
                    });
                    Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
                    coinDetailFragmentNew.addDisposable(interfaceC58217yxCAEQbTJ);
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                coinDetailFragmentNew.copydefault(abstractC12782ctV);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(CoinDetailFragmentNew coinDetailFragmentNew, String str, long j, Pair pair) {
        coinDetailFragmentNew.dismissLoading();
        coinDetailFragmentNew.copydefault(str, j);
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(CoinDetailFragmentNew coinDetailFragmentNew, String str, long j, Throwable th) {
        coinDetailFragmentNew.dismissLoading();
        coinDetailFragmentNew.copydefault(str, j);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(CoinDetailFragmentNew coinDetailFragmentNew, Object obj) {
        coinDetailFragmentNew.AEQbTJ("");
    }

    public static final void AYXKKw(CoinDetailFragmentNew coinDetailFragmentNew, Object obj) {
        coinDetailFragmentNew.AEQbTJ("type_bridge");
    }

    public static final void AkhnZx(final CoinDetailFragmentNew coinDetailFragmentNew, Object obj) {
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            c19465gDjAEQbTJ.EZpvd(false, new Function1() { // from class: o.gyr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return CoinDetailFragmentNew.AYXKKw(this.copydefault, (AbstractC12782ctV) obj2);
                }
            });
        }
    }

    public static final Unit AYXKKw(CoinDetailFragmentNew coinDetailFragmentNew, AbstractC12782ctV abstractC12782ctV) {
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        C10525bqB value;
        InterfaceC9773bbs interfaceC9773bbs;
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt2;
        C10525bqB value2;
        if (abstractC12782ctV != null) {
            AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
            if (c19465gDjAEQbTJ != null && (mutableLiveDataOLrzqt2 = c19465gDjAEQbTJ.OLrzqt()) != null && (value2 = mutableLiveDataOLrzqt2.getValue()) != null) {
                coinDetailFragmentNew.copydefault.OLrzqt(ExtJson.BRC20TYPE_TRADE, value2);
            }
            if (coinDetailFragmentNew.getContext() != null) {
                C15715eSp c15715eSp = C15715eSp.AEQbTJ;
                android.content.Context contextRequireContext = coinDetailFragmentNew.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                if (C15715eSp.dealWithMpcExceptionStatus$default(c15715eSp, abstractC12782ctV, contextRequireContext, null, 4, null)) {
                    return Unit.INSTANCE;
                }
            }
            if (abstractC12782ctV.getFieldNames() && abstractC12782ctV.fFgQHt() != AAStatus.Normal) {
                fPH fph = fPH.OLrzqt;
                android.content.Context contextRequireContext2 = coinDetailFragmentNew.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                fPH.showOwnerCheckFailedDialog$default(fph, contextRequireContext2, abstractC12782ctV.fFgQHt(), 1, null, 8, null);
                return Unit.INSTANCE;
            }
            if (abstractC12782ctV.zsXlph()) {
                coinDetailFragmentNew.RlQdEF();
            } else if (abstractC12782ctV.zLjUOn()) {
                AbstractC16521elW abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW2 = null;
                }
                C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW2.AEQbTJ();
                if (c19465gDjAEQbTJ2 == null || (mutableLiveDataOLrzqt = c19465gDjAEQbTJ2.OLrzqt()) == null || (value = mutableLiveDataOLrzqt.getValue()) == null) {
                    return Unit.INSTANCE;
                }
                List<InterfaceC9773bbs> listGGvvIC = coinDetailFragmentNew.gGvvIC();
                if (listGGvvIC != null && (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listGGvvIC)) != null) {
                    android.content.Context contextRequireContext3 = coinDetailFragmentNew.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("protocolId", String.valueOf(value.KWHzl().QbewEr()));
                    linkedHashMap.put("brc20Id", value.KWHzl().fJNWhG());
                    ChainAddress chainAddressEZpvd = value.EZpvd();
                    linkedHashMap.put("addressType", String.valueOf(chainAddressEZpvd != null ? Integer.valueOf(chainAddressEZpvd.getAddressType()) : null));
                    if (value.KWHzl().DAIeex()) {
                        linkedHashMap.put("tokenId", C14079deg.EZpvd.AEQbTJ(value.KWHzl()));
                    }
                    if (value.KWHzl().igXuih() || value.KWHzl().QwvEab()) {
                        linkedHashMap.put("tokenId", C14079deg.EZpvd.copydefault(value.KWHzl()));
                    }
                    Unit unit = Unit.INSTANCE;
                    interfaceC9773bbs.KWHzl(contextRequireContext3, linkedHashMap);
                }
            } else {
                coinDetailFragmentNew.copydefault(abstractC12782ctV);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(final CoinDetailFragmentNew coinDetailFragmentNew, Object obj) {
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        C10525bqB value;
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            c19465gDjAEQbTJ.EZpvd(true, new Function1() { // from class: o.gzl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return CoinDetailFragmentNew.djBIcL(this.KWHzl, (AbstractC12782ctV) obj2);
                }
            });
        }
        AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW2 = abstractC16521elW3;
        }
        C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW2.AEQbTJ();
        if (c19465gDjAEQbTJ2 == null || (mutableLiveDataOLrzqt = c19465gDjAEQbTJ2.OLrzqt()) == null || (value = mutableLiveDataOLrzqt.getValue()) == null) {
            return;
        }
        coinDetailFragmentNew.copydefault.OLrzqt("copy", value);
    }

    public static final Unit djBIcL(final CoinDetailFragmentNew coinDetailFragmentNew, final AbstractC12782ctV abstractC12782ctV) {
        if (coinDetailFragmentNew.getContext() != null && abstractC12782ctV != null) {
            C15715eSp c15715eSp = C15715eSp.AEQbTJ;
            android.content.Context contextRequireContext = coinDetailFragmentNew.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            if (c15715eSp.EZpvd(abstractC12782ctV, contextRequireContext, coinDetailFragmentNew.KWHzl)) {
                return Unit.INSTANCE;
            }
        }
        if (abstractC12782ctV != null && abstractC12782ctV.getFieldNames() && abstractC12782ctV.fFgQHt() != AAStatus.Normal) {
            fPH fph = fPH.OLrzqt;
            android.content.Context contextRequireContext2 = coinDetailFragmentNew.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            fPH.showOwnerCheckFailedDialog$default(fph, contextRequireContext2, abstractC12782ctV.fFgQHt(), 1, null, 8, null);
            return Unit.INSTANCE;
        }
        if (abstractC12782ctV != null && abstractC12782ctV.zLjUOn()) {
            fPH fph2 = fPH.OLrzqt;
            androidx.fragment.app.FragmentManager childFragmentManager = coinDetailFragmentNew.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            fPH.handleShowAACopyBottomSheet$default(fph2, childFragmentManager, abstractC12782ctV, false, new Function0() { // from class: o.gyw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CoinDetailFragmentNew.values(this.AEQbTJ, abstractC12782ctV);
                }
            }, 4, null);
        } else {
            if (abstractC12782ctV == null) {
                return Unit.INSTANCE;
            }
            coinDetailFragmentNew.copydefault(abstractC12782ctV);
        }
        return Unit.INSTANCE;
    }

    public static final Unit values(CoinDetailFragmentNew coinDetailFragmentNew, AbstractC12782ctV abstractC12782ctV) throws OKWException {
        String strAkhnZx;
        String strZLjUOn;
        C10854bwM c10854bwMDjBIcL;
        C10854bwM c10854bwMKWHzl;
        String strDjBIcL;
        C10854bwM c10854bwMKWHzl2;
        FragmentActivity activity = coinDetailFragmentNew.getActivity();
        if (activity != null) {
            if (!(!activity.isFinishing())) {
                activity = null;
            }
            if (activity != null) {
                Object systemService = coinDetailFragmentNew.requireActivity().getSystemService("clipboard");
                String str = "";
                Intrinsics.copydefault(systemService, "");
                ClipboardManager clipboardManager = (ClipboardManager) systemService;
                C10953byF c10953byF = C10953byF.KWHzl;
                AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW = null;
                }
                C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
                if (c19465gDjAEQbTJ == null || (strAkhnZx = c19465gDjAEQbTJ.AkhnZx()) == null) {
                    strAkhnZx = "";
                }
                C10525bqB c10525bqBEZpvd = abstractC12782ctV.EZpvd(c10953byF.EZpvd(strAkhnZx), coinDetailFragmentNew.zLjUOn());
                if (coinDetailFragmentNew.EZpvd(c10525bqBEZpvd)) {
                    strZLjUOn = (c10525bqBEZpvd == null || (c10854bwMKWHzl2 = c10525bqBEZpvd.KWHzl()) == null) ? null : c10854bwMKWHzl2.AEQbTJ(coinDetailFragmentNew.zLjUOn());
                    if (strZLjUOn == null) {
                        strZLjUOn = "";
                    }
                } else {
                    strZLjUOn = coinDetailFragmentNew.zLjUOn();
                }
                clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, strZLjUOn));
                if ((c10525bqBEZpvd != null && !c10525bqBEZpvd.KWHzl().dxcTrN()) || abstractC12782ctV.QfsBiF()) {
                    C19595gIe.StateListAnimator.newInstance$default(C19595gIe.Companion, null, strZLjUOn, 1, null).KWHzl(coinDetailFragmentNew.getContext());
                } else {
                    ChainAddress chainAddressAddressFromAddress$default = AbstractC12782ctV.addressFromAddress$default(abstractC12782ctV, coinDetailFragmentNew.zLjUOn(), null, 2, null);
                    int addressType = chainAddressAddressFromAddress$default != null ? chainAddressAddressFromAddress$default.getAddressType() : AddressType.Legacy.getValue();
                    int i = C13754dXa.FragmentManager.getCallbacks;
                    Pair[] pairArr = new Pair[2];
                    AbstractC16521elW abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
                    if (abstractC16521elW2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW2 = null;
                    }
                    C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW2.AEQbTJ();
                    if (c19465gDjAEQbTJ2 != null && (c10854bwMDjBIcL = c19465gDjAEQbTJ2.djBIcL()) != null && (c10854bwMKWHzl = c10854bwMDjBIcL.KWHzl()) != null && (strDjBIcL = c10854bwMKWHzl.djBIcL()) != null) {
                        str = strDjBIcL;
                    }
                    pairArr[0] = C56390yDp.OLrzqt("chainName", str);
                    pairArr[1] = C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, C8322bAY.getAddressFormat$default(C8322bAY.KWHzl, addressType, false, 2, null));
                    C19595gIe.Companion.AEQbTJ(C33069mpW.copydefault(coinDetailFragmentNew, i, C56424yEw.AYXKKw(pairArr)), strZLjUOn).KWHzl(coinDetailFragmentNew.getContext());
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(CoinDetailFragmentNew coinDetailFragmentNew, Boolean bool) {
        if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            coinDetailFragmentNew.OLrzqt.notifyDataSetChanged();
        } else {
            coinDetailFragmentNew.wlaJM = true;
        }
        return Unit.INSTANCE;
    }

    public static final Unit gHZMYf(final CoinDetailFragmentNew coinDetailFragmentNew) {
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        C10525bqB value;
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null && (mutableLiveDataOLrzqt = c19465gDjAEQbTJ.OLrzqt()) != null && (value = mutableLiveDataOLrzqt.getValue()) != null) {
            AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW3 = null;
            }
            C19394gAt c19394gAt = abstractC16521elW3.gEmmrt;
            C13821dZn c13821dZn = C13821dZn.EZpvd;
            C19394gAt.setCoinCount$default(c19394gAt, c13821dZn.OLrzqt(InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(value, false, true, 1, null)), null, 2, null);
            AbstractC16521elW abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW4 = null;
            }
            abstractC16521elW4.gEmmrt.setValuation(c13821dZn.OLrzqt(value.OLrzqt(true)));
            AbstractC16521elW abstractC16521elW5 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW2 = abstractC16521elW5;
            }
            abstractC16521elW2.QOLQEE.postDelayed(new Runnable() { // from class: o.gzJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    CoinDetailFragmentNew.QKVWgx(this.EZpvd);
                }
            }, 100L);
        }
        return Unit.INSTANCE;
    }

    public static final void QKVWgx(CoinDetailFragmentNew coinDetailFragmentNew) {
        coinDetailFragmentNew.OLrzqt.notifyDataSetChanged();
    }

    public static final void OLrzqt(CoinDetailFragmentNew coinDetailFragmentNew, String str, Bundle bundle) throws OKWException {
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        final C10525bqB value;
        String strDjBIcL;
        String address;
        C10854bwM c10854bwMKWHzl;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ == null || (mutableLiveDataOLrzqt = c19465gDjAEQbTJ.OLrzqt()) == null || (value = mutableLiveDataOLrzqt.getValue()) == null) {
            return;
        }
        final boolean z = bundle.getBoolean("switchXLayerAddressBottomFragmentResultKey");
        C19595gIe.StateListAnimator stateListAnimator = C19595gIe.Companion;
        int i = C13754dXa.FragmentManager.connect;
        Pair[] pairArr = new Pair[2];
        C10525bqB c10525bqBEZpvd = coinDetailFragmentNew.sSMYrx().EZpvd();
        if (c10525bqBEZpvd == null || (c10854bwMKWHzl = c10525bqBEZpvd.KWHzl()) == null || (strDjBIcL = c10854bwMKWHzl.djBIcL()) == null) {
            strDjBIcL = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("chainName", strDjBIcL);
        pairArr[1] = C56390yDp.OLrzqt("type", C33070mpX.AYXKKw(z ? C13754dXa.FragmentManager.onSupportContentChanged : C13754dXa.FragmentManager.onSupportActionModeStarted));
        String strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        ChainAddress chainAddressEZpvd = value.EZpvd();
        if (chainAddressEZpvd != null && (address = chainAddressEZpvd.getAddress()) != null) {
            str2 = address;
        }
        stateListAnimator.AEQbTJ(strCopydefault, str2).KWHzl(coinDetailFragmentNew.getContext());
        coinDetailFragmentNew.getFieldNames = true;
        coinDetailFragmentNew.AEQbTJ(value);
        coinDetailFragmentNew.OLrzqt.notifyDataSetChanged();
        C32866mlf.onEvent$default("TokenDetail_ReceivingAddress_SwitchXlayerAddress_Click", (TrackChannel[]) null, new Function1() { // from class: o.gAc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.OLrzqt(z, value, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit OLrzqt(boolean z, C10525bqB c10525bqB, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "address_type", z ? "default" : "evm0x", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", c10525bqB.KWHzl().fJNWhG(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_contract_address", c10525bqB.KWHzl().OLrzqt(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final String str) {
        pUU.OLrzqt(">>>track invokeDexPage :" + str);
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            c19465gDjAEQbTJ.EZpvd(false, new Function1() { // from class: o.gzy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.copydefault(str, this, (AbstractC12782ctV) obj);
                }
            });
        }
    }

    public static final Unit copydefault(String str, final CoinDetailFragmentNew coinDetailFragmentNew, AbstractC12782ctV abstractC12782ctV) {
        String str2;
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        C10525bqB value;
        String strFIwbmz;
        LifecycleOwner lifecycleOwner;
        android.content.Context context;
        CoinInfo coinInfo;
        CoinInfo coinInfo2;
        String strFetchVPNInfo;
        String strFetchVPNInfo2;
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt2;
        C10525bqB value2;
        if (abstractC12782ctV != null) {
            if (Intrinsics.EZpvd((Object) str, (Object) "type_swap")) {
                str2 = "swap";
            } else {
                str2 = Intrinsics.EZpvd((Object) str, (Object) "type_bridge") ? TabTitleInfo.KEY_BRIDGE : "";
            }
            AbstractC16521elW abstractC16521elW = null;
            if (C33129mqd.OLrzqt((CharSequence) str2)) {
                AbstractC16521elW abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW2 = null;
                }
                C19465gDj c19465gDjAEQbTJ = abstractC16521elW2.AEQbTJ();
                if (c19465gDjAEQbTJ != null && (mutableLiveDataOLrzqt2 = c19465gDjAEQbTJ.OLrzqt()) != null && (value2 = mutableLiveDataOLrzqt2.getValue()) != null) {
                    coinDetailFragmentNew.copydefault.OLrzqt(str2, value2);
                }
            }
            if (coinDetailFragmentNew.getContext() != null) {
                C15715eSp c15715eSp = C15715eSp.AEQbTJ;
                android.content.Context contextRequireContext = coinDetailFragmentNew.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                if (c15715eSp.EZpvd(abstractC12782ctV, contextRequireContext, coinDetailFragmentNew.KWHzl)) {
                    return Unit.INSTANCE;
                }
            }
            if (abstractC12782ctV.getFieldNames() && abstractC12782ctV.fFgQHt() != AAStatus.Normal) {
                fPH fph = fPH.OLrzqt;
                android.content.Context contextRequireContext2 = coinDetailFragmentNew.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                fPH.showOwnerCheckFailedDialog$default(fph, contextRequireContext2, abstractC12782ctV.fFgQHt(), 1, null, 8, null);
                return Unit.INSTANCE;
            }
            if (abstractC12782ctV.zsXlph()) {
                coinDetailFragmentNew.RlQdEF();
            } else if (abstractC12782ctV.zLjUOn()) {
                AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW3 = null;
                }
                C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW3.AEQbTJ();
                if (c19465gDjAEQbTJ2 == null || (mutableLiveDataOLrzqt = c19465gDjAEQbTJ2.OLrzqt()) == null || (value = mutableLiveDataOLrzqt.getValue()) == null) {
                    return Unit.INSTANCE;
                }
                AbstractC16521elW abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW4 = null;
                }
                C19465gDj c19465gDjAEQbTJ3 = abstractC16521elW4.AEQbTJ();
                if (c19465gDjAEQbTJ3 == null || (strFIwbmz = c19465gDjAEQbTJ3.fIwbmz()) == null) {
                    return Unit.INSTANCE;
                }
                boolean zAEQbTJ = C33129mqd.AEQbTJ(value.AhwBna(), "1");
                String strOLrzqt = value.KWHzl().OLrzqt();
                ChainAddress chainAddressAddressFromAddress$default = AbstractC12782ctV.addressFromAddress$default(abstractC12782ctV, coinDetailFragmentNew.zLjUOn(), null, 2, null);
                int addressType = chainAddressAddressFromAddress$default != null ? chainAddressAddressFromAddress$default.getAddressType() : AddressType.Legacy.getValue();
                gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
                android.content.Context contextRequireContext3 = coinDetailFragmentNew.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                LifecycleOwner viewLifecycleOwner = coinDetailFragmentNew.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                if (zAEQbTJ) {
                    AbstractC16521elW abstractC16521elW5 = coinDetailFragmentNew.AYXKKw;
                    if (abstractC16521elW5 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW5 = null;
                    }
                    C19465gDj c19465gDjAEQbTJ4 = abstractC16521elW5.AEQbTJ();
                    lifecycleOwner = viewLifecycleOwner;
                    context = contextRequireContext3;
                    coinInfo = new CoinInfo((c19465gDjAEQbTJ4 == null || (strFetchVPNInfo2 = c19465gDjAEQbTJ4.fetchVPNInfo()) == null) ? "" : strFetchVPNInfo2, strOLrzqt, value.KWHzl().AuCTel(), (String) null, 8, (DefaultConstructorMarker) null);
                } else {
                    lifecycleOwner = viewLifecycleOwner;
                    context = contextRequireContext3;
                    coinInfo = new CoinInfo((String) null, (String) null, false, (String) null, 15, (DefaultConstructorMarker) null);
                }
                if (zAEQbTJ) {
                    coinInfo2 = new CoinInfo((String) null, (String) null, false, (String) null, 15, (DefaultConstructorMarker) null);
                } else {
                    AbstractC16521elW abstractC16521elW6 = coinDetailFragmentNew.AYXKKw;
                    if (abstractC16521elW6 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC16521elW = abstractC16521elW6;
                    }
                    C19465gDj c19465gDjAEQbTJ5 = abstractC16521elW.AEQbTJ();
                    coinInfo2 = new CoinInfo((c19465gDjAEQbTJ5 == null || (strFetchVPNInfo = c19465gDjAEQbTJ5.fetchVPNInfo()) == null) ? "" : strFetchVPNInfo, strOLrzqt, value.KWHzl().AuCTel(), (String) null, 8, (DefaultConstructorMarker) null);
                }
                gko.EZpvd(context, lifecycleOwner, new TradeParam(strFIwbmz, "wallet_trade", coinInfo, coinInfo2, "", Integer.valueOf(addressType), str, true, (String) null, (Boolean) null, false, (String) null, 0, (String) null, 16128, (DefaultConstructorMarker) null), new Function1() { // from class: o.gyI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return CoinDetailFragmentNew.AYXKKw(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            } else {
                coinDetailFragmentNew.copydefault(abstractC12782ctV);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(CoinDetailFragmentNew coinDetailFragmentNew, boolean z) {
        if (z) {
            coinDetailFragmentNew.showLoading();
        } else {
            coinDetailFragmentNew.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(String str, long j) {
        C20690gle.OLrzqt.EZpvd((10 & 1) != 0 ? null : this, (10 & 2) != 0 ? null : null, str, (10 & 8) != 0 ? null : Long.valueOf(j), (10 & 16) != 0 ? false : false, zLjUOn(), (10 & 64) != 0 ? null : new Function1() { // from class: o.gyX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.AYXKKw(this.OLrzqt, (android.os.Bundle) obj);
            }
        });
    }

    public static final Unit AYXKKw(CoinDetailFragmentNew coinDetailFragmentNew, Bundle bundle) throws OKWException {
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        C10525bqB value;
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null && (mutableLiveDataOLrzqt = c19465gDjAEQbTJ.OLrzqt()) != null && (value = mutableLiveDataOLrzqt.getValue()) != null) {
            coinDetailFragmentNew.getFieldNames = true;
            coinDetailFragmentNew.AEQbTJ(value);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refreshCoinHistory$default(CoinDetailFragmentNew coinDetailFragmentNew, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        coinDetailFragmentNew.copydefault(z);
    }

    public final void copydefault(final boolean z) {
        InterfaceC58217yxC interfaceC58217yxC = this.iwGUEr;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(1000L, 1000L, TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.gzh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.OLrzqt(this.KWHzl, z, (java.lang.Long) obj);
            }
        };
        this.iwGUEr = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.gzg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CoinDetailFragmentNew.AwvSrB(function1, obj);
            }
        });
    }

    public static final void AwvSrB(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(CoinDetailFragmentNew coinDetailFragmentNew, boolean z, Long l) {
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            C19465gDj.refreshData$default(c19465gDjAEQbTJ, z, false, new Function0() { // from class: o.gyt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CoinDetailFragmentNew.fARcdN();
                }
            }, 2, null);
        }
        InterfaceC58217yxC interfaceC58217yxC = coinDetailFragmentNew.iwGUEr;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN() {
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void AEQbTJ(final String str, final long j) {
        AbstractC58185ywX<ChainStatus> abstractC58185ywXKWHzl;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ == null || (abstractC58185ywXKWHzl = c19465gDjAEQbTJ.KWHzl(j)) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: o.gzA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.KWHzl(this.KWHzl, str, j, (ChainStatus) obj);
            }
        };
        InterfaceC58227yxM<? super ChainStatus> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gzH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CoinDetailFragmentNew.fIwbmz(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gzF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gzI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CoinDetailFragmentNew.fJNWhG(function12, obj);
            }
        });
    }

    public static final Unit KWHzl(final CoinDetailFragmentNew coinDetailFragmentNew, String str, long j, ChainStatus chainStatus) {
        int i = chainStatus == null ? -1 : Application.AEQbTJ[chainStatus.ordinal()];
        if (i == 1) {
            C14083dek.OLrzqt.AEQbTJ();
        } else if (i == 2) {
            C14083dek c14083dek = C14083dek.OLrzqt;
            android.content.Context context = coinDetailFragmentNew.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            androidx.fragment.app.FragmentManager childFragmentManager = coinDetailFragmentNew.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C14083dek.handleUnregisteredStatus$default(c14083dek, context, childFragmentManager, str, j, null, 16, null);
        } else if (i == 3) {
            C14083dek.OLrzqt.KWHzl();
        } else if (i == 4) {
            C20690gle.OLrzqt.KWHzl((106 & 1) != 0 ? null : coinDetailFragmentNew, (106 & 2) != 0 ? null : null, str, (106 & 8) != 0 ? null : Long.valueOf(j), coinDetailFragmentNew.zLjUOn(), (106 & 32) != 0 ? null : null, (106 & 64) != 0 ? false : false, (106 & 128) != 0 ? null : new Function1() { // from class: o.gzG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.AEQbTJ(this.AEQbTJ, (android.os.Bundle) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(CoinDetailFragmentNew coinDetailFragmentNew, Bundle bundle) {
        if (bundle != null && bundle.getBoolean("send_coin_status")) {
            refreshCoinHistory$default(coinDetailFragmentNew, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Throwable th) {
        String message = th.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void dvKsVJ() {
        InterfaceC58217yxC interfaceC58217yxC = this.hDKMBd;
        if (interfaceC58217yxC == null || interfaceC58217yxC.isDisposed()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.fIwbmz;
            if (jCurrentTimeMillis < 1000) {
                AbstractC58247yxg<Long> abstractC58247yxgObserveOn = AbstractC58247yxg.timer(1000 - jCurrentTimeMillis, TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
                Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
                AbstractC58247yxg abstractC58247yxgOLrzqt = C58156yvv.OLrzqt(abstractC58247yxgObserveOn, this, Lifecycle.Event.ON_STOP);
                final Function1 function1 = new Function1() { // from class: o.gyl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return CoinDetailFragmentNew.copydefault(this.KWHzl, (java.lang.Long) obj);
                    }
                };
                this.hDKMBd = abstractC58247yxgOLrzqt.subscribe(new InterfaceC58227yxM() { // from class: o.gym
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        CoinDetailFragmentNew.gHZMYf(function1, obj);
                    }
                });
                return;
            }
            AbstractC16521elW abstractC16521elW = this.AYXKKw;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
            if (c19465gDjAEQbTJ != null) {
                C19465gDj.refreshData$default(c19465gDjAEQbTJ, false, false, new Function0() { // from class: o.gyk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return CoinDetailFragmentNew.getNewProxyInstance();
                    }
                }, 3, null);
            }
            this.fIwbmz = System.currentTimeMillis();
        }
    }

    public static final void gHZMYf(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(CoinDetailFragmentNew coinDetailFragmentNew, Long l) {
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            C19465gDj.refreshData$default(c19465gDjAEQbTJ, false, false, new Function0() { // from class: o.gzj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CoinDetailFragmentNew.getFieldNames();
                }
            }, 3, null);
        }
        coinDetailFragmentNew.fIwbmz = System.currentTimeMillis();
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames() {
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance() {
        return Unit.INSTANCE;
    }

    public final void QVAiDq() {
        InterfaceC58217yxC interfaceC58217yxC = this.getNewProxyInstance;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(10L, 30L, TimeUnit.SECONDS, C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgInterval, "");
        AbstractC58247yxg abstractC58247yxgOLrzqt = C58156yvv.OLrzqt(abstractC58247yxgInterval, this, Lifecycle.Event.ON_STOP);
        final Function1 function1 = new Function1() { // from class: o.gzM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.EZpvd(this.OLrzqt, (java.lang.Long) obj);
            }
        };
        this.getNewProxyInstance = abstractC58247yxgOLrzqt.subscribe(new InterfaceC58227yxM() { // from class: o.gzQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CoinDetailFragmentNew.zsXlph(function1, obj);
            }
        });
    }

    public static final void zsXlph(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(CoinDetailFragmentNew coinDetailFragmentNew, Long l) {
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            c19465gDjAEQbTJ.copydefault(coinDetailFragmentNew.fARcdN <= coinDetailFragmentNew.AxsJAY, new Function0() { // from class: o.gzx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CoinDetailFragmentNew.ejfBZ();
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ() {
        return Unit.INSTANCE;
    }

    public final void copydefault(AbstractC12782ctV abstractC12782ctV) {
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return;
        }
        new C14325djN().AEQbTJ(abstractActivityC33041mov, getChildFragmentManager(), abstractC12782ctV, new Function0() { // from class: o.gyO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CoinDetailFragmentNew.uzCIH();
            }
        });
    }

    public static final Unit uzCIH() {
        ActivityC21325gxd.Companion.KWHzl(true);
        return Unit.INSTANCE;
    }

    private final void RlQdEF() {
        C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        instance$default.EZpvd(childFragmentManager, new IntentSender(), 1);
    }

    private final void AxsJAYaxsJAY() {
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C33546myW c33546myW = abstractC16521elW.uzCIH;
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.gzY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                CoinDetailFragmentNew.AEQbTJ(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.gyf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                CoinDetailFragmentNew.EZpvd(this.copydefault, interfaceC57934yrl);
            }
        });
        c33546myW.AhwBna(false);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gDj.refreshData$default(o.gDj, boolean, boolean, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public static final void AEQbTJ(final CoinDetailFragmentNew coinDetailFragmentNew, InterfaceC57934yrl interfaceC57934yrl) {
        C10854bwM c10854bwMDjBIcL;
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            C19465gDj.refreshData$default(c19465gDjAEQbTJ, false, false, new Function0() { // from class: o.gzL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CoinDetailFragmentNew.OcIXYQ(this.OLrzqt);
                }
            }, 3, null);
        }
        AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW2 = abstractC16521elW3;
        }
        C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW2.AEQbTJ();
        if (c19465gDjAEQbTJ2 != null && (c10854bwMDjBIcL = c19465gDjAEQbTJ2.djBIcL()) != null) {
            coinDetailFragmentNew.flVtFt().EZpvd(c10854bwMDjBIcL.fetchVPNInfo(), c10854bwMDjBIcL.OLrzqt());
            coinDetailFragmentNew.flVtFt().copydefault(c10854bwMDjBIcL);
        }
        coinDetailFragmentNew.iwGUEr();
    }

    public static final Unit OcIXYQ(CoinDetailFragmentNew coinDetailFragmentNew) {
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        abstractC16521elW.uzCIH.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(CoinDetailFragmentNew coinDetailFragmentNew, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        Object objAEQbTJ = coinDetailFragmentNew.OLrzqt.AEQbTJ(r4.getItemCount() - 1);
        AbstractC16521elW abstractC16521elW = null;
        CoinAndAddressHistoryDetail coinAndAddressHistoryDetail = objAEQbTJ instanceof CoinAndAddressHistoryDetail ? (CoinAndAddressHistoryDetail) objAEQbTJ : null;
        if (coinAndAddressHistoryDetail != null) {
            AbstractC16521elW abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW = abstractC16521elW2;
            }
            C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
            if (c19465gDjAEQbTJ != null) {
                c19465gDjAEQbTJ.copydefault(coinAndAddressHistoryDetail.getRowId());
            }
        }
    }

    public final void UeEOUB() {
        try {
            if (isAdded() && getActivity() != null) {
                InterfaceC58217yxC interfaceC58217yxC = this.ejfBZ;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.copydefault(new Callable() { // from class: o.gzd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return CoinDetailFragmentNew.QOLQEE(this.OLrzqt);
                    }
                }).KWHzl(yBP.AEQbTJ()).OLrzqt(C58266yxz.OLrzqt());
                final Function1 function1 = new Function1() { // from class: o.gzc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return CoinDetailFragmentNew.EZpvd(this.EZpvd, (java.util.Map) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gze
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        CoinDetailFragmentNew.AubY(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.gzb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return CoinDetailFragmentNew.gEmmrt(this.copydefault, (java.lang.Throwable) obj);
                    }
                };
                this.ejfBZ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gzf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        CoinDetailFragmentNew.zLjUOn(function12, obj);
                    }
                });
            }
        } catch (Exception e) {
            pUU.AEQbTJ(this.gHZMYf, "Critical error in loadInvestmentDetailFromLP", e);
            fZBcTu();
        }
    }

    public static final Map QOLQEE(CoinDetailFragmentNew coinDetailFragmentNew) {
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        C10525bqB value;
        String strFetchVPNInfo;
        String strAYXKKw;
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null && (mutableLiveDataOLrzqt = c19465gDjAEQbTJ.OLrzqt()) != null && (value = mutableLiveDataOLrzqt.getValue()) != null) {
            String strOLrzqt = value.KWHzl().OLrzqt();
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) strOLrzqt))) {
                strOLrzqt = null;
            }
            if (strOLrzqt == null) {
                return null;
            }
            AbstractC16521elW abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW2 = null;
            }
            C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW2.AEQbTJ();
            if (c19465gDjAEQbTJ2 != null && (strFetchVPNInfo = c19465gDjAEQbTJ2.fetchVPNInfo()) != null) {
                AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW3 = null;
                }
                C19465gDj c19465gDjAEQbTJ3 = abstractC16521elW3.AEQbTJ();
                if (c19465gDjAEQbTJ3 != null && (strAYXKKw = c19465gDjAEQbTJ3.AYXKKw()) != null) {
                    if (!(!StringsKt__StringsKt.fARcdN((CharSequence) strAYXKKw))) {
                        strAYXKKw = null;
                    }
                    if (strAYXKKw != null) {
                        String strAubY = value.AubY();
                        String strOcIXYQ = value.OcIXYQ();
                        if (strAubY.length() == 0 || strOcIXYQ.length() == 0) {
                            return null;
                        }
                        return C56424yEw.gEmmrt(C56390yDp.OLrzqt("lpTokenAddress", strOLrzqt), C56390yDp.OLrzqt("chainId", strFetchVPNInfo), C56390yDp.OLrzqt("userAddress", strAYXKKw), C56390yDp.OLrzqt("walletInvestType", strOcIXYQ));
                    }
                }
            }
        }
        return null;
    }

    public static final void AubY(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final CoinDetailFragmentNew coinDetailFragmentNew, Map map) {
        String str;
        String str2;
        String str3;
        if (map == null || (str = (String) map.get("lpTokenAddress")) == null) {
            return Unit.INSTANCE;
        }
        String str4 = (String) map.get("chainId");
        if (str4 != null && (str2 = (String) map.get("userAddress")) != null && (str3 = (String) map.get("walletInvestType")) != null) {
            AbstractC58185ywX<ResponseData<InvestmentDetailData>> abstractC58185ywXKWHzl = InterfaceC13915dbb.Companion.copydefault().AEQbTJ(str, str4, str2, str3).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            final Function1 function1 = new Function1() { // from class: o.gzm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.OLrzqt(this.EZpvd, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM<? super ResponseData<InvestmentDetailData>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gzp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    CoinDetailFragmentNew.AuCTelauCTel(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.gzo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.AYXKKw(this.EZpvd, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gzu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    CoinDetailFragmentNew.wlaJM(function12, obj);
                }
            });
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final void AuCTelauCTel(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(CoinDetailFragmentNew coinDetailFragmentNew, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            InvestmentDetailData investmentDetailData = (InvestmentDetailData) responseData.getData();
            String platformName = investmentDetailData != null ? investmentDetailData.getPlatformName() : null;
            boolean z = platformName == null || StringsKt__StringsKt.fARcdN((CharSequence) platformName);
            String rate = investmentDetailData != null ? investmentDetailData.getRate() : null;
            boolean z2 = rate == null || StringsKt__StringsKt.fARcdN((CharSequence) rate);
            String unlockDate = investmentDetailData != null ? investmentDetailData.getUnlockDate() : null;
            boolean z3 = unlockDate == null || StringsKt__StringsKt.fARcdN((CharSequence) unlockDate);
            List<QaItem> qaList = investmentDetailData != null ? investmentDetailData.getQaList() : null;
            boolean z4 = qaList == null || qaList.isEmpty();
            if ((!z) || (!z2) || (!z3) || (!z4)) {
                coinDetailFragmentNew.EZpvd(investmentDetailData);
            } else {
                coinDetailFragmentNew.fZBcTu();
            }
        } else {
            coinDetailFragmentNew.fZBcTu();
        }
        return Unit.INSTANCE;
    }

    public static final void wlaJM(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(CoinDetailFragmentNew coinDetailFragmentNew, Throwable th) {
        pUU.AEQbTJ(coinDetailFragmentNew.gHZMYf, "Error loading investment detail", th);
        coinDetailFragmentNew.fZBcTu();
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(CoinDetailFragmentNew coinDetailFragmentNew, Throwable th) {
        pUU.AEQbTJ(coinDetailFragmentNew.gHZMYf, "Error preparing investment detail request", th);
        coinDetailFragmentNew.fZBcTu();
        return Unit.INSTANCE;
    }

    public final void AubY() {
        ButtonSetupState buttonSetupState;
        ButtonSetupState buttonSetupState2;
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        C10525bqB value;
        try {
            if (isAdded() && getActivity() != null && (buttonSetupState = this.valueOf) != ButtonSetupState.DEX_COMPLETE && buttonSetupState != (buttonSetupState2 = ButtonSetupState.DEX_PROCESSING)) {
                this.valueOf = buttonSetupState2;
                AbstractC16521elW abstractC16521elW = this.AYXKKw;
                if (abstractC16521elW == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW = null;
                }
                C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
                if (c19465gDjAEQbTJ == null || (mutableLiveDataOLrzqt = c19465gDjAEQbTJ.OLrzqt()) == null || (value = mutableLiveDataOLrzqt.getValue()) == null) {
                    return;
                }
                try {
                    Result.Application application = Result.Companion;
                    AbstractC16521elW abstractC16521elW2 = this.AYXKKw;
                    if (abstractC16521elW2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW2 = null;
                    }
                    TextView textView = abstractC16521elW2.AxsJAY;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    boolean z = false;
                    initTextViewDrawable$default(this, textView, 0, 2, null);
                    AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
                    if (abstractC16521elW3 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW3 = null;
                    }
                    TextView textView2 = abstractC16521elW3.zLjUOn;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    initTextViewDrawable$default(this, textView2, 0, 2, null);
                    AbstractC16521elW abstractC16521elW4 = this.AYXKKw;
                    if (abstractC16521elW4 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW4 = null;
                    }
                    TextView textView3 = abstractC16521elW4.sSMYrx;
                    Intrinsics.checkNotNullExpressionValue(textView3, "");
                    initTextViewDrawable$default(this, textView3, 0, 2, null);
                    AbstractC16521elW abstractC16521elW5 = this.AYXKKw;
                    if (abstractC16521elW5 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW5 = null;
                    }
                    abstractC16521elW5.AxsJAY.setEnabled(!value.values().DCUTEIdCUTEI());
                    AbstractC16521elW abstractC16521elW6 = this.AYXKKw;
                    if (abstractC16521elW6 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW6 = null;
                    }
                    abstractC16521elW6.zLjUOn.setEnabled(!value.values().DCUTEIdCUTEI());
                    AbstractC16521elW abstractC16521elW7 = this.AYXKKw;
                    if (abstractC16521elW7 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW7 = null;
                    }
                    TextView textView4 = abstractC16521elW7.sSMYrx;
                    if (!value.values().QfsBiF() && !value.values().DCUTEIdCUTEI()) {
                        z = true;
                    }
                    textView4.setEnabled(z);
                    Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                boolean zQfsBiF = value.values().QfsBiF();
                String strAYXKKw = C33129mqd.AYXKKw(Long.valueOf(value.KWHzl().fetchVPNInfo()));
                String strOLrzqt = value.KWHzl().OLrzqt();
                copydefault(Boolean.valueOf(zQfsBiF), strAYXKKw, strOLrzqt == null ? "" : strOLrzqt, C33129mqd.AEQbTJ(value.AhwBna(), "1"), Boolean.valueOf(value.KWHzl().AuCTel()), Boolean.valueOf(C10854bwM.isXRCToken$default(value.KWHzl(), null, 1, null)));
                zsXlph();
            }
        } catch (Exception e) {
            pUU.AEQbTJ(this.gHZMYf, "Error in checkTradeButtonsAfterLPTokenCheck", e);
        }
    }

    public final void DTwDnp() {
        FragmentActivity activity;
        try {
            if (getActivity() == null || !isAdded() || (activity = getActivity()) == null) {
                return;
            }
            activity.runOnUiThread(new Runnable() { // from class: o.gzn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    CoinDetailFragmentNew.AxsJAY(this.KWHzl);
                }
            });
        } catch (Exception e) {
            pUU.AEQbTJ(this.gHZMYf, "Error hiding investment sections", e);
        }
    }

    public static final void AxsJAY(CoinDetailFragmentNew coinDetailFragmentNew) {
        View viewFindViewById;
        try {
            Result.Application application = Result.Companion;
            AbstractC16521elW abstractC16521elW = null;
            coinDetailFragmentNew.djBIcL = null;
            AbstractC16521elW abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW2 = null;
            }
            abstractC16521elW2.AkhnZx.getRoot().setVisibility(8);
            AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW3 = null;
            }
            abstractC16521elW3.AhwBna.getRoot().setVisibility(8);
            AbstractC16521elW abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW4 = null;
            }
            TextView textView = abstractC16521elW4.gHZMYf;
            if (textView != null) {
                textView.setVisibility(8);
            }
            AbstractC16521elW abstractC16521elW5 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW5 = null;
            }
            TextView textView2 = abstractC16521elW5.AwvSrB;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            FragmentActivity activity = coinDetailFragmentNew.getActivity();
            if (activity != null && (viewFindViewById = activity.findViewById(C13754dXa.ActionBar.dUDNAs)) != null) {
                viewFindViewById.setVisibility(0);
            }
            AbstractC16521elW abstractC16521elW6 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW = abstractC16521elW6;
            }
            ConstraintLayout constraintLayout = abstractC16521elW.AYXKKw;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void fZBcTu() {
        this.valueOf = ButtonSetupState.INITIAL;
        DTwDnp();
        AubY();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(final InvestmentDetailData investmentDetailData) {
        String strOcIXYQ;
        String string;
        String strLocalizePriceChangePercentage$default;
        View viewFindViewById;
        String answer;
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        try {
            if (!isAdded() || getActivity() == null || investmentDetailData == null || this.valueOf == ButtonSetupState.LP_COMPLETE) {
                return;
            }
            this.djBIcL = investmentDetailData;
            String platformName = investmentDetailData.getPlatformName();
            String str = platformName == null ? "" : platformName;
            String platformLogo = investmentDetailData.getPlatformLogo();
            String rate = investmentDetailData.getRate();
            String unlockDate = investmentDetailData.getUnlockDate();
            AbstractC16521elW abstractC16521elW = this.AYXKKw;
            AbstractC16521elW abstractC16521elW2 = null;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
            final C10525bqB value = (c19465gDjAEQbTJ == null || (mutableLiveDataOLrzqt = c19465gDjAEQbTJ.OLrzqt()) == null) ? null : mutableLiveDataOLrzqt.getValue();
            if (value == null || (strOcIXYQ = value.OcIXYQ()) == null) {
                strOcIXYQ = "";
            }
            boolean zEZpvd = Intrinsics.EZpvd((Object) strOcIXYQ, (Object) "8");
            String string2 = getString(C13754dXa.FragmentManager.onNightModeChanged);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            if (zEZpvd) {
                String string3 = getString(C13754dXa.FragmentManager.onTitleChanged);
                if (unlockDate == null) {
                    unlockDate = string2;
                    strLocalizePriceChangePercentage$default = unlockDate;
                    string = string3;
                } else {
                    if (!(!StringsKt__StringsKt.fARcdN((CharSequence) unlockDate))) {
                        unlockDate = null;
                    }
                    if (unlockDate == null) {
                    }
                    strLocalizePriceChangePercentage$default = unlockDate;
                    string = string3;
                }
            } else {
                string = getString(C13754dXa.FragmentManager.onPostResume);
                if (rate == null || StringsKt__StringsKt.fARcdN((CharSequence) rate)) {
                    strLocalizePriceChangePercentage$default = string2;
                } else {
                    try {
                        strLocalizePriceChangePercentage$default = InterfaceC9857bdW.TaskDescription.localizePriceChangePercentage$default((InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class), C33129mqd.EZpvd(rate), 0, 0, true, DisplaySign.AUTO, null, 38, null);
                    } catch (Exception unused) {
                        strLocalizePriceChangePercentage$default = string2;
                    }
                }
            }
            if ((!StringsKt__StringsKt.fARcdN((CharSequence) str)) || !strLocalizePriceChangePercentage$default.equals(string2)) {
                String platformUrl = investmentDetailData.getPlatformUrl();
                if (platformUrl == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) platformUrl))) {
                    platformUrl = null;
                }
                Integer tabId = investmentDetailData.getTabId();
                String platformItemKey = investmentDetailData.getPlatformItemKey();
                if (platformItemKey == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) platformItemKey))) {
                    platformItemKey = null;
                }
                copydefault(str, string, strLocalizePriceChangePercentage$default, platformLogo, (platformUrl == null && (tabId == null || platformItemKey == null)) ? false : true);
            } else {
                AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
                if (abstractC16521elW3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW3 = null;
                }
                abstractC16521elW3.AkhnZx.getRoot().setVisibility(8);
            }
            List<QaItem> qaList = investmentDetailData.getQaList();
            if (qaList == null || qaList.isEmpty()) {
                AbstractC16521elW abstractC16521elW4 = this.AYXKKw;
                if (abstractC16521elW4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW4 = null;
                }
                abstractC16521elW4.AhwBna.getRoot().setVisibility(8);
            } else {
                ArrayList arrayList = new ArrayList();
                for (QaItem qaItem : qaList) {
                    String question = qaItem.getQuestion();
                    C19420gBs c19420gBs = (question == null || StringsKt__StringsKt.fARcdN((CharSequence) question) || (answer = qaItem.getAnswer()) == null || StringsKt__StringsKt.fARcdN((CharSequence) answer)) ? null : new C19420gBs(qaItem.getQuestion(), qaItem.getAnswer(), false, 4, null);
                    if (c19420gBs != null) {
                        arrayList.add(c19420gBs);
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.DbNXlk.copydefault(arrayList);
                    AbstractC16521elW abstractC16521elW5 = this.AYXKKw;
                    if (abstractC16521elW5 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW5 = null;
                    }
                    abstractC16521elW5.AhwBna.getRoot().setVisibility(0);
                } else {
                    AbstractC16521elW abstractC16521elW6 = this.AYXKKw;
                    if (abstractC16521elW6 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW6 = null;
                    }
                    abstractC16521elW6.AhwBna.getRoot().setVisibility(8);
                }
            }
            AbstractC16521elW abstractC16521elW7 = this.AYXKKw;
            if (abstractC16521elW7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW7 = null;
            }
            abstractC16521elW7.zLjUOn.setVisibility(8);
            AbstractC16521elW abstractC16521elW8 = this.AYXKKw;
            if (abstractC16521elW8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW8 = null;
            }
            TextView textView = abstractC16521elW8.sSMYrx;
            if (textView != null) {
                textView.setVisibility(8);
            }
            FragmentActivity activity = getActivity();
            if (activity != null && (viewFindViewById = activity.findViewById(C13754dXa.ActionBar.dUDNAs)) != null) {
                viewFindViewById.setVisibility(8);
            }
            AbstractC16521elW abstractC16521elW9 = this.AYXKKw;
            if (abstractC16521elW9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW9 = null;
            }
            ConstraintLayout constraintLayout = abstractC16521elW9.AYXKKw;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            AbstractC16521elW abstractC16521elW10 = this.AYXKKw;
            if (abstractC16521elW10 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW2 = abstractC16521elW10;
            }
            abstractC16521elW2.djBIcL.setVisibility(8);
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.runOnUiThread(new Runnable() { // from class: o.gzO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoinDetailFragmentNew.copydefault(this.AEQbTJ, investmentDetailData, value);
                    }
                });
            }
        } catch (Exception e) {
            pUU.AEQbTJ(this.gHZMYf, "Error updating investment details UI", e);
            DTwDnp();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: all -> 0x008e, TryCatch #5 {all -> 0x008e, blocks: (B:3:0x0008, B:5:0x0016, B:7:0x001a, B:8:0x001e, B:10:0x002a, B:11:0x002e, B:13:0x003b, B:18:0x0045, B:27:0x005e, B:29:0x0062, B:30:0x0066, B:32:0x0070, B:33:0x0074, B:38:0x0087, B:22:0x004e, B:25:0x0056, B:34:0x007a, B:36:0x007e, B:37:0x0082), top: B:124:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[Catch: all -> 0x008e, TryCatch #5 {all -> 0x008e, blocks: (B:3:0x0008, B:5:0x0016, B:7:0x001a, B:8:0x001e, B:10:0x002a, B:11:0x002e, B:13:0x003b, B:18:0x0045, B:27:0x005e, B:29:0x0062, B:30:0x0066, B:32:0x0070, B:33:0x0074, B:38:0x0087, B:22:0x004e, B:25:0x0056, B:34:0x007a, B:36:0x007e, B:37:0x0082), top: B:124:0x0008, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(CoinDetailFragmentNew coinDetailFragmentNew, InvestmentDetailData investmentDetailData, C10525bqB c10525bqB) {
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        AbstractC12782ctV abstractC12782ctVValues;
        boolean z;
        Object objM7377constructorimpl3;
        AbstractC12782ctV abstractC12782ctVValues2;
        boolean z2;
        AbstractC16521elW abstractC16521elW;
        AbstractC16521elW abstractC16521elW2;
        boolean z3 = true;
        AbstractC12782ctV abstractC12782ctVValues3 = null;
        try {
            Result.Application application = Result.Companion;
            if (Intrinsics.EZpvd(investmentDetailData.isSupportSwap(), Boolean.TRUE)) {
                AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW3 = null;
                }
                TextView textView = abstractC16521elW3.AxsJAY;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                initTextViewDrawable$default(coinDetailFragmentNew, textView, 0, 2, null);
                AbstractC16521elW abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW4 = null;
                }
                abstractC16521elW4.AxsJAY.setText(coinDetailFragmentNew.getString(C13754dXa.FragmentManager.onQueueChanged));
                if (c10525bqB != null) {
                    try {
                        abstractC12782ctVValues2 = c10525bqB.values();
                    } catch (Exception e) {
                        pUU.AEQbTJ(coinDetailFragmentNew.gHZMYf, "Error checking wallet status for swap button", e);
                    }
                } else {
                    abstractC12782ctVValues2 = null;
                }
                if (abstractC12782ctVValues2 == null || !abstractC12782ctVValues2.QfsBiF()) {
                    if (abstractC12782ctVValues2 != null) {
                        if (abstractC12782ctVValues2.DCUTEIdCUTEI()) {
                        }
                        abstractC16521elW = coinDetailFragmentNew.AYXKKw;
                        if (abstractC16521elW == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16521elW = null;
                        }
                        abstractC16521elW.AxsJAY.setEnabled(!z2);
                        abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
                        if (abstractC16521elW2 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16521elW2 = null;
                        }
                        abstractC16521elW2.AxsJAY.setVisibility(0);
                    }
                    z2 = false;
                    abstractC16521elW = coinDetailFragmentNew.AYXKKw;
                    if (abstractC16521elW == null) {
                    }
                    abstractC16521elW.AxsJAY.setEnabled(!z2);
                    abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
                    if (abstractC16521elW2 == null) {
                    }
                    abstractC16521elW2.AxsJAY.setVisibility(0);
                }
                z2 = true;
                abstractC16521elW = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW == null) {
                }
                abstractC16521elW.AxsJAY.setEnabled(!z2);
                abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW2 == null) {
                }
                abstractC16521elW2.AxsJAY.setVisibility(0);
            } else {
                AbstractC16521elW abstractC16521elW5 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW5 = null;
                }
                abstractC16521elW5.AxsJAY.setVisibility(8);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(coinDetailFragmentNew.gHZMYf, "Error setting up swap button", thM7380exceptionOrNullimpl);
            AbstractC16521elW abstractC16521elW6 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW6 = null;
            }
            abstractC16521elW6.AxsJAY.setVisibility(8);
        }
        AbstractC16521elW abstractC16521elW7 = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW7 = null;
        }
        TextView textView2 = abstractC16521elW7.gHZMYf;
        if (textView2 != null) {
            try {
                Result.Application application3 = Result.Companion;
                if (Intrinsics.EZpvd(investmentDetailData.isSupportRedeem(), Boolean.TRUE)) {
                    initTextViewDrawable$default(coinDetailFragmentNew, textView2, 0, 2, null);
                    textView2.setText(coinDetailFragmentNew.getString(C13754dXa.FragmentManager.onCreateSupportNavigateUpTaskStack));
                    if (c10525bqB != null) {
                        try {
                            abstractC12782ctVValues = c10525bqB.values();
                        } catch (Exception e2) {
                            pUU.AEQbTJ(coinDetailFragmentNew.gHZMYf, "Error checking wallet status for redeem button", e2);
                        }
                    } else {
                        abstractC12782ctVValues = null;
                    }
                    if (abstractC12782ctVValues == null || !abstractC12782ctVValues.QfsBiF()) {
                        if (abstractC12782ctVValues != null) {
                            if (abstractC12782ctVValues.DCUTEIdCUTEI()) {
                            }
                            textView2.setEnabled(z);
                            textView2.setVisibility(0);
                            textView2.setOnClickListener(new ApplicationInfo(textView2, 1000L, coinDetailFragmentNew));
                        }
                        z = true;
                        textView2.setEnabled(z);
                        textView2.setVisibility(0);
                        textView2.setOnClickListener(new ApplicationInfo(textView2, 1000L, coinDetailFragmentNew));
                    }
                    z = false;
                    textView2.setEnabled(z);
                    textView2.setVisibility(0);
                    textView2.setOnClickListener(new ApplicationInfo(textView2, 1000L, coinDetailFragmentNew));
                } else {
                    textView2.setVisibility(8);
                }
                objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
            if (thM7380exceptionOrNullimpl2 != null) {
                pUU.AEQbTJ(coinDetailFragmentNew.gHZMYf, "Error setting up redeem button", thM7380exceptionOrNullimpl2);
                textView2.setVisibility(8);
            }
            Result.m7376boximpl(objM7377constructorimpl2);
        }
        AbstractC16521elW abstractC16521elW8 = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW8 = null;
        }
        TextView textView3 = abstractC16521elW8.AwvSrB;
        if (textView3 != null) {
            try {
                Result.Application application5 = Result.Companion;
                if (Intrinsics.EZpvd(investmentDetailData.isSupportDeposit(), Boolean.TRUE)) {
                    initTextViewDrawable$default(coinDetailFragmentNew, textView3, 0, 2, null);
                    textView3.setText(coinDetailFragmentNew.getString(C13754dXa.FragmentManager.getResources));
                    if (c10525bqB != null) {
                        try {
                            abstractC12782ctVValues3 = c10525bqB.values();
                        } catch (Exception e3) {
                            pUU.AEQbTJ(coinDetailFragmentNew.gHZMYf, "Error checking wallet status for deposit button", e3);
                        }
                    }
                    if (abstractC12782ctVValues3 == null || !abstractC12782ctVValues3.QfsBiF()) {
                        if (abstractC12782ctVValues3 != null) {
                            if (abstractC12782ctVValues3.DCUTEIdCUTEI()) {
                            }
                        }
                        textView3.setEnabled(z3);
                        textView3.setVisibility(0);
                        textView3.setOnClickListener(new SharedPreferences(textView3, 1000L, coinDetailFragmentNew));
                    }
                    z3 = false;
                    textView3.setEnabled(z3);
                    textView3.setVisibility(0);
                    textView3.setOnClickListener(new SharedPreferences(textView3, 1000L, coinDetailFragmentNew));
                } else {
                    textView3.setVisibility(8);
                }
                objM7377constructorimpl3 = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Application application6 = Result.Companion;
                objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
            }
            Throwable thM7380exceptionOrNullimpl3 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl3);
            if (thM7380exceptionOrNullimpl3 != null) {
                pUU.AEQbTJ(coinDetailFragmentNew.gHZMYf, "Error setting up deposit button", thM7380exceptionOrNullimpl3);
                textView3.setVisibility(8);
            }
            Result.m7376boximpl(objM7377constructorimpl3);
        }
        coinDetailFragmentNew.valueOf = ButtonSetupState.LP_COMPLETE;
    }

    public final void QKVWgx() {
        String strFetchVPNInfo;
        AbstractC12782ctV abstractC12782ctVAuCTel;
        try {
            android.content.Context context = getContext();
            if (context == null || !isAdded()) {
                return;
            }
            FragmentActivity activity = getActivity();
            if (activity == null || !activity.isFinishing()) {
                FragmentActivity activity2 = getActivity();
                if (activity2 == null || !activity2.isDestroyed()) {
                    InvestmentDetailData investmentDetailData = this.djBIcL;
                    if (investmentDetailData == null) {
                        pUU.copydefault(this.gHZMYf, "Investment data not available for protocol click");
                        return;
                    }
                    Integer tabId = investmentDetailData.getTabId();
                    String platformItemKey = investmentDetailData.getPlatformItemKey();
                    Long lValueOf = null;
                    if (platformItemKey == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) platformItemKey))) {
                        platformItemKey = null;
                    }
                    String platformUrl = investmentDetailData.getPlatformUrl();
                    if (platformUrl == null || !(true ^ StringsKt__StringsKt.fARcdN((CharSequence) platformUrl))) {
                        platformUrl = null;
                    }
                    InterfaceC25429iwZ interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class));
                    if (tabId != null && platformItemKey != null) {
                        if (interfaceC25429iwZ != null) {
                            interfaceC25429iwZ.EZpvd(context, tabId.intValue(), platformItemKey, (String) null, (String) null);
                            return;
                        } else {
                            pUU.copydefault(this.gHZMYf, "InvestServiceApi not available");
                            return;
                        }
                    }
                    if (platformUrl != null) {
                        try {
                            FragmentActivity activity3 = getActivity();
                            if (activity3 != null && !activity3.isFinishing() && !activity3.isDestroyed()) {
                                AbstractC16521elW abstractC16521elW = this.AYXKKw;
                                if (abstractC16521elW == null) {
                                    Intrinsics.gEmmrt("");
                                    abstractC16521elW = null;
                                }
                                C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
                                String strDbNXlk = (c19465gDjAEQbTJ == null || (abstractC12782ctVAuCTel = c19465gDjAEQbTJ.AuCTel()) == null) ? null : abstractC12782ctVAuCTel.DbNXlk();
                                AbstractC16521elW abstractC16521elW2 = this.AYXKKw;
                                if (abstractC16521elW2 == null) {
                                    Intrinsics.gEmmrt("");
                                    abstractC16521elW2 = null;
                                }
                                C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW2.AEQbTJ();
                                if (c19465gDjAEQbTJ2 != null && (strFetchVPNInfo = c19465gDjAEQbTJ2.fetchVPNInfo()) != null) {
                                    lValueOf = Long.valueOf(Long.parseLong(strFetchVPNInfo));
                                }
                                InterfaceC54828xWv interfaceC54828xWv = (InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class);
                                if (interfaceC54828xWv != null) {
                                    InterfaceC54828xWv.ActionBar.enterDAppWebView$default(interfaceC54828xWv, activity3, platformUrl, strDbNXlk, lValueOf, new Function0() { // from class: o.gyP
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return CoinDetailFragmentNew.isConnected();
                                        }
                                    }, null, null, "dex", 96, null);
                                    return;
                                } else {
                                    pUU.copydefault(this.gHZMYf, "EnterDAppWebViewService not available");
                                    return;
                                }
                            }
                            pUU.copydefault(this.gHZMYf, "Activity not available for opening platform URL");
                            return;
                        } catch (Exception e) {
                            pUU.AEQbTJ(this.gHZMYf, "Error opening platform URL in DApp WebView", e);
                            return;
                        }
                    }
                    pUU.copydefault(this.gHZMYf, "No tabId/platformItemKey or platformUrl available for protocol click");
                }
            }
        } catch (Exception e2) {
            pUU.AEQbTJ(this.gHZMYf, "Error handling protocol click", e2);
        }
    }

    public static final Unit isConnected() {
        return Unit.INSTANCE;
    }

    public final void ORxRYg() {
        try {
            if (isAdded() && getActivity() != null) {
                InvestmentDetailData investmentDetailData = this.djBIcL;
                if (investmentDetailData == null) {
                    pUU.copydefault(this.gHZMYf, "Investment data not available for redeem");
                    return;
                }
                Long lValueOf = investmentDetailData.getInvestmentId() != null ? Long.valueOf(r0.intValue()) : null;
                if (lValueOf == null) {
                    pUU.copydefault(this.gHZMYf, "Invalid investment ID for redeem");
                    return;
                }
                AbstractC16521elW abstractC16521elW = this.AYXKKw;
                if (abstractC16521elW == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW = null;
                }
                C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
                String strFetchVPNInfo = c19465gDjAEQbTJ != null ? c19465gDjAEQbTJ.fetchVPNInfo() : null;
                if (strFetchVPNInfo == null) {
                    pUU.copydefault(this.gHZMYf, "Invalid chain ID for redeem");
                    return;
                }
                DeFiRedeemParam deFiRedeemParam = new DeFiRedeemParam(lValueOf.longValue(), Long.parseLong(strFetchVPNInfo), false, 4, (DefaultConstructorMarker) null);
                InterfaceC25429iwZ interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class));
                if (interfaceC25429iwZ == null) {
                    pUU.copydefault(this.gHZMYf, "InvestServiceApi not available");
                    return;
                }
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                interfaceC25429iwZ.copydefault(contextRequireContext, deFiRedeemParam, new LoaderManager(lValueOf));
            }
        } catch (Exception e) {
            pUU.AEQbTJ(this.gHZMYf, "Error handling redeem click", e);
        }
    }

    public static final class LoaderManager implements InterfaceC25423iwT {
        public final /* synthetic */ Long KWHzl;

        public LoaderManager(Long l) {
            this.KWHzl = l;
        }

        @Override // o.InterfaceC25423iwT
        public void KWHzl() {
            CoinDetailFragmentNew.this.showLoading(500L);
            pUU.EZpvd(CoinDetailFragmentNew.this.gHZMYf, "Redeem started for investmentId=" + this.KWHzl);
        }

        @Override // o.InterfaceC25423iwT
        public void copydefault() {
            CoinDetailFragmentNew.this.dismissLoading();
            pUU.EZpvd(CoinDetailFragmentNew.this.gHZMYf, "Redeem completed for investmentId=" + this.KWHzl);
        }

        @Override // o.InterfaceC25423iwT
        public void EZpvd() {
            CoinDetailFragmentNew.this.dismissLoading();
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dNCPSb), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            pUU.copydefault(CoinDetailFragmentNew.this.gHZMYf, "Redeem error for investmentId=" + this.KWHzl);
        }
    }

    public final void QOLQEE() {
        try {
            if (isAdded() && getActivity() != null) {
                InvestmentDetailData investmentDetailData = this.djBIcL;
                if (investmentDetailData == null) {
                    pUU.copydefault(this.gHZMYf, "Investment data not available for deposit");
                    return;
                }
                Long lValueOf = investmentDetailData.getInvestmentId() != null ? Long.valueOf(r0.intValue()) : null;
                if (lValueOf == null) {
                    pUU.copydefault(this.gHZMYf, "Invalid investment ID for deposit");
                    return;
                }
                InterfaceC25429iwZ interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class));
                if (interfaceC25429iwZ == null) {
                    pUU.copydefault(this.gHZMYf, "InvestServiceApi not available");
                    return;
                }
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                interfaceC25429iwZ.AEQbTJ(contextRequireContext, lValueOf.longValue(), lValueOf.longValue(), "wallet_coin_detail", (Integer) null);
            }
        } catch (Exception e) {
            pUU.AEQbTJ(this.gHZMYf, "Error handling deposit click", e);
        }
    }

    public final void QUSxYX() {
        this.valueOf = ButtonSetupState.INITIAL;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        abstractC16521elW.AkhnZx.getRoot().setVisibility(8);
        AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW3 = null;
        }
        TextView textView = abstractC16521elW3.gHZMYf;
        if (textView != null) {
            textView.setVisibility(8);
        }
        AbstractC16521elW abstractC16521elW4 = this.AYXKKw;
        if (abstractC16521elW4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW4 = null;
        }
        TextView textView2 = abstractC16521elW4.AwvSrB;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        AbstractC16521elW abstractC16521elW5 = this.AYXKKw;
        if (abstractC16521elW5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW5 = null;
        }
        abstractC16521elW5.AxsJAY.setVisibility(8);
        AbstractC16521elW abstractC16521elW6 = this.AYXKKw;
        if (abstractC16521elW6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW6 = null;
        }
        abstractC16521elW6.zLjUOn.setVisibility(8);
        AbstractC16521elW abstractC16521elW7 = this.AYXKKw;
        if (abstractC16521elW7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW7 = null;
        }
        TextView textView3 = abstractC16521elW7.sSMYrx;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        AbstractC16521elW abstractC16521elW8 = this.AYXKKw;
        if (abstractC16521elW8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW2 = abstractC16521elW8;
        }
        abstractC16521elW2.AYXKKw.setVisibility(0);
    }

    public static /* synthetic */ void updateInvestmentDetails$default(CoinDetailFragmentNew coinDetailFragmentNew, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        String str5 = str4;
        if ((i & 16) != 0) {
            z = false;
        }
        coinDetailFragmentNew.copydefault(str, str2, str3, str5, z);
    }

    public final void copydefault(final String str, String str2, String str3, String str4, boolean z) {
        Drawable drawable;
        Object objM7377constructorimpl;
        AbstractC16521elW abstractC16521elW = null;
        if ((str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) && (str3 == null || StringsKt__StringsKt.fARcdN((CharSequence) str3))) {
            AbstractC16521elW abstractC16521elW2 = this.AYXKKw;
            if (abstractC16521elW2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW = abstractC16521elW2;
            }
            abstractC16521elW.AkhnZx.getRoot().setVisibility(8);
            return;
        }
        AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW3 = null;
        }
        abstractC16521elW3.AkhnZx.getRoot().setVisibility(0);
        if (str != null && !StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            AbstractC16521elW abstractC16521elW4 = this.AYXKKw;
            if (abstractC16521elW4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW4 = null;
            }
            final AppCompatTextView appCompatTextView = abstractC16521elW4.AkhnZx.isConnected;
            if (appCompatTextView != null) {
                try {
                    Result.Application application = Result.Companion;
                    appCompatTextView.setText(str);
                    objM7377constructorimpl = Result.m7377constructorimpl(Boolean.valueOf(appCompatTextView.post(new Runnable() { // from class: o.gyY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            CoinDetailFragmentNew.OLrzqt(appCompatTextView, this, str);
                        }
                    })));
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ(this.gHZMYf, "Error setting protocol text", thM7380exceptionOrNullimpl);
                }
                Result.m7376boximpl(objM7377constructorimpl);
            }
        }
        AbstractC16521elW abstractC16521elW5 = this.AYXKKw;
        if (abstractC16521elW5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW5 = null;
        }
        AppCompatImageView appCompatImageView = abstractC16521elW5.AkhnZx.copydefault;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(0);
            if (str4 != null && !StringsKt__StringsKt.fARcdN((CharSequence) str4)) {
                Glide.EZpvd(this).EZpvd(str4).gEmmrt().KWHzl(C13754dXa.Activity.aKErDB).copydefault(C13754dXa.Activity.aKErDB).EZpvd((ImageView) appCompatImageView);
            }
        }
        AbstractC16521elW abstractC16521elW6 = this.AYXKKw;
        if (abstractC16521elW6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW6 = null;
        }
        AppCompatTextView appCompatTextView2 = abstractC16521elW6.AkhnZx.isConnected;
        if (!z || (drawable = ContextCompat.getDrawable(appCompatTextView2.getContext(), C52761wXj.TaskDescription.DGOPHZDGOPHZ)) == null) {
            drawable = null;
        } else {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.setTint(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        appCompatTextView2.setCompoundDrawablesRelative(null, null, drawable, null);
        AbstractC16521elW abstractC16521elW7 = this.AYXKKw;
        if (abstractC16521elW7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW7 = null;
        }
        ConstraintLayout constraintLayout = abstractC16521elW7.AkhnZx.gEmmrt;
        constraintLayout.setClickable(z);
        if (z) {
            constraintLayout.setOnClickListener(new IntentFilter(constraintLayout, 1000L, this));
        } else {
            constraintLayout.setOnClickListener(new ServiceConnection(constraintLayout, 1000L));
        }
        AbstractC16521elW abstractC16521elW8 = this.AYXKKw;
        if (abstractC16521elW8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW8 = null;
        }
        AppCompatTextView appCompatTextView3 = abstractC16521elW8.AkhnZx.djBIcL;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(str2);
        }
        if (str3 == null || StringsKt__StringsKt.fARcdN((CharSequence) str3)) {
            return;
        }
        AbstractC16521elW abstractC16521elW9 = this.AYXKKw;
        if (abstractC16521elW9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW = abstractC16521elW9;
        }
        AppCompatTextView appCompatTextView4 = abstractC16521elW.AkhnZx.AhwBna;
        if (appCompatTextView4 != null) {
            appCompatTextView4.setText(str3);
        }
    }

    public static final void OLrzqt(final AppCompatTextView appCompatTextView, final CoinDetailFragmentNew coinDetailFragmentNew, final String str) {
        Object objM7377constructorimpl;
        TextPaint paint;
        try {
            Result.Application application = Result.Companion;
            if (!appCompatTextView.isAttachedToWindow() || coinDetailFragmentNew.getContext() == null || (paint = appCompatTextView.getPaint()) == null) {
                return;
            }
            final int width = (appCompatTextView.getWidth() - appCompatTextView.getPaddingLeft()) - appCompatTextView.getPaddingRight();
            if (width > 0 && str.length() > 0) {
                if (paint.measureText(str) > width) {
                    appCompatTextView.setTextSize(2, 12.0f);
                    appCompatTextView.post(new Runnable() { // from class: o.gzi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            CoinDetailFragmentNew.copydefault(appCompatTextView, coinDetailFragmentNew, str, width);
                        }
                    });
                } else {
                    appCompatTextView.setTextSize(2, 14.0f);
                    appCompatTextView.setEllipsize(null);
                    appCompatTextView.setMaxLines(Integer.MAX_VALUE);
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(coinDetailFragmentNew.gHZMYf, "Error adjusting protocol text size", thM7380exceptionOrNullimpl);
        }
    }

    public static final void copydefault(AppCompatTextView appCompatTextView, CoinDetailFragmentNew coinDetailFragmentNew, String str, int i) {
        Object objM7377constructorimpl;
        TextPaint paint;
        try {
            Result.Application application = Result.Companion;
            if (!appCompatTextView.isAttachedToWindow() || coinDetailFragmentNew.getContext() == null || (paint = appCompatTextView.getPaint()) == null) {
                return;
            }
            if (paint.measureText(str) > i) {
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setMaxLines(1);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(coinDetailFragmentNew.gHZMYf, "Error adjusting protocol text truncation", thM7380exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ButtonSetupState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ButtonSetupState[] $VALUES;
        public static final ButtonSetupState INITIAL = new ButtonSetupState("INITIAL", 0);
        public static final ButtonSetupState LP_PROCESSING = new ButtonSetupState("LP_PROCESSING", 1);
        public static final ButtonSetupState LP_COMPLETE = new ButtonSetupState("LP_COMPLETE", 2);
        public static final ButtonSetupState DEX_PROCESSING = new ButtonSetupState("DEX_PROCESSING", 3);
        public static final ButtonSetupState DEX_COMPLETE = new ButtonSetupState("DEX_COMPLETE", 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ButtonSetupState[] $values() {
            return new ButtonSetupState[]{INITIAL, LP_PROCESSING, LP_COMPLETE, DEX_PROCESSING, DEX_COMPLETE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ButtonSetupState> getEntries() {
            return $ENTRIES;
        }

        private ButtonSetupState(String str, int i) {
        }

        static {
            ButtonSetupState[] buttonSetupStateArr$values = $values();
            $VALUES = buttonSetupStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(buttonSetupStateArr$values);
        }

        public static ButtonSetupState valueOf(String str) {
            return (ButtonSetupState) Enum.valueOf(ButtonSetupState.class, str);
        }

        public static ButtonSetupState[] values() {
            return (ButtonSetupState[]) $VALUES.clone();
        }
    }

    public final boolean RcXXUw() {
        ButtonSetupState buttonSetupState = this.valueOf;
        return buttonSetupState == ButtonSetupState.LP_PROCESSING || buttonSetupState == ButtonSetupState.LP_COMPLETE;
    }

    public final void QbewEr() {
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        RecyclerView recyclerView = abstractC16521elW.AhwBna.copydefault;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.DbNXlk);
            recyclerView.setHasFixedSize(false);
        }
        AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW2 = abstractC16521elW3;
        }
        abstractC16521elW2.AhwBna.getRoot().setVisibility(8);
    }

    public final void RJOkX() {
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        final C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ == null) {
            return;
        }
        c19465gDjAEQbTJ.fJNWhG().observe(getViewLifecycleOwner(), new DialogInterface(new Function1() { // from class: o.gzs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.copydefault(this.OLrzqt, c19465gDjAEQbTJ, (C18177fdV) obj);
            }
        }));
    }

    public static final Unit copydefault(final CoinDetailFragmentNew coinDetailFragmentNew, C19465gDj c19465gDj, final C18177fdV c18177fdV) {
        if (c18177fdV == null || c18177fdV.EZpvd() == AddressRegisterStatus.STATUS_UNACTIVATED) {
            AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            abstractC16521elW.DTwDnp.getRoot().setVisibility(8);
            return Unit.INSTANCE;
        }
        coinDetailFragmentNew.AEQbTJ(c19465gDj, new Function1() { // from class: o.gyZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.OLrzqt(this.copydefault, c18177fdV, (Web3CampaignResponse) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(CoinDetailFragmentNew coinDetailFragmentNew, C18177fdV c18177fdV, Web3CampaignResponse web3CampaignResponse) {
        Intrinsics.checkNotNullParameter(web3CampaignResponse, "");
        if (coinDetailFragmentNew.OLrzqt(web3CampaignResponse, c18177fdV)) {
            coinDetailFragmentNew.KWHzl(web3CampaignResponse);
        } else {
            AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            abstractC16521elW.DTwDnp.getRoot().setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C19465gDj c19465gDj, final Function1<? super Web3CampaignResponse, Unit> function1) {
        InterfaceC25429iwZ interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class));
        if (interfaceC25429iwZ != null) {
            String strAYXKKw = c19465gDj.AYXKKw();
            int iAhwBna = C33129mqd.AhwBna(c19465gDj.fetchVPNInfo());
            String strDbNXlk = c19465gDj.DbNXlk();
            if (strDbNXlk == null) {
                strDbNXlk = "";
            }
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(interfaceC25429iwZ.copydefault(strAYXKKw, iAhwBna, strDbNXlk, 2), this);
            final Function1 function12 = new Function1() { // from class: o.gyB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.AEQbTJ(function1, (Web3CampaignResponse) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gyx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    CoinDetailFragmentNew.getFieldNames(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.gyA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.AhwBna(this.copydefault, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gyy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    CoinDetailFragmentNew.iwGUEr(function13, obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(Function1 function1, Web3CampaignResponse web3CampaignResponse) {
        Intrinsics.copydefault(web3CampaignResponse);
        function1.invoke(web3CampaignResponse);
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void iwGUEr(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(CoinDetailFragmentNew coinDetailFragmentNew, Throwable th) {
        pUU.AEQbTJ(coinDetailFragmentNew.gHZMYf, "fetchClaimRewardsInfo error", th);
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        abstractC16521elW.DTwDnp.getRoot().setVisibility(8);
        return Unit.INSTANCE;
    }

    public final boolean OLrzqt(Web3CampaignResponse web3CampaignResponse, C18177fdV c18177fdV) {
        Web3CampaignBean web3CampaignBean;
        List<Web3RewardToken> listOLrzqt;
        Web3RewardToken web3RewardToken;
        String strKWHzl;
        List<Web3CampaignBean> listOLrzqt2 = web3CampaignResponse.OLrzqt();
        boolean zAEQbTJ = (listOLrzqt2 == null || (web3CampaignBean = (Web3CampaignBean) CollectionsKt___CollectionsKt.firstOrNull(listOLrzqt2)) == null || (listOLrzqt = web3CampaignBean.OLrzqt()) == null || (web3RewardToken = (Web3RewardToken) CollectionsKt___CollectionsKt.firstOrNull(listOLrzqt)) == null || (strKWHzl = web3RewardToken.KWHzl()) == null) ? false : C33129mqd.AEQbTJ(strKWHzl, "0");
        if (c18177fdV.AEQbTJ() != ActivityStatus.STATUS_CLOSED) {
            if (c18177fdV.EZpvd() == AddressRegisterStatus.STATUS_ACTIVATED) {
                return true;
            }
            if (c18177fdV.EZpvd() != AddressRegisterStatus.STATUS_DEACTIVATED) {
                return false;
            }
        }
        return zAEQbTJ;
    }

    public final void KWHzl(Web3CampaignResponse web3CampaignResponse) {
        List<Web3RewardToken> listOLrzqt;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        abstractC16521elW.DTwDnp.getRoot().setVisibility(0);
        List<Web3CampaignBean> listOLrzqt2 = web3CampaignResponse.OLrzqt();
        Web3CampaignBean web3CampaignBean = listOLrzqt2 != null ? (Web3CampaignBean) CollectionsKt___CollectionsKt.firstOrNull(listOLrzqt2) : null;
        Web3RewardToken web3RewardToken = (web3CampaignBean == null || (listOLrzqt = web3CampaignBean.OLrzqt()) == null) ? null : (Web3RewardToken) CollectionsKt___CollectionsKt.firstOrNull(listOLrzqt);
        AbstractC16521elW abstractC16521elW2 = this.AYXKKw;
        if (abstractC16521elW2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW2 = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW2.AEQbTJ();
        AEQbTJ(web3RewardToken, c19465gDjAEQbTJ != null ? c19465gDjAEQbTJ.djBIcL() : null);
        OLrzqt(web3CampaignBean);
        dxcTrN();
    }

    public final void OLrzqt(Web3CampaignBean web3CampaignBean) {
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C52794wYp c52794wYp = abstractC16521elW.DTwDnp.EZpvd;
        if (web3CampaignBean != null && Intrinsics.EZpvd(web3CampaignBean.EZpvd(), Boolean.TRUE)) {
            c52794wYp.setVisibility(0);
            c52794wYp.setOnClickListener(new ContextWrapper(c52794wYp, 1000L, this, web3CampaignBean));
        } else {
            c52794wYp.setVisibility(8);
        }
    }

    public final void AEQbTJ(Web3CampaignBean web3CampaignBean) {
        InterfaceC25429iwZ interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class));
        if (interfaceC25429iwZ == null || web3CampaignBean == null) {
            return;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC25429iwZ.copydefault(contextRequireContext, web3CampaignBean, new StateListAnimator());
    }

    public static final class StateListAnimator implements InterfaceC25483ixa {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC25483ixa
        public void OLrzqt() {
            CoinDetailFragmentNew.this.showLoading();
        }

        @Override // o.InterfaceC25483ixa
        public void copydefault() {
            CoinDetailFragmentNew.this.dismissLoading();
        }

        @Override // o.InterfaceC25483ixa
        public void copydefault(int i) {
            AbstractC58185ywX<C18177fdV> abstractC58185ywXWlaJM;
            AbstractC58185ywX<C18177fdV> abstractC58185ywXCopydefault;
            AbstractC58185ywX<C18177fdV> abstractC58185ywXKWHzl;
            CoinDetailFragmentNew.this.dismissLoading();
            if (i == 3) {
                AbstractC16521elW abstractC16521elW = CoinDetailFragmentNew.this.AYXKKw;
                if (abstractC16521elW == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW = null;
                }
                C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
                if (c19465gDjAEQbTJ == null || (abstractC58185ywXWlaJM = c19465gDjAEQbTJ.wlaJM()) == null || (abstractC58185ywXCopydefault = abstractC58185ywXWlaJM.copydefault(yBP.AEQbTJ())) == null || (abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(C58266yxz.OLrzqt())) == null) {
                    return;
                }
                final Function1 function1 = new Function1() { // from class: o.gAn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return CoinDetailFragmentNew.StateListAnimator.copydefault((C18177fdV) obj);
                    }
                };
                InterfaceC58227yxM<? super C18177fdV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gAm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        CoinDetailFragmentNew.StateListAnimator.EZpvd(function1, obj);
                    }
                };
                final CoinDetailFragmentNew coinDetailFragmentNew = CoinDetailFragmentNew.this;
                final Function1 function12 = new Function1() { // from class: o.gAk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return CoinDetailFragmentNew.StateListAnimator.copydefault(coinDetailFragmentNew, (java.lang.Throwable) obj);
                    }
                };
                InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gAj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        CoinDetailFragmentNew.StateListAnimator.KWHzl(function12, obj);
                    }
                });
                if (interfaceC58217yxCAEQbTJ != null) {
                    yBK.EZpvd(interfaceC58217yxCAEQbTJ, CoinDetailFragmentNew.this.AhwBna);
                }
            }
        }

        public static final void EZpvd(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static final void KWHzl(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static final Unit copydefault(C18177fdV c18177fdV) {
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(CoinDetailFragmentNew coinDetailFragmentNew, Throwable th) {
            pUU.AEQbTJ(coinDetailFragmentNew.gHZMYf, "showUsdgRewardsInfo error", th);
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC25483ixa
        public void KWHzl(int i, String str) {
            CoinDetailFragmentNew.this.dismissLoading();
            if (str == null) {
                str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendMetadata);
            }
            C55326xho.toast$default(str, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
    }

    public final void dxcTrN() {
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        AppCompatImageView appCompatImageView = abstractC16521elW.DTwDnp.OLrzqt;
        appCompatImageView.setOnClickListener(new Intent(appCompatImageView, 1000L, this));
    }

    public final void copydefault(int i, int i2) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(0);
        viewOnClickListenerC54939xaY.setTitle(i);
        viewOnClickListenerC54939xaY.copydefault(i2);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.DarRvM, (View.OnClickListener) null, 2, (Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(Web3RewardToken web3RewardToken, C10854bwM c10854bwM) {
        String strOLrzqt;
        String strOLrzqt2;
        String strAEQbTJ;
        BigDecimal bigDecimalEZpvd;
        String priceChangePercentage$default;
        String strKWHzl;
        String strDjBIcL;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        AbstractC17052evX abstractC17052evX = abstractC16521elW.DTwDnp;
        AppCompatTextView appCompatTextView = abstractC17052evX.valueOf;
        String str = "--";
        if (web3RewardToken == null || (strDjBIcL = web3RewardToken.djBIcL()) == null) {
            strOLrzqt = "--";
        } else {
            strOLrzqt = C54870xYj.OLrzqt(strDjBIcL, (249 & 1) != 0 ? 0 : 0, c10854bwM != null ? c10854bwM.AkhnZx() : 6, c10854bwM != null ? c10854bwM.fJNWhG() : null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
            if (strOLrzqt == null) {
            }
        }
        appCompatTextView.setText(strOLrzqt);
        AppCompatTextView appCompatTextView2 = abstractC17052evX.gEmmrt;
        if (web3RewardToken == null || (strKWHzl = web3RewardToken.KWHzl()) == null) {
            strOLrzqt2 = "--";
        } else {
            strOLrzqt2 = C54870xYj.OLrzqt(strKWHzl, (249 & 1) != 0 ? 0 : 0, c10854bwM != null ? c10854bwM.AkhnZx() : 6, c10854bwM != null ? c10854bwM.fJNWhG() : null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
            if (strOLrzqt2 == null) {
            }
        }
        appCompatTextView2.setText(strOLrzqt2);
        AppCompatTextView appCompatTextView3 = abstractC17052evX.AhwBna;
        if (web3RewardToken != null && (strAEQbTJ = web3RewardToken.AEQbTJ()) != null && (bigDecimalEZpvd = C33129mqd.EZpvd(strAEQbTJ)) != null && (priceChangePercentage$default = C54873xYm.formatPriceChangePercentage$default(bigDecimalEZpvd, 0, 0, true, null, null, 27, null)) != null) {
            str = priceChangePercentage$default;
        }
        appCompatTextView3.setText(str);
    }

    public static final class ContentResolver extends RecyclerView.OnScrollListener {
        public ContentResolver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            CoinDetailFragmentNew coinDetailFragmentNew = CoinDetailFragmentNew.this;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            coinDetailFragmentNew.fARcdN = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            if (CoinDetailFragmentNew.this.AxsJAY == 0) {
                CoinDetailFragmentNew coinDetailFragmentNew2 = CoinDetailFragmentNew.this;
                coinDetailFragmentNew2.AxsJAY = coinDetailFragmentNew2.fARcdN + 1;
            }
            if (!CoinDetailFragmentNew.this.wlaJM || CoinDetailFragmentNew.this.fARcdN > 10) {
                return;
            }
            CoinDetailFragmentNew.this.wlaJM = false;
            CoinDetailFragmentNew.this.dvKsVJ();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void iRxXKY() {
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        RecyclerView recyclerView = abstractC16521elW.QOLQEE;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        if (recyclerView.getItemDecorationCount() > 0) {
            int itemDecorationCount = recyclerView.getItemDecorationCount();
            for (int i = 0; i < itemDecorationCount; i++) {
                recyclerView.removeItemDecorationAt(i);
            }
        }
        recyclerView.addOnScrollListener(this.uzCIH);
        recyclerView.setHasFixedSize(true);
        new LinearLayoutManager(context, 1, false).findLastCompletelyVisibleItemPosition();
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.addItemDecoration(new C8039avH(new VoiceInteractor(new gAI(), context)));
        C43316rmw c43316rmw = this.OLrzqt;
        c43316rmw.register(CoinAndAddressHistoryDetail.class).copydefault(new gAD(new TaskStackBuilder()), new gAC(new PictureInPictureParams())).AEQbTJ(new InterfaceC59531zim() { // from class: o.gyz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i2, java.lang.Object obj) {
                return CoinDetailFragmentNew.copydefault(i2, (CoinAndAddressHistoryDetail) obj);
            }
        });
        c43316rmw.register(C14316djE.class, new ComponentName(context, this, CoinDetailFragmentNew$initRecyclerView$1$2$5.INSTANCE));
        c43316rmw.register(C14318djG.class, new ComponentCallbacks2(C13754dXa.TaskDescription.OAUGar));
        c43316rmw.register(C14317djF.class, new ClipData(context, CoinDetailFragmentNew$initRecyclerView$1$2$8.INSTANCE));
        c43316rmw.register(C14322djK.class, new BroadcastReceiver(C13754dXa.TaskDescription.FF));
        recyclerView.setAdapter(c43316rmw);
    }

    public static final CoinAndAddressHistoryDetail KWHzl(CoinDetailFragmentNew coinDetailFragmentNew, int i) {
        Object objAEQbTJ = coinDetailFragmentNew.OLrzqt.AEQbTJ(i);
        if (objAEQbTJ instanceof CoinAndAddressHistoryDetail) {
            return (CoinAndAddressHistoryDetail) objAEQbTJ;
        }
        return null;
    }

    public static final class VoiceInteractor implements C8039avH.ActionBar<TaskDescription> {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ gAI OLrzqt;

        public VoiceInteractor(gAI gai, android.content.Context context) {
            this.OLrzqt = gai;
            this.AEQbTJ = context;
        }

        @Override // o.C8039avH.ActionBar
        public long EZpvd(int i) {
            CoinAndAddressHistoryDetail coinAndAddressHistoryDetailKWHzl = CoinDetailFragmentNew.KWHzl(CoinDetailFragmentNew.this, i);
            AbstractC16521elW abstractC16521elW = null;
            Long lValueOf = coinAndAddressHistoryDetailKWHzl != null ? Long.valueOf(coinAndAddressHistoryDetailKWHzl.getTxTime()) : null;
            CoinAndAddressHistoryDetail coinAndAddressHistoryDetailKWHzl2 = CoinDetailFragmentNew.KWHzl(CoinDetailFragmentNew.this, i);
            boolean z = coinAndAddressHistoryDetailKWHzl2 != null && coinAndAddressHistoryDetailKWHzl2.isShowPending();
            AbstractC16521elW abstractC16521elW2 = CoinDetailFragmentNew.this.AYXKKw;
            if (abstractC16521elW2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW = abstractC16521elW2;
            }
            C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
            int iEZpvd = c19465gDjAEQbTJ != null ? c19465gDjAEQbTJ.EZpvd(CoinDetailFragmentNew.KWHzl(CoinDetailFragmentNew.this, i)) : 5;
            if (lValueOf == null || lValueOf.longValue() == 0 || z || iEZpvd == 0 || iEZpvd == 1 || iEZpvd == 2 || iEZpvd == 3) {
                return i < CoinDetailFragmentNew.this.OLrzqt.getItemCount() - 1 ? 1000L : -1L;
            }
            return this.OLrzqt.KWHzl(lValueOf.longValue());
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.C8039avH.ActionBar
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public TaskDescription OLrzqt(ViewGroup viewGroup) {
            ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(this.AEQbTJ), C13754dXa.TaskDescription.sCB, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
            return new TaskDescription((AbstractC16741epe) viewDataBindingInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // o.C8039avH.ActionBar
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void KWHzl(TaskDescription taskDescription, int i) {
            View view;
            CoinAndAddressHistoryDetail coinAndAddressHistoryDetailKWHzl = CoinDetailFragmentNew.KWHzl(CoinDetailFragmentNew.this, i);
            Long lValueOf = coinAndAddressHistoryDetailKWHzl != null ? Long.valueOf(coinAndAddressHistoryDetailKWHzl.getTxTime()) : null;
            CoinAndAddressHistoryDetail coinAndAddressHistoryDetailKWHzl2 = CoinDetailFragmentNew.KWHzl(CoinDetailFragmentNew.this, i);
            boolean z = coinAndAddressHistoryDetailKWHzl2 != null && coinAndAddressHistoryDetailKWHzl2.isShowPending();
            AbstractC16521elW abstractC16521elW = CoinDetailFragmentNew.this.AYXKKw;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
            int iEZpvd = c19465gDjAEQbTJ != null ? c19465gDjAEQbTJ.EZpvd(CoinDetailFragmentNew.KWHzl(CoinDetailFragmentNew.this, i)) : 5;
            if (lValueOf == null || lValueOf.longValue() == 0 || z || iEZpvd == 0 || iEZpvd == 1 || iEZpvd == 2 || iEZpvd == 3) {
                if (taskDescription != null) {
                    String string = CoinDetailFragmentNew.this.getString(C13754dXa.FragmentManager.ensureViewModelStore);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    taskDescription.KWHzl(string);
                }
            } else if (taskDescription != null) {
                taskDescription.KWHzl(this.OLrzqt.AEQbTJ(lValueOf.longValue()));
            }
            if (taskDescription == null || (view = taskDescription.itemView) == null) {
                return;
            }
            view.setPadding(view.getPaddingLeft(), C55298xhM.dp2px$default(12.0f, null, 1, null), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static final class TaskStackBuilder implements gAD.TaskDescription {
        public TaskStackBuilder() {
        }

        @Override // o.gAD.TaskDescription
        public void KWHzl(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
            Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
            CoinDetailFragmentNew.this.AEQbTJ(coinAndAddressHistoryDetail);
        }

        @Override // o.gAD.TaskDescription
        public void AEQbTJ(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
            Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
            CoinDetailFragmentNew.this.KWHzl(coinAndAddressHistoryDetail);
        }

        @Override // o.gAD.TaskDescription
        public void copydefault(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
            Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
            CoinDetailFragmentNew.this.copydefault(coinAndAddressHistoryDetail);
        }

        @Override // o.gAD.TaskDescription
        public void EZpvd(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
            Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
            CoinDetailFragmentNew.this.EZpvd(coinAndAddressHistoryDetail);
        }

        @Override // o.gAD.TaskDescription
        public void OLrzqt(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
            Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
            CoinDetailFragmentNew.this.OLrzqt(coinAndAddressHistoryDetail);
        }
    }

    public static final class PictureInPictureParams implements gAC.Activity {
        public PictureInPictureParams() {
        }

        @Override // o.gAC.Activity
        public void OLrzqt(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
            Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
            CoinDetailFragmentNew.this.AEQbTJ(coinAndAddressHistoryDetail);
        }
    }

    public static final int copydefault(int i, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
        return (coinAndAddressHistoryDetail.getTxStatus() == 1 || coinAndAddressHistoryDetail.getTxStatus() == 5) ? 0 : 1;
    }

    public static final class ComponentName extends AbstractC19608gIr<C14316djE, C17133ewz> {
        public final /* synthetic */ android.content.Context EZpvd;
        public final /* synthetic */ CoinDetailFragmentNew copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentName(android.content.Context context, CoinDetailFragmentNew coinDetailFragmentNew, CoinDetailFragmentNew$initRecyclerView$1$2$5 coinDetailFragmentNew$initRecyclerView$1$2$5) {
            super(coinDetailFragmentNew$initRecyclerView$1$2$5);
            this.EZpvd = context;
            this.copydefault = coinDetailFragmentNew;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
        @Override // o.AbstractC19608gIr
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(C17133ewz c17133ewz, final C14316djE c14316djE) {
            Intrinsics.checkNotNullParameter(c17133ewz, "");
            Intrinsics.checkNotNullParameter(c14316djE, "");
            C55173xeu c55173xeu = c17133ewz.OLrzqt;
            android.content.Context context = this.EZpvd;
            final CoinDetailFragmentNew coinDetailFragmentNew = this.copydefault;
            c55173xeu.setImage(C52761wXj.TaskDescription.HJWChPRGtXKC);
            String string = context.getString(C13754dXa.FragmentManager.getOnBackPressedDispatcher);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setSubTitle((CharSequence) string);
            String string2 = context.getString(C13754dXa.FragmentManager.isThumbUp);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeu.setRetry(string2);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.gAp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    CoinDetailFragmentNew.ComponentName.OLrzqt(coinDetailFragmentNew, c14316djE, view);
                }
            });
        }

        public static final void OLrzqt(final CoinDetailFragmentNew coinDetailFragmentNew, final C14316djE c14316djE, View view) {
            AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
            if (c19465gDjAEQbTJ != null) {
                c19465gDjAEQbTJ.EZpvd(true, new Function1() { // from class: o.gAv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return CoinDetailFragmentNew.ComponentName.KWHzl(coinDetailFragmentNew, c14316djE, (AbstractC12782ctV) obj);
                    }
                });
            }
        }

        public static final Unit KWHzl(CoinDetailFragmentNew coinDetailFragmentNew, C14316djE c14316djE, AbstractC12782ctV abstractC12782ctV) throws OKWException {
            if (abstractC12782ctV != null && abstractC12782ctV.zLjUOn()) {
                coinDetailFragmentNew.AEQbTJ(c14316djE.OLrzqt());
            } else if (abstractC12782ctV != null) {
                coinDetailFragmentNew.copydefault(abstractC12782ctV);
            } else {
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class ComponentCallbacks2 extends C43318rmy<C14318djG, AbstractC17086ewE> {
        public ComponentCallbacks2(int i) {
            super(i, 0);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC17086ewE> c43312rms, C14318djG c14318djG) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c14318djG, "");
            ((AbstractC17086ewE) c43312rms.OLrzqt()).KWHzl.setAnimation(C52761wXj.PendingIntent.hDKMBd);
        }
    }

    public static final class ClipData extends AbstractC19608gIr<C14317djF, C17089ewH> {
        public final /* synthetic */ android.content.Context KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClipData(android.content.Context context, CoinDetailFragmentNew$initRecyclerView$1$2$8 coinDetailFragmentNew$initRecyclerView$1$2$8) {
            super(coinDetailFragmentNew$initRecyclerView$1$2$8);
            this.KWHzl = context;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
        @Override // o.AbstractC19608gIr
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(C17089ewH c17089ewH, final C14317djF c14317djF) {
            Intrinsics.checkNotNullParameter(c17089ewH, "");
            Intrinsics.checkNotNullParameter(c14317djF, "");
            C55173xeu c55173xeu = c17089ewH.OLrzqt;
            android.content.Context context = this.KWHzl;
            c55173xeu.setTitle(c14317djF.EZpvd());
            c55173xeu.setSubTitle((CharSequence) c14317djF.OLrzqt());
            String strCopydefault = c14317djF.copydefault();
            if (strCopydefault == null) {
                strCopydefault = context.getString(C13754dXa.FragmentManager.QbewEr);
                Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            }
            c55173xeu.setRetry(strCopydefault);
            if (c14317djF.KWHzl() != null) {
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.gAu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        CoinDetailFragmentNew.ClipData.AEQbTJ(c14317djF, view);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AEQbTJ(C14317djF c14317djF, View view) {
            c14317djF.KWHzl().invoke();
        }
    }

    public static final class BroadcastReceiver extends C43318rmy<C14322djK, AbstractC17082ewA> {
        public BroadcastReceiver(int i) {
            super(i, 0);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC17082ewA> c43312rms, final C14322djK c14322djK) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c14322djK, "");
            View root = ((AbstractC17082ewA) c43312rms.OLrzqt()).getRoot();
            final CoinDetailFragmentNew coinDetailFragmentNew = CoinDetailFragmentNew.this;
            root.setOnClickListener(new View.OnClickListener() { // from class: o.gAw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) throws OKWException {
                    CoinDetailFragmentNew.BroadcastReceiver.OLrzqt(coinDetailFragmentNew, c14322djK, view);
                }
            });
        }

        public static final void OLrzqt(CoinDetailFragmentNew coinDetailFragmentNew, C14322djK c14322djK, View view) throws OKWException {
            coinDetailFragmentNew.AEQbTJ(c14322djK.KWHzl());
        }
    }

    public final void AEQbTJ(Map<String, String> map) throws OKWException {
        String strAkhnZx;
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        C10953byF c10953byF = C10953byF.KWHzl;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        String str = "";
        String str2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null && (strAkhnZx = c19465gDjAEQbTJ.AkhnZx()) != null) {
            str = strAkhnZx;
        }
        C10854bwM c10854bwMKWHzl = c10948byAValueOf.KWHzl(c10953byF.EZpvd(str));
        if (map != null) {
            str2 = map.get(C33129mqd.gEmmrt(c10854bwMKWHzl != null ? Long.valueOf(c10854bwMKWHzl.AhwBna()) : null));
        }
        if (str2 == null || StringsKt__StringsKt.fARcdN((CharSequence) str2)) {
            return;
        }
        Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str2 + zLjUOn()), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
    }

    public static final boolean copydefault(C10525bqB c10525bqB) {
        C10854bwM c10854bwMKWHzl;
        return (c10525bqB.values().QfsBiF() || c10525bqB.values().DCUTEIdCUTEI() || ((c10854bwMKWHzl = c10525bqB.KWHzl().KWHzl()) != null && c10854bwMKWHzl.QCjLjM())) ? false : true;
    }

    public static final boolean OLrzqt(C10525bqB c10525bqB) {
        C10854bwM c10854bwMKWHzl;
        return !c10525bqB.values().DCUTEIdCUTEI() && ((c10854bwMKWHzl = c10525bqB.KWHzl().KWHzl()) == null || !c10854bwMKWHzl.QCjLjM());
    }

    private final void hUfVAv() {
        MutableLiveData<List<DeFiApyDataInfoData>> mutableLiveDataIsConnected;
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null && (mutableLiveDataOLrzqt = c19465gDjAEQbTJ.OLrzqt()) != null) {
            mutableLiveDataOLrzqt.observe(this, new DialogInterface(new Function1() { // from class: o.gyj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.copydefault(this.EZpvd, (C10525bqB) obj);
                }
            }));
        }
        zuBGHE().copydefault().observe(this, new DialogInterface(new Function1() { // from class: o.gyi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.copydefault(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW2 = abstractC16521elW3;
        }
        C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW2.AEQbTJ();
        if (c19465gDjAEQbTJ2 == null || (mutableLiveDataIsConnected = c19465gDjAEQbTJ2.isConnected()) == null) {
            return;
        }
        mutableLiveDataIsConnected.observe(getViewLifecycleOwner(), new DialogInterface(new Function1() { // from class: o.gyq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        }));
    }

    public static final Unit copydefault(CoinDetailFragmentNew coinDetailFragmentNew, C10525bqB c10525bqB) throws OKWException {
        if (c10525bqB == null) {
            return Unit.INSTANCE;
        }
        coinDetailFragmentNew.AhwBna(c10525bqB);
        boolean z = false;
        boolean z2 = c10525bqB.AubY().length() > 0 && c10525bqB.OcIXYQ().length() > 0;
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        TextView textView = abstractC16521elW.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        initTextViewDrawable$default(coinDetailFragmentNew, textView, 0, 2, null);
        AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW3 = null;
        }
        TextView textView2 = abstractC16521elW3.fARcdN;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        initTextViewDrawable$default(coinDetailFragmentNew, textView2, 0, 2, null);
        AbstractC16521elW abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW4 = null;
        }
        abstractC16521elW4.ejfBZ.setEnabled(copydefault(c10525bqB));
        AbstractC16521elW abstractC16521elW5 = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW5 = null;
        }
        abstractC16521elW5.fARcdN.setEnabled(OLrzqt(c10525bqB));
        coinDetailFragmentNew.AEQbTJ(c10525bqB);
        if (z2 && !coinDetailFragmentNew.fetchVPNInfo) {
            if (coinDetailFragmentNew.valueOf != ButtonSetupState.INITIAL) {
                return Unit.INSTANCE;
            }
            coinDetailFragmentNew.valueOf = ButtonSetupState.LP_PROCESSING;
            AbstractC16521elW abstractC16521elW6 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW6 = null;
            }
            abstractC16521elW6.AxsJAY.setVisibility(8);
            AbstractC16521elW abstractC16521elW7 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW7 = null;
            }
            abstractC16521elW7.zLjUOn.setVisibility(8);
            AbstractC16521elW abstractC16521elW8 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW8 = null;
            }
            TextView textView3 = abstractC16521elW8.sSMYrx;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            AbstractC16521elW abstractC16521elW9 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW9 = null;
            }
            TextView textView4 = abstractC16521elW9.gHZMYf;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            AbstractC16521elW abstractC16521elW10 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW10 = null;
            }
            TextView textView5 = abstractC16521elW10.AwvSrB;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            AbstractC16521elW abstractC16521elW11 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW11 = null;
            }
            abstractC16521elW11.AxsJAY.setEnabled(false);
            AbstractC16521elW abstractC16521elW12 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW12 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW12 = null;
            }
            abstractC16521elW12.zLjUOn.setEnabled(false);
            AbstractC16521elW abstractC16521elW13 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW13 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW13 = null;
            }
            TextView textView6 = abstractC16521elW13.sSMYrx;
            if (textView6 != null) {
                textView6.setEnabled(false);
            }
            AbstractC16521elW abstractC16521elW14 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW14 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW14 = null;
            }
            TextView textView7 = abstractC16521elW14.gHZMYf;
            if (textView7 != null) {
                textView7.setEnabled(false);
            }
            AbstractC16521elW abstractC16521elW15 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW15 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW2 = abstractC16521elW15;
            }
            TextView textView8 = abstractC16521elW2.AwvSrB;
            if (textView8 != null) {
                textView8.setEnabled(false);
            }
            try {
                coinDetailFragmentNew.UeEOUB();
            } catch (Exception e) {
                pUU.AEQbTJ(coinDetailFragmentNew.gHZMYf, "Error loading investment detail", e);
                coinDetailFragmentNew.fZBcTu();
            }
        } else {
            AbstractC16521elW abstractC16521elW16 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW16 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW16 = null;
            }
            TextView textView9 = abstractC16521elW16.gHZMYf;
            if (textView9 != null) {
                textView9.setVisibility(8);
            }
            AbstractC16521elW abstractC16521elW17 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW17 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW17 = null;
            }
            TextView textView10 = abstractC16521elW17.AwvSrB;
            if (textView10 != null) {
                textView10.setVisibility(8);
            }
            if (coinDetailFragmentNew.valueOf == ButtonSetupState.INITIAL) {
                coinDetailFragmentNew.valueOf = ButtonSetupState.DEX_PROCESSING;
                AbstractC16521elW abstractC16521elW18 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW18 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW18 = null;
                }
                TextView textView11 = abstractC16521elW18.AxsJAY;
                Intrinsics.checkNotNullExpressionValue(textView11, "");
                initTextViewDrawable$default(coinDetailFragmentNew, textView11, 0, 2, null);
                AbstractC16521elW abstractC16521elW19 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW19 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW19 = null;
                }
                TextView textView12 = abstractC16521elW19.zLjUOn;
                Intrinsics.checkNotNullExpressionValue(textView12, "");
                initTextViewDrawable$default(coinDetailFragmentNew, textView12, 0, 2, null);
                AbstractC16521elW abstractC16521elW20 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW20 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW20 = null;
                }
                TextView textView13 = abstractC16521elW20.sSMYrx;
                Intrinsics.checkNotNullExpressionValue(textView13, "");
                initTextViewDrawable$default(coinDetailFragmentNew, textView13, 0, 2, null);
                AbstractC16521elW abstractC16521elW21 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW21 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW21 = null;
                }
                abstractC16521elW21.AxsJAY.setEnabled(!c10525bqB.values().DCUTEIdCUTEI());
                AbstractC16521elW abstractC16521elW22 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW22 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW22 = null;
                }
                abstractC16521elW22.zLjUOn.setEnabled(!c10525bqB.values().DCUTEIdCUTEI());
                AbstractC16521elW abstractC16521elW23 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW23 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW23 = null;
                }
                TextView textView14 = abstractC16521elW23.sSMYrx;
                if (!c10525bqB.values().QfsBiF() && !c10525bqB.values().DCUTEIdCUTEI()) {
                    z = true;
                }
                textView14.setEnabled(z);
                boolean zQfsBiF = c10525bqB.values().QfsBiF();
                String strAYXKKw = C33129mqd.AYXKKw(Long.valueOf(c10525bqB.KWHzl().fetchVPNInfo()));
                String strOLrzqt = c10525bqB.KWHzl().OLrzqt();
                coinDetailFragmentNew.copydefault(Boolean.valueOf(zQfsBiF), strAYXKKw, strOLrzqt == null ? "" : strOLrzqt, C33129mqd.AEQbTJ(c10525bqB.AhwBna(), "1"), Boolean.valueOf(c10525bqB.KWHzl().AuCTel()), Boolean.valueOf(C10854bwM.isXRCToken$default(c10525bqB.KWHzl(), null, 1, null)));
                coinDetailFragmentNew.zsXlph();
            }
        }
        coinDetailFragmentNew.KWHzl(c10525bqB);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(CoinDetailFragmentNew coinDetailFragmentNew, Boolean bool) {
        coinDetailFragmentNew.getFieldNames = true;
        if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            coinDetailFragmentNew.copydefault(true);
            C11205cFp.EZpvd.zLjUOn().AEQbTJ(coinDetailFragmentNew.wlaJM());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(CoinDetailFragmentNew coinDetailFragmentNew, List list) {
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        abstractC16521elW.values.setVisibility((list == null || list.isEmpty()) ? 8 : 0);
        AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW3 = null;
        }
        if (abstractC16521elW3.AhwBna.getRoot().getVisibility() == 0) {
            AbstractC16521elW abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW4 = null;
            }
            C21321gxZ c21321gxZ = abstractC16521elW4.values;
            Intrinsics.checkNotNullExpressionValue(c21321gxZ, "");
            C55296xhK.OLrzqt(c21321gxZ, Float.valueOf(0.0f), Float.valueOf(24.0f), Float.valueOf(0.0f), Float.valueOf(0.0f));
        } else {
            AbstractC16521elW abstractC16521elW5 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW5 = null;
            }
            if (abstractC16521elW5.AYXKKw.getVisibility() == 0) {
                AbstractC16521elW abstractC16521elW6 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW6 = null;
                }
                C21321gxZ c21321gxZ2 = abstractC16521elW6.values;
                Intrinsics.checkNotNullExpressionValue(c21321gxZ2, "");
                C55296xhK.OLrzqt(c21321gxZ2, Float.valueOf(0.0f), Float.valueOf(24.0f), Float.valueOf(0.0f), Float.valueOf(0.0f));
            } else {
                AbstractC16521elW abstractC16521elW7 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW7 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW7 = null;
                }
                C21321gxZ c21321gxZ3 = abstractC16521elW7.values;
                Intrinsics.checkNotNullExpressionValue(c21321gxZ3, "");
                C55296xhK.OLrzqt(c21321gxZ3, Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f));
            }
        }
        AbstractC16521elW abstractC16521elW8 = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW2 = abstractC16521elW8;
        }
        C21321gxZ c21321gxZ4 = abstractC16521elW2.values;
        androidx.fragment.app.FragmentManager parentFragmentManager = coinDetailFragmentNew.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c21321gxZ4.copydefault(parentFragmentManager, list);
        return Unit.INSTANCE;
    }

    public final void AhwBna(C10525bqB c10525bqB) {
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19394gAt c19394gAt = abstractC16521elW.gEmmrt;
        C13821dZn c13821dZn = C13821dZn.EZpvd;
        C19394gAt.setCoinCount$default(c19394gAt, c13821dZn.OLrzqt(InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB, false, true, 1, null)), null, 2, null);
        AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW2 = abstractC16521elW3;
        }
        abstractC16521elW2.gEmmrt.setValuation(c13821dZn.OLrzqt(c10525bqB.OLrzqt(true)));
    }

    public static /* synthetic */ void initTextViewDrawable$default(CoinDetailFragmentNew coinDetailFragmentNew, TextView textView, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = C13754dXa.StateListAnimator.copydefault;
        }
        coinDetailFragmentNew.copydefault(textView, i);
    }

    public final void copydefault(TextView textView, int i) {
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "");
        Object objGEmmrt = yDV.gEmmrt(compoundDrawablesRelative, 1);
        LayerDrawable layerDrawable = objGEmmrt instanceof LayerDrawable ? (LayerDrawable) objGEmmrt : null;
        if (layerDrawable != null) {
            Drawable drawable = layerDrawable.getDrawable(1);
            if (drawable != null) {
                drawable.setTintList(C33070mpX.AEQbTJ(i));
            }
            textView.setEnabled(true);
        }
    }

    public final void iwGUEr() {
        String strAkhnZx;
        if (AuCTelauCTel().copydefault().getValue() instanceof Point.Application) {
            return;
        }
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ == null || (strAkhnZx = c19465gDjAEQbTJ.AkhnZx()) == null) {
            return;
        }
        Long lValueOf = Long.valueOf(C10953byF.KWHzl.EZpvd(strAkhnZx));
        Long l = lValueOf.longValue() != 0 ? lValueOf : null;
        if (l != null) {
            AuCTelauCTel().OLrzqt(String.valueOf(l.longValue()));
        }
    }

    public final void AEQbTJ(C10525bqB c10525bqB) throws OKWException {
        String addressStr$default;
        if (this.getFieldNames) {
            boolean z = false;
            this.getFieldNames = false;
            AbstractC16521elW abstractC16521elW = null;
            if (c10525bqB.KWHzl().OuxcSI()) {
                C13852daR c13852daRODWQjV = c10525bqB.values().ODWQjV();
                String strKWHzl = c13852daRODWQjV != null ? c13852daRODWQjV.KWHzl() : null;
                if (strKWHzl == null) {
                    strKWHzl = "";
                }
                if (strKWHzl.length() > 0) {
                    AbstractC16521elW abstractC16521elW2 = this.AYXKKw;
                    if (abstractC16521elW2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16521elW2 = null;
                    }
                    C19465gDj c19465gDjAEQbTJ = abstractC16521elW2.AEQbTJ();
                    if (c19465gDjAEQbTJ != null) {
                        c19465gDjAEQbTJ.AEQbTJ(strKWHzl);
                    }
                }
            }
            if (c10525bqB.values().zLjUOn()) {
                addressStr$default = zLjUOn();
            } else {
                addressStr$default = C14079deg.getAddressStr$default(C14079deg.EZpvd, zLjUOn(), false, 2, null);
            }
            int i = 8;
            if (addressStr$default.length() == 0) {
                AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
                if (abstractC16521elW3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW3 = null;
                }
                abstractC16521elW3.AYXKKw.setVisibility(8);
            } else {
                AbstractC16521elW abstractC16521elW4 = this.AYXKKw;
                if (abstractC16521elW4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW4 = null;
                }
                abstractC16521elW4.AYXKKw.setVisibility(0);
                AbstractC16521elW abstractC16521elW5 = this.AYXKKw;
                if (abstractC16521elW5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW5 = null;
                }
                TextView textView = abstractC16521elW5.AubY;
                if (EZpvd(c10525bqB)) {
                    addressStr$default = c10525bqB.KWHzl().AEQbTJ(addressStr$default);
                }
                textView.setText(addressStr$default);
            }
            AbstractC16521elW abstractC16521elW6 = this.AYXKKw;
            if (abstractC16521elW6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW6 = null;
            }
            TextView textView2 = abstractC16521elW6.getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            if (c10525bqB.KWHzl().DGgnkA() && !c10525bqB.values().QfsBiF()) {
                i = 0;
            }
            textView2.setVisibility(i);
            AbstractC16521elW abstractC16521elW7 = this.AYXKKw;
            if (abstractC16521elW7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW7 = null;
            }
            abstractC16521elW7.getNewProxyInstance.setText(C33070mpX.AYXKKw(C17948fYf.copydefault.EZpvd() ? C13754dXa.FragmentManager.onSupportNavigateUp : C13754dXa.FragmentManager.onSupportActionModeFinished));
            AbstractC16521elW abstractC16521elW8 = this.AYXKKw;
            if (abstractC16521elW8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW = abstractC16521elW8;
            }
            ConstraintLayout constraintLayout = abstractC16521elW.AuCTel;
            if (c10525bqB.values().zLjUOn() && (!c10525bqB.values().ORxRYg() || !c10525bqB.values().DCUTEIdCUTEI())) {
                z = true;
            }
            constraintLayout.setEnabled(z);
        }
    }

    public final boolean EZpvd(C10525bqB c10525bqB) {
        C10854bwM c10854bwMKWHzl;
        return (c10525bqB == null || (c10854bwMKWHzl = c10525bqB.KWHzl()) == null || !c10854bwMKWHzl.DGOPHZDGOPHZ() || c10525bqB.values().QfsBiF()) ? false : true;
    }

    public final void djSkpj() {
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        OKAlertBanner oKAlertBanner = abstractC16521elW.valueOf;
        Intrinsics.checkNotNullExpressionValue(oKAlertBanner, "");
        oKAlertBanner.setVisibility(8);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new CoinDetailFragmentNew$observeDynamicTokenState$1(this, null), 3, null);
    }

    public final void fvQaOB() {
        String strAkhnZx;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ == null || (strAkhnZx = c19465gDjAEQbTJ.AkhnZx()) == null) {
            return;
        }
        Long lValueOf = Long.valueOf(C10953byF.KWHzl.EZpvd(strAkhnZx));
        if (lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            final C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(lValueOf.longValue()));
            if (c10854bwMKWHzl == null) {
                return;
            }
            C32866mlf.onEvent$default("Web3CryptoDetails_Top_WordLink_View", (TrackChannel[]) null, new Function1() { // from class: o.gyh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.OLrzqt(c10854bwMKWHzl, (EventParamsList) obj);
                }
            }, 1, (Object) null);
        }
    }

    public static final Unit OLrzqt(C10854bwM c10854bwM, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "crypto_name", c10854bwM.values(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "crypto_chain", c10854bwM.djBIcL(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "crypto_contractaddress", c10854bwM.OLrzqt(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void fFgQHt() {
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        abstractC16521elW.valueOf.setMessage(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isRated));
        AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW2 = abstractC16521elW3;
        }
        OKAlertBanner oKAlertBanner = abstractC16521elW2.valueOf;
        oKAlertBanner.setOnClickListener(new Context(oKAlertBanner, 1000L, this));
    }

    public final void finit() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        C33570myu.copydefault((android.app.Activity) activity);
        Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", activity.getString(C13754dXa.FragmentManager.MediaControllerCompatApi23)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
    }

    private final void gkJEwt() {
        MutableLiveData<Bitmap<ArrayList<Object>>> mutableLiveDataFARcdN;
        this.OLrzqt.setItems(yDY.copydefault(new C14318djG()));
        this.OLrzqt.notifyDataSetChanged();
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ == null || (mutableLiveDataFARcdN = c19465gDjAEQbTJ.fARcdN()) == null) {
            return;
        }
        mutableLiveDataFARcdN.observe(this, new DialogInterface(new Function1() { // from class: o.gyp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.OLrzqt(this.copydefault, (Bitmap) obj);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(final CoinDetailFragmentNew coinDetailFragmentNew, Bitmap bitmap) {
        if (!(bitmap instanceof Bitmap.TaskDescription)) {
            if (!(bitmap instanceof Bitmap.StateListAnimator) && !(bitmap instanceof Bitmap.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
            AbstractC16521elW abstractC16521elW2 = null;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            abstractC16521elW.uzCIH.valueOf();
            if (((ArrayList) bitmap.OLrzqt()) == null) {
                coinDetailFragmentNew.OLrzqt.setItems(new ArrayList());
                Unit unit = Unit.INSTANCE;
            } else {
                if (coinDetailFragmentNew.OLrzqt.getItems().isEmpty()) {
                    int i = coinDetailFragmentNew.isConnected;
                    Object objOLrzqt = bitmap.OLrzqt();
                    Intrinsics.copydefault(objOLrzqt);
                    coinDetailFragmentNew.isConnected = Math.max(i, ((ArrayList) objOLrzqt).size());
                }
                C43316rmw c43316rmw = coinDetailFragmentNew.OLrzqt;
                Object objOLrzqt2 = bitmap.OLrzqt();
                Intrinsics.copydefault(objOLrzqt2);
                c43316rmw.setItems((List) objOLrzqt2);
                Object objOLrzqt3 = bitmap.OLrzqt();
                Intrinsics.copydefault(objOLrzqt3);
                if (!(CollectionsKt___CollectionsKt.firstOrNull((List) objOLrzqt3) instanceof C14316djE)) {
                    Object objOLrzqt4 = bitmap.OLrzqt();
                    Intrinsics.copydefault(objOLrzqt4);
                    if (CollectionsKt___CollectionsKt.wlaJM((List) objOLrzqt4) instanceof C14322djK) {
                        AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
                        if (abstractC16521elW3 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC16521elW2 = abstractC16521elW3;
                        }
                        abstractC16521elW2.uzCIH.AhwBna(false);
                    } else {
                        AbstractC16521elW abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
                        if (abstractC16521elW4 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC16521elW2 = abstractC16521elW4;
                        }
                        abstractC16521elW2.uzCIH.AhwBna(true);
                    }
                }
            }
            if (bitmap instanceof Bitmap.ActionBar) {
                Bitmap.ActionBar actionBar = (Bitmap.ActionBar) bitmap;
                if (C33129mqd.OLrzqt((CharSequence) actionBar.AEQbTJ())) {
                    C55326xho.toast$default(actionBar.AEQbTJ(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                }
                if (!coinDetailFragmentNew.OLrzqt.getItems().isEmpty()) {
                    List<?> items = coinDetailFragmentNew.OLrzqt.getItems();
                    Intrinsics.checkNotNullExpressionValue(items, "");
                    if (CollectionsKt___CollectionsKt.firstOrNull(items) instanceof C14316djE) {
                        coinDetailFragmentNew.OLrzqt.setItems(yDY.copydefault(new C14317djF(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk), 0, new Function0() { // from class: o.gzr
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return CoinDetailFragmentNew.ORxRYg(this.copydefault);
                            }
                        }, 8, null)));
                    }
                }
            }
            coinDetailFragmentNew.OLrzqt.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ORxRYg(CoinDetailFragmentNew coinDetailFragmentNew) {
        coinDetailFragmentNew.OLrzqt.setItems(yDY.copydefault(new C14318djG()));
        coinDetailFragmentNew.OLrzqt.notifyDataSetChanged();
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            C19465gDj.refreshData$default(c19465gDjAEQbTJ, false, false, new Function0() { // from class: o.gyH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CoinDetailFragmentNew.fJNWhG();
                }
            }, 3, null);
        }
        coinDetailFragmentNew.iwGUEr();
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG() {
        return Unit.INSTANCE;
    }

    public final void dNCPSb() {
        C10854bwM c10854bwMDjBIcL;
        LiveData<UTXOInfoResp> liveDataAEQbTJ;
        C10854bwM c10854bwMDjBIcL2;
        MutableLiveData<XRC20BalanceDetailInfoResp> mutableLiveDataEZpvd;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null && (c10854bwMDjBIcL2 = c19465gDjAEQbTJ.djBIcL()) != null && c10854bwMDjBIcL2.hUfVAv()) {
            AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
            if (abstractC16521elW3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW2 = abstractC16521elW3;
            }
            C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW2.AEQbTJ();
            if (c19465gDjAEQbTJ2 == null || (mutableLiveDataEZpvd = c19465gDjAEQbTJ2.EZpvd()) == null) {
                return;
            }
            mutableLiveDataEZpvd.observe(getViewLifecycleOwner(), new DialogInterface(new Function1() { // from class: o.gyE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.EZpvd(this.OLrzqt, (XRC20BalanceDetailInfoResp) obj);
                }
            }));
            return;
        }
        AbstractC16521elW abstractC16521elW4 = this.AYXKKw;
        if (abstractC16521elW4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW4 = null;
        }
        C19465gDj c19465gDjAEQbTJ3 = abstractC16521elW4.AEQbTJ();
        if (c19465gDjAEQbTJ3 != null && (c10854bwMDjBIcL = c19465gDjAEQbTJ3.djBIcL()) != null && c10854bwMDjBIcL.iRxXKY()) {
            AbstractC16521elW abstractC16521elW5 = this.AYXKKw;
            if (abstractC16521elW5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW2 = abstractC16521elW5;
            }
            C19465gDj c19465gDjAEQbTJ4 = abstractC16521elW2.AEQbTJ();
            if (c19465gDjAEQbTJ4 == null || (liveDataAEQbTJ = c19465gDjAEQbTJ4.AEQbTJ()) == null) {
                return;
            }
            liveDataAEQbTJ.observe(getViewLifecycleOwner(), new DialogInterface(new Function1() { // from class: o.gyL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.copydefault(this.copydefault, (UTXOInfoResp) obj);
                }
            }));
            return;
        }
        AbstractC16521elW abstractC16521elW6 = this.AYXKKw;
        if (abstractC16521elW6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW6 = null;
        }
        abstractC16521elW6.AuCTelauCTel.setVisibility(8);
        AbstractC16521elW abstractC16521elW7 = this.AYXKKw;
        if (abstractC16521elW7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW7 = null;
        }
        abstractC16521elW7.wlaJM.setVisibility(8);
        AbstractC16521elW abstractC16521elW8 = this.AYXKKw;
        if (abstractC16521elW8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW2 = abstractC16521elW8;
        }
        abstractC16521elW2.getFieldNames.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(CoinDetailFragmentNew coinDetailFragmentNew, XRC20BalanceDetailInfoResp xRC20BalanceDetailInfoResp) {
        String availableWithoutSpending;
        String strEZpvd;
        AbstractC16521elW abstractC16521elW;
        AbstractC16521elW abstractC16521elW2;
        AbstractC16521elW abstractC16521elW3;
        AbstractC16521elW abstractC16521elW4;
        C10854bwM c10854bwMDjBIcL;
        C10854bwM c10854bwMDjBIcL2;
        C10854bwM c10854bwMDjBIcL3;
        AbstractC16521elW abstractC16521elW5 = coinDetailFragmentNew.AYXKKw;
        AbstractC16521elW abstractC16521elW6 = null;
        if (abstractC16521elW5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW5 = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW5.AEQbTJ();
        AbstractC12782ctV abstractC12782ctVAuCTel = c19465gDjAEQbTJ != null ? c19465gDjAEQbTJ.AuCTel() : null;
        if ((abstractC12782ctVAuCTel == null || !abstractC12782ctVAuCTel.QfsBiF()) && ((abstractC12782ctVAuCTel == null || !abstractC12782ctVAuCTel.zsXlph()) && xRC20BalanceDetailInfoResp != null && (availableWithoutSpending = xRC20BalanceDetailInfoResp.getAvailableWithoutSpending()) != null && C33129mqd.AEQbTJ(availableWithoutSpending, "0"))) {
            AbstractC16521elW abstractC16521elW7 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW7 = null;
            }
            abstractC16521elW7.wlaJM.setVisibility(0);
            AbstractC16521elW abstractC16521elW8 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW8 = null;
            }
            abstractC16521elW8.getFieldNames.setVisibility(0);
            AbstractC16521elW abstractC16521elW9 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW9 = null;
            }
            abstractC16521elW9.AuCTelauCTel.setVisibility(0);
            AbstractC16521elW abstractC16521elW10 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW10 = null;
            }
            abstractC16521elW10.AuCTelauCTel.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompat));
            AbstractC16521elW abstractC16521elW11 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW11 = null;
            }
            AppCompatTextView appCompatTextView = abstractC16521elW11.wlaJM;
            String availableWithoutSpending2 = xRC20BalanceDetailInfoResp.getAvailableWithoutSpending();
            if (availableWithoutSpending2 == null) {
                strEZpvd = "";
                appCompatTextView.setText(strEZpvd);
                abstractC16521elW = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW = null;
                }
                abstractC16521elW.getFieldNames.setVisibility(0);
                abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW2 = null;
                }
                abstractC16521elW2.getFieldNames.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.disconnect));
                abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW3 = null;
                }
                abstractC16521elW3.getFieldNames.getPaint().setFlags(8);
                abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW4 != null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16521elW6 = abstractC16521elW4;
                }
                AppCompatTextView appCompatTextView2 = abstractC16521elW6.getFieldNames;
                appCompatTextView2.setOnClickListener(new ComponentCallbacks(appCompatTextView2, 1000L, coinDetailFragmentNew));
            } else {
                AbstractC16521elW abstractC16521elW12 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW12 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW12 = null;
                }
                C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW12.AEQbTJ();
                int iValueOf = (c19465gDjAEQbTJ2 == null || (c10854bwMDjBIcL3 = c19465gDjAEQbTJ2.djBIcL()) == null) ? 0 : c10854bwMDjBIcL3.valueOf();
                AbstractC16521elW abstractC16521elW13 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW13 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW13 = null;
                }
                C19465gDj c19465gDjAEQbTJ3 = abstractC16521elW13.AEQbTJ();
                int iAkhnZx = (c19465gDjAEQbTJ3 == null || (c10854bwMDjBIcL2 = c19465gDjAEQbTJ3.djBIcL()) == null) ? 6 : c10854bwMDjBIcL2.AkhnZx();
                AbstractC16521elW abstractC16521elW14 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW14 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW14 = null;
                }
                C19465gDj c19465gDjAEQbTJ4 = abstractC16521elW14.AEQbTJ();
                strEZpvd = C54870xYj.EZpvd(availableWithoutSpending2, iValueOf, iAkhnZx, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : (c19465gDjAEQbTJ4 == null || (c10854bwMDjBIcL = c19465gDjAEQbTJ4.djBIcL()) == null) ? null : Boolean.valueOf(c10854bwMDjBIcL.getNewProxyInstance()), (248 & 64) != 0 ? false : true, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                if (strEZpvd == null) {
                }
                appCompatTextView.setText(strEZpvd);
                abstractC16521elW = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW == null) {
                }
                abstractC16521elW.getFieldNames.setVisibility(0);
                abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW2 == null) {
                }
                abstractC16521elW2.getFieldNames.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.disconnect));
                abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW3 == null) {
                }
                abstractC16521elW3.getFieldNames.getPaint().setFlags(8);
                abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW4 != null) {
                }
                AppCompatTextView appCompatTextView22 = abstractC16521elW6.getFieldNames;
                appCompatTextView22.setOnClickListener(new ComponentCallbacks(appCompatTextView22, 1000L, coinDetailFragmentNew));
            }
        } else {
            AbstractC16521elW abstractC16521elW15 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW15 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW15 = null;
            }
            abstractC16521elW15.AuCTelauCTel.setVisibility(8);
            AbstractC16521elW abstractC16521elW16 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW16 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW16 = null;
            }
            abstractC16521elW16.wlaJM.setVisibility(8);
            AbstractC16521elW abstractC16521elW17 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW17 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW6 = abstractC16521elW17;
            }
            abstractC16521elW6.getFieldNames.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(CoinDetailFragmentNew coinDetailFragmentNew, UTXOInfoResp uTXOInfoResp) {
        String strEZpvd;
        String lockAmount;
        C10854bwM c10854bwMDjBIcL;
        C10854bwM c10854bwMDjBIcL2;
        C10854bwM c10854bwMDjBIcL3;
        AbstractC16521elW abstractC16521elW = null;
        if (C33129mqd.AEQbTJ(uTXOInfoResp != null ? uTXOInfoResp.getLockAmount() : null, "0")) {
            AbstractC16521elW abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW2 = null;
            }
            int iValueOf = 0;
            abstractC16521elW2.AuCTelauCTel.setVisibility(0);
            AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW3 = null;
            }
            abstractC16521elW3.AuCTelauCTel.setText(String.valueOf(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AudioAttributesImplBaseParcelizer)));
            AbstractC16521elW abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW4 = null;
            }
            abstractC16521elW4.wlaJM.setVisibility(0);
            AbstractC16521elW abstractC16521elW5 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW5 = null;
            }
            AppCompatTextView appCompatTextView = abstractC16521elW5.wlaJM;
            if (uTXOInfoResp == null || (lockAmount = uTXOInfoResp.getLockAmount()) == null) {
                strEZpvd = null;
            } else {
                AbstractC16521elW abstractC16521elW6 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW6 = null;
                }
                C19465gDj c19465gDjAEQbTJ = abstractC16521elW6.AEQbTJ();
                if (c19465gDjAEQbTJ != null && (c10854bwMDjBIcL3 = c19465gDjAEQbTJ.djBIcL()) != null) {
                    iValueOf = c10854bwMDjBIcL3.valueOf();
                }
                int i = iValueOf;
                AbstractC16521elW abstractC16521elW7 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW7 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW7 = null;
                }
                C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW7.AEQbTJ();
                int iAkhnZx = (c19465gDjAEQbTJ2 == null || (c10854bwMDjBIcL2 = c19465gDjAEQbTJ2.djBIcL()) == null) ? 6 : c10854bwMDjBIcL2.AkhnZx();
                AbstractC16521elW abstractC16521elW8 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16521elW8 = null;
                }
                C19465gDj c19465gDjAEQbTJ3 = abstractC16521elW8.AEQbTJ();
                strEZpvd = C54870xYj.EZpvd(lockAmount, i, iAkhnZx, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : (c19465gDjAEQbTJ3 == null || (c10854bwMDjBIcL = c19465gDjAEQbTJ3.djBIcL()) == null) ? null : Boolean.valueOf(c10854bwMDjBIcL.getNewProxyInstance()), (248 & 64) != 0 ? false : true, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            }
            appCompatTextView.setText(String.valueOf(strEZpvd));
            AbstractC16521elW abstractC16521elW9 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW9 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW = abstractC16521elW9;
            }
            abstractC16521elW.getFieldNames.setVisibility(8);
        } else {
            AbstractC16521elW abstractC16521elW10 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW10 = null;
            }
            abstractC16521elW10.AuCTelauCTel.setVisibility(8);
            AbstractC16521elW abstractC16521elW11 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW11 = null;
            }
            abstractC16521elW11.wlaJM.setVisibility(8);
            AbstractC16521elW abstractC16521elW12 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW12 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW = abstractC16521elW12;
            }
            abstractC16521elW.getFieldNames.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public final void aKErDB() {
        LiveData<WalletCoinLatestPnlResponse> liveDataGEmmrt;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ == null || (liveDataGEmmrt = c19465gDjAEQbTJ.gEmmrt()) == null) {
            return;
        }
        liveDataGEmmrt.observe(getViewLifecycleOwner(), new DialogInterface(new Function1() { // from class: o.gzq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.EZpvd(this.KWHzl, (WalletCoinLatestPnlResponse) obj);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(CoinDetailFragmentNew coinDetailFragmentNew, WalletCoinLatestPnlResponse walletCoinLatestPnlResponse) {
        AbstractC16521elW abstractC16521elW = null;
        if (coinDetailFragmentNew.djBIcL != null) {
            AbstractC16521elW abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW = abstractC16521elW2;
            }
            abstractC16521elW.djBIcL.setVisibility(8);
        } else {
            AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW3 = null;
            }
            if (abstractC16521elW3.AkhnZx.getRoot().getVisibility() != 0) {
                AbstractC16521elW abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
                if (abstractC16521elW4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16521elW = abstractC16521elW4;
                }
                C14707dqY c14707dqY = abstractC16521elW.djBIcL;
                Intrinsics.copydefault(walletCoinLatestPnlResponse);
                c14707dqY.setPnlData(walletCoinLatestPnlResponse);
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(final C10525bqB c10525bqB) {
        ChainAddress chainAddressEZpvd;
        AbstractC16521elW abstractC16521elW = null;
        if (c10525bqB.gEmmrt() == 70000061 && ((chainAddressEZpvd = c10525bqB.EZpvd()) == null || chainAddressEZpvd.getAddressType() != AddressType.P2TRType.getValue())) {
            C17928fXm c17928fXm = C17928fXm.KWHzl;
            if (c17928fXm.AEQbTJ().KWHzl()) {
                AbstractC16521elW abstractC16521elW2 = this.AYXKKw;
                if (abstractC16521elW2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16521elW = abstractC16521elW2;
                }
                OKAlertBanner oKAlertBanner = abstractC16521elW.copydefault;
                Intrinsics.copydefault(oKAlertBanner);
                oKAlertBanner.setVisibility(0);
                oKAlertBanner.setType(2);
                oKAlertBanner.setMessage(C33069mpW.copydefault(C13754dXa.FragmentManager.isBrowsable, C56424yEw.gEmmrt(C56390yDp.OLrzqt("contractName", C33070mpX.AYXKKw(C13754dXa.FragmentManager.writeToParcel)), C56390yDp.OLrzqt("contractType", C33070mpX.AYXKKw(C13754dXa.FragmentManager.isPlayable)))));
                ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
                imageViewOLrzqt.setOnClickListener(new FragmentManager(imageViewOLrzqt, 1000L));
                c17928fXm.AEQbTJ().OLrzqt(AxsJAY());
                return;
            }
        }
        if (c10525bqB.KWHzl().UlJrfe() && C17928fXm.KWHzl.AYXKKw().KWHzl(c10525bqB.values().DbNXlk())) {
            AwvSrB().copydefault(c10525bqB.KWHzl().AhwBna(), c10525bqB.zuBGHE(), c10525bqB.KWHzl().OLrzqt(), new Function1() { // from class: o.gyU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.EZpvd(this.KWHzl, c10525bqB, (RegisterStatusResp) obj);
                }
            });
            return;
        }
        AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW = abstractC16521elW3;
        }
        OKAlertBanner oKAlertBanner2 = abstractC16521elW.copydefault;
        Intrinsics.checkNotNullExpressionValue(oKAlertBanner2, "");
        oKAlertBanner2.setVisibility(8);
    }

    public static final Unit EZpvd(final CoinDetailFragmentNew coinDetailFragmentNew, C10525bqB c10525bqB, final RegisterStatusResp registerStatusResp) {
        Intrinsics.checkNotNullParameter(registerStatusResp, "");
        if (ChainStatusChecker.OLrzqt.OLrzqt(registerStatusResp) == ChainStatus.UNREGISTERED) {
            AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            OKAlertBanner oKAlertBanner = abstractC16521elW.copydefault;
            Intrinsics.copydefault(oKAlertBanner);
            oKAlertBanner.setVisibility(0);
            oKAlertBanner.setType(4);
            oKAlertBanner.setMessage(registerStatusResp.getAlertMessage());
            oKAlertBanner.setPrimaryAction(C33070mpX.AYXKKw(C13754dXa.FragmentManager.mapNightMode), new Function0() { // from class: o.gyv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CoinDetailFragmentNew.OLrzqt(this.EZpvd, registerStatusResp);
                }
            });
            ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
            imageViewOLrzqt.setOnClickListener(new Dialog(imageViewOLrzqt, 1000L, c10525bqB));
            C17928fXm.KWHzl.AYXKKw().OLrzqt(coinDetailFragmentNew.AxsJAY());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(CoinDetailFragmentNew coinDetailFragmentNew, RegisterStatusResp registerStatusResp) {
        InterfaceC54828xWv interfaceC54828xWv = (InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class);
        FragmentActivity activity = coinDetailFragmentNew.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        InterfaceC54828xWv.ActionBar.enterDAppWebView$default(interfaceC54828xWv, activity, registerStatusResp.getUrl(), null, null, null, null, null, "wallet", 96, null);
        return Unit.INSTANCE;
    }

    public final void OcIXYQ() {
        String strDbNXlk;
        String strAYXKKw;
        String strAYXKKw2;
        C10854bwM c10854bwMDjBIcL;
        AbstractC12782ctV abstractC12782ctVAuCTel;
        C9694baS.Application application = C9694baS.Companion;
        ActivityC21019grp.Activity activity = ActivityC21019grp.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ == null || (abstractC12782ctVAuCTel = c19465gDjAEQbTJ.AuCTel()) == null || (strDbNXlk = abstractC12782ctVAuCTel.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW3 = null;
        }
        C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW3.AEQbTJ();
        String strGEmmrt = C33129mqd.gEmmrt((c19465gDjAEQbTJ2 == null || (c10854bwMDjBIcL = c19465gDjAEQbTJ2.djBIcL()) == null) ? null : Long.valueOf(c10854bwMDjBIcL.AhwBna()));
        AbstractC16521elW abstractC16521elW4 = this.AYXKKw;
        if (abstractC16521elW4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW4 = null;
        }
        C19465gDj c19465gDjAEQbTJ3 = abstractC16521elW4.AEQbTJ();
        if (c19465gDjAEQbTJ3 == null || (strAYXKKw = c19465gDjAEQbTJ3.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        AbstractC16521elW abstractC16521elW5 = this.AYXKKw;
        if (abstractC16521elW5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW2 = abstractC16521elW5;
        }
        C19465gDj c19465gDjAEQbTJ4 = abstractC16521elW2.AEQbTJ();
        application.KWHzl(this, activity.copydefault(context, strDbNXlk, strGEmmrt, strAYXKKw, (c19465gDjAEQbTJ4 == null || (strAYXKKw2 = c19465gDjAEQbTJ4.AYXKKw()) == null) ? "" : strAYXKKw2, TransactionType.TypeInscribe, (448 & 64) != 0 ? null : null, (448 & 128) != 0 ? null : null, (448 & 256) != 0 ? null : null), new Function2() { // from class: o.gzR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return CoinDetailFragmentNew.KWHzl(((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit KWHzl(int i, android.content.Intent intent) {
        return Unit.INSTANCE;
    }

    public final void QfsBiF() {
        LiveData<gFH> liveDataEjfBZ;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ == null || (liveDataEjfBZ = c19465gDjAEQbTJ.ejfBZ()) == null) {
            return;
        }
        liveDataEjfBZ.observe(this, new DialogInterface(new Function1() { // from class: o.gzD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.OLrzqt(this.KWHzl, (gFH) obj);
            }
        }));
    }

    public static final Unit OLrzqt(CoinDetailFragmentNew coinDetailFragmentNew, gFH gfh) {
        if (gfh == null) {
            return Unit.INSTANCE;
        }
        if (!gfh.EZpvd()) {
            return Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(coinDetailFragmentNew), null, null, new CoinDetailFragmentNew$initUtxoManagementEntrance$1$1(coinDetailFragmentNew, gfh, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(android.content.Context context, String str, long j) {
        context.startActivity(copydefault(context, str, j));
    }

    public final android.content.Intent copydefault(android.content.Context context, String str, long j) {
        C10854bwM c10854bwMDjBIcL;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        Long lValueOf = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null && (c10854bwMDjBIcL = c19465gDjAEQbTJ.djBIcL()) != null) {
            lValueOf = Long.valueOf(c10854bwMDjBIcL.AhwBna());
        }
        return ActivityC10355bmr.Companion.AEQbTJ(context, new UtxoWalletInfo(str, C11600cUg.copydefault(lValueOf), j, null, 8, null));
    }

    public final void AEQbTJ(final CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        MutableLiveData<C10525bqB> mutableLiveDataOLrzqt;
        C10525bqB value;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        AbstractC16521elW abstractC16521elW2 = null;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            c19465gDjAEQbTJ.EZpvd(false, new Function1() { // from class: o.gyQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.valueOf(this.AEQbTJ, coinAndAddressHistoryDetail, (AbstractC12782ctV) obj);
                }
            });
        }
        AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
        if (abstractC16521elW3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16521elW2 = abstractC16521elW3;
        }
        C19465gDj c19465gDjAEQbTJ2 = abstractC16521elW2.AEQbTJ();
        if (c19465gDjAEQbTJ2 == null || (mutableLiveDataOLrzqt = c19465gDjAEQbTJ2.OLrzqt()) == null || (value = mutableLiveDataOLrzqt.getValue()) == null) {
            return;
        }
        this.copydefault.OLrzqt("history", value);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit valueOf(CoinDetailFragmentNew coinDetailFragmentNew, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, AbstractC12782ctV abstractC12782ctV) {
        InterfaceC25429iwZ interfaceC25429iwZ;
        if (abstractC12782ctV != null) {
            FragmentActivity activity = coinDetailFragmentNew.getActivity();
            int txType = coinAndAddressHistoryDetail.getTxType();
            if (txType != 5) {
                if (txType != 84 && txType != 85) {
                    switch (txType) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                            break;
                        default:
                            switch (txType) {
                                case 40:
                                case 41:
                                    if (activity instanceof AppCompatActivity) {
                                        ((gKO) C43251rlk.copydefault(gKO.class)).AEQbTJ(activity, new TradeDetails(coinAndAddressHistoryDetail.getOrderId()), activity);
                                    }
                                    break;
                                case 42:
                                    if (activity instanceof AppCompatActivity) {
                                        ((gKO) C43251rlk.copydefault(gKO.class)).EZpvd(activity, new TradeDetails(coinAndAddressHistoryDetail.getOrderId()), activity);
                                    }
                                    break;
                                default:
                                    FragmentActivity activity2 = coinDetailFragmentNew.getActivity();
                                    if (activity2 == null) {
                                        return Unit.INSTANCE;
                                    }
                                    coinDetailFragmentNew.EZpvd(activity2, coinAndAddressHistoryDetail, abstractC12782ctV.DbNXlk());
                                    break;
                            }
                            break;
                    }
                } else if ((activity instanceof AppCompatActivity) && (interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class))) != null) {
                    interfaceC25429iwZ.AEQbTJ(activity, coinAndAddressHistoryDetail.getTxhash(), coinAndAddressHistoryDetail.getUOpHash());
                }
            } else if ((activity instanceof AppCompatActivity) && C33129mqd.OLrzqt((CharSequence) coinAndAddressHistoryDetail.getDexOrderId())) {
                ((gKO) C43251rlk.copydefault(gKO.class)).AEQbTJ(activity, new TradeDetails(coinAndAddressHistoryDetail.getDexOrderId()), activity);
            } else {
                FragmentActivity activity3 = coinDetailFragmentNew.getActivity();
                if (activity3 == null) {
                    return Unit.INSTANCE;
                }
                coinDetailFragmentNew.EZpvd(activity3, coinAndAddressHistoryDetail, abstractC12782ctV.DbNXlk());
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.content.Context context, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, String str) {
        ActivityC10049bhC.ActionBar actionBar = ActivityC10049bhC.Companion;
        String txId = coinAndAddressHistoryDetail.getTxId();
        String txhash = coinAndAddressHistoryDetail.getTxhash();
        String str2 = txhash == null ? "" : txhash;
        String uOpHash = coinAndAddressHistoryDetail.getUOpHash();
        String str3 = uOpHash == null ? "" : uOpHash;
        actionBar.KWHzl(context, (1544 & 2) != 0 ? "" : txId, (1544 & 4) != 0 ? "" : str2, (1544 & 8) != 0 ? "" : str3, zLjUOn(), str, coinAndAddressHistoryDetail.getOrderId(), (1544 & 128) != 0 ? 0L : coinAndAddressHistoryDetail.getCoinId(), coinAndAddressHistoryDetail.getOrderType(), (1544 & 512) != 0 ? false : false, (1544 & 1024) != 0 ? "" : null);
    }

    public final void KWHzl(final CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            c19465gDjAEQbTJ.EZpvd(false, new Function1() { // from class: o.gyg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.gEmmrt(this.OLrzqt, coinAndAddressHistoryDetail, (AbstractC12782ctV) obj);
                }
            });
        }
    }

    public static final Unit gEmmrt(final CoinDetailFragmentNew coinDetailFragmentNew, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            gCZ gcz = gCZ.EZpvd;
            androidx.fragment.app.FragmentManager childFragmentManager = coinDetailFragmentNew.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            gcz.OLrzqt(childFragmentManager, abstractC12782ctV.DbNXlk(), coinAndAddressHistoryDetail, new Function1() { // from class: o.gyu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.gEmmrt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(CoinDetailFragmentNew coinDetailFragmentNew, boolean z) {
        if (z) {
            refreshCoinHistory$default(coinDetailFragmentNew, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            c19465gDjAEQbTJ.EZpvd(false, new Function1() { // from class: o.gzS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.KWHzl(this.KWHzl, coinAndAddressHistoryDetail, (AbstractC12782ctV) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(final CoinDetailFragmentNew coinDetailFragmentNew, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            gCZ gcz = gCZ.EZpvd;
            androidx.fragment.app.FragmentManager childFragmentManager = coinDetailFragmentNew.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            gcz.copydefault(childFragmentManager, abstractC12782ctV.DbNXlk(), coinAndAddressHistoryDetail, new Function1() { // from class: o.gzk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.valueOf(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(CoinDetailFragmentNew coinDetailFragmentNew, boolean z) {
        if (z) {
            refreshCoinHistory$default(coinDetailFragmentNew, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(final CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            c19465gDjAEQbTJ.EZpvd(false, new Function1() { // from class: o.gzW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.AhwBna(this.copydefault, coinAndAddressHistoryDetail, (AbstractC12782ctV) obj);
                }
            });
        }
    }

    public static final Unit AhwBna(final CoinDetailFragmentNew coinDetailFragmentNew, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            gCZ gcz = gCZ.EZpvd;
            androidx.fragment.app.FragmentManager childFragmentManager = coinDetailFragmentNew.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            gcz.EZpvd(childFragmentManager, abstractC12782ctV.DbNXlk(), coinAndAddressHistoryDetail, new Function1() { // from class: o.gyo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return CoinDetailFragmentNew.djBIcL(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(CoinDetailFragmentNew coinDetailFragmentNew, boolean z) {
        if (z) {
            refreshCoinHistory$default(coinDetailFragmentNew, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(CoinAndAddressHistoryDetail coinAndAddressHistoryDetail) {
        gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        gko.copydefault(contextRequireContext, viewLifecycleOwner, coinAndAddressHistoryDetail.getOrderId(), C33129mqd.gEmmrt(coinAndAddressHistoryDetail.getToChainId()), true, new Function1() { // from class: o.gyK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.OLrzqt((BridgeRedeemStatus) obj);
            }
        });
    }

    public static final Unit OLrzqt(BridgeRedeemStatus bridgeRedeemStatus) {
        Intrinsics.checkNotNullParameter(bridgeRedeemStatus, "");
        return Unit.INSTANCE;
    }

    public final void copydefault(Boolean bool, String str, String str2, boolean z, Boolean bool2, Boolean bool3) {
        CoinInfo coinInfo;
        CoinInfo coinInfo2;
        if (RcXXUw()) {
            return;
        }
        Boolean bool4 = Boolean.TRUE;
        if (Intrinsics.EZpvd(bool, bool4) || Intrinsics.EZpvd(bool3, bool4) || C14687dqE.OLrzqt.djBIcL()) {
            return;
        }
        if (z) {
            String str3 = str == null ? "" : str;
            String str4 = str2 == null ? "" : str2;
            if (bool2 == null) {
                return;
            } else {
                coinInfo = new CoinInfo(str3, str4, bool2.booleanValue(), (String) null, 8, (DefaultConstructorMarker) null);
            }
        } else {
            coinInfo = new CoinInfo((String) null, (String) null, false, (String) null, 15, (DefaultConstructorMarker) null);
        }
        if (z) {
            coinInfo2 = new CoinInfo((String) null, (String) null, false, (String) null, 15, (DefaultConstructorMarker) null);
        } else {
            String str5 = str == null ? "" : str;
            String str6 = str2 == null ? "" : str2;
            if (bool2 == null) {
                return;
            } else {
                coinInfo2 = new CoinInfo(str5, str6, bool2.booleanValue(), (String) null, 8, (DefaultConstructorMarker) null);
            }
        }
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(((gKO) C43251rlk.copydefault(gKO.class)).KWHzl(new ChainRequest("1", "wallet_trade", coinInfo, coinInfo2, "")), this);
        final Function1 function1 = new Function1() { // from class: o.gzT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.KWHzl(this.OLrzqt, (SupportSwapCheck) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gzX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CoinDetailFragmentNew.AuCTel(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gzU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.KWHzl(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gzV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CoinDetailFragmentNew.getNewProxyInstance(function12, obj);
            }
        });
    }

    public static final void AuCTel(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(CoinDetailFragmentNew coinDetailFragmentNew, SupportSwapCheck supportSwapCheck) {
        if (coinDetailFragmentNew.RcXXUw()) {
            return Unit.INSTANCE;
        }
        AbstractC16521elW abstractC16521elW = null;
        if (supportSwapCheck.isSupportSingleSwap() == 1) {
            AbstractC16521elW abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW2 = null;
            }
            abstractC16521elW2.AxsJAY.setText(coinDetailFragmentNew.getString(C13754dXa.FragmentManager.onQueueChanged));
            AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW3 = null;
            }
            abstractC16521elW3.AxsJAY.setVisibility(0);
        } else {
            AbstractC16521elW abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW4 = null;
            }
            abstractC16521elW4.AxsJAY.setVisibility(8);
        }
        if (supportSwapCheck.isSupportCrossSwap() == 1) {
            AbstractC16521elW abstractC16521elW5 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW5 = null;
            }
            abstractC16521elW5.zLjUOn.setText(coinDetailFragmentNew.getString(C13754dXa.FragmentManager.dHguZz));
            AbstractC16521elW abstractC16521elW6 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW = abstractC16521elW6;
            }
            abstractC16521elW.zLjUOn.setVisibility(0);
        } else {
            AbstractC16521elW abstractC16521elW7 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW = abstractC16521elW7;
            }
            abstractC16521elW.zLjUOn.setVisibility(8);
        }
        if (coinDetailFragmentNew.valueOf == ButtonSetupState.DEX_PROCESSING) {
            coinDetailFragmentNew.valueOf = ButtonSetupState.DEX_COMPLETE;
        }
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(CoinDetailFragmentNew coinDetailFragmentNew, Throwable th) {
        pUU.copydefault(coinDetailFragmentNew.gHZMYf, "requireService checkSupportChain error message :" + th.getMessage());
        AbstractC16521elW abstractC16521elW = coinDetailFragmentNew.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        abstractC16521elW.AxsJAY.setVisibility(8);
        return Unit.INSTANCE;
    }

    public final void zsXlph() {
        InterfaceC9773bbs interfaceC9773bbs;
        Integer numQbewEr;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        String strAEQbTJ = "";
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        C10854bwM c10854bwMDjBIcL = c19465gDjAEQbTJ != null ? c19465gDjAEQbTJ.djBIcL() : null;
        List<InterfaceC9773bbs> listGGvvIC = gGvvIC();
        if (listGGvvIC == null || (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listGGvvIC)) == null) {
            return;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        long jFetchVPNInfo = c10854bwMDjBIcL != null ? c10854bwMDjBIcL.fetchVPNInfo() : -1L;
        String strFJNWhG = c10854bwMDjBIcL != null ? c10854bwMDjBIcL.fJNWhG() : null;
        String str = strFJNWhG == null ? "" : strFJNWhG;
        if (c10854bwMDjBIcL != null && c10854bwMDjBIcL.DAIeex()) {
            strAEQbTJ = C14079deg.EZpvd.AEQbTJ(c10854bwMDjBIcL);
        }
        interfaceC9773bbs.OLrzqt(contextRequireContext, jFetchVPNInfo, str, strAEQbTJ, (c10854bwMDjBIcL == null || (numQbewEr = c10854bwMDjBIcL.QbewEr()) == null) ? -1 : numQbewEr.intValue(), new yHS() { // from class: o.gyJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHS
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                return CoinDetailFragmentNew.AEQbTJ(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Long) obj2).longValue(), (java.lang.String) obj3, (java.lang.String) obj4, ((java.lang.Integer) obj5).intValue());
            }
        });
    }

    public static final Unit AEQbTJ(CoinDetailFragmentNew coinDetailFragmentNew, boolean z, long j, String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC16521elW abstractC16521elW = null;
        if (z) {
            AbstractC16521elW abstractC16521elW2 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW2 = null;
            }
            abstractC16521elW2.sSMYrx.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHandleNativeActionModesEnabled));
            AbstractC16521elW abstractC16521elW3 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW = abstractC16521elW3;
            }
            abstractC16521elW.sSMYrx.setVisibility(0);
        } else {
            AbstractC16521elW abstractC16521elW4 = coinDetailFragmentNew.AYXKKw;
            if (abstractC16521elW4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16521elW = abstractC16521elW4;
            }
            abstractC16521elW.sSMYrx.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel() {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null) {
            C19465gDj.refreshData$default(c19465gDjAEQbTJ, false, this.fARcdN + 1 <= this.isConnected, new Function0() { // from class: o.gzC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CoinDetailFragmentNew.AuCTel();
                }
            }, 1, null);
        }
        QVAiDq();
        iwGUEr();
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        InterfaceC58217yxC interfaceC58217yxC = this.getNewProxyInstance;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Unit unit;
        InterfaceC58217yxC interfaceC58217yxC = this.iwGUEr;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.ejfBZ;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        super.onDestroyView();
        C17928fXm c17928fXm = C17928fXm.KWHzl;
        c17928fXm.AEQbTJ().AEQbTJ(AxsJAY());
        c17928fXm.AYXKKw().AEQbTJ(AxsJAY());
        this.AhwBna.OLrzqt();
        try {
            Result.Application application = Result.Companion;
            AbstractC16521elW abstractC16521elW = this.AYXKKw;
            if (abstractC16521elW == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW = null;
            }
            ConstraintLayout constraintLayout = abstractC16521elW.AkhnZx.gEmmrt;
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(null);
            }
            AbstractC16521elW abstractC16521elW2 = this.AYXKKw;
            if (abstractC16521elW2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW2 = null;
            }
            AppCompatTextView appCompatTextView = abstractC16521elW2.AkhnZx.AhwBna;
            if (appCompatTextView != null) {
                appCompatTextView.setOnClickListener(null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7377constructorimpl(unit);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        try {
            Result.Application application3 = Result.Companion;
            AbstractC16521elW abstractC16521elW3 = this.AYXKKw;
            if (abstractC16521elW3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16521elW3 = null;
            }
            RecyclerView recyclerView = abstractC16521elW3.AhwBna.copydefault;
            if (recyclerView != null) {
                recyclerView.setAdapter(null);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Application application4 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
    }

    public final String zLjUOn() throws OKWException {
        String strAYXKKw;
        AbstractC16521elW abstractC16521elW = this.AYXKKw;
        String str = "";
        if (abstractC16521elW == null) {
            Intrinsics.gEmmrt("");
            abstractC16521elW = null;
        }
        C19465gDj c19465gDjAEQbTJ = abstractC16521elW.AEQbTJ();
        if (c19465gDjAEQbTJ != null && (strAYXKKw = c19465gDjAEQbTJ.AYXKKw()) != null) {
            str = strAYXKKw;
        }
        if (str.length() != 0) {
            return str;
        }
        throw new OKWException(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy), null);
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final AbstractC16741epe KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull AbstractC16741epe abstractC16741epe) {
            super(abstractC16741epe.getRoot());
            Intrinsics.checkNotNullParameter(abstractC16741epe, "");
            this.KWHzl = abstractC16741epe;
        }

        public final void KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl.getRoot().setVisibility(str.length() == 0 ? 8 : 0);
            this.KWHzl.KWHzl.setText(str);
        }
    }

    public static final ViewModelProvider.Factory AkhnZx() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(gEQ.class), new Function1() { // from class: o.gys
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.copydefault((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    public static final ViewModelProvider.Factory hDKMBd() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(gFD.class), new Function1() { // from class: o.gzt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinDetailFragmentNew.AEQbTJ((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }
}
