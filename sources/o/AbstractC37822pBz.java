package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.ui.view.pricewindow.PriceWindowData;
import com.okinc.rxutils.RxBus;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33512mxp;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC43294rma;
import o.mND;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.pBz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC37822pBz {
    public static int AhwBna;
    public static final int gEmmrt = 0;
    public static int valueOf;
    public final java.lang.String AYXKKw = "PriceFloatWindowManager";
    public final android.app.Application AkhnZx;
    public android.widget.ImageView AuCTel;
    public InterfaceC58217yxC AuCTelauCTel;
    public C37826pCc AubY;
    public long AwvSrB;
    public final float AxsJAY;
    public java.util.ArrayList<PriceWindowData.PriceWindowItem> DTwDnp;
    public android.widget.FrameLayout DbNXlk;
    public float ORxRYg;
    public final float OcIXYQ;
    public final float QKVWgx;
    public final ActionBar QOLQEE;
    public final float QUSxYX;
    public final float QVAiDq;
    public Application QbewEr;
    public final LoaderManager QfsBiF;
    public final float RJOkX;
    public android.widget.TextView RcXXUw;
    public android.view.View aKErDB;
    public int dNCPSb;
    public StateListAnimator djBIcL;
    public RecyclerView djSkpj;
    public android.widget.ImageView ejfBZ;
    public android.widget.ImageView fARcdN;
    public android.widget.ImageView fIwbmz;
    public android.widget.ImageView fJNWhG;
    public final AtomicInteger fetchVPNInfo;
    public final TaskDescription gHZMYf;
    public int getFieldNames;
    public int getNewProxyInstance;
    public InterfaceC58217yxC hDKMBd;
    public final java.util.ArrayList<java.lang.String> isConnected;
    public int iwGUEr;
    public final int sSMYrx;
    public int uzCIH;
    public final java.util.ArrayList<java.lang.String> values;
    public final int wlaJM;
    public final int zLjUOn;
    public C37824pCa zsXlph;
    public final int zuBGHE;
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public static final java.lang.String OLrzqt = "price_window";
    public static final java.lang.String copydefault = "price_window_Logo";
    public static final int AEQbTJ = 1;
    public static final int EZpvd = 2;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.String> AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58217yxC AkhnZx() {
        return this.AuCTelauCTel;
    }

    public abstract void AubY();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(InterfaceC58217yxC interfaceC58217yxC) {
        this.AuCTelauCTel = interfaceC58217yxC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.String> fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<PriceWindowData.PriceWindowItem> isConnected() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AtomicInteger valueOf() {
        return this.fetchVPNInfo;
    }

    public abstract void values();

    public AbstractC37822pBz() {
        android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
        this.AkhnZx = applicationOLrzqt;
        this.djBIcL = new StateListAnimator(applicationOLrzqt);
        this.getFieldNames = 600;
        this.dNCPSb = EZpvd;
        this.QVAiDq = C33052mpF.EZpvd(20, (android.content.Context) applicationOLrzqt);
        this.ORxRYg = C33052mpF.EZpvd(32, (android.content.Context) applicationOLrzqt);
        this.QKVWgx = C33052mpF.EZpvd(8, (android.content.Context) applicationOLrzqt);
        this.AxsJAY = C33052mpF.EZpvd(12, (android.content.Context) applicationOLrzqt);
        this.OcIXYQ = C33052mpF.EZpvd(16, (android.content.Context) applicationOLrzqt);
        this.QUSxYX = C33052mpF.EZpvd(24, (android.content.Context) applicationOLrzqt);
        this.RJOkX = C33052mpF.EZpvd(30, (android.content.Context) applicationOLrzqt);
        this.sSMYrx = C55298xhM.copydefault(34.0f, (android.content.Context) applicationOLrzqt);
        this.zLjUOn = C55298xhM.copydefault(88.0f, (android.content.Context) applicationOLrzqt);
        this.wlaJM = C55298xhM.copydefault(76.0f, (android.content.Context) applicationOLrzqt);
        this.zuBGHE = C55298xhM.copydefault(68.0f, (android.content.Context) applicationOLrzqt);
        this.DTwDnp = new java.util.ArrayList<>();
        this.values = new java.util.ArrayList<>();
        this.isConnected = new java.util.ArrayList<>();
        this.fetchVPNInfo = new AtomicInteger();
        getFieldNames();
        this.QOLQEE = new ActionBar();
        this.QfsBiF = new LoaderManager();
        this.gHZMYf = new TaskDescription();
    }

    /* JADX INFO: renamed from: o.pBz$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pBz.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String AEQbTJ() {
            return AbstractC37822pBz.OLrzqt;
        }

        public final java.lang.String copydefault() {
            return AbstractC37822pBz.copydefault;
        }

        public final int OLrzqt() {
            return AbstractC37822pBz.gEmmrt;
        }

        public final int KWHzl() {
            return AbstractC37822pBz.EZpvd;
        }
    }

    public final void getFieldNames() {
        this.QbewEr = new Application();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        android.app.Application application = this.AkhnZx;
        Application application2 = this.QbewEr;
        if (application2 == null) {
            Intrinsics.gEmmrt("");
            application2 = null;
        }
        application.registerReceiver(application2, intentFilter);
    }

    /* JADX INFO: renamed from: o.pBz$Application */
    public static final class Application extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull android.content.Context context, @NotNull android.content.Intent intent) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(intent, "");
            if (Intrinsics.EZpvd((java.lang.Object) "android.intent.action.SCREEN_ON", (java.lang.Object) intent.getAction())) {
                pBO pbo = pBO.dxcTrN;
                java.lang.Integer num = SPUtils.getInt("chart_price_window_fix", 5);
                Intrinsics.checkNotNullExpressionValue(num, "");
                pbo.djBIcL(num.intValue());
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) "android.intent.action.SCREEN_OFF", (java.lang.Object) intent.getAction())) {
                pBO.dxcTrN.gEmmrt();
            }
        }
    }

    public final void copydefault(int i) {
        C37824pCa c37824pCa = this.zsXlph;
        if (c37824pCa != null) {
            c37824pCa.getBackground().setAlpha(i);
            this.iwGUEr = i;
        }
        C37826pCc c37826pCc = this.AubY;
        if (c37826pCc != null) {
            c37826pCc.getBackground().setAlpha(i);
            this.iwGUEr = i;
        }
    }

    public final void AhwBna(int i) {
        int i2 = i != 0 ? i != 1 ? this.zLjUOn : this.wlaJM : this.zuBGHE;
        mNF mnfOLrzqt = mND.OLrzqt(OLrzqt);
        if (mnfOLrzqt != null) {
            int iValueOf = mnfOLrzqt.valueOf();
            if (iValueOf > 0) {
                C33566myq c33566myq = C33566myq.EZpvd;
                if (iValueOf == c33566myq.EZpvd(this.AkhnZx) - mnfOLrzqt.AYXKKw()) {
                    iValueOf = c33566myq.EZpvd(this.AkhnZx) - i2;
                }
            }
            mnfOLrzqt.KWHzl(i2, iValueOf);
            KWHzl(C37825pCb.KWHzl.KWHzl());
        }
    }

    public final void getNewProxyInstance() {
        int iCopydefault;
        C37824pCa c37824pCa = this.zsXlph;
        if (c37824pCa != null) {
            android.view.View viewFindViewById = c37824pCa.findViewById(C35964oKf.StateListAnimator.hgxRZI);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById;
            if (!C34704nhP.copydefault.copydefault()) {
                imageView.setVisibility(8);
                return;
            }
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C35964oKf.Activity.djSkpj);
            if (drawableKWHzl != null) {
                if (C37825pCb.KWHzl.KWHzl()) {
                    iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fERRXa);
                } else {
                    iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.run);
                }
                drawableKWHzl.setTint(iCopydefault);
                imageView.setImageDrawable(drawableKWHzl);
            }
        }
    }

    public final void valueOf(int i) {
        android.graphics.drawable.Drawable background;
        C37824pCa c37824pCa = this.zsXlph;
        if (c37824pCa != null) {
            c37824pCa.setPosition(i);
        }
        C37824pCa c37824pCa2 = this.zsXlph;
        if (c37824pCa2 == null || (background = c37824pCa2.getBackground()) == null) {
            return;
        }
        background.setAlpha(this.iwGUEr);
    }

    public final void EZpvd(int i) {
        android.graphics.drawable.Drawable background;
        C37826pCc c37826pCc = this.AubY;
        if (c37826pCc != null) {
            c37826pCc.setPosition(i);
        }
        C37826pCc c37826pCc2 = this.AubY;
        if (c37826pCc2 == null || (background = c37826pCc2.getBackground()) == null) {
            return;
        }
        background.setAlpha(this.iwGUEr);
    }

    public final void AEQbTJ(int i) {
        C37824pCa c37824pCa = this.zsXlph;
        if (c37824pCa != null) {
            c37824pCa.setThemeMode(i);
            c37824pCa.getBackground().setAlpha(this.iwGUEr);
            getNewProxyInstance();
            hDKMBd();
            this.djBIcL.notifyDataSetChanged();
        }
        C37826pCc c37826pCc = this.AubY;
        if (c37826pCc != null) {
            c37826pCc.setThemeMode(i);
            c37826pCc.getBackground().setAlpha(this.iwGUEr);
        }
    }

    public final void DbNXlk() {
        this.djBIcL.notifyDataSetChanged();
        fJNWhG();
    }

    /* JADX INFO: renamed from: o.pBz$ActionBar */
    public static final class ActionBar implements mNK {
        public ActionBar() {
        }

        @Override // o.mNK
        public void bj_() {
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
        }

        @Override // o.mNK
        public void AEQbTJ() {
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
            SPUtils.put("sp_price_floatwindow_enable", java.lang.Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: o.pBz$LoaderManager */
    public static final class LoaderManager implements mNN {
        public LoaderManager() {
        }

        @Override // o.mNN
        public void OLrzqt(int i, int i2) {
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
            C37824pCa c37824pCa = AbstractC37822pBz.this.zsXlph;
            Objects.toString(c37824pCa != null ? java.lang.Integer.valueOf(c37824pCa.getHeight()) : null);
            if (i > 0 && i != AbstractC37822pBz.this.getNewProxyInstance) {
                AbstractC37822pBz.this.valueOf(1);
            }
            AbstractC37822pBz.this.getNewProxyInstance = i;
            AbstractC37822pBz.this.getFieldNames = i2;
        }

        @Override // o.mNN
        public void AYXKKw() {
            Activity activity = AbstractC37822pBz.Companion;
            if (mND.OLrzqt(activity.AEQbTJ()).valueOf() > 0) {
                AbstractC37822pBz.this.valueOf(2);
            } else {
                AbstractC37822pBz.this.valueOf(0);
            }
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
            mND.OLrzqt(activity.AEQbTJ()).valueOf();
            mND.OLrzqt(activity.AEQbTJ()).AhwBna();
            mND.OLrzqt(activity.AEQbTJ()).copydefault();
            RecyclerView recyclerView = AbstractC37822pBz.this.djSkpj;
            if (recyclerView == null) {
                Intrinsics.gEmmrt("");
                recyclerView = null;
            }
            recyclerView.getHeight();
        }

        @Override // o.mNN
        public void KWHzl() {
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
        }

        @Override // o.mNN
        public void OLrzqt() {
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
        }

        @Override // o.mNN
        public void copydefault() {
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
        }

        @Override // o.mNN
        public void bi_() {
            Activity activity = AbstractC37822pBz.Companion;
            if (mND.OLrzqt(activity.AEQbTJ()) != null) {
                AbstractC37822pBz.this.getNewProxyInstance = mND.OLrzqt(activity.AEQbTJ()).valueOf();
                AbstractC37822pBz.this.getFieldNames = mND.OLrzqt(activity.AEQbTJ()).AhwBna();
                if (AbstractC37822pBz.this.getNewProxyInstance > 0) {
                    AbstractC37822pBz.this.valueOf(2);
                } else {
                    AbstractC37822pBz.this.valueOf(0);
                }
                java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
                mND.OLrzqt(activity.AEQbTJ()).valueOf();
                mND.OLrzqt(activity.AEQbTJ()).AhwBna();
                C37824pCa c37824pCa = AbstractC37822pBz.this.zsXlph;
                Objects.toString(c37824pCa != null ? java.lang.Integer.valueOf(c37824pCa.getHeight()) : null);
                return;
            }
            java.lang.String unused2 = AbstractC37822pBz.this.AYXKKw;
        }

        @Override // o.mNN
        public void EZpvd() {
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
        }
    }

    /* JADX INFO: renamed from: o.pBz$TaskDescription */
    public static final class TaskDescription implements mNN {
        public TaskDescription() {
        }

        @Override // o.mNN
        public void OLrzqt(int i, int i2) {
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
            int unused2 = AbstractC37822pBz.this.getNewProxyInstance;
            if (i <= 0 || i == AbstractC37822pBz.this.getNewProxyInstance) {
                return;
            }
            AbstractC37822pBz.this.EZpvd(1);
        }

        @Override // o.mNN
        public void AYXKKw() {
            if (mND.OLrzqt(AbstractC37822pBz.Companion.copydefault()).valueOf() > 0) {
                AbstractC37822pBz.this.EZpvd(2);
            } else {
                AbstractC37822pBz.this.EZpvd(0);
            }
        }

        @Override // o.mNN
        public void KWHzl() {
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
        }

        @Override // o.mNN
        public void OLrzqt() {
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
        }

        @Override // o.mNN
        public void copydefault() {
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
        }

        @Override // o.mNN
        public void bi_() {
            Activity activity = AbstractC37822pBz.Companion;
            if (mND.OLrzqt(activity.copydefault()) != null) {
                AbstractC37822pBz.this.getNewProxyInstance = mND.OLrzqt(activity.copydefault()).valueOf();
                AbstractC37822pBz.this.getFieldNames = mND.OLrzqt(activity.copydefault()).AhwBna();
                if (AbstractC37822pBz.this.getNewProxyInstance > 0) {
                    AbstractC37822pBz.this.EZpvd(2);
                    return;
                } else {
                    AbstractC37822pBz.this.EZpvd(0);
                    return;
                }
            }
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
        }

        @Override // o.mNN
        public void EZpvd() {
            java.lang.String unused = AbstractC37822pBz.this.AYXKKw;
        }
    }

    public static /* synthetic */ void showFloatWindow$default(AbstractC37822pBz abstractC37822pBz, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFloatWindow");
        }
        if ((i2 & 1) != 0) {
            i = 5;
        }
        abstractC37822pBz.djBIcL(i);
    }

    public final void djBIcL(int i) {
        android.graphics.drawable.Drawable background;
        if (SPUtils.getBoolean("sp_price_floatwindow_enable", false) && pFP.OLrzqt.OLrzqt()) {
            uzCIH();
            C33512mxp.AEQbTJ.KWHzl(new FragmentManager());
            PriceWindowData priceWindowData = PriceWindowData.AEQbTJ;
            OLrzqt(priceWindowData.AEQbTJ());
            this.DTwDnp = priceWindowData.OLrzqt();
            gEmmrt();
            if (this.DTwDnp.size() == 0) {
                return;
            }
            int iIntValue = SPUtils.getInt("chart_price_window_zoom_level", EZpvd).intValue();
            this.dNCPSb = iIntValue;
            if (iIntValue == gEmmrt) {
                iwGUEr();
            } else {
                RecyclerView recyclerView = null;
                android.view.View viewInflate = android.view.LayoutInflater.from(C52759wXh.AEQbTJ.OLrzqt(C52761wXj.LoaderManager.fvQaOB)).inflate(C35964oKf.Application.RkASWs, (android.view.ViewGroup) null);
                Intrinsics.copydefault(viewInflate, "");
                this.zsXlph = (C37824pCa) viewInflate;
                this.iwGUEr = SPUtils.getInt("chart_price_window_alpha", 255).intValue();
                C37824pCa c37824pCa = this.zsXlph;
                if (c37824pCa != null && (background = c37824pCa.getBackground()) != null) {
                    background.setAlpha(this.iwGUEr);
                }
                C37824pCa c37824pCa2 = this.zsXlph;
                if (c37824pCa2 != null) {
                    c37824pCa2.setThemeMode(C37825pCb.KWHzl.AEQbTJ());
                }
                C37824pCa c37824pCa3 = this.zsXlph;
                this.fJNWhG = c37824pCa3 != null ? (android.widget.ImageView) c37824pCa3.findViewById(C35964oKf.StateListAnimator.hcetpZ) : null;
                C37824pCa c37824pCa4 = this.zsXlph;
                this.fIwbmz = c37824pCa4 != null ? (android.widget.ImageView) c37824pCa4.findViewById(C35964oKf.StateListAnimator.HJWChPDXdlte) : null;
                KWHzl(C37825pCb.KWHzl.KWHzl());
                hDKMBd();
                C37824pCa c37824pCa5 = this.zsXlph;
                Intrinsics.copydefault(c37824pCa5);
                this.djSkpj = (RecyclerView) c37824pCa5.findViewById(C35964oKf.StateListAnimator.ICustomTabsCallbackDefault);
                C37824pCa c37824pCa6 = this.zsXlph;
                Intrinsics.copydefault(c37824pCa6);
                c37824pCa6.setOnClickListener(new View.OnClickListener() { // from class: o.pBE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        AbstractC37822pBz.copydefault(this.OLrzqt, view);
                    }
                });
                int iAhwBna = priceWindowData.AhwBna();
                int i2 = iAhwBna != 0 ? iAhwBna != 1 ? this.zLjUOn : this.wlaJM : this.zuBGHE;
                if (this.dNCPSb == AEQbTJ) {
                    this.DTwDnp.clear();
                    this.DTwDnp.add(priceWindowData.OLrzqt().get(0));
                }
                RecyclerView recyclerView2 = this.djSkpj;
                if (recyclerView2 == null) {
                    Intrinsics.gEmmrt("");
                    recyclerView2 = null;
                }
                recyclerView2.setLayoutManager(new LinearLayoutManager(this.AkhnZx));
                RecyclerView recyclerView3 = this.djSkpj;
                if (recyclerView3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    recyclerView = recyclerView3;
                }
                recyclerView.setAdapter(this.djBIcL);
                this.djBIcL.OLrzqt();
                this.djBIcL.OLrzqt(this.DTwDnp);
                AubY();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                C37824pCa c37824pCa7 = this.zsXlph;
                if (c37824pCa7 != null) {
                    c37824pCa7.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                int i3 = this.getFieldNames;
                C33566myq c33566myq = C33566myq.EZpvd;
                int iOLrzqt = c33566myq.OLrzqt(this.AkhnZx);
                C37824pCa c37824pCa8 = this.zsXlph;
                Intrinsics.copydefault(c37824pCa8);
                if (i3 > (iOLrzqt - c37824pCa8.getMeasuredHeight()) - C33570myu.KWHzl(this.AkhnZx)) {
                    int iOLrzqt2 = c33566myq.OLrzqt(this.AkhnZx);
                    C37824pCa c37824pCa9 = this.zsXlph;
                    Intrinsics.copydefault(c37824pCa9);
                    this.getFieldNames = (iOLrzqt2 - c37824pCa9.getMeasuredHeight()) - C33570myu.KWHzl(this.AkhnZx);
                }
                int i4 = this.getNewProxyInstance;
                if (i4 > 0) {
                    if (i4 > c33566myq.EZpvd(this.AkhnZx) / 2) {
                        this.getNewProxyInstance = c33566myq.EZpvd(this.AkhnZx) - i2;
                    } else {
                        this.getNewProxyInstance = 0;
                    }
                }
                try {
                    mND.StateListAnimator stateListAnimatorKWHzl = mND.KWHzl(this.AkhnZx);
                    C37824pCa c37824pCa10 = this.zsXlph;
                    Intrinsics.copydefault(c37824pCa10);
                    mND.StateListAnimator stateListAnimatorEZpvd = stateListAnimatorKWHzl.EZpvd(c37824pCa10);
                    java.lang.String str = OLrzqt;
                    stateListAnimatorEZpvd.AEQbTJ(str).AEQbTJ(i2).copydefault(this.getNewProxyInstance).OLrzqt(this.getFieldNames).KWHzl(5).EZpvd(this.QfsBiF).AEQbTJ(this.QOLQEE).KWHzl(true).KWHzl();
                    getNewProxyInstance();
                    mND.OLrzqt(str).isConnected();
                } catch (java.lang.Exception e) {
                    pUU.copydefault(this.AYXKKw, "showFloatWindow: " + e);
                }
                InterfaceC58217yxC interfaceC58217yxC = this.hDKMBd;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_on_configuration_changed");
                final Function1 function1 = new Function1() { // from class: o.pBB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC37822pBz.KWHzl(this.copydefault, (java.lang.String) obj);
                    }
                };
                this.hDKMBd = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pBD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        AbstractC37822pBz.KWHzl(function1, obj);
                    }
                });
            }
            RxBus.AEQbTJ("trade_to_new_system").subscribe(new RxBus.EventCallback<java.lang.String>() { // from class: com.okinc.kline.ui.view.pricewindow.IPriceFloatWindowManager$showFloatWindow$4
                {
                    super(this.this$0);
                }

                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(String str2) {
                    this.this$0.values();
                }
            });
            RxBus.AEQbTJ("EVENT_CHANGE_LANGUAGE").subscribe(new RxBus.EventCallback<java.lang.String>() { // from class: com.okinc.kline.ui.view.pricewindow.IPriceFloatWindowManager$showFloatWindow$5
                {
                    super(this.this$0);
                }

                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(String str2) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    this.this$0.getNewProxyInstance();
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.pBz$FragmentManager */
    public static final class FragmentManager implements C33512mxp.ActionBar {
        public FragmentManager() {
        }

        @Override // o.C33512mxp.ActionBar
        public void copydefault(int i) {
            AbstractC37822pBz.this.uzCIH();
        }

        @Override // o.C33512mxp.ActionBar
        public void AEQbTJ(int i) {
            AbstractC37822pBz.this.uzCIH();
        }
    }

    public static final void copydefault(AbstractC37822pBz abstractC37822pBz, android.view.View view) {
        if (view instanceof C37824pCa) {
            if (PriceWindowData.AEQbTJ.AYXKKw()) {
                C37824pCa c37824pCa = (C37824pCa) view;
                if (c37824pCa.OLrzqt() < c37824pCa.getHeight() - abstractC37822pBz.QKVWgx && c37824pCa.OLrzqt() > (c37824pCa.getHeight() - abstractC37822pBz.QKVWgx) - abstractC37822pBz.OcIXYQ) {
                    if (c37824pCa.KWHzl() > abstractC37822pBz.AxsJAY && c37824pCa.KWHzl() < abstractC37822pBz.AxsJAY + abstractC37822pBz.OcIXYQ) {
                        abstractC37822pBz.wlaJM();
                        return;
                    } else {
                        if (c37824pCa.KWHzl() <= (c37824pCa.getWidth() - abstractC37822pBz.AxsJAY) - abstractC37822pBz.OcIXYQ || c37824pCa.KWHzl() >= c37824pCa.getWidth() - abstractC37822pBz.AxsJAY) {
                            return;
                        }
                        abstractC37822pBz.zsXlph();
                        return;
                    }
                }
            }
            C37824pCa c37824pCa2 = (C37824pCa) view;
            if (c37824pCa2.OLrzqt() < abstractC37822pBz.QUSxYX) {
                if (c37824pCa2.KWHzl() < abstractC37822pBz.RJOkX) {
                    abstractC37822pBz.AuCTel();
                    return;
                } else {
                    if (c37824pCa2.KWHzl() > c37824pCa2.getWidth() - abstractC37822pBz.RJOkX) {
                        abstractC37822pBz.fARcdN();
                        return;
                    }
                    return;
                }
            }
            if (java.lang.System.currentTimeMillis() - abstractC37822pBz.AwvSrB < 1000 || abstractC37822pBz.DTwDnp.size() == 0 || c37824pCa2.getHeight() / abstractC37822pBz.DTwDnp.size() == 0) {
                return;
            }
            abstractC37822pBz.AwvSrB = java.lang.System.currentTimeMillis();
            int iOLrzqt = (int) ((c37824pCa2.OLrzqt() - abstractC37822pBz.QUSxYX) / ((((c37824pCa2.getHeight() - abstractC37822pBz.QVAiDq) - abstractC37822pBz.ORxRYg) - abstractC37822pBz.QUSxYX) / abstractC37822pBz.DTwDnp.size()));
            if (iOLrzqt < 0 || iOLrzqt >= abstractC37822pBz.DTwDnp.size()) {
                return;
            }
            abstractC37822pBz.OLrzqt(iOLrzqt);
        }
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractC37822pBz abstractC37822pBz, java.lang.String str) {
        abstractC37822pBz.djBIcL(5);
        return Unit.INSTANCE;
    }

    public final void uzCIH() {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = this.AkhnZx;
        }
        java.lang.Integer numKWHzl = C33503mxg.KWHzl(C33503mxg.OLrzqt());
        if (numKWHzl != null) {
            android.content.Context contextOLrzqt = C52759wXh.AEQbTJ.OLrzqt(numKWHzl.intValue());
            if (contextOLrzqt != null) {
                contextAEQbTJ = contextOLrzqt;
            }
        }
        if (C37825pCb.KWHzl.KWHzl()) {
            AhwBna = C55366xib.KWHzl(C52761wXj.ActionBar.sTzBva, new C55365xia(contextAEQbTJ, 16));
            valueOf = C55366xib.KWHzl(C52761wXj.ActionBar.aJFbMH, new C55365xia(contextAEQbTJ, 16));
        } else {
            AhwBna = C55366xib.KWHzl(C52761wXj.ActionBar.sTzBva, new C55365xia(contextAEQbTJ, 32));
            valueOf = C55366xib.KWHzl(C52761wXj.ActionBar.aJFbMH, new C55365xia(contextAEQbTJ, 32));
        }
    }

    public final void fIwbmz() {
        PriceWindowData priceWindowData = PriceWindowData.AEQbTJ;
        OLrzqt(priceWindowData.AEQbTJ());
        java.util.ArrayList<PriceWindowData.PriceWindowItem> arrayListOLrzqt = priceWindowData.OLrzqt();
        this.DTwDnp = arrayListOLrzqt;
        if (this.dNCPSb == gEmmrt) {
            if (this.AubY == null) {
                iwGUEr();
                return;
            } else {
                if (arrayListOLrzqt.size() == 0) {
                    gEmmrt();
                    return;
                }
                return;
            }
        }
        if (this.zsXlph == null) {
            showFloatWindow$default(this, 0, 1, null);
            return;
        }
        C37832pCi.KWHzl.clear();
        if (this.DTwDnp.size() == 0) {
            gEmmrt();
            return;
        }
        if (this.dNCPSb == AEQbTJ) {
            this.DTwDnp.clear();
            if (C33129mqd.KWHzl((java.util.Collection) priceWindowData.OLrzqt())) {
                this.DTwDnp.add(priceWindowData.OLrzqt().get(0));
            }
        }
        ejfBZ();
        this.djBIcL.OLrzqt();
        this.djBIcL.OLrzqt(this.DTwDnp);
        AubY();
        fJNWhG();
    }

    public final void AuCTel() {
        SPUtils.put("chart_price_window_zoom_level_last", java.lang.Integer.valueOf(this.dNCPSb));
        AxsJAY();
    }

    public final void fARcdN() {
        SPUtils.put("chart_price_window_zoom_level_last", java.lang.Integer.valueOf(this.dNCPSb));
        int i = this.dNCPSb;
        if (i == EZpvd) {
            AuCTelauCTel();
        } else if (i == AEQbTJ) {
            zLjUOn();
        }
    }

    public final void zLjUOn() {
        KWHzl(EZpvd);
        KWHzl(C37825pCb.KWHzl.KWHzl());
        C37832pCi.KWHzl.clear();
        this.DTwDnp.clear();
        PriceWindowData priceWindowData = PriceWindowData.AEQbTJ;
        this.DTwDnp = priceWindowData.OLrzqt();
        this.djBIcL.OLrzqt();
        this.djBIcL.OLrzqt(this.DTwDnp);
        AubY();
        if (priceWindowData.AYXKKw()) {
            android.widget.FrameLayout frameLayout = this.DbNXlk;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            this.ORxRYg = C33052mpF.EZpvd(32, (android.content.Context) this.AkhnZx);
        }
        fJNWhG();
    }

    public final void fJNWhG() {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        C37824pCa c37824pCa = this.zsXlph;
        if (c37824pCa != null) {
            c37824pCa.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int i = this.getFieldNames;
            C33566myq c33566myq = C33566myq.EZpvd;
            if (i > (c33566myq.OLrzqt(this.AkhnZx) - c37824pCa.getMeasuredHeight()) - C33570myu.KWHzl(this.AkhnZx)) {
                this.getFieldNames = (c33566myq.OLrzqt(this.AkhnZx) - c37824pCa.getMeasuredHeight()) - C33570myu.KWHzl(this.AkhnZx);
                mND.OLrzqt(OLrzqt).EZpvd(this.getFieldNames);
            }
        }
    }

    public final void AuCTelauCTel() {
        KWHzl(AEQbTJ);
        KWHzl(C37825pCb.KWHzl.KWHzl());
        C37832pCi.KWHzl.clear();
        this.DTwDnp.clear();
        PriceWindowData priceWindowData = PriceWindowData.AEQbTJ;
        if (C33129mqd.KWHzl((java.util.Collection) priceWindowData.OLrzqt())) {
            this.DTwDnp.add(priceWindowData.OLrzqt().get(0));
        }
        this.djBIcL.OLrzqt();
        this.djBIcL.OLrzqt(this.DTwDnp);
        AubY();
        if (priceWindowData.AYXKKw()) {
            android.widget.FrameLayout frameLayout = this.DbNXlk;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            this.ORxRYg = C33052mpF.EZpvd(0, (android.content.Context) this.AkhnZx);
        }
        C32866mlf.onEvent$default("MobileWidget_FloatingWidget_Resize_Click", (TrackChannel[]) null, new Function1() { // from class: o.pBF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC37822pBz.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("resize_type", "shrink", true);
        return Unit.INSTANCE;
    }

    public final void AxsJAY() {
        KWHzl(gEmmrt);
        gEmmrt();
        iwGUEr();
        C32866mlf.onEvent$default("MobileWidget_FloatingWidget_Resize_Click", (TrackChannel[]) null, new Function1() { // from class: o.pBH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC37822pBz.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("resize_type", "minimize", true);
        return Unit.INSTANCE;
    }

    public final void iwGUEr() {
        android.graphics.drawable.Drawable background;
        android.view.View viewInflate = android.view.LayoutInflater.from(C52759wXh.AEQbTJ.OLrzqt(C52761wXj.LoaderManager.fvQaOB)).inflate(C35964oKf.Application.RTWSvT, (android.view.ViewGroup) null);
        Intrinsics.copydefault(viewInflate, "");
        this.AubY = (C37826pCc) viewInflate;
        this.iwGUEr = SPUtils.getInt("chart_price_window_alpha", 255).intValue();
        C37826pCc c37826pCc = this.AubY;
        if (c37826pCc != null && (background = c37826pCc.getBackground()) != null) {
            background.setAlpha(this.iwGUEr);
        }
        C37826pCc c37826pCc2 = this.AubY;
        if (c37826pCc2 != null) {
            c37826pCc2.setThemeMode(C37825pCb.KWHzl.AEQbTJ());
        }
        C37826pCc c37826pCc3 = this.AubY;
        this.AuCTel = c37826pCc3 != null ? (android.widget.ImageView) c37826pCc3.findViewById(C35964oKf.StateListAnimator.GQzpsZsQwTVT) : null;
        EZpvd(C37825pCb.KWHzl.KWHzl());
        C37826pCc c37826pCc4 = this.AubY;
        if (c37826pCc4 != null) {
            c37826pCc4.setOnClickListener(new View.OnClickListener() { // from class: o.pBK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC37822pBz.KWHzl(this.AEQbTJ, view);
                }
            });
        }
        int i = this.getNewProxyInstance;
        if (i > 0) {
            C33566myq c33566myq = C33566myq.EZpvd;
            this.getNewProxyInstance = i > c33566myq.EZpvd(this.AkhnZx) / 2 ? c33566myq.EZpvd(this.AkhnZx) - this.sSMYrx : 0;
        }
        int i2 = this.getFieldNames;
        C33566myq c33566myq2 = C33566myq.EZpvd;
        if (i2 > (c33566myq2.OLrzqt(this.AkhnZx) - this.sSMYrx) - C33570myu.KWHzl(this.AkhnZx)) {
            this.getFieldNames = (c33566myq2.OLrzqt(this.AkhnZx) - this.sSMYrx) - C33570myu.KWHzl(this.AkhnZx);
        }
        try {
            mND.StateListAnimator stateListAnimatorKWHzl = mND.KWHzl(this.AkhnZx);
            C37826pCc c37826pCc5 = this.AubY;
            Intrinsics.copydefault(c37826pCc5);
            mND.StateListAnimator stateListAnimatorEZpvd = stateListAnimatorKWHzl.EZpvd(c37826pCc5);
            java.lang.String str = copydefault;
            stateListAnimatorEZpvd.AEQbTJ(str).AEQbTJ(this.sSMYrx).EZpvd(this.sSMYrx).copydefault(this.getNewProxyInstance).OLrzqt(this.getFieldNames).KWHzl(3).EZpvd(this.gHZMYf).AEQbTJ(this.QOLQEE).KWHzl(true).KWHzl();
            mND.OLrzqt(str).isConnected();
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.AYXKKw, "showLogoFloatWindow: " + e);
        }
        InterfaceC58217yxC interfaceC58217yxC = this.hDKMBd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_on_configuration_changed");
        final Function1 function1 = new Function1() { // from class: o.pBG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC37822pBz.AEQbTJ(this.copydefault, (java.lang.String) obj);
            }
        };
        this.hDKMBd = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pBC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC37822pBz.OLrzqt(function1, obj);
            }
        });
    }

    public static final void KWHzl(AbstractC37822pBz abstractC37822pBz, android.view.View view) {
        abstractC37822pBz.gEmmrt();
        int i = EZpvd;
        java.lang.Integer num = SPUtils.getInt("chart_price_window_zoom_level_last", i);
        if (num == null || num.intValue() != i) {
            i = AEQbTJ;
        }
        abstractC37822pBz.dNCPSb = i;
        SPUtils.put("chart_price_window_zoom_level", java.lang.Integer.valueOf(i));
        showFloatWindow$default(abstractC37822pBz, 0, 1, null);
        SPUtils.put("chart_price_window_zoom_level_last", java.lang.Integer.valueOf(gEmmrt));
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractC37822pBz abstractC37822pBz, java.lang.String str) {
        abstractC37822pBz.djBIcL(5);
        return Unit.INSTANCE;
    }

    public final void KWHzl(int i) {
        this.dNCPSb = i;
        SPUtils.put("chart_price_window_zoom_level", java.lang.Integer.valueOf(i));
    }

    public final void KWHzl(boolean z) {
        if (z) {
            java.lang.Integer num = SPUtils.getInt("chart_price_window_text_level", 2);
            if (num != null && num.intValue() == 2) {
                android.widget.ImageView imageView = this.fJNWhG;
                if (imageView != null) {
                    imageView.setImageResource(C35964oKf.Activity.fJNWhG);
                }
                if (this.dNCPSb == EZpvd) {
                    android.widget.ImageView imageView2 = this.fIwbmz;
                    if (imageView2 != null) {
                        imageView2.setImageResource(C35964oKf.Activity.uzCIH);
                        return;
                    }
                    return;
                }
                android.widget.ImageView imageView3 = this.fIwbmz;
                if (imageView3 != null) {
                    imageView3.setImageResource(C35964oKf.Activity.AubY);
                    return;
                }
                return;
            }
            android.widget.ImageView imageView4 = this.fJNWhG;
            if (imageView4 != null) {
                imageView4.setImageResource(C35964oKf.Activity.AuCTel);
            }
            if (this.dNCPSb == EZpvd) {
                android.widget.ImageView imageView5 = this.fIwbmz;
                if (imageView5 != null) {
                    imageView5.setImageResource(C35964oKf.Activity.iwGUEr);
                    return;
                }
                return;
            }
            android.widget.ImageView imageView6 = this.fIwbmz;
            if (imageView6 != null) {
                imageView6.setImageResource(C35964oKf.Activity.hDKMBd);
                return;
            }
            return;
        }
        java.lang.Integer num2 = SPUtils.getInt("chart_price_window_text_level", 2);
        if (num2 != null && num2.intValue() == 2) {
            android.widget.ImageView imageView7 = this.fJNWhG;
            if (imageView7 != null) {
                imageView7.setImageResource(C35964oKf.Activity.fARcdN);
            }
            if (this.dNCPSb == EZpvd) {
                android.widget.ImageView imageView8 = this.fIwbmz;
                if (imageView8 != null) {
                    imageView8.setImageResource(C35964oKf.Activity.getFieldNames);
                    return;
                }
                return;
            }
            android.widget.ImageView imageView9 = this.fIwbmz;
            if (imageView9 != null) {
                imageView9.setImageResource(C35964oKf.Activity.zLjUOn);
                return;
            }
            return;
        }
        android.widget.ImageView imageView10 = this.fJNWhG;
        if (imageView10 != null) {
            imageView10.setImageResource(C35964oKf.Activity.ejfBZ);
        }
        if (this.dNCPSb == EZpvd) {
            android.widget.ImageView imageView11 = this.fIwbmz;
            if (imageView11 != null) {
                imageView11.setImageResource(C35964oKf.Activity.getNewProxyInstance);
                return;
            }
            return;
        }
        android.widget.ImageView imageView12 = this.fIwbmz;
        if (imageView12 != null) {
            imageView12.setImageResource(C35964oKf.Activity.AuCTelauCTel);
        }
    }

    public final void EZpvd(boolean z) {
        if (z) {
            android.widget.ImageView imageView = this.AuCTel;
            if (imageView != null) {
                imageView.setImageResource(C35964oKf.Activity.gHZMYf);
                return;
            }
            return;
        }
        android.widget.ImageView imageView2 = this.AuCTel;
        if (imageView2 != null) {
            imageView2.setImageResource(C35964oKf.Activity.sSMYrx);
        }
    }

    public final void OLrzqt(MarketCoinInfo marketCoinInfo) {
        EZpvd(marketCoinInfo);
        copydefault(marketCoinInfo);
    }

    public final void copydefault(final MarketCoinInfo marketCoinInfo) {
        int i = this.dNCPSb;
        final java.lang.String str = i == AEQbTJ ? "middle_square" : i == EZpvd ? "full_rectangle" : "small_square";
        C32866mlf.onEvent$default("MobileWidget_FloatingWidget_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.pBx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC37822pBz.AEQbTJ(str, marketCoinInfo, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, MarketCoinInfo marketCoinInfo, AbstractC37822pBz abstractC37822pBz, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("widget_type", str, true);
        EventParamsList.put$default(eventParamsList, "token_pair", marketCoinInfo.getInstrumentId(), false, 4, null);
        eventParamsList.put("biz_type", marketCoinInfo.getInstrumentType(), true);
        EventParamsList.put$default(eventParamsList, "page", C33129mqd.gEmmrt(java.lang.Integer.valueOf(abstractC37822pBz.uzCIH + 1)), false, 4, null);
        eventParamsList.put("percentage_change", PriceWindowData.AEQbTJ.djBIcL() ? "True" : "False", true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(MarketCoinInfo marketCoinInfo) {
        android.app.Activity activityAEQbTJ;
        android.app.Activity activityAEQbTJ2;
        java.lang.String str = "trade_kline?id=" + marketCoinInfo.getInstrumentId() + "&type=" + marketCoinInfo.getInstrumentType() + "&refreshWidget=1";
        if (C32986mnt.EZpvd.valueOf()) {
            C54819xWm c54819xWmKWHzl = C54819xWm.KWHzl();
            if (c54819xWmKWHzl != null && (activityAEQbTJ2 = c54819xWmKWHzl.AEQbTJ()) != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) activityAEQbTJ2.getClass().getSimpleName(), (java.lang.CharSequence) "SecurityVerifyLockScreenActivity", false, 2, (java.lang.Object) null)) {
                pUU.copydefault(this.AYXKKw, "startByDeeplink isAppForeground: SecurityVerifyLockScreenActivity");
                return;
            }
            C54819xWm c54819xWmKWHzl2 = C54819xWm.KWHzl();
            if (c54819xWmKWHzl2 != null && (activityAEQbTJ = c54819xWmKWHzl2.AEQbTJ()) != null) {
                InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activityAEQbTJ, str, null, new Function1() { // from class: o.pBJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC37822pBz.AEQbTJ((AbstractC43238rlX) obj);
                    }
                }, 4, null);
                return;
            }
            pUU.copydefault(this.AYXKKw, "startByDeeplink Foreground: cannot start activity for deeplink " + str);
            return;
        }
        android.app.Activity activitySSMYrx = pBO.dxcTrN.sSMYrx();
        if (activitySSMYrx != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activitySSMYrx, str, null, new Function1() { // from class: o.pBI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC37822pBz.OLrzqt((AbstractC43238rlX) obj);
                }
            }, 4, null);
            return;
        }
        pUU.copydefault(this.AYXKKw, " startByDeeplink Background: cannot start activity for deeplink " + str);
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void wlaJM() {
        if (C55296xhK.OLrzqt(this.AkhnZx)) {
            android.widget.ImageView imageView = this.ejfBZ;
            if (imageView == null || !imageView.isEnabled()) {
                return;
            }
            int i = this.uzCIH - 1;
            this.uzCIH = i;
            PriceWindowData.AEQbTJ.EZpvd(i);
            fIwbmz();
            return;
        }
        android.widget.ImageView imageView2 = this.fARcdN;
        if (imageView2 == null || !imageView2.isEnabled()) {
            return;
        }
        int i2 = this.uzCIH - 1;
        this.uzCIH = i2;
        PriceWindowData.AEQbTJ.EZpvd(i2);
        fIwbmz();
    }

    public final void zsXlph() {
        if (C55296xhK.OLrzqt(this.AkhnZx)) {
            android.widget.ImageView imageView = this.fARcdN;
            if (imageView == null || !imageView.isEnabled()) {
                return;
            }
            int i = this.uzCIH + 1;
            this.uzCIH = i;
            PriceWindowData.AEQbTJ.EZpvd(i);
            fIwbmz();
            return;
        }
        android.widget.ImageView imageView2 = this.ejfBZ;
        if (imageView2 == null || !imageView2.isEnabled()) {
            return;
        }
        int i2 = this.uzCIH + 1;
        this.uzCIH = i2;
        PriceWindowData.AEQbTJ.EZpvd(i2);
        fIwbmz();
    }

    public final void hDKMBd() {
        android.graphics.drawable.Drawable background;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.ImageView imageView3;
        android.widget.ImageView imageView4;
        android.graphics.drawable.Drawable background2;
        C37824pCa c37824pCa = this.zsXlph;
        this.aKErDB = c37824pCa != null ? c37824pCa.findViewById(C35964oKf.StateListAnimator.onRemoveQueueItemAt) : null;
        C37824pCa c37824pCa2 = this.zsXlph;
        this.fARcdN = c37824pCa2 != null ? (android.widget.ImageView) c37824pCa2.findViewById(C35964oKf.StateListAnimator.zzJhsT) : null;
        C37824pCa c37824pCa3 = this.zsXlph;
        this.RcXXUw = c37824pCa3 != null ? (android.widget.TextView) c37824pCa3.findViewById(C35964oKf.StateListAnimator.removeQueueItem) : null;
        C37824pCa c37824pCa4 = this.zsXlph;
        this.ejfBZ = c37824pCa4 != null ? (android.widget.ImageView) c37824pCa4.findViewById(C35964oKf.StateListAnimator.hKJZrr) : null;
        C37824pCa c37824pCa5 = this.zsXlph;
        this.DbNXlk = c37824pCa5 != null ? (android.widget.FrameLayout) c37824pCa5.findViewById(C35964oKf.StateListAnimator.DcMfJKDDUqPf) : null;
        PriceWindowData priceWindowData = PriceWindowData.AEQbTJ;
        if (priceWindowData.AYXKKw() && this.dNCPSb == EZpvd) {
            android.widget.FrameLayout frameLayout = this.DbNXlk;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            this.ORxRYg = C33052mpF.EZpvd(32, (android.content.Context) this.AkhnZx);
        } else {
            android.widget.FrameLayout frameLayout2 = this.DbNXlk;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
            this.ORxRYg = C33052mpF.EZpvd(0, (android.content.Context) this.AkhnZx);
        }
        android.view.View view = this.aKErDB;
        if (view != null) {
            view.setBackgroundColor(C37825pCb.KWHzl.EZpvd());
        }
        C37825pCb c37825pCb = C37825pCb.KWHzl;
        if (c37825pCb.KWHzl()) {
            android.view.View view2 = this.aKErDB;
            if (view2 != null && (background2 = view2.getBackground()) != null) {
                background2.setAlpha(255);
            }
        } else {
            android.view.View view3 = this.aKErDB;
            if (view3 != null && (background = view3.getBackground()) != null) {
                background.setAlpha(127);
            }
        }
        android.widget.TextView textView = this.RcXXUw;
        if (textView != null) {
            textView.setTextColor(c37825pCb.OLrzqt());
        }
        this.uzCIH = priceWindowData.copydefault();
        if (C55296xhK.OLrzqt(this.AkhnZx)) {
            android.widget.TextView textView2 = this.RcXXUw;
            if (textView2 != null) {
                textView2.setText(priceWindowData.EZpvd() + "/" + (this.uzCIH + 1));
            }
            android.widget.ImageView imageView5 = this.fARcdN;
            if (imageView5 != null) {
                imageView5.setEnabled(true);
            }
            android.widget.ImageView imageView6 = this.ejfBZ;
            if (imageView6 != null) {
                imageView6.setEnabled(true);
            }
            if (this.uzCIH == 0 && (imageView4 = this.ejfBZ) != null) {
                imageView4.setEnabled(false);
            }
            if (this.uzCIH == priceWindowData.EZpvd() - 1 && (imageView3 = this.fARcdN) != null) {
                imageView3.setEnabled(false);
            }
            if (c37825pCb.KWHzl()) {
                android.widget.ImageView imageView7 = this.fARcdN;
                if (imageView7 != null) {
                    imageView7.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.DAIeex, this.AkhnZx));
                }
                android.widget.ImageView imageView8 = this.ejfBZ;
                if (imageView8 != null) {
                    imageView8.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.RlQdEF, this.AkhnZx));
                    return;
                }
                return;
            }
            android.widget.ImageView imageView9 = this.fARcdN;
            if (imageView9 != null) {
                imageView9.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.iRxXKY, this.AkhnZx));
            }
            android.widget.ImageView imageView10 = this.ejfBZ;
            if (imageView10 != null) {
                imageView10.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.QKudOq, this.AkhnZx));
                return;
            }
            return;
        }
        android.widget.TextView textView3 = this.RcXXUw;
        if (textView3 != null) {
            int i = this.uzCIH;
            textView3.setText((i + 1) + "/" + priceWindowData.EZpvd());
        }
        android.widget.ImageView imageView11 = this.fARcdN;
        if (imageView11 != null) {
            imageView11.setEnabled(true);
        }
        android.widget.ImageView imageView12 = this.ejfBZ;
        if (imageView12 != null) {
            imageView12.setEnabled(true);
        }
        if (this.uzCIH == 0 && (imageView2 = this.fARcdN) != null) {
            imageView2.setEnabled(false);
        }
        if (this.uzCIH == priceWindowData.EZpvd() - 1 && (imageView = this.ejfBZ) != null) {
            imageView.setEnabled(false);
        }
        if (c37825pCb.KWHzl()) {
            android.widget.ImageView imageView13 = this.fARcdN;
            if (imageView13 != null) {
                imageView13.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.RlQdEF, this.AkhnZx));
            }
            android.widget.ImageView imageView14 = this.ejfBZ;
            if (imageView14 != null) {
                imageView14.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.DAIeex, this.AkhnZx));
                return;
            }
            return;
        }
        android.widget.ImageView imageView15 = this.fARcdN;
        if (imageView15 != null) {
            imageView15.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.QKudOq, this.AkhnZx));
        }
        android.widget.ImageView imageView16 = this.ejfBZ;
        if (imageView16 != null) {
            imageView16.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.iRxXKY, this.AkhnZx));
        }
    }

    public final void ejfBZ() {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.ImageView imageView3;
        android.widget.ImageView imageView4;
        PriceWindowData priceWindowData = PriceWindowData.AEQbTJ;
        if (priceWindowData.AYXKKw() && this.dNCPSb == EZpvd) {
            android.widget.FrameLayout frameLayout = this.DbNXlk;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            this.ORxRYg = C33052mpF.EZpvd(32, (android.content.Context) this.AkhnZx);
        } else {
            android.widget.FrameLayout frameLayout2 = this.DbNXlk;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
            this.ORxRYg = C33052mpF.EZpvd(0, (android.content.Context) this.AkhnZx);
        }
        android.widget.TextView textView = this.RcXXUw;
        if (textView != null) {
            textView.setTextColor(C37825pCb.KWHzl.OLrzqt());
        }
        this.uzCIH = priceWindowData.copydefault();
        if (C55296xhK.OLrzqt(this.AkhnZx)) {
            android.widget.TextView textView2 = this.RcXXUw;
            if (textView2 != null) {
                textView2.setText(priceWindowData.EZpvd() + "/" + (this.uzCIH + 1));
            }
            android.widget.ImageView imageView5 = this.fARcdN;
            if (imageView5 != null) {
                imageView5.setEnabled(true);
            }
            android.widget.ImageView imageView6 = this.ejfBZ;
            if (imageView6 != null) {
                imageView6.setEnabled(true);
            }
            if (this.uzCIH == 0 && (imageView4 = this.ejfBZ) != null) {
                imageView4.setEnabled(false);
            }
            if (this.uzCIH == priceWindowData.EZpvd() - 1 && (imageView3 = this.fARcdN) != null) {
                imageView3.setEnabled(false);
            }
            if (C37825pCb.KWHzl.KWHzl()) {
                android.widget.ImageView imageView7 = this.fARcdN;
                if (imageView7 != null) {
                    imageView7.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.DAIeex, this.AkhnZx));
                }
                android.widget.ImageView imageView8 = this.ejfBZ;
                if (imageView8 != null) {
                    imageView8.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.RlQdEF, this.AkhnZx));
                    return;
                }
                return;
            }
            android.widget.ImageView imageView9 = this.fARcdN;
            if (imageView9 != null) {
                imageView9.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.iRxXKY, this.AkhnZx));
            }
            android.widget.ImageView imageView10 = this.ejfBZ;
            if (imageView10 != null) {
                imageView10.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.QKudOq, this.AkhnZx));
                return;
            }
            return;
        }
        android.widget.TextView textView3 = this.RcXXUw;
        if (textView3 != null) {
            int i = this.uzCIH;
            textView3.setText((i + 1) + "/" + priceWindowData.EZpvd());
        }
        android.widget.ImageView imageView11 = this.fARcdN;
        if (imageView11 != null) {
            imageView11.setEnabled(true);
        }
        android.widget.ImageView imageView12 = this.ejfBZ;
        if (imageView12 != null) {
            imageView12.setEnabled(true);
        }
        if (this.uzCIH == 0 && (imageView2 = this.fARcdN) != null) {
            imageView2.setEnabled(false);
        }
        if (this.uzCIH == priceWindowData.EZpvd() - 1 && (imageView = this.ejfBZ) != null) {
            imageView.setEnabled(false);
        }
        if (C37825pCb.KWHzl.KWHzl()) {
            android.widget.ImageView imageView13 = this.fARcdN;
            if (imageView13 != null) {
                imageView13.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.RlQdEF, this.AkhnZx));
            }
            android.widget.ImageView imageView14 = this.ejfBZ;
            if (imageView14 != null) {
                imageView14.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.DAIeex, this.AkhnZx));
                return;
            }
            return;
        }
        android.widget.ImageView imageView15 = this.fARcdN;
        if (imageView15 != null) {
            imageView15.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.QKudOq, this.AkhnZx));
        }
        android.widget.ImageView imageView16 = this.ejfBZ;
        if (imageView16 != null) {
            imageView16.setImageDrawable(C33070mpX.EZpvd(C35964oKf.Activity.iRxXKY, this.AkhnZx));
        }
    }

    public final void OLrzqt(int i) {
        android.app.Activity activityAEQbTJ;
        java.lang.String contract = this.DTwDnp.get(i).getContract();
        java.lang.String strAEQbTJ = pFI.AEQbTJ(this.DTwDnp.get(i).getKlineType());
        Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
        MarketCoinInfo marketCoinInfo = new MarketCoinInfo(contract, strAEQbTJ, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        if (C32986mnt.EZpvd.valueOf()) {
            C54819xWm c54819xWmKWHzl = C54819xWm.KWHzl();
            if (c54819xWmKWHzl == null || (activityAEQbTJ = c54819xWmKWHzl.AEQbTJ()) == null || !StringsKt__StringsKt.contains$default((java.lang.CharSequence) activityAEQbTJ.getClass().getSimpleName(), (java.lang.CharSequence) "SecurityVerifyLockScreenActivity", false, 2, (java.lang.Object) null)) {
                OLrzqt(marketCoinInfo);
                return;
            }
            return;
        }
        OLrzqt(marketCoinInfo);
    }

    public final void OLrzqt(java.util.ArrayList<PriceWindowData.PriceWindowItem> arrayList) {
        java.util.Iterator<PriceWindowData.PriceWindowItem> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        java.util.Locale locale = java.util.Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd HH:mm:ss", locale);
        java.lang.String str = simpleDateFormat.format(new Date(java.lang.System.currentTimeMillis()));
        while (it.hasNext()) {
            PriceWindowData.PriceWindowItem next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            PriceWindowData.PriceWindowItem priceWindowItem = next;
            int klineType = priceWindowItem.getKlineType();
            if (klineType != 2) {
                if (klineType != 5) {
                    continue;
                } else {
                    if (StringsKt__StringsKt.split$default((java.lang.CharSequence) priceWindowItem.getContract(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).size() < 3 || ((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) priceWindowItem.getContract(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(2)).length() < 4) {
                        return;
                    }
                    java.lang.String strSubstring = ((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) priceWindowItem.getContract(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(2)).substring(((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) priceWindowItem.getContract(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(2)).length() - 4, ((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) priceWindowItem.getContract(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(2)).length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    Intrinsics.copydefault((java.lang.Object) str);
                    java.lang.String strSubstring2 = str.substring(0, 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    java.lang.String strSubstring3 = ((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) priceWindowItem.getContract(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(2)).substring(0, 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                    if (simpleDateFormat2.parse((strSubstring2 + strSubstring3) + strSubstring + " 16:00:00").getTime() < java.lang.System.currentTimeMillis()) {
                        it.remove();
                    }
                }
            } else {
                if (priceWindowItem.getContract().length() < 4) {
                    return;
                }
                java.lang.String strSubstring4 = priceWindowItem.getContract().substring(priceWindowItem.getContract().length() - 4, priceWindowItem.getContract().length());
                Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
                Intrinsics.copydefault((java.lang.Object) str);
                java.lang.String strSubstring5 = str.substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring5, "");
                java.lang.String strSubstring6 = priceWindowItem.getContract().substring(priceWindowItem.getContract().length() - 6, priceWindowItem.getContract().length() - 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring6, "");
                if (simpleDateFormat2.parse(strSubstring5 + strSubstring6 + strSubstring4 + " 16:00:00").getTime() < java.lang.System.currentTimeMillis()) {
                    it.remove();
                }
            }
        }
        PriceWindowData.AEQbTJ.OLrzqt(arrayList);
    }

    public void gEmmrt() {
        try {
            InterfaceC58217yxC interfaceC58217yxC = this.hDKMBd;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            this.zsXlph = null;
            this.AubY = null;
            mND.EZpvd(OLrzqt);
            mND.EZpvd(copydefault);
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
        C37832pCi.KWHzl.clear();
        InterfaceC58217yxC interfaceC58217yxC2 = this.AuCTelauCTel;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    /* JADX INFO: renamed from: o.pBz$StateListAnimator */
    public static final class StateListAnimator extends AbstractC8041avJ<PriceWindowData.PriceWindowItem> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.content.Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
        }

        @Override // o.AbstractC8041avJ
        public AbstractC8033avB<?> KWHzl(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new TaskDescription(this, viewGroup);
        }

        /* JADX INFO: renamed from: o.pBz$StateListAnimator$TaskDescription */
        public final class TaskDescription extends AbstractC8033avB<PriceWindowData.PriceWindowItem> {
            public android.widget.TextView AEQbTJ;
            public android.widget.TextView EZpvd;
            public android.widget.TextView KWHzl;
            public final /* synthetic */ StateListAnimator OLrzqt;
            public android.widget.TextView copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull StateListAnimator stateListAnimator, android.view.ViewGroup viewGroup) {
                super(viewGroup, C35964oKf.Application.DCUTEIdCUTEI);
                Intrinsics.checkNotNullParameter(viewGroup, "");
                this.OLrzqt = stateListAnimator;
                android.view.View viewAEQbTJ = AEQbTJ(C35964oKf.StateListAnimator.setShuffleMode);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ, "");
                this.AEQbTJ = (android.widget.TextView) viewAEQbTJ;
                android.view.View viewAEQbTJ2 = AEQbTJ(C35964oKf.StateListAnimator.release);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ2, "");
                this.EZpvd = (android.widget.TextView) viewAEQbTJ2;
                android.view.View viewAEQbTJ3 = AEQbTJ(C35964oKf.StateListAnimator.prepareFromMediaId);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ3, "");
                this.copydefault = (android.widget.TextView) viewAEQbTJ3;
                android.view.View viewAEQbTJ4 = AEQbTJ(C35964oKf.StateListAnimator.fromMediaMetadata);
                Intrinsics.checkNotNullExpressionValue(viewAEQbTJ4, "");
                this.KWHzl = (android.widget.TextView) viewAEQbTJ4;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)V */
            /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
            @Override // o.AbstractC8033avB
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void OLrzqt(@NotNull PriceWindowData.PriceWindowItem priceWindowItem) {
                Intrinsics.checkNotNullParameter(priceWindowItem, "");
                PriceWindowData priceWindowData = PriceWindowData.AEQbTJ;
                if (priceWindowData.AhwBna() == 0) {
                    this.AEQbTJ.setTextSize(8.0f);
                    this.copydefault.setTextSize(8.0f);
                    this.EZpvd.setTextSize(8.0f);
                    this.KWHzl.setTextSize(8.0f);
                } else if (priceWindowData.AhwBna() == 1) {
                    this.AEQbTJ.setTextSize(10.0f);
                    this.copydefault.setTextSize(10.0f);
                    this.EZpvd.setTextSize(10.0f);
                    this.KWHzl.setTextSize(10.0f);
                } else {
                    this.AEQbTJ.setTextSize(12.0f);
                    this.copydefault.setTextSize(12.0f);
                    this.EZpvd.setTextSize(12.0f);
                    this.KWHzl.setTextSize(12.0f);
                }
                if (priceWindowData.djBIcL()) {
                    this.KWHzl.setVisibility(0);
                } else {
                    this.KWHzl.setVisibility(8);
                }
                if (C59449zhJ.startsWith$default(priceWindowItem.getChangePercent(), Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
                    this.AEQbTJ.setTextColor(AbstractC37822pBz.AhwBna);
                    this.KWHzl.setTextColor(AbstractC37822pBz.AhwBna);
                } else {
                    this.AEQbTJ.setTextColor(AbstractC37822pBz.valueOf);
                    this.KWHzl.setTextColor(AbstractC37822pBz.valueOf);
                }
                this.AEQbTJ.setText(priceWindowItem.getPrice());
                this.KWHzl.setText(priceWindowItem.getChangePercent());
                android.widget.TextView textView = this.copydefault;
                C37825pCb c37825pCb = C37825pCb.KWHzl;
                textView.setTextColor(c37825pCb.copydefault());
                this.EZpvd.setTextColor(c37825pCb.copydefault());
                java.lang.String displayId = priceWindowItem.getDisplayId();
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) displayId)) {
                    displayId = null;
                }
                if (displayId == null) {
                    displayId = priceWindowItem.getContract();
                }
                if (!Intrinsics.EZpvd((java.lang.Object) this.copydefault.getText(), (java.lang.Object) pFI.copydefault(priceWindowItem.getKlineType(), displayId))) {
                    if (priceWindowItem.getKlineType() == 1) {
                        android.content.Context contextKWHzl = KWHzl();
                        Intrinsics.checkNotNullExpressionValue(contextKWHzl, "");
                        if (C55296xhK.OLrzqt(contextKWHzl)) {
                            java.lang.String contract = priceWindowItem.getContract();
                            java.lang.String strEZpvd = contract != null ? C48914uef.EZpvd.EZpvd(contract) : null;
                            java.lang.String strKWHzl = displayId != null ? C48914uef.EZpvd.KWHzl(displayId) : null;
                            this.copydefault.setText(strKWHzl + "/" + strEZpvd);
                        } else {
                            this.copydefault.setText(pFI.copydefault(priceWindowItem.getKlineType(), displayId));
                        }
                    }
                }
                if (priceWindowItem.getKlineType() == 1) {
                    this.EZpvd.setVisibility(8);
                } else if (priceWindowItem.getKlineType() == 0) {
                    java.lang.String leverage = priceWindowItem.getLeverage();
                    if (leverage == null || leverage.length() == 0) {
                        this.EZpvd.setVisibility(8);
                    } else {
                        this.EZpvd.setVisibility(0);
                        this.EZpvd.setText(priceWindowItem.getLeverage() + "x");
                    }
                } else {
                    this.EZpvd.setVisibility(0);
                    this.EZpvd.setText(pFI.AEQbTJ(priceWindowItem.getKlineType(), priceWindowItem.getContract(), priceWindowItem.isPreMarket()));
                }
                super.OLrzqt(priceWindowItem);
            }
        }
    }
}
