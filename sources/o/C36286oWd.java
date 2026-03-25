package o;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.VectorDrawable;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.kline.data.KlineDexAvgDataBean;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.layout.ChartArea;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import o.C32392mcI;
import o.C52761wXj;
import org.slf4j.Marker;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.oWd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36286oWd extends AbstractC36301oWs {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public int AhwBna;
    public final int AkhnZx;
    public final int AuCTel;
    public final java.util.HashMap<InterfaceC39510pth, android.graphics.Point> AuCTelauCTel;
    public VectorDrawable AubY;
    public final int AwvSrB;
    public final int AxsJAY;
    public RectF AxsJAYaxsJAY;
    public final android.graphics.Paint AxsJAYsNCnLh;
    public RectF DAIeex;
    public final android.graphics.Path DBxZfM;
    public java.lang.String DCJXGO;
    public int DCUTEI;
    public final android.graphics.Paint DCUTEIdCUTEI;
    public final android.graphics.Paint DCUTEIddSDPG;
    public final android.graphics.Paint DGOPHZ;
    public final java.util.ArrayList<java.lang.Integer> DGOPHZDGOPHZ;
    public final android.content.res.Resources DGUQLI;
    public final java.util.HashMap<java.lang.String, java.lang.String> DGgnkA;
    public int DLWbHP;
    public final RectF DNMMPQ;
    public final int DTwDnp;
    public final android.graphics.Paint DWgRXt;
    public final android.graphics.Paint DXXBbs;
    public final java.util.HashMap<java.lang.Object, android.graphics.Point> DaRZkR;
    public final android.graphics.Paint DarRvM;
    public VectorDrawable DbNXlk;
    public final android.graphics.Paint DcqEDu;
    public final int Dmq;
    public final java.lang.StringBuilder DsrFlB;
    public java.lang.String EZpvd;
    public final android.graphics.Paint KDccX;
    public final java.lang.String KWHzl;
    public final android.graphics.Paint OBJEWx;
    public final android.graphics.Paint ODWQjV;
    public int ODXsMY;
    public int OFhtUX;
    public int OHqIaq;
    public int OJuSTm;
    public final java.lang.String OLrzqt;
    public final int ORxRYg;
    public final android.graphics.Point OTwTPd;
    public final int OcIXYQ;
    public final android.graphics.Paint OqFWZa;
    public final int OuxcSI;
    public int OxVOHk;
    public int QCjLjM;
    public final android.graphics.Paint QDqgQU;
    public int QHmsKR;
    public final android.graphics.Paint QIZEnU;
    public final int QKVWgx;
    public final android.graphics.Paint QKudOq;
    public final int QOLQEE;
    public int QSBOWP;
    public int QSLkRj;
    public final int QUSxYX;
    public final int QVAiDq;
    public int QVsKAR;
    public final NumberFormat QXDzTk;
    public final int QbewEr;
    public final int QfsBiF;
    public int QkdxfA;
    public final android.graphics.Paint QwvEab;
    public final int RJOkX;
    public int RKDWNf;
    public final android.graphics.Paint RKcVTr;
    public final android.graphics.Paint RVsVBY;
    public final android.graphics.Paint RXzakW;
    public final int RcXXUw;
    public int RdAHlO;
    public final android.graphics.Paint RlQdEF;
    public final android.graphics.Paint TarCU;
    public final android.graphics.Paint ULRxlR;
    public final android.graphics.Paint USBtdM;
    public com.okinc.kline.library.data.DataSource UeEOUB;
    public final android.graphics.Paint Ufzxmz;
    public final android.graphics.Paint UhxbNG;
    public final android.graphics.Paint UlJrfe;
    public final android.graphics.Paint UrRBLY;
    public final android.graphics.Paint UscePu;
    public final android.graphics.Paint WS;
    public final android.graphics.Paint aHXSQp;
    public final android.graphics.Paint aJFbMH;
    public boolean aKErDB;
    public final android.graphics.Paint aUsmxb;
    public RectF accept;
    public final android.graphics.Paint akftKQ;
    public final android.graphics.Paint alsFma;
    public final java.util.HashMap<KlineOpenOrderBean, android.graphics.Point> apNbdB;
    public final android.graphics.Paint call;
    public int dHguZz;
    public final float dLBcXg;
    public final android.graphics.drawable.Drawable dNCPSb;
    public final android.graphics.Paint dUDNAs;
    public final int djBIcL;
    public final int djSkpj;
    public int dmfpNf;
    public final C36246oUr dvImUD;
    public boolean dvKsVJ;
    public android.view.LayoutInflater dxcTrN;
    public final android.graphics.drawable.Drawable ejfBZ;
    public android.view.View fARcdN;
    public int fERRXa;
    public final android.graphics.Paint fFgQHt;
    public final android.graphics.Paint fHqPtx;
    public final int fIwbmz;
    public final android.graphics.drawable.Drawable fJNWhG;
    public final android.graphics.Paint fLIjIY;
    public final android.graphics.Paint fXHmeK;
    public int fZBcTu;
    public final android.graphics.Paint fdOvFl;
    public double fetchVPNInfo;
    public final android.graphics.Paint ffGIBT;
    public final android.graphics.drawable.Drawable finit;
    public final android.graphics.Paint fjfviF;
    public final android.graphics.Paint flVtFt;
    public final android.graphics.drawable.Drawable fsSxsn;
    public final android.graphics.Paint fvQaOB;
    public final int gEmmrt;
    public final android.graphics.Paint gGvvIC;
    public final int gHZMYf;
    public boolean gSBher;
    public final android.graphics.drawable.Drawable gUEfcq;
    public final android.graphics.Paint gasjUx;
    public final float[] getFieldNames;
    public final float[] getNewProxyInstance;
    public final int getPostValueLengthLimit;
    public final android.graphics.Paint giSNqX;
    public RectF gkJEwt;
    public final RectF gmHjFq;
    public int gwTjWJ;
    public int hBpjJd;
    public final android.graphics.Paint hCLrkq;
    public android.view.View hDKMBd;
    public final android.graphics.Paint hUfVAv;
    public int heceqZ;
    public oWC hlkKmr;
    public int hrNTAI;
    public final int htlTjW;
    public VectorDrawable hvKCwS;
    public VectorDrawable iPSTqm;
    public RectF iRxXKY;
    public final android.graphics.Paint iZzfmt;
    public int igXuih;
    public final int isConnected;
    public android.view.View iwGUEr;
    public final android.graphics.drawable.Drawable ixgjPv;
    public final android.graphics.Paint run;
    public final int sSMYrx;
    public oWK sTzBva;
    public int sVXHln;
    public int spnCvw;
    public android.util.Pair<KlineSpotAverageBean, android.graphics.Point> swzYdv;
    public C39797pzC tIwhY;
    public final float[] uzCIH;
    public C39795pzA vLaW;
    public final java.lang.String valueOf;
    public VectorDrawable values;
    public final int wlaJM;
    public oWN zAEkPU;
    public C39799pzE zDUObI;
    public int zKcAg;
    public final int zLjUOn;
    public final android.graphics.Paint zblBkD;
    public VectorDrawable zsXlph;
    public final int zuBGHE;
    public final android.graphics.Paint zuWLRA;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.Point AkhnZx() {
        return this.OTwTPd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF AuCTel() {
        return this.DNMMPQ;
    }

    public C36286oWd(java.lang.String str) {
        super(str);
        this.valueOf = "buy";
        this.AYXKKw = "sell";
        this.isConnected = 255;
        this.gEmmrt = CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256;
        this.djBIcL = 204;
        this.AhwBna = 77;
        this.gmHjFq = new RectF();
        this.DBxZfM = new android.graphics.Path();
        this.DNMMPQ = new RectF();
        this.OTwTPd = new android.graphics.Point();
        this.DGOPHZDGOPHZ = new java.util.ArrayList<>(20);
        this.DaRZkR = new java.util.HashMap<>(20);
        this.DsrFlB = new java.lang.StringBuilder();
        this.DGgnkA = new java.util.HashMap<>(8);
        this.zKcAg = 0;
        this.values = null;
        this.hvKCwS = null;
        this.zsXlph = null;
        this.AubY = null;
        this.iPSTqm = null;
        this.DbNXlk = null;
        this.AuCTelauCTel = new java.util.HashMap<>(16);
        this.apNbdB = new java.util.HashMap<>(16);
        this.swzYdv = null;
        this.gSBher = false;
        this.KWHzl = "   ";
        this.OLrzqt = Marker.ANY_NON_NULL_MARKER;
        this.fetchVPNInfo = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.dvKsVJ = true;
        this.aKErDB = false;
        this.wlaJM = AbstractC36302oWt.copydefault(11.0f);
        this.DCJXGO = "";
        this.iRxXKY = null;
        this.RKDWNf = -1;
        this.QSBOWP = -1;
        this.QHmsKR = -1;
        this.DCUTEI = -1;
        this.gkJEwt = null;
        this.RdAHlO = -1;
        this.OFhtUX = -1;
        this.DLWbHP = -1;
        this.dmfpNf = -1;
        this.AxsJAYaxsJAY = null;
        this.gwTjWJ = -1;
        this.dHguZz = -1;
        this.hBpjJd = -1;
        this.QkdxfA = -1;
        this.DAIeex = null;
        this.QCjLjM = -1;
        this.OxVOHk = -1;
        this.OJuSTm = -1;
        this.OHqIaq = -1;
        this.accept = null;
        this.ODXsMY = -1;
        this.QVsKAR = -1;
        this.QSLkRj = -1;
        this.hrNTAI = -1;
        NumberFormat numberInstance = NumberFormat.getNumberInstance(java.util.Locale.US);
        this.QXDzTk = numberInstance;
        numberInstance.setGroupingUsed(false);
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        this.dvImUD = c36246oUrCopydefault;
        android.content.res.Resources resources = c36246oUrCopydefault.AubY().getApplicationContext().getResources();
        this.DGUQLI = resources;
        this.DCJXGO = resources.getString(C32392mcI.Dialog.AxsJAYsNCnLh);
        this.fERRXa = AbstractC36302oWt.copydefault(4.0f);
        this.igXuih = AbstractC36302oWt.copydefault(4.0f);
        this.spnCvw = AbstractC36302oWt.copydefault(16.0f);
        this.htlTjW = AbstractC36302oWt.copydefault(20.0f);
        this.heceqZ = AbstractC36302oWt.copydefault(2.0f);
        this.Dmq = AbstractC36302oWt.copydefault(4.0f);
        this.fIwbmz = AbstractC36302oWt.copydefault(14.0f);
        float f = this.heceqZ;
        this.getFieldNames = new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
        this.uzCIH = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.getNewProxyInstance = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
        int iCopydefault = AbstractC36302oWt.copydefault(0.5f);
        this.QVAiDq = iCopydefault;
        int iCopydefault2 = AbstractC36302oWt.copydefault(1.0f);
        this.zLjUOn = iCopydefault2;
        this.AxsJAY = AbstractC36302oWt.copydefault(2.0f);
        this.DTwDnp = AbstractC36302oWt.copydefault(3.0f);
        this.ORxRYg = AbstractC36302oWt.copydefault(4.0f);
        this.RJOkX = AbstractC36302oWt.copydefault(6.0f);
        this.QUSxYX = AbstractC36302oWt.copydefault(7.0f);
        this.QbewEr = AbstractC36302oWt.copydefault(8.0f);
        this.QfsBiF = AbstractC36302oWt.copydefault(9.0f);
        this.AwvSrB = AbstractC36302oWt.copydefault(12.0f);
        this.zuBGHE = AbstractC36302oWt.copydefault(16.0f);
        this.gHZMYf = AbstractC36302oWt.copydefault(20.0f);
        this.sSMYrx = AbstractC36302oWt.copydefault(22.0f);
        this.OcIXYQ = AbstractC36302oWt.copydefault(26.0f);
        this.QKVWgx = AbstractC36302oWt.copydefault(30.0f);
        this.QOLQEE = AbstractC36302oWt.copydefault(32.0f);
        this.AuCTel = AbstractC36302oWt.copydefault(2.0f);
        this.RcXXUw = AbstractC36302oWt.copydefault(4.0f);
        this.djSkpj = AbstractC36302oWt.copydefault(4.0f);
        this.AkhnZx = AbstractC36302oWt.copydefault(16.0f);
        this.DGUQLIOvDItG = AbstractC36302oWt.copydefault(6.0f);
        this.DTg = AbstractC36302oWt.copydefault(4.0f);
        this.OuxcSI = AbstractC36302oWt.copydefault(18.0f);
        this.getPostValueLengthLimit = AbstractC36302oWt.copydefault(18.0f);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.fFgQHt = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.flVtFt = paint2;
        paint2.setStyle(style);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.giSNqX = paint3;
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.fvQaOB = paint4;
        paint4.setStyle(style);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.gGvvIC = paint5;
        paint5.setStyle(style);
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.gasjUx = paint6;
        paint6.setStyle(style);
        android.graphics.Paint paint7 = new android.graphics.Paint();
        this.iZzfmt = paint7;
        paint7.setStyle(style);
        android.graphics.Paint paint8 = new android.graphics.Paint();
        this.ffGIBT = paint8;
        paint8.setStyle(style);
        android.graphics.Paint paint9 = new android.graphics.Paint();
        this.QKudOq = paint9;
        Paint.Style style2 = Paint.Style.STROKE;
        paint9.setStyle(style2);
        float f2 = iCopydefault2;
        paint9.setStrokeWidth(f2);
        paint9.setPathEffect(this.getPriority);
        android.graphics.Paint paint10 = new android.graphics.Paint();
        this.hUfVAv = paint10;
        paint10.setStyle(style);
        android.graphics.Paint paint11 = new android.graphics.Paint();
        this.WS = paint11;
        paint11.setStyle(style2);
        android.graphics.Paint paint12 = new android.graphics.Paint();
        this.DGOPHZ = paint12;
        Paint.Style style3 = Paint.Style.FILL_AND_STROKE;
        paint12.setStyle(style3);
        paint12.setStrokeWidth(f2);
        android.graphics.Paint paint13 = new android.graphics.Paint();
        this.RKcVTr = paint13;
        paint13.setStyle(style2);
        android.graphics.Paint paint14 = new android.graphics.Paint();
        this.AxsJAYsNCnLh = paint14;
        paint14.setStyle(style2);
        android.graphics.Paint paint15 = new android.graphics.Paint();
        this.USBtdM = paint15;
        paint15.setStyle(style2);
        paint15.setPathEffect(this.gtCCJH);
        android.graphics.Paint paint16 = new android.graphics.Paint();
        this.ODWQjV = paint16;
        paint16.setStyle(style2);
        paint16.setStrokeWidth(f2);
        paint16.setPathEffect(this.gtCCJH);
        android.graphics.Paint paint17 = new android.graphics.Paint();
        this.zblBkD = paint17;
        paint17.setStyle(style2);
        paint17.setStrokeWidth(f2);
        paint17.setPathEffect(this.gtCCJH);
        android.graphics.Paint paint18 = new android.graphics.Paint();
        this.dUDNAs = paint18;
        paint18.setStyle(style2);
        paint18.setStrokeWidth(f2);
        paint18.setPathEffect(this.gtCCJH);
        android.graphics.Paint paint19 = new android.graphics.Paint();
        this.OqFWZa = paint19;
        paint19.setAntiAlias(true);
        paint19.setStyle(style);
        android.graphics.Paint paint20 = new android.graphics.Paint();
        this.DXXBbs = paint20;
        paint20.setAntiAlias(true);
        paint20.setStyle(style);
        android.graphics.Paint paint21 = new android.graphics.Paint();
        this.QDqgQU = paint21;
        paint21.setAntiAlias(true);
        paint21.setStyle(style2);
        paint21.setStrokeWidth(f2);
        android.graphics.Paint paint22 = new android.graphics.Paint();
        this.UlJrfe = paint22;
        paint22.setAntiAlias(true);
        paint22.setStyle(style2);
        paint22.setStrokeWidth(AbstractC36302oWt.copydefault(0.5f));
        android.graphics.Paint paint23 = new android.graphics.Paint();
        this.QwvEab = paint23;
        paint23.setAntiAlias(true);
        paint23.setStyle(style2);
        paint23.setStrokeWidth(f2);
        android.graphics.Paint paint24 = new android.graphics.Paint();
        this.RVsVBY = paint24;
        paint24.setAntiAlias(true);
        paint24.setStyle(style);
        android.graphics.Paint paint25 = new android.graphics.Paint();
        this.aUsmxb = paint25;
        paint25.setAntiAlias(true);
        paint25.setStyle(style2);
        paint25.setStrokeWidth(AbstractC36302oWt.copydefault(0.5f));
        paint25.setPathEffect(this.getPriority);
        android.graphics.Paint paint26 = new android.graphics.Paint();
        this.DarRvM = paint26;
        paint26.setAntiAlias(true);
        paint26.setStyle(style2);
        paint26.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        this.fERRXa = AbstractC36302oWt.copydefault(4.0f);
        this.igXuih = AbstractC36302oWt.copydefault(4.0f);
        this.spnCvw = AbstractC36302oWt.copydefault(16.0f);
        this.heceqZ = AbstractC36302oWt.copydefault(2.0f);
        android.graphics.Paint paint27 = new android.graphics.Paint();
        this.fjfviF = paint27;
        paint27.setAntiAlias(true);
        paint27.setStyle(style);
        paint27.setStrokeWidth(f2);
        paint27.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        C55051xce c55051xce = C55051xce.OLrzqt;
        paint27.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint28 = new android.graphics.Paint();
        this.DCUTEIdCUTEI = paint28;
        paint28.setAntiAlias(true);
        paint28.setStyle(style);
        paint28.setStrokeWidth(AbstractC36302oWt.copydefault(0.5f));
        paint28.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint28.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint29 = new android.graphics.Paint();
        this.OBJEWx = paint29;
        paint29.setStrokeWidth(f2);
        paint29.setStyle(style2);
        android.graphics.Paint paint30 = new android.graphics.Paint();
        this.QIZEnU = paint30;
        paint30.setAntiAlias(true);
        Paint.Align align = Paint.Align.RIGHT;
        paint30.setTextAlign(align);
        paint30.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint30.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint31 = new android.graphics.Paint();
        this.aJFbMH = paint31;
        paint31.setAntiAlias(true);
        paint31.setTextAlign(Paint.Align.CENTER);
        paint31.setTextSize(AbstractC36302oWt.KWHzl(9.0f));
        paint31.setTypeface(c55051xce.AEQbTJ("harmony_sans_medium.ttf"));
        android.graphics.Paint paint32 = new android.graphics.Paint();
        this.RlQdEF = paint32;
        paint32.setAntiAlias(true);
        paint32.setTextAlign(align);
        paint32.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint32.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint33 = new android.graphics.Paint();
        this.zuWLRA = paint33;
        paint33.setAntiAlias(true);
        paint33.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint33.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint34 = new android.graphics.Paint();
        this.fLIjIY = paint34;
        paint34.setAntiAlias(true);
        paint34.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint34.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint35 = new android.graphics.Paint();
        this.ULRxlR = paint35;
        paint35.setAntiAlias(true);
        paint35.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint35.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint36 = new android.graphics.Paint();
        this.Ufzxmz = paint36;
        paint36.setAntiAlias(true);
        paint36.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint36.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint37 = new android.graphics.Paint();
        this.UhxbNG = paint37;
        paint37.setAntiAlias(true);
        paint37.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint37.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint38 = new android.graphics.Paint();
        this.RXzakW = paint38;
        paint38.setAntiAlias(true);
        paint38.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint38.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint39 = new android.graphics.Paint();
        this.aHXSQp = paint39;
        paint39.setAntiAlias(true);
        paint39.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint39.setColor(-1);
        paint39.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint40 = new android.graphics.Paint();
        this.alsFma = paint40;
        paint40.setAntiAlias(true);
        paint40.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint40.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint41 = new android.graphics.Paint();
        this.TarCU = paint41;
        paint41.setAntiAlias(true);
        paint41.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint41.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint42 = new android.graphics.Paint();
        this.akftKQ = paint42;
        paint42.setAntiAlias(true);
        paint42.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint42.setTypeface(c55051xce.valueOf());
        android.graphics.Paint paint43 = new android.graphics.Paint();
        this.UscePu = paint43;
        paint43.setAntiAlias(true);
        paint43.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        paint43.setTypeface(c55051xce.valueOf());
        this.dLBcXg = (-(((int) java.lang.Math.ceil(r1.bottom - r1.top)) >> 1)) - paint30.getFontMetrics().top;
        android.graphics.Paint paint44 = new android.graphics.Paint();
        this.call = paint44;
        paint44.setAntiAlias(true);
        paint44.setStyle(style2);
        paint44.setStrokeWidth(iCopydefault);
        android.graphics.Paint paint45 = new android.graphics.Paint();
        this.fHqPtx = paint45;
        paint45.setAntiAlias(true);
        paint45.setStyle(style2);
        paint45.setStrokeWidth(AbstractC36302oWt.copydefault(0.5f));
        android.graphics.Paint paint46 = new android.graphics.Paint();
        this.hCLrkq = paint46;
        paint46.setStyle(style);
        android.graphics.Paint paint47 = new android.graphics.Paint();
        this.KDccX = paint47;
        paint47.setAntiAlias(true);
        paint47.setStyle(style2);
        paint47.setStrokeWidth(AbstractC36302oWt.copydefault(0.5f));
        android.graphics.Paint paint48 = new android.graphics.Paint();
        this.UrRBLY = paint48;
        paint48.setAntiAlias(true);
        paint48.setStyle(style2);
        paint48.setStrokeWidth(AbstractC36302oWt.copydefault(0.5f));
        android.graphics.Paint paint49 = new android.graphics.Paint();
        this.run = paint49;
        paint49.setStyle(style3);
        android.graphics.Paint paint50 = new android.graphics.Paint();
        this.DWgRXt = paint50;
        paint50.setAntiAlias(true);
        paint50.setStyle(style2);
        paint50.setStrokeWidth(AbstractC36302oWt.copydefault(0.5f));
        android.graphics.Paint paint51 = new android.graphics.Paint();
        this.DCUTEIddSDPG = paint51;
        paint51.setAntiAlias(true);
        paint51.setStyle(style2);
        paint51.setStrokeWidth(AbstractC36302oWt.copydefault(0.5f));
        android.graphics.Paint paint52 = new android.graphics.Paint();
        this.fdOvFl = paint52;
        paint52.setAntiAlias(true);
        paint52.setTextSize(AbstractC36302oWt.KWHzl(10.0f));
        android.graphics.Paint paint53 = new android.graphics.Paint();
        this.DcqEDu = paint53;
        paint53.setAntiAlias(true);
        paint53.setStyle(style2);
        paint53.setStrokeWidth(AbstractC36302oWt.copydefault(0.5f));
        paint53.setPathEffect(this.gtCCJH);
        android.graphics.Paint paint54 = new android.graphics.Paint();
        this.fXHmeK = paint54;
        paint54.setAntiAlias(true);
        paint54.setStyle(style);
        this.fsSxsn = C33070mpX.KWHzl(C32392mcI.Activity.djBIcL);
        this.dNCPSb = C33070mpX.KWHzl(C52761wXj.TaskDescription.iHkeWl);
        this.fJNWhG = C33070mpX.KWHzl(C52761wXj.TaskDescription.dvImUD);
        this.finit = C33070mpX.KWHzl(C32392mcI.Activity.OLrzqt);
        this.ixgjPv = C33070mpX.KWHzl(C52761wXj.TaskDescription.DGUQLI);
        this.ejfBZ = C33070mpX.KWHzl(C32392mcI.Activity.EZpvd);
        this.DGUQLIDGUQLI = C37891pEn.AEQbTJ.OLrzqt(C36246oUr.copydefault().AubY(), C32392mcI.Activity.fARcdN, false);
        this.getLabel = C33070mpX.KWHzl(C32392mcI.Activity.iwGUEr);
        this.gUEfcq = ContextCompat.getDrawable(C36246oUr.copydefault().AubY(), C52761wXj.TaskDescription.DRuYWY);
        this.AEQbTJ = C36246oUr.copydefault().AubY().getResources().getString(C32392mcI.Dialog.DWgRXt) + " ";
    }

    @Override // o.AbstractC36302oWt
    public void KWHzl() {
        this.QXDzTk.setMaximumFractionDigits(C36246oUr.copydefault().gkJEwt());
        this.QXDzTk.setMinimumFractionDigits(C36246oUr.copydefault().gkJEwt());
    }

    @Override // o.AbstractC36302oWt
    public void OLrzqt(oWK owk) {
        this.zDUObI = null;
        this.tIwhY = null;
        this.fZBcTu = this.DGUQLI.getColor(C52761wXj.Activity.QKudOq);
        this.giSNqX.setColor(owk.copydefault());
        this.giSNqX.setAlpha(204);
        this.Ufzxmz.setColor(owk.AuCTelauCTel());
        this.gasjUx.setColor(owk.OLrzqt());
        this.QwvEab.setColor(owk.KWHzl());
        this.RXzakW.setColor(owk.AuCTel());
        this.fXHmeK.setColor(owk.zLjUOn());
        this.fFgQHt.setColor(owk.OLrzqt());
        this.DarRvM.setColor(owk.AubY());
        this.QKudOq.setColor(owk.EZpvd(6));
        this.fjfviF.setColor(owk.EZpvd(11));
        this.zuWLRA.setColor(owk.OLrzqt());
        this.OBJEWx.setColor(owk.getFieldNames());
        this.zblBkD.setColor(owk.wlaJM());
        this.QIZEnU.setColor(owk.hDKMBd());
        this.RlQdEF.setColor(owk.hDKMBd());
        this.call.setColor(owk.EZpvd(6));
        this.fLIjIY.setColor(owk.getNewProxyInstance());
        this.fHqPtx.setColor(owk.getNewProxyInstance());
        this.hCLrkq.setColor(owk.OLrzqt());
        this.DCUTEIdCUTEI.setColor(owk.getNewProxyInstance());
        this.iZzfmt.setColor(owk.OLrzqt());
        VectorDrawable vectorDrawable = (VectorDrawable) ContextCompat.getDrawable(C36246oUr.copydefault().AubY(), C32392mcI.Activity.AYXKKw);
        this.zOIQXb = vectorDrawable;
        if (vectorDrawable != null) {
            vectorDrawable.setTint(owk.getNewProxyInstance());
        }
        if (Objects.equals(C36246oUr.copydefault().fZBcTu(), "defi_mode_dex") || Objects.equals(C36246oUr.copydefault().fZBcTu(), "lite_mode")) {
            this.zsXlph = (VectorDrawable) ContextCompat.getDrawable(C36246oUr.copydefault().AubY(), C32392mcI.Activity.fJNWhG);
            this.AubY = (VectorDrawable) ContextCompat.getDrawable(C36246oUr.copydefault().AubY(), C32392mcI.Activity.valueOf);
            this.iPSTqm = (VectorDrawable) C33070mpX.KWHzl(C32392mcI.Activity.copydefault);
            this.DbNXlk = (VectorDrawable) C33070mpX.KWHzl(C32392mcI.Activity.AkhnZx);
            this.zsXlph.setTint(owk.fJNWhG());
            this.AubY.setTint(owk.fIwbmz());
            this.iPSTqm.setTint(owk.fJNWhG());
            this.DbNXlk.setTint(owk.fIwbmz());
            return;
        }
        this.hvKCwS = (VectorDrawable) ContextCompat.getDrawable(C36246oUr.copydefault().AubY(), C32392mcI.Activity.fJNWhG);
        this.values = (VectorDrawable) ContextCompat.getDrawable(C36246oUr.copydefault().AubY(), C32392mcI.Activity.valueOf);
        this.hvKCwS.setTint(owk.fJNWhG());
        this.values.setTint(owk.fIwbmz());
        if (C33512mxp.AEQbTJ.AYXKKw() == 1) {
            this.hUfVAv.setColor(owk.AhwBna());
        } else {
            this.hUfVAv.setColor(Color.parseColor("#ffffff"));
        }
    }

    @Override // o.AbstractC36302oWt
    public void AEQbTJ(android.graphics.Canvas canvas) {
        oWC owc;
        boolean z;
        boolean zKWHzl;
        boolean zGEmmrt;
        boolean zBooleanValue = false;
        this.aKErDB = false;
        this.dvImUD.AYXKKw();
        this.AuCTelauCTel.clear();
        this.swzYdv = null;
        this.apNbdB.clear();
        this.zAEkPU = this.dvImUD.DCJXGO().get(copydefault());
        this.hlkKmr = this.dvImUD.iwGUEr().QVAiDq().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        this.UeEOUB = this.dvImUD.zLjUOn().getDataSources().get(copydefault());
        this.sTzBva = C36246oUr.copydefault().zLjUOn().getThemes().get(copydefault());
        this.gSBher = false;
        com.okinc.kline.library.data.DataSource dataSource = this.UeEOUB;
        if (dataSource == null || dataSource.gEmmrt() < 1 || this.zAEkPU == null || (owc = this.hlkKmr) == null || this.sTzBva == null) {
            return;
        }
        this.dvImUD.AEQbTJ((owc.uzCIH() - this.hlkKmr.fIwbmz()) + AbstractC36302oWt.copydefault(12.0f));
        this.dvKsVJ = AkhnZx(canvas);
        this.dvImUD.iwGUEr().OLrzqt(isConnected());
        int width = canvas.getWidth();
        int i = this.zuBGHE;
        int iIsConnected = isConnected();
        int iODWQjV = this.dvImUD.ODWQjV();
        this.sVXHln = iODWQjV;
        if (iODWQjV != -1) {
            if (this.dvImUD.fJNWhG() && this.dvImUD.DWgRXt() && this.dvImUD.EZpvd(copydefault()) == 0) {
                copydefault(canvas, this.dvImUD, this.zAEkPU);
            }
            if (this.dvImUD.EZpvd(copydefault()) == 0) {
                OLrzqt(canvas, this.dvImUD);
            }
            copydefault(canvas, true);
            if (this.dvImUD.DCUTEI() == null || this.dvImUD.DCUTEI().isEmpty()) {
                zKWHzl = false;
            } else {
                AYXKKw();
                zKWHzl = KWHzl(canvas);
            }
            zGEmmrt = (this.dvImUD.zLjUOn().getKlineSpotAverageBean().getShowSpotAverageLine() && C36246oUr.copydefault().DBxZfM()) ? gEmmrt(canvas) : false;
            boolean zCopydefault = copydefault(canvas, false);
            if (this.dvImUD.ORxRYg() != null) {
                OLrzqt(canvas);
            }
            if (this.dvImUD.hCLrkq() && this.dvImUD.iRxXKY() != null && !this.dvImUD.iRxXKY().isEmpty()) {
                zBooleanValue = copydefault(canvas, (width - i) - iIsConnected).booleanValue();
            }
            z = zBooleanValue;
            zBooleanValue = zCopydefault;
        } else {
            z = false;
            zKWHzl = false;
            zGEmmrt = false;
        }
        if (!zBooleanValue && !z && !zKWHzl && !zGEmmrt) {
            djBIcL(canvas);
        }
        copydefault(canvas);
        AhwBna(canvas);
        AYXKKw(canvas);
        EZpvd(canvas);
    }

    public final boolean copydefault(android.graphics.Canvas canvas, boolean z) {
        if ((this.dvImUD.WS() || C37932pGa.AEQbTJ.AhwBna()) && this.dvImUD.gasjUx() != null && !this.dvImUD.gasjUx().isEmpty()) {
            if (z) {
                if (!((java.lang.Boolean) gEmmrt().first).booleanValue()) {
                    AYXKKw();
                    return valueOf(canvas);
                }
            } else if (((java.lang.Boolean) gEmmrt().first).booleanValue()) {
                AYXKKw();
                return valueOf(canvas);
            }
        }
        return false;
    }

    public final void djBIcL(android.graphics.Canvas canvas) {
        double dKWHzl = KWHzl(this.UeEOUB);
        oWC owc = this.hlkKmr;
        int iAhwBna = owc.AhwBna(java.lang.Math.min(java.lang.Math.max(dKWHzl, owc.AkhnZx()), this.hlkKmr.DbNXlk()));
        if (this.dvImUD.gHZMYf().equals("YScale")) {
            iAhwBna = this.hlkKmr.AhwBna(dKWHzl);
        }
        int i = iAhwBna;
        int i2 = this.spnCvw >> 1;
        int i3 = i - i2;
        int i4 = i + i2;
        int width = canvas.getWidth() - this.zuBGHE;
        int iIsConnected = width - isConnected();
        if (this.dvImUD.gHZMYf().equals("YScale")) {
            if (this.hlkKmr.KWHzl(dKWHzl, i3, i4, this.spnCvw)) {
                return;
            }
            copydefault(canvas, java.lang.Double.valueOf(dKWHzl), this.QKudOq, this.RlQdEF, iIsConnected, width, i, i3, i4);
            return;
        }
        copydefault(canvas, java.lang.Double.valueOf(dKWHzl), this.QKudOq, this.RlQdEF, iIsConnected, width, i, i3, i4);
    }

    public final void EZpvd(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable;
        ChartArea chartArea = this.dvImUD.values().get(EZpvd());
        if (chartArea == null) {
            return;
        }
        android.graphics.drawable.Drawable drawable2 = this.ejfBZ;
        if (this.dvImUD.iwGUEr().giSNqX()) {
            drawable = this.dvImUD.gwTjWJ() ? this.dNCPSb : this.fJNWhG;
        } else {
            drawable = this.finit;
        }
        if (EZpvd().endsWith(com.ibm.icu.text.DateFormat.MINUTE) && C34704nhP.copydefault.copydefault()) {
            if (C36246oUr.copydefault().Dmq()) {
                float fAYXKKw = chartArea.AYXKKw() + this.zuBGHE + this.fIwbmz;
                float fKWHzl = chartArea.KWHzl() - this.sSMYrx;
                int i = this.fIwbmz;
                float f = i;
                int i2 = (int) (fAYXKKw - f);
                int i3 = (int) (fKWHzl - f);
                int i4 = (int) (f + fAYXKKw);
                int i5 = ((int) fKWHzl) + i;
                drawable2.setAlpha(190);
                drawable2.setBounds(i2, i3, i4, i5);
                drawable2.draw(canvas);
                float f2 = this.getPostValueLengthLimit / 2;
                float f3 = this.OuxcSI / 2;
                drawable.setBounds((int) (fAYXKKw - f2), (int) (fKWHzl - f3), (int) (fAYXKKw + f2), (int) (fKWHzl + f3));
                drawable.draw(canvas);
                C36246oUr c36246oUr = this.dvImUD;
                int i6 = this.ORxRYg;
                int i7 = this.QbewEr;
                c36246oUr.AEQbTJ(AEQbTJ(i2 - i6, i3 - i6, i4 + i7, i5 + i7));
                return;
            }
            this.dvImUD.AEQbTJ((RectF) null);
        }
    }

    public final void copydefault(android.graphics.Canvas canvas, java.lang.Double d, android.graphics.Paint paint, android.graphics.Paint paint2, int i, int i2, int i3, int i4, int i5) {
        if (this.dvImUD.KDccX() || this.dvImUD.zLjUOn().isShowCountdown()) {
            android.graphics.Path pathValues = values();
            if (this.dvImUD.iwGUEr().ejfBZ() == d.doubleValue() || d.doubleValue() > this.hlkKmr.DbNXlk() || d.doubleValue() < this.hlkKmr.AkhnZx()) {
                this.fetchVPNInfo = d.doubleValue();
                KWHzl(canvas, pathValues, paint, paint2, i2 - isConnected(), i2, i3, i4, i5);
                return;
            }
            int iAhwBna = (int) (this.hlkKmr.AhwBna(this.dvImUD.iwGUEr().ejfBZ()) + ((i3 - this.hlkKmr.AhwBna(this.dvImUD.iwGUEr().ejfBZ())) * this.dvImUD.iwGUEr().EZpvd()));
            this.zlvcHA = iAhwBna;
            int i6 = this.spnCvw;
            this.fetchVPNInfo = this.dvImUD.iwGUEr().ejfBZ() + ((d.doubleValue() - this.dvImUD.iwGUEr().ejfBZ()) * ((double) this.dvImUD.iwGUEr().EZpvd()));
            int i7 = i6 >> 1;
            KWHzl(canvas, pathValues, paint, paint2, i, i2, this.zlvcHA, iAhwBna - i7, iAhwBna + i7);
        }
    }

    public final void AYXKKw() {
        if (this.dvImUD.WS() && this.dvImUD.gasjUx() != null && !this.dvImUD.gasjUx().isEmpty()) {
            int i = 0;
            while (true) {
                if (i >= this.dvImUD.gasjUx().size()) {
                    break;
                }
                if (this.dvImUD.gasjUx().get(i).getSelected()) {
                    this.gSBher = true;
                    break;
                }
                i++;
            }
        }
        if (!this.dvImUD.run() || this.dvImUD.DCUTEI() == null || this.dvImUD.DCUTEI().isEmpty() || this.gSBher) {
            return;
        }
        for (int i2 = 0; i2 < this.dvImUD.DCUTEI().size(); i2++) {
            if (this.dvImUD.DCUTEI().get(i2).getSelected()) {
                this.gSBher = true;
                return;
            }
        }
    }

    public final java.lang.Boolean copydefault(android.graphics.Canvas canvas, int i) {
        PriceWarningItemBean priceWarningItemBean = null;
        int i2 = 0;
        for (int i3 = 0; i3 < this.dvImUD.iRxXKY().size(); i3++) {
            PriceWarningItemBean priceWarningItemBean2 = this.dvImUD.iRxXKY().get(i3);
            if (priceWarningItemBean2.getSelected()) {
                i2 = i3;
                priceWarningItemBean = priceWarningItemBean2;
            } else if (priceWarningItemBean2.getPromptType() != 3 && priceWarningItemBean2.getPromptType() != 4 && priceWarningItemBean2.getActive() > 0) {
                android.graphics.Path pathValues = values();
                int iAhwBna = this.hlkKmr.AhwBna(java.lang.Double.parseDouble(priceWarningItemBean2.getPromptThreshold()));
                int width = (canvas.getWidth() - isConnected()) - this.OcIXYQ;
                if (java.lang.Double.parseDouble(priceWarningItemBean2.getPromptThreshold()) >= this.hlkKmr.AkhnZx() && java.lang.Double.parseDouble(priceWarningItemBean2.getPromptThreshold()) <= this.hlkKmr.DbNXlk()) {
                    float f = iAhwBna;
                    pathValues.moveTo(0.0f, f);
                    float f2 = width;
                    pathValues.lineTo(f2, f);
                    this.zblBkD.setColor(this.sTzBva.wlaJM());
                    canvas.drawPath(pathValues, this.zblBkD);
                    int intrinsicWidth = this.fsSxsn.getIntrinsicWidth();
                    int intrinsicHeight = this.fsSxsn.getIntrinsicHeight();
                    int i4 = width - intrinsicWidth;
                    int i5 = iAhwBna - (intrinsicHeight / 2);
                    this.fsSxsn.setBounds(i4, i5, intrinsicWidth + i4, intrinsicHeight + i5);
                    this.fsSxsn.draw(canvas);
                    LinkedHashMap<java.lang.Integer, RectF> linkedHashMapDTwDnp = this.dvImUD.iwGUEr().DTwDnp();
                    int i6 = this.QbewEr;
                    linkedHashMapDTwDnp.put(java.lang.Integer.valueOf(i3), new RectF(0.0f, iAhwBna - i6, f2, iAhwBna + i6));
                }
            }
        }
        if (priceWarningItemBean == null) {
            return java.lang.Boolean.FALSE;
        }
        djBIcL(canvas);
        KWHzl(priceWarningItemBean, i2, canvas, i);
        return java.lang.Boolean.TRUE;
    }

    public final void KWHzl(PriceWarningItemBean priceWarningItemBean, int i, android.graphics.Canvas canvas, int i2) {
        if (priceWarningItemBean.getPromptType() == 3 || priceWarningItemBean.getPromptType() == 4 || priceWarningItemBean.getActive() <= 0) {
            return;
        }
        android.graphics.Path pathValues = values();
        int iAhwBna = this.hlkKmr.AhwBna(java.lang.Double.parseDouble(priceWarningItemBean.getPromptThreshold()));
        int i3 = i2 - this.ORxRYg;
        if (java.lang.Double.parseDouble(priceWarningItemBean.getPromptThreshold()) < this.hlkKmr.AkhnZx() || java.lang.Double.parseDouble(priceWarningItemBean.getPromptThreshold()) > this.hlkKmr.DbNXlk()) {
            return;
        }
        float f = iAhwBna;
        pathValues.moveTo(0.0f, f);
        float f2 = i3;
        pathValues.lineTo(f2, f);
        this.zblBkD.setColor(this.sTzBva.zsXlph());
        canvas.drawPath(pathValues, this.zblBkD);
        java.lang.String strKWHzl = KWHzl(priceWarningItemBean.getPromptType(), priceWarningItemBean.getPromptThreshold());
        int i4 = i3 - this.AkhnZx;
        int iOLrzqt = OLrzqt(strKWHzl);
        int i5 = this.spnCvw >> 1;
        int i6 = iAhwBna - i5;
        int i7 = iAhwBna + i5;
        RectF rectFAuCTel = AuCTel();
        rectFAuCTel.set(i4 - iOLrzqt, i6, f2, i7);
        float f3 = this.heceqZ;
        canvas.drawRoundRect(rectFAuCTel, f3, f3, this.fFgQHt);
        float f4 = this.heceqZ;
        canvas.drawRoundRect(rectFAuCTel, f4, f4, this.call);
        canvas.drawText(strKWHzl, i4 - this.igXuih, f + this.dLBcXg, this.QIZEnU);
        VectorDrawable vectorDrawable = this.zOIQXb;
        int i8 = this.AkhnZx;
        int i9 = i8 / 4;
        vectorDrawable.setBounds(i9 + i4, i9 + i6, i3 - i9, (i8 + i6) - i9);
        this.zOIQXb.draw(canvas);
        copydefault(canvas, i4, i6, i7, this.call);
        this.dvImUD.iwGUEr().gEmmrt(EZpvd(i4, i6, i3, i7));
        LinkedHashMap<java.lang.Integer, RectF> linkedHashMapDTwDnp = this.dvImUD.iwGUEr().DTwDnp();
        int i10 = this.QbewEr;
        linkedHashMapDTwDnp.put(java.lang.Integer.valueOf(i), new RectF(0.0f, iAhwBna - i10, f2, iAhwBna + i10));
    }

    public final java.lang.String KWHzl(int i, java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.String> mapFIwbmz = fIwbmz();
        mapFIwbmz.put(FirebaseAnalytics.Param.PRICE, " " + AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(str)));
        if (i == 1) {
            return C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C32392mcI.Dialog.zqTOFw, mapFIwbmz);
        }
        if (i == 2) {
            return C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C32392mcI.Dialog.zlvcHA, mapFIwbmz);
        }
        return C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C32392mcI.Dialog.zhUgOk, mapFIwbmz);
    }

    public final void KWHzl(android.graphics.Canvas canvas, android.graphics.Path path, android.graphics.Paint paint, android.graphics.Paint paint2, int i, int i2, int i3, int i4, int i5) {
        int i6 = this.zuBGHE;
        if (this.dvKsVJ) {
            if (this.sVXHln < 0) {
                oWN own = this.zAEkPU;
                path.moveTo((own.gEmmrt(own.ejfBZ()) - (((int) this.zAEkPU.fJNWhG()) >> 1)) + AbstractC36302oWt.copydefault(3.0f), i3);
            } else {
                oWN own2 = this.zAEkPU;
                path.moveTo(own2.gEmmrt(own2.ejfBZ()) + AbstractC36302oWt.copydefault(3.0f), i3);
            }
            i6 = 0;
        } else {
            path.moveTo(0.0f, i3);
        }
        float f = i3;
        path.lineTo(canvas.getWidth(), f);
        canvas.drawPath(path, paint);
        int i7 = (this.dvImUD.KDccX() && this.dvImUD.zLjUOn().isShowCountdown() && !this.dvImUD.iwGUEr().RcXXUw().isEmpty()) ? (int) ((i5 + this.spnCvw) - this.dLBcXg) : i5;
        KWHzl(this.fFgQHt, this.zqTOFw);
        RectF rectFAuCTel = AuCTel();
        rectFAuCTel.set(i, i4, i2, i7);
        float f2 = this.heceqZ;
        canvas.drawRoundRect(rectFAuCTel, f2, f2, this.fFgQHt);
        float f3 = this.heceqZ;
        canvas.drawRoundRect(rectFAuCTel, f3, f3, this.call);
        if (this.dvImUD.KDccX()) {
            canvas.drawText(uzCIH(), (i2 - this.fERRXa) - i6, f + this.dLBcXg, this.QIZEnU);
            if (this.dvImUD.zLjUOn().isShowCountdown() && !this.dvImUD.iwGUEr().RcXXUw().isEmpty()) {
                canvas.drawText(this.dvImUD.iwGUEr().RcXXUw(), (i2 - this.fERRXa) - i6, i3 + this.spnCvw, paint2);
            }
        } else if (this.dvImUD.zLjUOn().isShowCountdown() && !this.dvImUD.iwGUEr().RcXXUw().isEmpty()) {
            canvas.drawText(this.dvImUD.iwGUEr().RcXXUw(), (i2 - this.fERRXa) - i6, f + this.dLBcXg, paint2);
        }
        copydefault(this.fFgQHt);
        if (!this.dvKsVJ) {
            EZpvd(canvas, i2 - i6, i4, i2, i7);
            oUE oueIwGUEr = this.dvImUD.iwGUEr();
            int i8 = this.ORxRYg;
            oueIwGUEr.djBIcL(copydefault(i - i8, i4 - i8, i2 + i8, i7 + i8));
            return;
        }
        this.dvImUD.iwGUEr().djBIcL((RectF) null);
    }

    public final void EZpvd(android.graphics.Canvas canvas, int i, int i2, int i3, int i4) {
        android.graphics.drawable.Drawable drawable = this.ixgjPv;
        int i5 = i2 + ((i4 - i2) / 2);
        int i6 = this.QUSxYX;
        drawable.setBounds(i, i5 - i6, i3 - this.AxsJAY, i5 + i6);
        this.ixgjPv.draw(canvas);
    }

    public final boolean AkhnZx(android.graphics.Canvas canvas) {
        return this.zAEkPU.AuCTelauCTel() <= ((float) canvas.getWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005a A[PHI: r0
  0x005a: PHI (r0v42 double) = (r0v9 double), (r0v9 double), (r0v9 double), (r0v33 double), (r0v33 double), (r0v9 double), (r0v9 double) binds: [B:6:0x0058, B:20:0x00a7, B:22:0x00b1, B:65:0x029b, B:68:0x02a4, B:11:0x0080, B:13:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(android.graphics.Canvas canvas) {
        int i;
        int i2;
        int i3;
        double d;
        int iGEmmrt;
        int width = canvas.getWidth() - this.zuBGHE;
        int i4 = this.ORxRYg;
        InterfaceC39506ptd interfaceC39506ptdORxRYg = this.dvImUD.ORxRYg();
        int iCopydefault = AbstractC36302oWt.copydefault(4.0f);
        com.okinc.kline.library.data.DataSource dataSource = this.UeEOUB;
        int i5 = 1;
        double dCopydefault = dataSource.AEQbTJ.get(dataSource.DbNXlk() - 1).copydefault();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        while (i10 < this.dvImUD.ORxRYg().KWHzl().size()) {
            java.lang.String str = this.dvImUD.ORxRYg().KWHzl().get(i10);
            if (!str.isEmpty() && (!C36246oUr.copydefault().gHZMYf().equals("YScale") || ((iGEmmrt = this.hlkKmr.gEmmrt(java.lang.Double.parseDouble(str))) >= this.hlkKmr.uzCIH() && iGEmmrt <= this.hlkKmr.gEmmrt()))) {
                if (!this.dvImUD.zblBkD() || this.dvImUD.hUfVAv() == i5) {
                    double d2 = java.lang.Double.parseDouble(str);
                    if (d2 >= this.hlkKmr.DbNXlk() || d2 <= this.hlkKmr.AkhnZx()) {
                        i = i10;
                        i2 = i5;
                    } else {
                        java.lang.String string = i10 == interfaceC39506ptdORxRYg.KWHzl().size() - i5 ? this.DGUQLI.getString(C32392mcI.Dialog.giSNqX) : "";
                        if (!interfaceC39506ptdORxRYg.EZpvd().isEmpty()) {
                            dCopydefault = java.lang.Double.parseDouble(interfaceC39506ptdORxRYg.EZpvd());
                        }
                        if (interfaceC39506ptdORxRYg.OLrzqt().equals("infinite_grid")) {
                            AEQbTJ(dCopydefault, str);
                        } else if (interfaceC39506ptdORxRYg.copydefault().equals("neutral") || interfaceC39506ptdORxRYg.copydefault().equals("long")) {
                            if (dCopydefault < java.lang.Double.parseDouble(str)) {
                                if (dCopydefault < java.lang.Double.parseDouble(interfaceC39506ptdORxRYg.KWHzl().get(i6)) || i8 != 0 || i10 == interfaceC39506ptdORxRYg.KWHzl().size() - i5) {
                                    this.ODWQjV.setColor(this.sTzBva.fJNWhG());
                                    this.ULRxlR.setColor(this.sTzBva.fJNWhG());
                                    this.DGOPHZ.setColor(this.sTzBva.fJNWhG());
                                    this.KDccX.setColor(this.sTzBva.fJNWhG());
                                    this.ffGIBT.setColor(this.sTzBva.fJNWhG());
                                } else {
                                    i = i10;
                                    i8 = i5;
                                    i2 = i8;
                                }
                            } else {
                                this.ODWQjV.setColor(this.sTzBva.fIwbmz());
                                this.ULRxlR.setColor(this.sTzBva.fIwbmz());
                                this.DGOPHZ.setColor(this.sTzBva.fIwbmz());
                                this.KDccX.setColor(this.sTzBva.fIwbmz());
                                this.ffGIBT.setColor(this.sTzBva.fIwbmz());
                            }
                        } else if (interfaceC39506ptdORxRYg.copydefault().equals("short")) {
                            if (dCopydefault < java.lang.Double.parseDouble(str)) {
                                this.ODWQjV.setColor(this.sTzBva.fJNWhG());
                                this.ULRxlR.setColor(this.sTzBva.fJNWhG());
                                this.DGOPHZ.setColor(this.sTzBva.fJNWhG());
                                this.KDccX.setColor(this.sTzBva.fJNWhG());
                                this.ffGIBT.setColor(this.sTzBva.fJNWhG());
                            } else if (dCopydefault > java.lang.Double.parseDouble(interfaceC39506ptdORxRYg.KWHzl().get(interfaceC39506ptdORxRYg.KWHzl().size() - i5)) || i9 != 0 || (i3 = i10 + 1) >= this.dvImUD.ORxRYg().KWHzl().size() || dCopydefault >= java.lang.Double.parseDouble(this.dvImUD.ORxRYg().KWHzl().get(i3)) || i10 == 0) {
                                this.ODWQjV.setColor(this.sTzBva.fIwbmz());
                                this.ULRxlR.setColor(this.sTzBva.fIwbmz());
                                this.DGOPHZ.setColor(this.sTzBva.fIwbmz());
                                this.KDccX.setColor(this.sTzBva.fIwbmz());
                                this.ffGIBT.setColor(this.sTzBva.fIwbmz());
                            } else {
                                i = i10;
                                i9 = i5;
                                i2 = i9;
                            }
                        }
                        int iAhwBna = this.hlkKmr.AhwBna(java.lang.Double.parseDouble(str));
                        int iOLrzqt = width - OLrzqt(AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(str)));
                        if (iAhwBna < this.hlkKmr.gEmmrt() && iAhwBna > this.hlkKmr.uzCIH()) {
                            int i11 = this.spnCvw >> i5;
                            int i12 = iAhwBna - i11;
                            int i13 = iAhwBna + i11;
                            int iOLrzqt2 = i4 + OLrzqt(string);
                            int i14 = iOLrzqt2 + this.AxsJAY;
                            this.ODWQjV.setAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
                            this.DGOPHZ.setAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
                            this.KDccX.setAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
                            if (!string.isEmpty()) {
                                d = dCopydefault;
                                KWHzl(canvas, i14, iOLrzqt, iAhwBna, this.ODWQjV);
                                i = i10;
                                i2 = i5;
                                AEQbTJ(canvas, iOLrzqt, i12, width, i13, iAhwBna, this.fFgQHt, this.KDccX, this.ULRxlR, iCopydefault, AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(str)));
                                AEQbTJ(canvas, i4, i12, iOLrzqt2, i13, iAhwBna, this.ffGIBT, this.KDccX, this.zuWLRA, iCopydefault, string);
                            } else {
                                d = dCopydefault;
                                i = i10;
                                i2 = i5;
                                KWHzl(canvas, i14, width, iAhwBna, this.ODWQjV);
                            }
                            i7 = iOLrzqt2;
                            dCopydefault = d;
                        }
                    }
                }
            }
            i10 = i + 1;
            i5 = i2;
            i6 = 0;
        }
        if (interfaceC39506ptdORxRYg.KWHzl().isEmpty()) {
            return;
        }
        java.lang.String str2 = interfaceC39506ptdORxRYg.KWHzl().get(0);
        int iAhwBna2 = this.hlkKmr.AhwBna(java.lang.Double.parseDouble(str2));
        if (iAhwBna2 < this.hlkKmr.gEmmrt()) {
            if (dCopydefault < java.lang.Double.parseDouble(str2)) {
                this.ODWQjV.setColor(this.sTzBva.fJNWhG());
                this.ULRxlR.setColor(this.sTzBva.fJNWhG());
                this.DGOPHZ.setColor(this.sTzBva.fJNWhG());
                this.KDccX.setColor(this.sTzBva.fJNWhG());
                this.ffGIBT.setColor(this.sTzBva.fJNWhG());
            } else {
                this.ODWQjV.setColor(this.sTzBva.fIwbmz());
                this.ULRxlR.setColor(this.sTzBva.fIwbmz());
                this.DGOPHZ.setColor(this.sTzBva.fIwbmz());
                this.KDccX.setColor(this.sTzBva.fIwbmz());
                this.ffGIBT.setColor(this.sTzBva.fIwbmz());
            }
            this.ODWQjV.setAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
            this.DGOPHZ.setAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
            this.KDccX.setAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
            int iOLrzqt3 = width - OLrzqt(AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(str2)));
            int i15 = this.spnCvw >> 1;
            int i16 = iAhwBna2 - i15;
            int i17 = iAhwBna2 + i15;
            int i18 = this.AxsJAY;
            java.lang.String string2 = this.DGUQLI.getString(C32392mcI.Dialog.fFgQHt);
            int iOLrzqt4 = OLrzqt(string2);
            KWHzl(canvas, i7 + i18, iOLrzqt3, iAhwBna2, this.ODWQjV);
            AEQbTJ(canvas, iOLrzqt3, i16, width, i17, iAhwBna2, this.fFgQHt, this.KDccX, this.ULRxlR, iCopydefault, AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(str2)));
            AEQbTJ(canvas, i4, i16, i4 + iOLrzqt4, i17, iAhwBna2, this.ffGIBT, this.KDccX, this.zuWLRA, iCopydefault, string2);
        }
    }

    public final void AEQbTJ(double d, java.lang.String str) {
        if (d < java.lang.Double.parseDouble(str)) {
            this.ODWQjV.setColor(this.sTzBva.fJNWhG());
            this.ULRxlR.setColor(this.sTzBva.fJNWhG());
            this.DGOPHZ.setColor(this.sTzBva.fJNWhG());
            this.KDccX.setColor(this.sTzBva.fJNWhG());
            this.ffGIBT.setColor(this.sTzBva.fJNWhG());
            return;
        }
        this.ODWQjV.setColor(this.sTzBva.fIwbmz());
        this.ULRxlR.setColor(this.sTzBva.fIwbmz());
        this.DGOPHZ.setColor(this.sTzBva.fIwbmz());
        this.KDccX.setColor(this.sTzBva.fIwbmz());
        this.ffGIBT.setColor(this.sTzBva.fIwbmz());
    }

    public final boolean gEmmrt(android.graphics.Canvas canvas) {
        int i;
        double d;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i2;
        int i3;
        int i4;
        int i5;
        KlineSpotAverageBean klineSpotAverageBean;
        java.util.HashMap map;
        java.util.ArrayList<java.lang.Integer> arrayList;
        java.util.HashMap map2;
        java.util.ArrayList<java.lang.Integer> arrayList2;
        int i6;
        java.util.HashMap map3;
        java.util.ArrayList<java.lang.Integer> arrayList3;
        int i7;
        int i8;
        int i9;
        KlineSpotAverageBean klineSpotAverageBean2;
        java.lang.String str4;
        int i10;
        int i11;
        KlineSpotAverageBean klineSpotAverageBean3;
        int i12;
        int i13;
        KlineSpotAverageBean klineSpotAverageBean4;
        java.lang.String str5;
        KlineSpotAverageBean klineSpotAverageBean5 = this.dvImUD.zLjUOn().getKlineSpotAverageBean();
        if (klineSpotAverageBean5 != null) {
            if (this.dvImUD.DLWbHP()) {
                KWHzl(canvas, klineSpotAverageBean5);
                return false;
            }
            boolean tSelected = klineSpotAverageBean5.getTSelected();
            if (tSelected) {
                djBIcL(canvas);
            }
            java.util.ArrayList<java.lang.Integer> arrayListDbNXlk = DbNXlk();
            java.util.HashMap mapFetchVPNInfo = fetchVPNInfo();
            int iOLrzqt = OLrzqt(uzCIH());
            int width = canvas.getWidth() - this.zuBGHE;
            int i14 = width - iOLrzqt;
            int i15 = i14 - this.QKVWgx;
            int i16 = i14 - this.sSMYrx;
            if (this.dvImUD.QDqgQU()) {
                i = 0;
            } else {
                i15 = 0;
                i = this.ORxRYg;
            }
            int i17 = this.dvImUD.DGOPHZDGOPHZ() ? 0 : i15;
            java.lang.String cashBal = klineSpotAverageBean5.getCashBal();
            if (klineSpotAverageBean5.isOpenAvgPx()) {
                if (klineSpotAverageBean5.getOpenAvgPx().isEmpty() || klineSpotAverageBean5.getOpenAvgPx().equals("0")) {
                    return false;
                }
                d = java.lang.Double.parseDouble(klineSpotAverageBean5.getOpenAvgPx());
                java.lang.String strAYXKKw = AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(klineSpotAverageBean5.getOpenAvgPx()));
                if (this.dvImUD.QIZEnU()) {
                    java.lang.String strKWHzl = pTB.KWHzl(klineSpotAverageBean5.getSpotUpl());
                    if (C33129mqd.AEQbTJ(klineSpotAverageBean5.getSpotUpl(), 0)) {
                        strKWHzl = Marker.ANY_NON_NULL_MARKER + strKWHzl;
                    }
                    str5 = valueOf() + " " + strKWHzl;
                } else {
                    str5 = djBIcL() + " " + klineSpotAverageBean5.getSpotUplRatio();
                }
                str3 = str5;
                str2 = strAYXKKw;
            } else if (!klineSpotAverageBean5.getAccAvgPx().isEmpty() && !klineSpotAverageBean5.getAccAvgPx().equals("0")) {
                d = java.lang.Double.parseDouble(klineSpotAverageBean5.getAccAvgPx());
                java.lang.String strAYXKKw2 = AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(klineSpotAverageBean5.getAccAvgPx()));
                if (this.dvImUD.QIZEnU()) {
                    java.lang.String strKWHzl2 = pTB.KWHzl(klineSpotAverageBean5.getTotalPnl());
                    if (C33129mqd.AEQbTJ(klineSpotAverageBean5.getTotalPnl(), 0)) {
                        strKWHzl2 = Marker.ANY_NON_NULL_MARKER + strKWHzl2;
                    }
                    str = valueOf() + " " + strKWHzl2;
                } else {
                    str = djBIcL() + " " + klineSpotAverageBean5.getTotalPnlRatio();
                }
                str2 = strAYXKKw2;
                str3 = str;
            }
            double d2 = d;
            this.AxsJAYsNCnLh.setColor(this.sTzBva.fIwbmz());
            this.ULRxlR.setColor(this.sTzBva.fIwbmz());
            this.WS.setColor(this.sTzBva.fIwbmz());
            this.KDccX.setColor(this.sTzBva.fIwbmz());
            this.iZzfmt.setColor(this.sTzBva.fIwbmz());
            this.ffGIBT.setColor(this.sTzBva.fIwbmz());
            int iGEmmrt = this.hlkKmr.gEmmrt(d2);
            java.lang.String str6 = str2;
            if (C36246oUr.copydefault().gHZMYf().equals("YScale") && (iGEmmrt < C36246oUr.copydefault().AxsJAY() || iGEmmrt > this.hlkKmr.gEmmrt())) {
                return false;
            }
            if ((this.dvImUD.hBpjJd() && this.dvImUD.zblBkD() && this.dvImUD.hUfVAv() != 1) || (d2 < this.hlkKmr.DbNXlk() && d2 > this.hlkKmr.AkhnZx())) {
                int i18 = this.spnCvw >> 1;
                int i19 = iGEmmrt - i18;
                int i20 = iGEmmrt + i18;
                int iOLrzqt2 = OLrzqt(str3);
                int i21 = i + iOLrzqt2;
                int iOLrzqt3 = i21 + OLrzqt(cashBal);
                if (str3.contains("-")) {
                    i2 = iOLrzqt3;
                    i3 = i20;
                    this.run.setColor(this.sTzBva.fJNWhG());
                } else {
                    i2 = iOLrzqt3;
                    i3 = i20;
                    this.run.setColor(this.sTzBva.fIwbmz());
                }
                this.alsFma.setColor(this.sTzBva.fIwbmz());
                if (cashBal.contains("-")) {
                    this.RKcVTr.setColor(this.sTzBva.fJNWhG());
                } else {
                    this.RKcVTr.setColor(this.sTzBva.fIwbmz());
                }
                this.WS.setColor(this.sTzBva.fIwbmz());
                this.AxsJAYsNCnLh.setColor(this.sTzBva.fIwbmz());
                this.ULRxlR.setColor(this.sTzBva.fIwbmz());
                if (this.dvImUD.QDqgQU()) {
                    if (klineSpotAverageBean5.getTSelected() && this.dvImUD.QXDzTk()) {
                        this.RKcVTr.setStrokeWidth(this.zLjUOn);
                        arrayList3 = arrayListDbNXlk;
                        int i22 = i3;
                        map3 = mapFetchVPNInfo;
                        i8 = i16;
                        KWHzl(canvas, i17, width, iGEmmrt, this.RKcVTr);
                        this.ULRxlR.setColor(this.sTzBva.AuCTel());
                        int iOLrzqt4 = ((width - OLrzqt(str6)) - this.QOLQEE) - this.zuBGHE;
                        int iOLrzqt5 = iOLrzqt4 - OLrzqt(cashBal);
                        int i23 = iOLrzqt5 - iOLrzqt2;
                        android.graphics.Path pathValues = values();
                        RectF rectFAuCTel = AuCTel();
                        float f = iOLrzqt5;
                        rectFAuCTel.left = f;
                        float f2 = i19;
                        rectFAuCTel.top = f2;
                        float f3 = iOLrzqt4;
                        rectFAuCTel.right = f3;
                        str4 = str6;
                        float f4 = i22;
                        rectFAuCTel.bottom = f4;
                        i6 = width;
                        float[] fArr = this.uzCIH;
                        Path.Direction direction = Path.Direction.CW;
                        pathValues.addRoundRect(rectFAuCTel, fArr, direction);
                        canvas.drawPath(pathValues, this.fFgQHt);
                        canvas.drawPath(pathValues, this.WS);
                        float f5 = iGEmmrt;
                        canvas.drawText(cashBal, rectFAuCTel.left + this.fERRXa, this.dLBcXg + f5, this.alsFma);
                        rectFAuCTel.left = i23;
                        rectFAuCTel.top = f2;
                        rectFAuCTel.right = f;
                        rectFAuCTel.bottom = f4;
                        pathValues.reset();
                        pathValues.addRoundRect(rectFAuCTel, this.getNewProxyInstance, direction);
                        canvas.drawPath(pathValues, this.run);
                        canvas.drawText(str3, rectFAuCTel.left + this.fERRXa, this.dLBcXg + f5, this.RXzakW);
                        rectFAuCTel.left = f3;
                        rectFAuCTel.top = f2;
                        rectFAuCTel.right = iOLrzqt4 + this.zuBGHE;
                        rectFAuCTel.bottom = f4;
                        pathValues.reset();
                        pathValues.addRoundRect(rectFAuCTel, this.getFieldNames, direction);
                        canvas.drawPath(pathValues, this.fFgQHt);
                        canvas.drawPath(pathValues, this.KDccX);
                        int i24 = (int) rectFAuCTel.left;
                        int i25 = this.AkhnZx;
                        int i26 = i25 / 4;
                        copydefault(canvas, i26 + i24, i19 + i26, ((int) rectFAuCTel.right) - i26, (i19 + i25) - i26);
                        i7 = i22;
                        this.dvImUD.iwGUEr().DbNXlk(KWHzl((int) rectFAuCTel.left, i19, (int) rectFAuCTel.right, i7));
                        int i27 = i23 - this.QbewEr;
                        int iOLrzqt6 = i27 - OLrzqt(copydefault("TP_SL"));
                        this.DWgRXt.setColor(this.sTzBva.EZpvd(6));
                        this.fdOvFl.setColor(this.sTzBva.EZpvd(6));
                        if (this.dvImUD.DGOPHZDGOPHZ()) {
                            i12 = i23;
                            i13 = iOLrzqt6;
                        } else {
                            i12 = i23;
                            i13 = iOLrzqt6;
                            KWHzl(canvas, iOLrzqt6, i23, iGEmmrt, this.AxsJAYsNCnLh);
                        }
                        if (klineSpotAverageBean5.getTDragSL()) {
                            klineSpotAverageBean4 = klineSpotAverageBean5;
                        } else {
                            RectF rectFAuCTel2 = AuCTel();
                            float f6 = i13;
                            float f7 = i27;
                            rectFAuCTel2.set(f6, f2, f7, f4);
                            float f8 = this.heceqZ;
                            canvas.drawRoundRect(rectFAuCTel2, f8, f8, this.fFgQHt);
                            float f9 = this.heceqZ;
                            canvas.drawRoundRect(rectFAuCTel2, f9, f9, this.DWgRXt);
                            canvas.drawText(copydefault("TP_SL"), i13 + this.ORxRYg, f5 + this.dLBcXg, this.fdOvFl);
                            this.dvImUD.iwGUEr().isConnected(new RectF(f6, f2, f7, f4));
                            klineSpotAverageBean4 = klineSpotAverageBean5;
                            klineSpotAverageBean4.setSLLeft(i13);
                        }
                        klineSpotAverageBean2 = klineSpotAverageBean4;
                        i9 = i12;
                        i11 = iOLrzqt4;
                        i4 = iGEmmrt;
                        i10 = i19;
                    } else {
                        i6 = width;
                        map3 = mapFetchVPNInfo;
                        arrayList3 = arrayListDbNXlk;
                        i7 = i3;
                        i8 = i16;
                        if (klineSpotAverageBean5.getTSelected()) {
                            this.RKcVTr.setStrokeWidth(this.zLjUOn);
                            KWHzl(canvas, i17, i6, iGEmmrt, this.RKcVTr);
                            this.ULRxlR.setColor(this.sTzBva.AuCTel());
                        } else {
                            this.RKcVTr.setStrokeWidth(this.QVAiDq);
                            KWHzl(canvas, i17, i6, iGEmmrt, this.RKcVTr);
                            this.iZzfmt.setColor(this.sTzBva.OLrzqt());
                        }
                        int iOLrzqt7 = (i6 - OLrzqt(str6)) - this.QOLQEE;
                        int iOLrzqt8 = iOLrzqt7 - OLrzqt(cashBal);
                        i9 = iOLrzqt8 - iOLrzqt2;
                        android.graphics.Path pathValues2 = values();
                        RectF rectFAuCTel3 = AuCTel();
                        float f10 = iOLrzqt8;
                        rectFAuCTel3.left = f10;
                        float f11 = i19;
                        rectFAuCTel3.top = f11;
                        rectFAuCTel3.right = iOLrzqt7;
                        float f12 = i7;
                        rectFAuCTel3.bottom = f12;
                        pathValues2.reset();
                        float[] fArr2 = this.getFieldNames;
                        Path.Direction direction2 = Path.Direction.CW;
                        pathValues2.addRoundRect(rectFAuCTel3, fArr2, direction2);
                        canvas.drawPath(pathValues2, this.fFgQHt);
                        canvas.drawPath(pathValues2, this.WS);
                        klineSpotAverageBean2 = klineSpotAverageBean5;
                        str4 = str6;
                        i10 = i19;
                        float f13 = iGEmmrt;
                        i4 = iGEmmrt;
                        canvas.drawText(cashBal, rectFAuCTel3.left + this.fERRXa, this.dLBcXg + f13, this.alsFma);
                        rectFAuCTel3.left = i9;
                        rectFAuCTel3.top = f11;
                        rectFAuCTel3.right = f10;
                        rectFAuCTel3.bottom = f12;
                        pathValues2.reset();
                        pathValues2.addRoundRect(rectFAuCTel3, this.getNewProxyInstance, direction2);
                        canvas.drawPath(pathValues2, this.run);
                        canvas.drawText(str3, rectFAuCTel3.left + this.fERRXa, f13 + this.dLBcXg, this.RXzakW);
                        i11 = iOLrzqt7;
                    }
                    int i28 = i10;
                    this.dvImUD.iwGUEr().values(OLrzqt(i9, i28, i11, i7));
                    java.lang.String str7 = str4;
                    java.util.HashMap map4 = map3;
                    i5 = i8;
                    AEQbTJ(canvas, i6 - OLrzqt(str7), i28, i6, i7, i4, this.iZzfmt, this.KDccX, this.ULRxlR, this.heceqZ, str7);
                    if (klineSpotAverageBean2.getTLongClick()) {
                        android.graphics.Point point = new android.graphics.Point(i11, i28);
                        klineSpotAverageBean3 = klineSpotAverageBean2;
                        this.swzYdv = new android.util.Pair<>(klineSpotAverageBean3, point);
                    } else {
                        klineSpotAverageBean3 = klineSpotAverageBean2;
                    }
                    map = map4;
                    klineSpotAverageBean = klineSpotAverageBean3;
                    arrayList = arrayList3;
                } else {
                    int i29 = i3;
                    i4 = iGEmmrt;
                    i5 = i16;
                    if (klineSpotAverageBean5.getTSelected()) {
                        this.RKcVTr.setStrokeWidth(this.zLjUOn);
                        this.ULRxlR.setColor(this.sTzBva.AuCTel());
                    } else {
                        this.RKcVTr.setStrokeWidth(this.QVAiDq);
                        this.iZzfmt.setColor(this.sTzBva.OLrzqt());
                    }
                    int i30 = i2;
                    KWHzl(canvas, i17, width, i4, this.RKcVTr);
                    klineSpotAverageBean = klineSpotAverageBean5;
                    map = mapFetchVPNInfo;
                    arrayList = arrayListDbNXlk;
                    OLrzqt(canvas, i4, i19, i29, i21, i, i30, width - OLrzqt(str6), width, str3, cashBal, str6);
                    this.dvImUD.iwGUEr().values(OLrzqt(i, i19, i30, i29));
                }
                if (klineSpotAverageBean.getTSelected()) {
                    android.graphics.Point pointAkhnZx = AkhnZx();
                    int i31 = i4;
                    pointAkhnZx.set(i5, i31);
                    map2 = map;
                    map2.put(klineSpotAverageBean, pointAkhnZx);
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(i31);
                    arrayList2 = arrayList;
                    arrayList2.add(numValueOf);
                } else {
                    map2 = map;
                    arrayList2 = arrayList;
                }
                if (!arrayList2.isEmpty()) {
                    for (Map.Entry entry : map2.entrySet()) {
                        KlineSpotAverageBean klineSpotAverageBean6 = (KlineSpotAverageBean) entry.getKey();
                        android.graphics.Point point2 = (android.graphics.Point) entry.getValue();
                        OLrzqt(this.sTzBva.fIwbmz());
                        if (klineSpotAverageBean6.getTShowSolid()) {
                            canvas.drawCircle(point2.x, point2.y, this.AuCTel, this.OqFWZa);
                        } else {
                            canvas.drawCircle(point2.x, point2.y, this.AuCTel, this.fFgQHt);
                            canvas.drawCircle(point2.x, point2.y, this.AuCTel, this.QDqgQU);
                        }
                    }
                }
                return tSelected;
            }
        }
        return false;
    }

    public final void KWHzl(android.graphics.Canvas canvas, KlineSpotAverageBean klineSpotAverageBean) {
        int iOLrzqt = OLrzqt(uzCIH());
        for (KlineDexAvgDataBean klineDexAvgDataBean : klineSpotAverageBean.getDexAvgDataList()) {
            if (klineDexAvgDataBean.getFilterAddress().isEmpty()) {
                AEQbTJ(klineDexAvgDataBean, canvas, iOLrzqt);
            } else {
                KWHzl(klineDexAvgDataBean, canvas, iOLrzqt);
            }
        }
    }

    public final void AEQbTJ(KlineDexAvgDataBean klineDexAvgDataBean, android.graphics.Canvas canvas, int i) {
        int iOLrzqt;
        int iOLrzqt2;
        int i2;
        int i3;
        java.lang.String str;
        int i4;
        int i5;
        int iOLrzqt3;
        int i6;
        int i7;
        float fOLrzqt;
        double d = java.lang.Double.parseDouble(klineDexAvgDataBean.getAccAvgPx());
        java.lang.String strAYXKKw = AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(klineDexAvgDataBean.getAccAvgPx()));
        java.lang.String strAYXKKw2 = AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(klineDexAvgDataBean.getPnlAmount()));
        if (C33129mqd.AEQbTJ(klineDexAvgDataBean.getPnlAmount(), 0)) {
            strAYXKKw2 = Marker.ANY_NON_NULL_MARKER + strAYXKKw2;
        }
        java.lang.String str2 = valueOf() + " " + strAYXKKw2;
        java.lang.String str3 = djBIcL() + " " + klineDexAvgDataBean.getPnlRate();
        java.lang.String strAYXKKw3 = AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(klineDexAvgDataBean.getPositionAmount()));
        int iGEmmrt = this.hlkKmr.gEmmrt(java.lang.Double.valueOf(d).doubleValue());
        int width = canvas.getWidth() - this.zuBGHE;
        int iOLrzqt4 = width - OLrzqt(strAYXKKw);
        int i8 = this.spnCvw >> 1;
        int i9 = iGEmmrt - i8;
        int i10 = iGEmmrt + i8;
        int iFIwbmz = java.lang.Double.parseDouble(klineDexAvgDataBean.getPnlAmount()) > AudioStats.AUDIO_AMPLITUDE_NONE ? this.sTzBva.fIwbmz() : this.sTzBva.fJNWhG();
        this.RKcVTr.setColor(iFIwbmz);
        this.KDccX.setColor(iFIwbmz);
        this.ULRxlR.setColor(iFIwbmz);
        this.UlJrfe.setColor(iFIwbmz);
        java.lang.String str4 = ((this.dvImUD.hrNTAI() && this.dvImUD.OFhtUX()) || (this.dvImUD.QIZEnU() && this.dvImUD.RKDWNf())) ? str2 : str3;
        java.lang.String str5 = str4 + "   " + strAYXKKw3;
        if ((this.dvImUD.ODXsMY() && this.dvImUD.OFhtUX()) || (this.dvImUD.QDqgQU() && this.dvImUD.RKDWNf())) {
            iOLrzqt2 = (width - i) - this.QOLQEE;
            iOLrzqt = iOLrzqt2 - OLrzqt(str5);
        } else {
            iOLrzqt = this.ORxRYg;
            iOLrzqt2 = OLrzqt(str5) + iOLrzqt;
        }
        int i11 = iOLrzqt2;
        int i12 = iOLrzqt;
        int i13 = ((this.dvImUD.dmfpNf() && this.dvImUD.OFhtUX()) || (this.dvImUD.DGOPHZDGOPHZ() && this.dvImUD.RKDWNf())) ? 0 : this.AxsJAY + i11;
        if (i13 < iOLrzqt4) {
            i2 = i12;
            i3 = i11;
            str = str5;
            KWHzl(canvas, i13, iOLrzqt4, iGEmmrt, this.RKcVTr);
        } else {
            i2 = i12;
            i3 = i11;
            str = str5;
        }
        java.lang.String str6 = str4;
        AEQbTJ(canvas, iOLrzqt4, i9, width, i10, iGEmmrt, this.iZzfmt, this.KDccX, this.ULRxlR, this.heceqZ, strAYXKKw);
        AEQbTJ(canvas, i2, i9, i3, i10, iGEmmrt, this.iZzfmt, this.KDccX, this.ULRxlR, this.heceqZ, str);
        boolean zOLrzqt = C55296xhK.OLrzqt(C36246oUr.copydefault().AubY());
        if (zOLrzqt) {
            i4 = i3;
            i5 = i2;
            iOLrzqt3 = i4 - OLrzqt(str6);
        } else {
            i4 = i3;
            i5 = i2;
            iOLrzqt3 = i5 + OLrzqt(str6);
        }
        if (iOLrzqt3 > 0) {
            RectF rectFAuCTel = AuCTel();
            if (zOLrzqt) {
                i6 = i9;
                i7 = i10;
                rectFAuCTel.set(iOLrzqt3, i6, i4, i7);
            } else {
                i6 = i9;
                i7 = i10;
                rectFAuCTel.set(i5, i6, iOLrzqt3, i7);
            }
            android.graphics.Path pathValues = values();
            pathValues.reset();
            float f = this.heceqZ;
            pathValues.addRoundRect(rectFAuCTel, zOLrzqt ? new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f} : new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f}, Path.Direction.CW);
            int color = this.fFgQHt.getColor();
            Paint.Style style = this.fFgQHt.getStyle();
            this.fFgQHt.setStyle(Paint.Style.FILL);
            this.fFgQHt.setColor(this.KDccX.getColor());
            canvas.drawPath(pathValues, this.fFgQHt);
            this.fFgQHt.setColor(color);
            this.fFgQHt.setStyle(style);
            int color2 = this.ULRxlR.getColor();
            this.ULRxlR.setColor(this.sTzBva.AuCTel());
            if (zOLrzqt) {
                fOLrzqt = (rectFAuCTel.right - this.fERRXa) - OLrzqt(str6);
            } else {
                fOLrzqt = rectFAuCTel.left + this.fERRXa;
            }
            canvas.drawText(str6, fOLrzqt, iGEmmrt + this.dLBcXg, this.ULRxlR);
            this.ULRxlR.setColor(color2);
            copydefault(canvas, iOLrzqt3, i6, i7, this.UlJrfe);
            RectF rectFAuCTel2 = AuCTel();
            rectFAuCTel2.set(i5, i6, i4, i7);
            float f2 = this.heceqZ;
            canvas.drawRoundRect(rectFAuCTel2, f2, f2, this.KDccX);
        }
    }

    public final void KWHzl(KlineDexAvgDataBean klineDexAvgDataBean, android.graphics.Canvas canvas, int i) {
        double d = java.lang.Double.parseDouble(klineDexAvgDataBean.getAccAvgPx());
        java.lang.String strAYXKKw = AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(klineDexAvgDataBean.getAccAvgPx()));
        int iGEmmrt = this.hlkKmr.gEmmrt(java.lang.Double.valueOf(d).doubleValue());
        int width = canvas.getWidth() - this.zuBGHE;
        int iOLrzqt = OLrzqt(strAYXKKw);
        int i2 = this.spnCvw >> 1;
        int i3 = iGEmmrt - i2;
        int i4 = iGEmmrt + i2;
        int iFIwbmz = java.lang.Double.parseDouble(klineDexAvgDataBean.getPnlAmount()) > AudioStats.AUDIO_AMPLITUDE_NONE ? this.sTzBva.fIwbmz() : this.sTzBva.fJNWhG();
        this.fZBcTu = iFIwbmz;
        this.RKcVTr.setColor(iFIwbmz);
        this.KDccX.setColor(this.fZBcTu);
        this.ULRxlR.setColor(this.fZBcTu);
        KWHzl(canvas, 0, width, iGEmmrt, this.RKcVTr);
        AEQbTJ(canvas, width - iOLrzqt, i3, width, i4, iGEmmrt, this.iZzfmt, this.KDccX, this.ULRxlR, this.heceqZ, strAYXKKw);
        java.util.HashMap<java.lang.String, java.lang.String> mapFIwbmz = fIwbmz();
        mapFIwbmz.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, klineDexAvgDataBean.getFormatFilterAddress());
        java.lang.String strOLrzqt = C33069mpW.OLrzqt(this.DGUQLI.getString(C32392mcI.Dialog.QKudOq), mapFIwbmz);
        int i5 = (width - i) - this.QOLQEE;
        AEQbTJ(canvas, i5 - OLrzqt(strOLrzqt), i3, i5, i4, iGEmmrt, this.iZzfmt, this.KDccX, this.ULRxlR, this.heceqZ, strOLrzqt);
    }

    public final java.lang.String valueOf() {
        return C36246oUr.copydefault().AubY().getResources().getString(C32392mcI.Dialog.WS);
    }

    public final java.lang.String djBIcL() {
        return C36246oUr.copydefault().AubY().getResources().getString(C32392mcI.Dialog.KDccX);
    }

    public final void OLrzqt(android.graphics.Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i9;
        int i10;
        java.lang.String str4;
        pUU.EZpvd("WMYYYY", "drawSpotCostLeft: " + str + "  " + str2);
        KlineSpotAverageBean klineSpotAverageBean = this.dvImUD.zLjUOn().getKlineSpotAverageBean();
        if (klineSpotAverageBean == null) {
            return;
        }
        android.graphics.Path pathValues = values();
        RectF rectFAuCTel = AuCTel();
        float f = i4;
        rectFAuCTel.left = f;
        float f2 = i2;
        rectFAuCTel.top = f2;
        float f3 = i6;
        rectFAuCTel.right = f3;
        float f4 = i3;
        rectFAuCTel.bottom = f4;
        pathValues.reset();
        float[] fArr = this.getFieldNames;
        Path.Direction direction = Path.Direction.CW;
        pathValues.addRoundRect(rectFAuCTel, fArr, direction);
        canvas.drawPath(pathValues, this.fFgQHt);
        canvas.drawPath(pathValues, this.WS);
        float f5 = i;
        canvas.drawText(str2, rectFAuCTel.left + this.fERRXa, this.dLBcXg + f5, this.alsFma);
        rectFAuCTel.left = i5;
        rectFAuCTel.top = f2;
        rectFAuCTel.right = f;
        rectFAuCTel.bottom = f4;
        pathValues.reset();
        pathValues.addRoundRect(rectFAuCTel, this.getNewProxyInstance, direction);
        canvas.drawPath(pathValues, this.run);
        canvas.drawText(str, rectFAuCTel.left + this.fERRXa, this.dLBcXg + f5, this.RXzakW);
        if (klineSpotAverageBean.getTSelected() && this.dvImUD.QXDzTk()) {
            rectFAuCTel.left = f3;
            rectFAuCTel.top = f2;
            rectFAuCTel.right = this.zuBGHE + i6;
            rectFAuCTel.bottom = f4;
            pathValues.reset();
            pathValues.addRoundRect(rectFAuCTel, this.getFieldNames, direction);
            canvas.drawPath(pathValues, this.fFgQHt);
            canvas.drawPath(pathValues, this.KDccX);
            int i11 = (int) rectFAuCTel.left;
            int i12 = this.AkhnZx;
            int i13 = i12 / 4;
            i9 = i2;
            copydefault(canvas, i13 + i11, i9 + i13, ((int) rectFAuCTel.right) - i13, (i9 + i12) - i13);
            this.dvImUD.iwGUEr().DbNXlk(KWHzl((int) rectFAuCTel.left, i9, (int) rectFAuCTel.right, i3));
            int i14 = ((int) rectFAuCTel.right) + this.AwvSrB;
            int iOLrzqt = i14 + OLrzqt(copydefault("TP_SL"));
            this.DWgRXt.setColor(this.sTzBva.EZpvd(6));
            this.fdOvFl.setColor(this.sTzBva.EZpvd(6));
            klineSpotAverageBean.setTPLeft(i14);
            if (!this.dvImUD.DGOPHZDGOPHZ()) {
                i10 = iOLrzqt;
                str4 = "TP_SL";
                KWHzl(canvas, i14, i14, i, this.AxsJAYsNCnLh);
            } else {
                i10 = iOLrzqt;
                str4 = "TP_SL";
            }
            if (!klineSpotAverageBean.getTDragTP()) {
                RectF rectFAuCTel2 = AuCTel();
                float f6 = i14;
                float f7 = i10;
                rectFAuCTel2.set(f6, f2, f7, f4);
                float f8 = this.heceqZ;
                canvas.drawRoundRect(rectFAuCTel2, f8, f8, this.fFgQHt);
                float f9 = this.heceqZ;
                canvas.drawRoundRect(rectFAuCTel2, f9, f9, this.DWgRXt);
                canvas.drawText(copydefault(str4), i14 + this.ORxRYg, this.dLBcXg + f5, this.fdOvFl);
                this.dvImUD.iwGUEr().fetchVPNInfo(new RectF(f6, f2, f7, f4));
            }
        } else {
            i9 = i2;
        }
        AEQbTJ(canvas, i7, i2, i8, i3, i, this.iZzfmt, this.KDccX, this.ULRxlR, this.heceqZ, str3);
        if (this.dvImUD.zLjUOn().getKlineSpotAverageBean().getTLongClick()) {
            this.swzYdv = new android.util.Pair<>(klineSpotAverageBean, new android.graphics.Point(i6, i9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x03ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean KWHzl(android.graphics.Canvas canvas) {
        int i;
        int i2;
        int i3;
        java.util.HashMap<InterfaceC39510pth, android.graphics.Point> map;
        boolean z;
        java.lang.String str;
        int iOLrzqt;
        int iOLrzqt2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iGEmmrt;
        boolean zAhwBna = AhwBna();
        if (zAhwBna) {
            djBIcL(canvas);
        }
        java.util.ArrayList<java.lang.Integer> arrayListDbNXlk = DbNXlk();
        java.util.HashMap<InterfaceC39510pth, android.graphics.Point> mapFetchVPNInfo = fetchVPNInfo();
        int iOLrzqt3 = OLrzqt(uzCIH());
        int width = canvas.getWidth() - this.zuBGHE;
        int i13 = width - iOLrzqt3;
        int i14 = i13 - this.QKVWgx;
        int i15 = i13 - this.QOLQEE;
        int i16 = i13 - this.sSMYrx;
        if (this.dvImUD.QDqgQU()) {
            i = 0;
        } else {
            i = this.ORxRYg;
            i14 = 0;
            i15 = 0;
        }
        if (this.dvImUD.DGOPHZDGOPHZ()) {
            i14 = 0;
        }
        int i17 = 0;
        while (i17 < this.dvImUD.DCUTEI().size()) {
            InterfaceC39510pth interfaceC39510pth = this.dvImUD.DCUTEI().get(i17);
            if (interfaceC39510pth.getAvgPx().isEmpty() || interfaceC39510pth.getUpl().isEmpty() || interfaceC39510pth.getPos().isEmpty() || interfaceC39510pth.getUplRatio().isEmpty() || (C36246oUr.copydefault().gHZMYf().equals("YScale") && ((iGEmmrt = this.hlkKmr.gEmmrt(java.lang.Double.parseDouble(interfaceC39510pth.getAvgPx()))) < C36246oUr.copydefault().AxsJAY() || iGEmmrt > this.hlkKmr.gEmmrt()))) {
                i2 = i17;
                i3 = i16;
                map = mapFetchVPNInfo;
                z = zAhwBna;
            } else {
                if (!this.dvImUD.hBpjJd() || !this.dvImUD.zblBkD() || this.dvImUD.hUfVAv() == 1) {
                    double d = java.lang.Double.parseDouble(interfaceC39510pth.getAvgPx());
                    if (d >= this.hlkKmr.DbNXlk() || d <= this.hlkKmr.AkhnZx()) {
                    }
                }
                if (this.dvImUD.QIZEnU()) {
                    java.lang.String strKWHzl = pTB.KWHzl(interfaceC39510pth.getUpl());
                    if (C33129mqd.AEQbTJ(interfaceC39510pth.getUpl(), 0)) {
                        strKWHzl = Marker.ANY_NON_NULL_MARKER + strKWHzl;
                    }
                    str = valueOf() + " " + strKWHzl;
                } else {
                    str = djBIcL() + " " + pTB.AEQbTJ(pTB.OLrzqt((java.lang.Object) interfaceC39510pth.getUplRatio()), 2, 2, RoundingMode.DOWN);
                }
                java.lang.String str2 = str;
                int iGEmmrt2 = this.hlkKmr.gEmmrt(java.lang.Double.parseDouble(interfaceC39510pth.getAvgPx()));
                int iOLrzqt4 = width - OLrzqt(AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(interfaceC39510pth.getAvgPx())));
                int i18 = this.spnCvw >> 1;
                int i19 = iGEmmrt2 - i18;
                int i20 = iGEmmrt2 + i18;
                if (this.dvImUD.QDqgQU()) {
                    int iOLrzqt5 = i15 - OLrzqt(EZpvd(interfaceC39510pth.getPos()));
                    i5 = iOLrzqt5;
                    i4 = i14;
                    iOLrzqt2 = iOLrzqt5 - OLrzqt(str2);
                    iOLrzqt = i15;
                } else {
                    int iOLrzqt6 = OLrzqt(str2) + i;
                    iOLrzqt = OLrzqt(EZpvd(interfaceC39510pth.getPos())) + iOLrzqt6;
                    if (!this.dvImUD.DGOPHZDGOPHZ()) {
                        i14 = this.AxsJAY + iOLrzqt;
                    }
                    iOLrzqt2 = i;
                    i4 = i14;
                    i5 = iOLrzqt6;
                }
                if (this.dvImUD.DCUTEIddSDPG()) {
                    i6 = iOLrzqt;
                    i7 = iOLrzqt2;
                    i8 = i19;
                    z = zAhwBna;
                    i9 = iGEmmrt2;
                    EZpvd(canvas, i17, interfaceC39510pth, width, arrayListDbNXlk, mapFetchVPNInfo);
                } else {
                    i6 = iOLrzqt;
                    i7 = iOLrzqt2;
                    i8 = i19;
                    z = zAhwBna;
                    i9 = iGEmmrt2;
                }
                if (this.dvImUD.DCUTEIdCUTEI()) {
                    OLrzqt(canvas, i17, interfaceC39510pth, width, arrayListDbNXlk, mapFetchVPNInfo);
                }
                if (!this.dvImUD.run()) {
                    copydefault(canvas, arrayListDbNXlk, mapFetchVPNInfo, i16);
                    i2 = i17;
                    i3 = i16;
                    map = mapFetchVPNInfo;
                    i10 = i6;
                    i12 = i7;
                } else {
                    if (interfaceC39510pth.getBSSide().equals("sell")) {
                        this.AxsJAYsNCnLh.setColor(this.sTzBva.fJNWhG());
                        this.ULRxlR.setColor(this.sTzBva.fJNWhG());
                        this.fvQaOB.setColor(this.sTzBva.fJNWhG());
                        this.WS.setColor(this.sTzBva.fJNWhG());
                        this.TarCU.setColor(this.sTzBva.fJNWhG());
                        this.KDccX.setColor(this.sTzBva.fJNWhG());
                    } else {
                        this.AxsJAYsNCnLh.setColor(this.sTzBva.fIwbmz());
                        this.ULRxlR.setColor(this.sTzBva.fIwbmz());
                        this.fvQaOB.setColor(this.sTzBva.fIwbmz());
                        this.WS.setColor(this.sTzBva.fIwbmz());
                        this.TarCU.setColor(this.sTzBva.fIwbmz());
                        this.KDccX.setColor(this.sTzBva.fIwbmz());
                    }
                    if (interfaceC39510pth.getSelected() || !this.gSBher) {
                        this.AxsJAYsNCnLh.setAlpha(255);
                        this.ULRxlR.setAlpha(255);
                        this.WS.setAlpha(255);
                        this.KDccX.setAlpha(255);
                    } else {
                        this.AxsJAYsNCnLh.setAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
                        this.ULRxlR.setAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
                        this.WS.setAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
                        this.KDccX.setAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
                    }
                    if (interfaceC39510pth.getSelected()) {
                        mapFetchVPNInfo.put(interfaceC39510pth, new android.graphics.Point(i16, i9));
                        arrayListDbNXlk.add(java.lang.Integer.valueOf(i9));
                        if (interfaceC39510pth.getShowSolid()) {
                            this.AxsJAYsNCnLh.setStrokeWidth(this.zLjUOn);
                            this.ULRxlR.setColor(this.sTzBva.AuCTel());
                        } else {
                            this.AxsJAYsNCnLh.setStrokeWidth(this.QVAiDq);
                            this.fvQaOB.setColor(this.sTzBva.OLrzqt());
                        }
                    } else {
                        this.AxsJAYsNCnLh.setStrokeWidth(this.QVAiDq);
                        this.fvQaOB.setColor(this.sTzBva.OLrzqt());
                    }
                    KWHzl(canvas, i4, iOLrzqt4, i9, this.AxsJAYsNCnLh);
                    i2 = i17;
                    i3 = i16;
                    map = mapFetchVPNInfo;
                    AEQbTJ(canvas, iOLrzqt4, i8, width, i20, i9, this.fvQaOB, this.KDccX, this.ULRxlR, this.heceqZ, AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(interfaceC39510pth.getAvgPx())));
                    AEQbTJ(i2, canvas, interfaceC39510pth, i9, i5, i6, i8, i20, i7, str2);
                    if (interfaceC39510pth.getLongClick()) {
                        i10 = i6;
                        i11 = i8;
                        this.AuCTelauCTel.put(interfaceC39510pth, new android.graphics.Point(i10, i11));
                    } else {
                        i10 = i6;
                        i11 = i8;
                    }
                    LinkedHashMap<java.lang.Integer, RectF> linkedHashMapGEmmrt = this.dvImUD.iwGUEr().gEmmrt();
                    i12 = i7;
                    int i21 = this.ORxRYg;
                    linkedHashMapGEmmrt.put(java.lang.Integer.valueOf(i2), new RectF(i12, i11 - i21, i10, i20 + i21));
                }
                i = i12;
                i15 = i10;
                i14 = i4;
            }
            i17 = i2 + 1;
            zAhwBna = z;
            i16 = i3;
            mapFetchVPNInfo = map;
        }
        boolean z2 = zAhwBna;
        copydefault(canvas, arrayListDbNXlk, mapFetchVPNInfo, i16);
        return z2;
    }

    public final void copydefault(android.graphics.Canvas canvas, java.util.List<java.lang.Integer> list, java.util.HashMap<InterfaceC39510pth, android.graphics.Point> map, int i) {
        int iAhwBna;
        if (list.isEmpty()) {
            return;
        }
        int iIntValue = ((java.lang.Integer) Collections.max(list)).intValue();
        int iIntValue2 = ((java.lang.Integer) Collections.min(list)).intValue();
        if (!this.aKErDB) {
            float f = i;
            canvas.drawLine(f, iIntValue2, f, iIntValue, this.QwvEab);
        }
        for (Map.Entry<InterfaceC39510pth, android.graphics.Point> entry : map.entrySet()) {
            InterfaceC39510pth key = entry.getKey();
            android.graphics.Point value = entry.getValue();
            if (this.dvImUD.DCUTEIddSDPG() && !key.getLiqPx().isEmpty() && C33129mqd.AEQbTJ(key.getLiqPx(), 0) && (iAhwBna = this.hlkKmr.AhwBna(java.lang.Double.parseDouble(key.getLiqPx()))) >= C36246oUr.copydefault().AxsJAY() && iAhwBna <= this.hlkKmr.gEmmrt()) {
                OLrzqt(this.sTzBva.AuCTelauCTel());
                if (key.getShowSolidLiq()) {
                    canvas.drawCircle(value.x, iAhwBna, this.AuCTel, this.OqFWZa);
                } else {
                    float f2 = iAhwBna;
                    canvas.drawCircle(value.x, f2, this.AuCTel, this.fFgQHt);
                    canvas.drawCircle(value.x, f2, this.AuCTel, this.QDqgQU);
                }
            }
            if (this.dvImUD.DCUTEIdCUTEI() && !key.getBePx().isEmpty() && C33129mqd.AEQbTJ(key.getBePx(), 0)) {
                OLrzqt(this.sTzBva.fARcdN());
                int iGEmmrt = this.hlkKmr.gEmmrt(java.lang.Double.parseDouble(key.getBePx()));
                if (key.getShowSolidBE()) {
                    canvas.drawCircle(value.x, iGEmmrt, this.AuCTel, this.OqFWZa);
                } else {
                    float f3 = iGEmmrt;
                    canvas.drawCircle(value.x, f3, this.AuCTel, this.fFgQHt);
                    canvas.drawCircle(value.x, f3, this.AuCTel, this.QDqgQU);
                }
            }
            if (this.dvImUD.run()) {
                if (key.getBSSide().equals("sell")) {
                    OLrzqt(this.sTzBva.fJNWhG());
                } else {
                    OLrzqt(this.sTzBva.fIwbmz());
                }
                int iGEmmrt2 = this.hlkKmr.gEmmrt(java.lang.Double.parseDouble(key.getAvgPx()));
                if (key.getShowSolid()) {
                    canvas.drawCircle(value.x, iGEmmrt2, this.AuCTel, this.OqFWZa);
                } else {
                    float f4 = iGEmmrt2;
                    canvas.drawCircle(value.x, f4, this.AuCTel, this.fFgQHt);
                    canvas.drawCircle(value.x, f4, this.AuCTel, this.QDqgQU);
                }
            }
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas, int i, InterfaceC39510pth interfaceC39510pth, int i2, java.util.List<java.lang.Integer> list, java.util.HashMap<InterfaceC39510pth, android.graphics.Point> map) {
        int iOLrzqt;
        int iOLrzqt2;
        java.lang.String liqPx = interfaceC39510pth.getLiqPx();
        if (liqPx.isEmpty() || C33129mqd.valueOf(liqPx, 0)) {
            return;
        }
        int iAhwBna = this.hlkKmr.AhwBna(java.lang.Double.parseDouble(liqPx));
        if (iAhwBna < C36246oUr.copydefault().AxsJAY() || iAhwBna > this.hlkKmr.gEmmrt()) {
            copydefault(list, liqPx);
            return;
        }
        java.lang.String string = this.DGUQLI.getString(C32392mcI.Dialog.call);
        int iOLrzqt3 = i2 - OLrzqt(uzCIH());
        int i3 = iOLrzqt3 - this.sSMYrx;
        int iOLrzqt4 = i2 - OLrzqt(AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(liqPx)));
        int i4 = this.spnCvw >> 1;
        int i5 = iAhwBna - i4;
        int i6 = iAhwBna + i4;
        if (this.dvImUD.QDqgQU()) {
            iOLrzqt2 = iOLrzqt3 - this.QOLQEE;
            iOLrzqt = iOLrzqt2 - OLrzqt(string);
        } else {
            iOLrzqt = this.ORxRYg;
            iOLrzqt2 = OLrzqt(string) + iOLrzqt;
        }
        int i7 = iOLrzqt2;
        int i8 = iOLrzqt;
        int i9 = !this.dvImUD.DGOPHZDGOPHZ() ? i7 : 0;
        this.USBtdM.setColor(this.sTzBva.AuCTelauCTel());
        this.USBtdM.setStrokeWidth(this.QVAiDq);
        this.gGvvIC.setColor(this.sTzBva.OLrzqt());
        this.Ufzxmz.setColor(this.sTzBva.AuCTelauCTel());
        this.UrRBLY.setColor(this.sTzBva.AuCTelauCTel());
        this.UhxbNG.setColor(this.sTzBva.AuCTelauCTel());
        if (interfaceC39510pth.getLiqSelected()) {
            if (interfaceC39510pth.getShowSolidLiq()) {
                this.USBtdM.setStrokeWidth(this.zLjUOn);
                this.gGvvIC.setColor(this.sTzBva.AuCTelauCTel());
                this.Ufzxmz.setColor(this.sTzBva.AuCTel());
            }
            if (C36246oUr.copydefault().run()) {
                interfaceC39510pth.setSelected(true);
            }
            if (C36246oUr.copydefault().DCUTEIdCUTEI()) {
                java.lang.String bePx = interfaceC39510pth.getBePx();
                if (!bePx.isEmpty() && C33129mqd.AEQbTJ(bePx, 0)) {
                    copydefault(list, bePx);
                    interfaceC39510pth.setBeSelected(true);
                }
            }
        }
        if (interfaceC39510pth.getSelected() || interfaceC39510pth.getLiqSelected()) {
            if (java.lang.Double.parseDouble(liqPx) > this.hlkKmr.DbNXlk()) {
                list.add(0);
                map.put(interfaceC39510pth, new android.graphics.Point(i3, 0));
            } else if (java.lang.Double.parseDouble(liqPx) < this.hlkKmr.AkhnZx()) {
                list.add(java.lang.Integer.valueOf(this.hlkKmr.gEmmrt()));
                map.put(interfaceC39510pth, new android.graphics.Point(i3, this.hlkKmr.gEmmrt()));
            } else {
                list.add(java.lang.Integer.valueOf(iAhwBna));
                map.put(interfaceC39510pth, new android.graphics.Point(i3, iAhwBna));
            }
        }
        KWHzl(canvas, i9, iOLrzqt4, iAhwBna, this.USBtdM);
        AEQbTJ(canvas, i8, i5, i7, i6, iAhwBna, this.gasjUx, this.UrRBLY, this.UhxbNG, this.heceqZ, string);
        AEQbTJ(canvas, iOLrzqt4, i5, i2, i6, iAhwBna, this.gGvvIC, this.UrRBLY, this.Ufzxmz, this.heceqZ, AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(liqPx)));
        LinkedHashMap<java.lang.Integer, RectF> linkedHashMapIwGUEr = this.dvImUD.iwGUEr().iwGUEr();
        int i10 = this.ORxRYg;
        linkedHashMapIwGUEr.put(java.lang.Integer.valueOf(i), new RectF(i8, i5 - i10, i7, i6 + i10));
    }

    public final void OLrzqt(android.graphics.Canvas canvas, int i, InterfaceC39510pth interfaceC39510pth, int i2, java.util.List<java.lang.Integer> list, java.util.HashMap<InterfaceC39510pth, android.graphics.Point> map) {
        int iOLrzqt;
        int iOLrzqt2;
        java.lang.String bePx = interfaceC39510pth.getBePx();
        if (bePx.isEmpty() || C33129mqd.valueOf(bePx, 0)) {
            return;
        }
        int iGEmmrt = this.hlkKmr.gEmmrt(java.lang.Double.parseDouble(bePx));
        if (this.dvImUD.gHZMYf().equals("YScale") && (iGEmmrt < C36246oUr.copydefault().AxsJAY() || iGEmmrt > this.hlkKmr.gEmmrt())) {
            copydefault(list, bePx);
            return;
        }
        java.lang.String string = this.DGUQLI.getString(C32392mcI.Dialog.DCUTEIddSDPG);
        int iOLrzqt3 = i2 - OLrzqt(uzCIH());
        int i3 = iOLrzqt3 - this.sSMYrx;
        int iOLrzqt4 = i2 - OLrzqt(AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(bePx)));
        int i4 = this.spnCvw >> 1;
        int i5 = iGEmmrt - i4;
        int i6 = iGEmmrt + i4;
        if (this.dvImUD.QDqgQU()) {
            iOLrzqt2 = iOLrzqt3 - this.QOLQEE;
            iOLrzqt = iOLrzqt2 - OLrzqt(string);
        } else {
            iOLrzqt = this.ORxRYg;
            iOLrzqt2 = OLrzqt(string) + iOLrzqt;
        }
        int i7 = iOLrzqt2;
        int i8 = iOLrzqt;
        int i9 = !this.dvImUD.DGOPHZDGOPHZ() ? i7 : 0;
        this.USBtdM.setColor(this.sTzBva.fARcdN());
        this.USBtdM.setStrokeWidth(this.QVAiDq);
        this.gGvvIC.setColor(this.sTzBva.OLrzqt());
        this.Ufzxmz.setColor(this.sTzBva.fARcdN());
        this.UrRBLY.setColor(this.sTzBva.fARcdN());
        this.UhxbNG.setColor(this.sTzBva.fARcdN());
        if (interfaceC39510pth.getBeSelected()) {
            if (interfaceC39510pth.getShowSolidBE()) {
                this.USBtdM.setStrokeWidth(this.zLjUOn);
                this.gGvvIC.setColor(this.sTzBva.fARcdN());
                this.Ufzxmz.setColor(this.sTzBva.AuCTel());
            }
            if (C36246oUr.copydefault().run()) {
                interfaceC39510pth.setSelected(true);
            }
            if (C36246oUr.copydefault().DCUTEIddSDPG()) {
                java.lang.String liqPx = interfaceC39510pth.getLiqPx();
                if (!liqPx.isEmpty() && C33129mqd.AEQbTJ(liqPx, 0)) {
                    copydefault(list, liqPx);
                    interfaceC39510pth.setLiqSelected(true);
                }
            }
        }
        if (interfaceC39510pth.getSelected() || interfaceC39510pth.getBeSelected()) {
            if (java.lang.Double.parseDouble(bePx) > this.hlkKmr.DbNXlk()) {
                list.add(0);
                map.put(interfaceC39510pth, new android.graphics.Point(i3, 0));
            } else if (java.lang.Double.parseDouble(bePx) < this.hlkKmr.AkhnZx()) {
                list.add(java.lang.Integer.valueOf(this.hlkKmr.gEmmrt()));
                map.put(interfaceC39510pth, new android.graphics.Point(i3, this.hlkKmr.gEmmrt()));
            } else {
                list.add(java.lang.Integer.valueOf(iGEmmrt));
                map.put(interfaceC39510pth, new android.graphics.Point(i3, iGEmmrt));
            }
            list.add(java.lang.Integer.valueOf(iGEmmrt));
        }
        KWHzl(canvas, i9, iOLrzqt4, iGEmmrt, this.USBtdM);
        AEQbTJ(canvas, i8, i5, i7, i6, iGEmmrt, this.gasjUx, this.UrRBLY, this.UhxbNG, this.heceqZ, string);
        AEQbTJ(canvas, iOLrzqt4, i5, i2, i6, iGEmmrt, this.gGvvIC, this.UrRBLY, this.Ufzxmz, this.heceqZ, AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(bePx)));
        LinkedHashMap<java.lang.Integer, RectF> linkedHashMapKWHzl = this.dvImUD.iwGUEr().KWHzl();
        int i10 = this.ORxRYg;
        linkedHashMapKWHzl.put(java.lang.Integer.valueOf(i), new RectF(i8, i5 - i10, i7, i6 + i10));
    }

    public final android.util.Pair<java.lang.Boolean, java.lang.Integer> gEmmrt() {
        android.util.Pair<java.lang.Boolean, java.lang.Integer> pair = new android.util.Pair<>(java.lang.Boolean.FALSE, -1);
        for (int i = 0; i < this.dvImUD.gasjUx().size(); i++) {
            KlineOpenOrderBean klineOpenOrderBean = this.dvImUD.gasjUx().get(i);
            if (klineOpenOrderBean.getSelected() && klineOpenOrderBean.getShowSolid()) {
                return new android.util.Pair<>(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i));
            }
        }
        return pair;
    }

    public final boolean AhwBna() {
        for (int i = 0; i < this.dvImUD.DCUTEI().size(); i++) {
            if (this.dvImUD.DCUTEI().get(i).getShowSolid()) {
                return true;
            }
        }
        return false;
    }

    public final void OLrzqt(int i) {
        this.OqFWZa.setColor(i);
        this.QDqgQU.setColor(i);
        this.DXXBbs.setColor(i);
        this.DXXBbs.setAlpha(this.AhwBna);
    }

    public final void AEQbTJ(int i, android.graphics.Canvas canvas, InterfaceC39510pth interfaceC39510pth, int i2, int i3, int i4, int i5, int i6, int i7, java.lang.String str) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float[] fArr = this.getFieldNames;
        android.graphics.Path pathValues = values();
        RectF rectFAuCTel = AuCTel();
        int i14 = i4 + this.AkhnZx;
        if (interfaceC39510pth.getShowSolid() && this.dvImUD.QXDzTk() && !interfaceC39510pth.getInstType().equals(oLT.DbNXlk())) {
            if (this.dvImUD.QDqgQU()) {
                int i15 = this.AkhnZx;
                i11 = i4;
                i8 = i3 - i15;
                i13 = i7 - i15;
                i12 = i4 - i15;
                i9 = i12;
            } else {
                i8 = i3;
                i12 = i4;
                i9 = i12;
                i13 = i7;
                i11 = i14;
            }
            AEQbTJ(i, canvas, this.KDccX, i12, i5, i11, i6);
            fArr = this.uzCIH;
            i10 = i13;
        } else {
            i8 = i3;
            i9 = i4;
            i10 = i7;
            i11 = i14;
        }
        if (str.contains(Marker.ANY_NON_NULL_MARKER)) {
            this.ULRxlR.setColor(this.sTzBva.fIwbmz());
            this.run.setColor(this.sTzBva.fIwbmz());
        } else if (str.contains("-")) {
            this.ULRxlR.setColor(this.sTzBva.fJNWhG());
            this.run.setColor(this.sTzBva.fJNWhG());
        } else {
            this.ULRxlR.setColor(this.sTzBva.getNewProxyInstance());
            this.run.setColor(this.sTzBva.values());
        }
        rectFAuCTel.left = i8;
        float f = i5;
        rectFAuCTel.top = f;
        rectFAuCTel.right = i9;
        float f2 = i6;
        rectFAuCTel.bottom = f2;
        pathValues.reset();
        Path.Direction direction = Path.Direction.CW;
        pathValues.addRoundRect(rectFAuCTel, fArr, direction);
        canvas.drawPath(pathValues, this.fFgQHt);
        canvas.drawPath(pathValues, this.WS);
        int i16 = i11;
        float f3 = i2;
        canvas.drawText(EZpvd(interfaceC39510pth.getPos()), rectFAuCTel.left + this.fERRXa, this.dLBcXg + f3, this.TarCU);
        rectFAuCTel.left = i10;
        rectFAuCTel.top = f;
        rectFAuCTel.right = i8 - this.QVAiDq;
        rectFAuCTel.bottom = f2;
        pathValues.reset();
        pathValues.addRoundRect(rectFAuCTel, this.getNewProxyInstance, direction);
        canvas.drawPath(pathValues, this.run);
        canvas.drawText(str, rectFAuCTel.left + this.fERRXa, f3 + this.dLBcXg, this.RXzakW);
        if (interfaceC39510pth.getShowSolid() && this.dvImUD.QXDzTk() && !interfaceC39510pth.getInstType().equals(oLT.DbNXlk())) {
            if (this.dvImUD.QDqgQU()) {
                OLrzqt(i, canvas, interfaceC39510pth, i10, i5, i6, i2);
            } else {
                copydefault(i, canvas, interfaceC39510pth, i16, i5, i6, i2);
            }
        }
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return str.startsWith("-") ? str.substring(1) : str;
    }

    public final void OLrzqt(int i, android.graphics.Canvas canvas, InterfaceC39510pth interfaceC39510pth, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i2 - this.QbewEr;
        int i8 = i7 - this.gHZMYf;
        if (interfaceC39510pth.getInstType().equals(oLT.isConnected()) || !interfaceC39510pth.isSupportPR() || this.dvImUD.dUDNAs()) {
            i6 = i2;
        } else {
            AEQbTJ(i, canvas, interfaceC39510pth, i8, i3, i7, i4);
            if (!this.dvImUD.DGOPHZDGOPHZ()) {
                KWHzl(canvas, i7, i2, i5, this.AxsJAYsNCnLh);
            }
            i6 = i8;
        }
        int i9 = i6 - this.AwvSrB;
        int iOLrzqt = i9 - OLrzqt(copydefault("TP_SL"));
        if (!this.dvImUD.DGOPHZDGOPHZ()) {
            KWHzl(canvas, iOLrzqt, i6, i5, this.AxsJAYsNCnLh);
        }
        if (!interfaceC39510pth.isDragSL()) {
            EZpvd(i, canvas, this.DWgRXt, this.fdOvFl, iOLrzqt, i3, i9, i4, i5);
        }
        interfaceC39510pth.setSLLeft(iOLrzqt);
    }

    public final void copydefault(int i, android.graphics.Canvas canvas, InterfaceC39510pth interfaceC39510pth, int i2, int i3, int i4, int i5) {
        int i6 = i2 + this.AwvSrB;
        int iOLrzqt = i6 + OLrzqt(copydefault("TP_SL"));
        if (!interfaceC39510pth.isDragTP()) {
            copydefault(i, canvas, this.DWgRXt, this.fdOvFl, i6, i3, iOLrzqt, i4, i5);
        }
        interfaceC39510pth.setTPLeft(i6);
        if (interfaceC39510pth.getInstType().equals(oLT.isConnected()) || !interfaceC39510pth.isSupportPR() || this.dvImUD.dUDNAs()) {
            return;
        }
        int i7 = iOLrzqt + this.AwvSrB;
        AEQbTJ(i, canvas, interfaceC39510pth, i7, i3, i7 + this.gHZMYf, i4);
    }

    public final void AEQbTJ(int i, android.graphics.Canvas canvas, android.graphics.Paint paint, int i2, int i3, int i4, int i5) {
        RectF rectFAuCTel = AuCTel();
        float f = i2;
        rectFAuCTel.left = f;
        rectFAuCTel.top = i3;
        float f2 = i4;
        rectFAuCTel.right = f2;
        rectFAuCTel.bottom = i5;
        android.graphics.Path pathValues = values();
        pathValues.addRoundRect(rectFAuCTel, this.getFieldNames, Path.Direction.CW);
        canvas.drawPath(pathValues, this.fFgQHt);
        canvas.drawPath(pathValues, paint);
        int i6 = (int) rectFAuCTel.left;
        int i7 = this.AkhnZx;
        int i8 = i7 / 4;
        copydefault(canvas, i6 + i8, i8 + i3, ((int) rectFAuCTel.right) - i8, (i3 + i7) - i8);
        LinkedHashMap<java.lang.Integer, RectF> linkedHashMapValueOf = this.dvImUD.iwGUEr().valueOf();
        int i9 = this.ORxRYg;
        linkedHashMapValueOf.put(java.lang.Integer.valueOf(i), new RectF(f, i3 - i9, f2, i9 + i5));
    }

    public final void copydefault(java.lang.String str, int i, android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.Paint paint2, int i2, int i3, int i4, int i5, int i6) {
        paint.setColor(this.sTzBva.EZpvd(6));
        paint2.setColor(this.sTzBva.EZpvd(6));
        RectF rectFAuCTel = AuCTel();
        float f = i2;
        float f2 = i4;
        rectFAuCTel.set(f, i3, f2, i5);
        float f3 = this.heceqZ;
        canvas.drawRoundRect(rectFAuCTel, f3, f3, this.fFgQHt);
        float f4 = this.heceqZ;
        canvas.drawRoundRect(rectFAuCTel, f4, f4, paint);
        if (str.equals("TP_SL")) {
            canvas.drawText(copydefault(str), i2 + this.ORxRYg, i6 + this.dLBcXg, paint2);
        } else {
            canvas.drawText(copydefault(str), i2 + this.QbewEr, i6 + this.dLBcXg, paint2);
        }
        if (str.equals("SL_Limit")) {
            LinkedHashMap<java.lang.Integer, RectF> linkedHashMapQKVWgx = C36246oUr.copydefault().iwGUEr().QKVWgx();
            int i7 = this.ORxRYg;
            linkedHashMapQKVWgx.put(java.lang.Integer.valueOf(i), new RectF(f, i3 - i7, f2, i5 + i7));
        } else {
            LinkedHashMap<java.lang.Integer, RectF> linkedHashMapOcIXYQ = C36246oUr.copydefault().iwGUEr().OcIXYQ();
            int i8 = this.ORxRYg;
            linkedHashMapOcIXYQ.put(java.lang.Integer.valueOf(i), new RectF(f, i3 - i8, f2, i5 + i8));
        }
    }

    public final void copydefault(int i, android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.Paint paint2, int i2, int i3, int i4, int i5, int i6) {
        paint.setColor(this.sTzBva.EZpvd(6));
        paint2.setColor(this.sTzBva.EZpvd(6));
        RectF rectFAuCTel = AuCTel();
        float f = i2;
        float f2 = i4;
        rectFAuCTel.set(f, i3, f2, i5);
        float f3 = this.heceqZ;
        canvas.drawRoundRect(rectFAuCTel, f3, f3, this.fFgQHt);
        float f4 = this.heceqZ;
        canvas.drawRoundRect(rectFAuCTel, f4, f4, paint);
        canvas.drawText(copydefault("TP_SL"), i2 + this.ORxRYg, i6 + this.dLBcXg, paint2);
        LinkedHashMap<java.lang.Integer, RectF> linkedHashMapAYXKKw = C36246oUr.copydefault().iwGUEr().AYXKKw();
        int i7 = this.ORxRYg;
        linkedHashMapAYXKKw.put(java.lang.Integer.valueOf(i), new RectF(f, i3 - i7, f2, i5 + i7));
    }

    public final void EZpvd(int i, android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.Paint paint2, int i2, int i3, int i4, int i5, int i6) {
        paint.setColor(this.sTzBva.EZpvd(6));
        paint2.setColor(this.sTzBva.EZpvd(6));
        RectF rectFAuCTel = AuCTel();
        float f = i2;
        float f2 = i4;
        rectFAuCTel.set(f, i3, f2, i5);
        float f3 = this.heceqZ;
        canvas.drawRoundRect(rectFAuCTel, f3, f3, this.fFgQHt);
        float f4 = this.heceqZ;
        canvas.drawRoundRect(rectFAuCTel, f4, f4, paint);
        canvas.drawText(copydefault("TP_SL"), i2 + this.ORxRYg, i6 + this.dLBcXg, paint2);
        LinkedHashMap<java.lang.Integer, RectF> linkedHashMapAhwBna = C36246oUr.copydefault().iwGUEr().AhwBna();
        int i7 = this.ORxRYg;
        linkedHashMapAhwBna.put(java.lang.Integer.valueOf(i), new RectF(f, i3 - i7, f2, i5 + i7));
    }

    public final void AEQbTJ(int i, android.graphics.Canvas canvas, InterfaceC39510pth interfaceC39510pth, int i2, int i3, int i4, int i5) {
        if (AEQbTJ(interfaceC39510pth).equals("buy")) {
            this.gUEfcq.setColorFilter(this.sTzBva.fJNWhG(), PorterDuff.Mode.SRC_IN);
        } else {
            this.gUEfcq.setColorFilter(this.sTzBva.fIwbmz(), PorterDuff.Mode.SRC_IN);
        }
        int iEZpvd = this.sTzBva.EZpvd(6);
        this.gUEfcq.setColorFilter(this.sTzBva.EZpvd(6), PorterDuff.Mode.SRC_IN);
        this.DCUTEIddSDPG.setColor(iEZpvd);
        RectF rectFAuCTel = AuCTel();
        float f = i2;
        float f2 = i4;
        rectFAuCTel.set(f, i3, f2, i5);
        float f3 = this.heceqZ;
        canvas.drawRoundRect(rectFAuCTel, f3, f3, this.fFgQHt);
        float f4 = this.heceqZ;
        canvas.drawRoundRect(rectFAuCTel, f4, f4, this.DCUTEIddSDPG);
        int i6 = (i2 + i4) / 2;
        int i7 = (i3 + i5) / 2;
        android.graphics.drawable.Drawable drawable = this.gUEfcq;
        int i8 = this.QUSxYX;
        drawable.setBounds(i6 - i8, i7 - i8, i6 + i8, i7 + i8);
        this.gUEfcq.draw(canvas);
        LinkedHashMap<java.lang.Integer, RectF> linkedHashMapDjBIcL = this.dvImUD.iwGUEr().djBIcL();
        int i9 = this.ORxRYg;
        linkedHashMapDjBIcL.put(java.lang.Integer.valueOf(i), new RectF(f, i3 - i9, f2, i5 + i9));
    }

    public final java.lang.String AEQbTJ(InterfaceC39510pth interfaceC39510pth) {
        return interfaceC39510pth.getBSSide().equals("sell") ? "sell" : "buy";
    }

    public final void copydefault(android.graphics.Canvas canvas) {
        float f;
        if (this.AuCTelauCTel.isEmpty()) {
            return;
        }
        InterfaceC39510pth interfaceC39510pth = null;
        android.graphics.Point value = null;
        for (Map.Entry<InterfaceC39510pth, android.graphics.Point> entry : this.AuCTelauCTel.entrySet()) {
            InterfaceC39510pth key = entry.getKey();
            value = entry.getValue();
            interfaceC39510pth = key;
        }
        if (interfaceC39510pth == null || value == null) {
            return;
        }
        if (this.tIwhY == null) {
            android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(C36246oUr.copydefault().AubY());
            this.dxcTrN = layoutInflaterFrom;
            android.view.View viewInflate = layoutInflaterFrom.inflate(C32392mcI.StateListAnimator.AhwBna, (android.view.ViewGroup) null);
            this.iwGUEr = viewInflate;
            this.tIwhY = (C39797pzC) viewInflate.findViewById(C32392mcI.TaskDescription.fJNWhG);
        }
        this.tIwhY.setData(interfaceC39510pth);
        this.iwGUEr.measure(canvas.getWidth(), canvas.getHeight());
        int measuredWidth = this.iwGUEr.getMeasuredWidth();
        int measuredHeight = this.iwGUEr.getMeasuredHeight();
        float f2 = value.y - measuredHeight;
        int iOLrzqt = OLrzqt(interfaceC39510pth.getPos()) / 2;
        this.zKcAg = iOLrzqt;
        value.x -= iOLrzqt;
        if (f2 < 0.0f) {
            float f3 = value.y + this.spnCvw;
            value.y = (int) f3;
            OLrzqt(canvas, this.fXHmeK, value, true);
            f = f3 + this.djSkpj;
        } else {
            OLrzqt(canvas, this.fXHmeK, value, false);
            f = f2 - this.djSkpj;
        }
        this.iwGUEr.layout(0, 0, measuredWidth, measuredHeight);
        canvas.save();
        if (this.dvImUD.QDqgQU()) {
            canvas.translate((value.x - measuredWidth) + this.zKcAg, f);
        } else {
            canvas.translate(this.ORxRYg, f);
        }
        this.iwGUEr.draw(canvas);
        canvas.restore();
    }

    public final void AYXKKw(android.graphics.Canvas canvas) {
        float f;
        android.util.Pair<KlineSpotAverageBean, android.graphics.Point> pair = this.swzYdv;
        if (pair != null) {
            KlineSpotAverageBean klineSpotAverageBean = (KlineSpotAverageBean) pair.first;
            android.graphics.Point point = (android.graphics.Point) pair.second;
            if (klineSpotAverageBean == null || point == null) {
                return;
            }
            if (this.vLaW == null) {
                android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(C36246oUr.copydefault().AubY());
                this.dxcTrN = layoutInflaterFrom;
                android.view.View viewInflate = layoutInflaterFrom.inflate(C32392mcI.StateListAnimator.OLrzqt, (android.view.ViewGroup) null);
                this.hDKMBd = viewInflate;
                this.vLaW = (C39795pzA) viewInflate.findViewById(C32392mcI.TaskDescription.fJNWhG);
            }
            this.vLaW.setData(klineSpotAverageBean);
            this.hDKMBd.measure(canvas.getWidth(), canvas.getHeight());
            int measuredWidth = this.hDKMBd.getMeasuredWidth();
            int measuredHeight = this.hDKMBd.getMeasuredHeight();
            float f2 = point.y - measuredHeight;
            int iOLrzqt = OLrzqt(klineSpotAverageBean.getOpenAvgPx()) / 2;
            this.zKcAg = iOLrzqt;
            point.x -= iOLrzqt;
            if (f2 < 0.0f) {
                float f3 = point.y + this.spnCvw;
                point.y = (int) f3;
                OLrzqt(canvas, this.fXHmeK, point, true);
                f = f3 + this.djSkpj;
            } else {
                OLrzqt(canvas, this.fXHmeK, point, false);
                f = f2 - this.djSkpj;
            }
            this.hDKMBd.layout(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            if (this.dvImUD.QDqgQU()) {
                canvas.translate((point.x - measuredWidth) + this.zKcAg, f);
            } else {
                canvas.translate(this.ORxRYg, f);
            }
            this.hDKMBd.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean valueOf(android.graphics.Canvas canvas) {
        int i;
        int i2;
        android.util.Pair<java.lang.Boolean, java.lang.Integer> pairGEmmrt = gEmmrt();
        boolean zBooleanValue = ((java.lang.Boolean) pairGEmmrt.first).booleanValue();
        java.util.ArrayList<java.lang.Integer> arrayListDbNXlk = DbNXlk();
        java.util.HashMap<KlineOpenOrderBean, android.graphics.Point> mapFetchVPNInfo = fetchVPNInfo();
        int iOLrzqt = OLrzqt(uzCIH());
        int width = canvas.getWidth() - this.zuBGHE;
        int i3 = (width - iOLrzqt) - this.sSMYrx;
        int i4 = 0;
        while (i4 < this.dvImUD.gasjUx().size()) {
            KlineOpenOrderBean klineOpenOrderBean = this.dvImUD.gasjUx().get(i4);
            if (klineOpenOrderBean.getPrice().isEmpty() || ((java.lang.Integer) pairGEmmrt.second).intValue() == i4) {
                i = i4;
                i2 = i3;
            } else if (java.lang.Double.parseDouble(klineOpenOrderBean.getPrice()) < this.hlkKmr.AkhnZx() || java.lang.Double.parseDouble(klineOpenOrderBean.getPrice()) > this.hlkKmr.DbNXlk()) {
                i = i4;
                i2 = i3;
                if (klineOpenOrderBean.getSelected()) {
                    EZpvd(arrayListDbNXlk, klineOpenOrderBean);
                }
            } else if (this.dvImUD.WS() || klineOpenOrderBean.isTemp()) {
                i = i4;
                i2 = i3;
                copydefault(canvas, klineOpenOrderBean, i4, width, iOLrzqt, i3, mapFetchVPNInfo, arrayListDbNXlk);
            }
            i4 = i + 1;
            i3 = i2;
        }
        int i5 = i3;
        if (zBooleanValue) {
            djBIcL(canvas);
            int iIntValue = ((java.lang.Integer) pairGEmmrt.second).intValue();
            if (iIntValue > -1 && iIntValue < this.dvImUD.gasjUx().size()) {
                KlineOpenOrderBean klineOpenOrderBean2 = this.dvImUD.gasjUx().get(iIntValue);
                ChartArea chartArea = this.dvImUD.values().get(EZpvd());
                int iAhwBna = this.hlkKmr.AhwBna(java.lang.Double.parseDouble(klineOpenOrderBean2.getPrice()));
                if (chartArea != null && iAhwBna >= chartArea.AuCTel() && iAhwBna <= chartArea.KWHzl()) {
                    copydefault(canvas, klineOpenOrderBean2, iIntValue, width, iOLrzqt, i5, mapFetchVPNInfo, arrayListDbNXlk);
                }
            }
        }
        if (!arrayListDbNXlk.isEmpty()) {
            if (arrayListDbNXlk.size() > 1) {
                this.aKErDB = true;
                float f = i5;
                canvas.drawLine(f, ((java.lang.Integer) Collections.min(arrayListDbNXlk)).intValue(), f, ((java.lang.Integer) Collections.max(arrayListDbNXlk)).intValue(), this.QwvEab);
            }
            for (Map.Entry<KlineOpenOrderBean, android.graphics.Point> entry : mapFetchVPNInfo.entrySet()) {
                KlineOpenOrderBean key = entry.getKey();
                android.graphics.Point value = entry.getValue();
                if (key.isTemp()) {
                    if (key.getOrdType().equals("TP_Limit")) {
                        OLrzqt(this.sTzBva.fIwbmz());
                    } else {
                        OLrzqt(this.sTzBva.fJNWhG());
                    }
                } else if (key.getSide().equals("buy")) {
                    OLrzqt(this.sTzBva.fIwbmz());
                } else {
                    OLrzqt(this.sTzBva.fJNWhG());
                }
                if (key.getShowSolid()) {
                    if (key.getShowDragCircle()) {
                        canvas.drawCircle(value.x, value.y, this.RcXXUw, this.DXXBbs);
                    }
                    canvas.drawCircle(value.x, value.y, this.AuCTel, this.OqFWZa);
                } else {
                    canvas.drawCircle(value.x, value.y, this.AuCTel, this.fFgQHt);
                    canvas.drawCircle(value.x, value.y, this.AuCTel, this.QDqgQU);
                }
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(android.graphics.Canvas canvas, KlineOpenOrderBean klineOpenOrderBean, int i, int i2, int i3, int i4, java.util.HashMap<KlineOpenOrderBean, android.graphics.Point> map, java.util.List<java.lang.Integer> list) {
        int i5;
        int i6;
        int i7;
        android.graphics.Paint paint;
        android.graphics.Paint paint2;
        int iOLrzqt;
        int iOLrzqt2;
        int iOLrzqt3;
        int i8;
        java.lang.Object obj;
        int i9;
        android.graphics.Paint paint3;
        android.graphics.Paint paint4;
        int i10;
        java.lang.String strAEQbTJ;
        java.lang.String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iOLrzqt4;
        int iOLrzqt5;
        int iOLrzqt6;
        int i17 = i2 - i3;
        int i18 = this.QOLQEE;
        int i19 = this.QKVWgx;
        if (this.dvImUD.igXuih()) {
            int i20 = i17 - i18;
            int i21 = i17 - i19;
            i5 = i20;
            i6 = i21;
            i7 = 0;
        } else {
            i7 = this.ORxRYg;
            i6 = 0;
            i5 = 0;
        }
        if (this.dvImUD.fHqPtx()) {
            i6 = 0;
        }
        if (klineOpenOrderBean.isMainOrder()) {
            paint = this.KDccX;
            paint2 = this.UlJrfe;
        } else {
            paint = this.DcqEDu;
            paint2 = this.aUsmxb;
        }
        android.graphics.Paint paint5 = paint;
        android.graphics.Paint paint6 = paint2;
        int iAhwBna = this.hlkKmr.AhwBna(java.lang.Double.parseDouble(klineOpenOrderBean.getPrice()));
        int iOLrzqt7 = i2 - OLrzqt(AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(klineOpenOrderBean.getPrice())));
        if (this.dvImUD.igXuih()) {
            if (valueOf(klineOpenOrderBean)) {
                iOLrzqt6 = OLrzqt(EZpvd(klineOpenOrderBean));
            } else {
                iOLrzqt6 = OLrzqt(AEQbTJ(klineOpenOrderBean));
            }
            i7 = i5 - iOLrzqt6;
        } else {
            if (valueOf(klineOpenOrderBean)) {
                iOLrzqt = OLrzqt(EZpvd(klineOpenOrderBean));
            } else {
                iOLrzqt = OLrzqt(AEQbTJ(klineOpenOrderBean));
            }
            i5 = iOLrzqt + i7;
            if (!this.dvImUD.fHqPtx()) {
                i6 = this.AxsJAY + i5;
            }
        }
        int i22 = i7;
        int i23 = i5;
        if (C55296xhK.OLrzqt(C36246oUr.copydefault().AubY())) {
            if (klineOpenOrderBean.isTpLimit().equals("true")) {
                iOLrzqt5 = OLrzqt(ejfBZ());
            } else {
                iOLrzqt5 = OLrzqt(copydefault(klineOpenOrderBean.getOrdType()));
            }
            iOLrzqt3 = i23 - iOLrzqt5;
            if (klineOpenOrderBean.isMultipleOrder()) {
                iOLrzqt3 -= OLrzqt(klineOpenOrderBean.getMultipleOrderNum() + "");
            }
        } else {
            if (klineOpenOrderBean.isTpLimit().equals("true")) {
                iOLrzqt2 = OLrzqt(ejfBZ());
            } else {
                iOLrzqt2 = OLrzqt(copydefault(klineOpenOrderBean.getOrdType()));
            }
            iOLrzqt3 = i22 + iOLrzqt2;
            if (klineOpenOrderBean.isMultipleOrder()) {
                iOLrzqt3 += OLrzqt(klineOpenOrderBean.getMultipleOrderNum() + "");
            }
        }
        int i24 = iOLrzqt3;
        int i25 = this.spnCvw >> 1;
        int i26 = iAhwBna - i25;
        int i27 = iAhwBna + i25;
        if (klineOpenOrderBean.isTemp() && klineOpenOrderBean.getSLLeft() > -1) {
            copydefault(paint6, paint5, klineOpenOrderBean.getOrdType().equals("TP_Limit"));
            EZpvd(canvas, this.hlkKmr, klineOpenOrderBean, iAhwBna);
        } else if (klineOpenOrderBean.isTemp() && klineOpenOrderBean.getTPLeft() > -1) {
            copydefault(paint6, paint5, klineOpenOrderBean.getOrdType().equals("TP_Limit"));
            EZpvd(canvas, this.hlkKmr, klineOpenOrderBean, iAhwBna);
        } else if (klineOpenOrderBean.getSide().equals("buy")) {
            this.dUDNAs.setColor(this.sTzBva.fIwbmz());
            paint6.setColor(this.sTzBva.fIwbmz());
            this.akftKQ.setColor(this.sTzBva.fIwbmz());
            this.UscePu.setColor(this.sTzBva.fIwbmz());
            paint5.setColor(this.sTzBva.fIwbmz());
            this.RVsVBY.setColor(this.sTzBva.fIwbmz());
            this.flVtFt.setColor(this.sTzBva.fIwbmz());
        } else {
            this.dUDNAs.setColor(this.sTzBva.fJNWhG());
            paint6.setColor(this.sTzBva.fJNWhG());
            this.akftKQ.setColor(this.sTzBva.fJNWhG());
            this.UscePu.setColor(this.sTzBva.fJNWhG());
            paint5.setColor(this.sTzBva.fJNWhG());
            this.RVsVBY.setColor(this.sTzBva.fJNWhG());
            this.flVtFt.setColor(this.sTzBva.fJNWhG());
        }
        if (klineOpenOrderBean.isChangePrice()) {
            KWHzl(canvas, klineOpenOrderBean);
        }
        if (klineOpenOrderBean.getSelected() && klineOpenOrderBean.getShowSolid()) {
            this.dUDNAs.setAlpha(255);
            this.dUDNAs.setStrokeWidth(this.zLjUOn);
            this.UscePu.setColor(this.sTzBva.AuCTel());
        } else {
            this.dUDNAs.setAlpha(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256);
            this.dUDNAs.setStrokeWidth(this.QVAiDq);
            this.flVtFt.setColor(this.sTzBva.OLrzqt());
        }
        paint6.setAlpha(255);
        this.akftKQ.setAlpha(255);
        paint5.setAlpha(255);
        int i28 = -1;
        KWHzl(canvas, klineOpenOrderBean.isTemp() ? 0 : i6, iOLrzqt7, iAhwBna, this.dUDNAs);
        this.EZpvd = "";
        if (klineOpenOrderBean.getSelected() && klineOpenOrderBean.getShowSolid() && klineOpenOrderBean.getTriggerPxType() != null && !klineOpenOrderBean.getTriggerPxType().isEmpty() && !klineOpenOrderBean.getTriggerPxType().equals("last")) {
            java.lang.StringBuilder sbFJNWhG = fJNWhG();
            if (klineOpenOrderBean.getTriggerPxType().equals("mark")) {
                this.EZpvd = C36246oUr.copydefault().AubY().getResources().getString(C32392mcI.Dialog.fHqPtx);
            } else if (klineOpenOrderBean.getTriggerPxType().equals("index")) {
                this.EZpvd = C36246oUr.copydefault().AubY().getResources().getString(C32392mcI.Dialog.UrRBLY);
            } else if (klineOpenOrderBean.getTriggerPxType().equals("active")) {
                this.EZpvd = C36246oUr.copydefault().AubY().getResources().getString(C32392mcI.Dialog.DcqEDu);
            }
            sbFJNWhG.append(this.EZpvd);
            sbFJNWhG.append("   ");
            iOLrzqt7 -= (int) this.akftKQ.measureText(sbFJNWhG.toString());
            if (C55296xhK.OLrzqt(C36246oUr.copydefault().AubY())) {
                iOLrzqt4 = i2 - OLrzqt(this.EZpvd);
            } else {
                iOLrzqt4 = iOLrzqt7 + OLrzqt(this.EZpvd);
            }
            int i29 = iOLrzqt4;
            sbFJNWhG.append(AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(klineOpenOrderBean.getPrice())));
            i8 = i26;
            obj = "true";
            i9 = iAhwBna;
            paint3 = paint5;
            paint4 = paint6;
            AEQbTJ(canvas, iOLrzqt7, i26, i2, i27, iAhwBna, this.flVtFt, paint5, this.UscePu, this.heceqZ, sbFJNWhG.toString());
            if (i29 > 0) {
                copydefault(canvas, i29, i8, i27, paint4);
            }
        } else {
            i8 = i26;
            obj = "true";
            i9 = iAhwBna;
            paint3 = paint5;
            paint4 = paint6;
            AEQbTJ(canvas, iOLrzqt7, i8, i2, i27, i9, this.flVtFt, paint3, this.UscePu, this.heceqZ, AbstractC36302oWt.AYXKKw(java.lang.Double.parseDouble(klineOpenOrderBean.getPrice())));
        }
        int i30 = iOLrzqt7;
        if (klineOpenOrderBean.getSelected() && klineOpenOrderBean.getShowSolid() && !klineOpenOrderBean.isTemp() && this.dvImUD.QXDzTk() && klineOpenOrderBean.isSupportDragAndCancel()) {
            if (this.dvImUD.igXuih()) {
                int i31 = this.AkhnZx;
                i22 -= i31;
                i24 -= i31;
            } else {
                i23 += this.AkhnZx;
            }
        } else if (klineOpenOrderBean.isTemp() && (klineOpenOrderBean.getSLLeft() > 0 || klineOpenOrderBean.getTPLeft() > 0)) {
            int width = ((canvas.getWidth() / 2) - (((int) this.akftKQ.measureText(copydefault(klineOpenOrderBean.getOrdType()))) / 2)) - this.fERRXa;
            int iOLrzqt8 = OLrzqt(copydefault(klineOpenOrderBean.getOrdType()));
            i22 = width;
            i10 = iOLrzqt8 + width;
            strAEQbTJ = AEQbTJ(klineOpenOrderBean);
            if (!klineOpenOrderBean.isTemp() && klineOpenOrderBean.isShowTempPnl()) {
                strAEQbTJ = copydefault(klineOpenOrderBean.getOrdType());
            } else if (valueOf(klineOpenOrderBean) && klineOpenOrderBean.isShowTempPnl()) {
                strAEQbTJ = EZpvd(klineOpenOrderBean);
            }
            str = strAEQbTJ;
            if (!valueOf(klineOpenOrderBean) && klineOpenOrderBean.isShowTempPnl()) {
                i11 = i10;
                i12 = i30;
                EZpvd(klineOpenOrderBean, canvas, i22, i8, i10, i27, i9, this.fFgQHt, paint3, this.akftKQ, this.heceqZ, str);
            } else {
                i11 = i10;
                i12 = i30;
                AEQbTJ(canvas, i22, i8, i11, i27, i9, this.fFgQHt, paint3, this.akftKQ, this.heceqZ, str);
            }
            if (!klineOpenOrderBean.isTemp() && klineOpenOrderBean.isShowTempPnl() && valueOf(klineOpenOrderBean)) {
                i13 = i9;
                copydefault(canvas, klineOpenOrderBean, KWHzl(klineOpenOrderBean), i13);
            } else {
                i13 = i9;
            }
            if (klineOpenOrderBean.isShowTempPnl() && i28 > 0) {
                copydefault(canvas, i28, i8, i27, paint4);
            }
            if (klineOpenOrderBean.getSelected() && klineOpenOrderBean.getShowSolid() && !klineOpenOrderBean.isTemp() && this.dvImUD.QXDzTk() && klineOpenOrderBean.isSupportDragAndCancel()) {
                copydefault(i, canvas, i11, i8, i27, paint4);
            }
            if (klineOpenOrderBean.getSelected()) {
                i14 = i11;
            } else {
                map.put(klineOpenOrderBean, new android.graphics.Point(i4, i13));
                list.add(java.lang.Integer.valueOf(i13));
                if (!klineOpenOrderBean.getCostPrice().isEmpty() && C36246oUr.copydefault().run()) {
                    copydefault(list, klineOpenOrderBean.getCostPrice());
                }
                if (!klineOpenOrderBean.getCostLiq().isEmpty() && C36246oUr.copydefault().DCUTEIddSDPG()) {
                    copydefault(list, klineOpenOrderBean.getCostLiq());
                }
                if (!klineOpenOrderBean.getCostBE().isEmpty() && C36246oUr.copydefault().DCUTEIdCUTEI()) {
                    copydefault(list, klineOpenOrderBean.getCostBE());
                }
                if (!klineOpenOrderBean.getAccAvgPx().isEmpty()) {
                    list.add(java.lang.Integer.valueOf(this.hlkKmr.AhwBna(java.lang.Double.parseDouble(klineOpenOrderBean.getAccAvgPx()))));
                }
                if ((klineOpenOrderBean.getOrdType().equals("limit") || klineOpenOrderBean.getOrdType().equals("post_only")) && !klineOpenOrderBean.getReduceOnly().equals(obj) && klineOpenOrderBean.isMainOrder() && ((klineOpenOrderBean.getInstType().equals(oLT.AuCTel()) || klineOpenOrderBean.getInstType().equals(oLT.KWHzl())) && this.dvImUD.QXDzTk() && klineOpenOrderBean.getShowSolid())) {
                    if (this.dvImUD.igXuih()) {
                        int i32 = this.ORxRYg;
                        if (!klineOpenOrderBean.isDragging()) {
                            int i33 = (i22 - i32) - this.QbewEr;
                            if (!klineOpenOrderBean.getHaveTP() && !klineOpenOrderBean.getHaveSL()) {
                                int iOLrzqt9 = i33 - OLrzqt(copydefault("TP_SL"));
                                copydefault("TP_SL", i, canvas, this.DWgRXt, this.fdOvFl, iOLrzqt9, i8, i33, i27, i13);
                                klineOpenOrderBean.setTPLeft(iOLrzqt9);
                            } else if (klineOpenOrderBean.getHaveTP() && !klineOpenOrderBean.getHaveSL()) {
                                int iOLrzqt10 = (i33 - OLrzqt(copydefault("SL_Limit"))) - this.QbewEr;
                                copydefault("SL_Limit", i, canvas, this.DWgRXt, this.fdOvFl, iOLrzqt10, i8, i33, i27, i13);
                                klineOpenOrderBean.setSLLeft(iOLrzqt10);
                            } else if (!klineOpenOrderBean.getHaveTP() && klineOpenOrderBean.getHaveSL()) {
                                int iOLrzqt11 = (i33 - OLrzqt(copydefault("TP_Limit"))) - this.QbewEr;
                                copydefault("TP_Limit", i, canvas, this.DWgRXt, this.fdOvFl, iOLrzqt11, i8, i33, i27, i13);
                                klineOpenOrderBean.setTPLeft(iOLrzqt11);
                            } else {
                                i16 = i22;
                                if (!this.dvImUD.fHqPtx()) {
                                    KWHzl(canvas, i16, i22, i13, this.dUDNAs);
                                }
                            }
                            i16 = i33;
                            if (!this.dvImUD.fHqPtx()) {
                            }
                        }
                    } else {
                        int i34 = this.ORxRYg;
                        if (!klineOpenOrderBean.isDragging()) {
                            i14 = i11;
                            int i35 = i14 + i34 + this.QbewEr;
                            if (!klineOpenOrderBean.getHaveTP() && !klineOpenOrderBean.getHaveSL()) {
                                copydefault("TP_SL", i, canvas, this.DWgRXt, this.fdOvFl, i35, i8, i35 + OLrzqt(copydefault("TP_SL")), i27, i13);
                                klineOpenOrderBean.setTPLeft(i35);
                            } else if (klineOpenOrderBean.getHaveTP() && !klineOpenOrderBean.getHaveSL()) {
                                copydefault("SL_Limit", i, canvas, this.DWgRXt, this.fdOvFl, i35, i8, OLrzqt(copydefault("SL_Limit")) + i35 + this.QbewEr, i27, i13);
                                klineOpenOrderBean.setSLLeft(i35);
                            } else if (!klineOpenOrderBean.getHaveTP() && klineOpenOrderBean.getHaveSL()) {
                                copydefault("TP_Limit", i, canvas, this.DWgRXt, this.fdOvFl, i35, i8, OLrzqt(copydefault("TP_Limit")) + i35 + this.QbewEr, i27, i13);
                                klineOpenOrderBean.setTPLeft(i35);
                            }
                        }
                        if (klineOpenOrderBean.getShowSolid() && !klineOpenOrderBean.isDragging() && !this.dvImUD.igXuih() && klineOpenOrderBean.isOrderCanDrag() && this.dvImUD.QXDzTk() && this.dvImUD.DsrFlB()) {
                            EZpvd(canvas, !klineOpenOrderBean.getSide().equals("buy") ? this.sTzBva.fIwbmz() : this.sTzBva.fJNWhG(), this.hlkKmr.AhwBna(java.lang.Double.parseDouble(klineOpenOrderBean.getPrice())));
                        }
                    }
                    i14 = i11;
                    if (klineOpenOrderBean.getShowSolid()) {
                        EZpvd(canvas, !klineOpenOrderBean.getSide().equals("buy") ? this.sTzBva.fIwbmz() : this.sTzBva.fJNWhG(), this.hlkKmr.AhwBna(java.lang.Double.parseDouble(klineOpenOrderBean.getPrice())));
                    }
                } else {
                    i14 = i11;
                    if (klineOpenOrderBean.getShowSolid()) {
                    }
                }
            }
            if (klineOpenOrderBean.getLongClick()) {
                i15 = i8;
            } else {
                i15 = i8;
                this.apNbdB.put(klineOpenOrderBean, new android.graphics.Point(i14, i15));
            }
            if (this.dvImUD.zLjUOn().isOrderSupportClick()) {
                return;
            }
            int i36 = this.dvImUD.fHqPtx() ? 0 : i22;
            LinkedHashMap<java.lang.Integer, RectF> linkedHashMapAxsJAY = this.dvImUD.iwGUEr().AxsJAY();
            int i37 = this.ORxRYg;
            linkedHashMapAxsJAY.put(java.lang.Integer.valueOf(i), new RectF(i36, i15 - i37, i12, i27 + i37));
            return;
        }
        i10 = i23;
        i28 = i24;
        strAEQbTJ = AEQbTJ(klineOpenOrderBean);
        if (!klineOpenOrderBean.isTemp()) {
            if (valueOf(klineOpenOrderBean)) {
                strAEQbTJ = EZpvd(klineOpenOrderBean);
            }
        }
        str = strAEQbTJ;
        if (!valueOf(klineOpenOrderBean)) {
            i11 = i10;
            i12 = i30;
            AEQbTJ(canvas, i22, i8, i11, i27, i9, this.fFgQHt, paint3, this.akftKQ, this.heceqZ, str);
        }
        if (!klineOpenOrderBean.isTemp()) {
            i13 = i9;
        }
        if (klineOpenOrderBean.isShowTempPnl()) {
            copydefault(canvas, i28, i8, i27, paint4);
        }
        if (klineOpenOrderBean.getSelected()) {
            copydefault(i, canvas, i11, i8, i27, paint4);
        }
        if (klineOpenOrderBean.getSelected()) {
        }
        if (klineOpenOrderBean.getLongClick()) {
        }
        if (this.dvImUD.zLjUOn().isOrderSupportClick()) {
        }
    }

    public final void copydefault(android.graphics.Canvas canvas, KlineOpenOrderBean klineOpenOrderBean, java.lang.String str, int i) {
        int i2;
        int i3;
        boolean z;
        java.lang.String str2 = this.AEQbTJ + str;
        if (this.dvImUD.iwGUEr().QVAiDq().get(EZpvd()) == null) {
            return;
        }
        int width = ((canvas.getWidth() / 2) - (((int) this.akftKQ.measureText(str2)) / 2)) - this.fERRXa;
        int iOLrzqt = OLrzqt(str2);
        int iAEQbTJ = AEQbTJ(i, true);
        int i4 = this.htlTjW;
        int i5 = iAEQbTJ + i4;
        int i6 = i4 / 2;
        int width2 = canvas.getWidth() / 2;
        int i7 = this.spnCvw / 2;
        int i8 = this.ORxRYg;
        if ((klineOpenOrderBean.getMainPrice().isEmpty() || !C33129mqd.gEmmrt(klineOpenOrderBean.getPrice(), klineOpenOrderBean.getMainPrice())) && (klineOpenOrderBean.getCostPrice().isEmpty() || !C33129mqd.gEmmrt(klineOpenOrderBean.getPrice(), klineOpenOrderBean.getCostPrice()))) {
            i2 = (i - i7) - i8;
            i3 = i6 + iAEQbTJ;
            z = true;
        } else {
            int iAEQbTJ2 = AEQbTJ(i, false);
            int i9 = this.htlTjW;
            i2 = i + (this.spnCvw / 2);
            i3 = (i9 / 2) + iAEQbTJ2;
            i5 = i9 + iAEQbTJ2;
            z = false;
            iAEQbTJ = iAEQbTJ2;
        }
        android.graphics.Point pointAkhnZx = AkhnZx();
        pointAkhnZx.set(width2, i2);
        OLrzqt(canvas, this.giSNqX, pointAkhnZx, true ^ z);
        AEQbTJ(canvas, width, iAEQbTJ, width + iOLrzqt, i5, i3, this.giSNqX, this.akftKQ, this.Dmq, str);
    }

    public final int AEQbTJ(int i, boolean z) {
        int i2 = this.spnCvw / 2;
        return !z ? i + i2 + this.ORxRYg : ((i - i2) - this.QbewEr) - this.htlTjW;
    }

    public final void KWHzl(android.graphics.Canvas canvas, KlineOpenOrderBean klineOpenOrderBean) {
        this.RVsVBY.setAlpha(50);
        RectF rectFAuCTel = AuCTel();
        rectFAuCTel.set(0.0f, this.hlkKmr.AhwBna(java.lang.Double.parseDouble(klineOpenOrderBean.getOldPrice())), canvas.getWidth(), this.hlkKmr.AhwBna(java.lang.Double.parseDouble(klineOpenOrderBean.getPrice())));
        canvas.drawRoundRect(rectFAuCTel, 0.0f, 0.0f, this.RVsVBY);
    }

    public final void EZpvd(android.graphics.Canvas canvas, oWC owc, KlineOpenOrderBean klineOpenOrderBean, int i) {
        this.RVsVBY.setAlpha(50);
        RectF rectFAuCTel = AuCTel();
        if (!klineOpenOrderBean.getCostPrice().isEmpty()) {
            rectFAuCTel.set(0.0f, i, canvas.getWidth(), owc.AhwBna(java.lang.Double.parseDouble(klineOpenOrderBean.getCostPrice())));
            canvas.drawRoundRect(rectFAuCTel, 0.0f, 0.0f, this.RVsVBY);
        } else if (!klineOpenOrderBean.getAccAvgPx().isEmpty()) {
            rectFAuCTel.set(0.0f, i, canvas.getWidth(), owc.AhwBna(java.lang.Double.parseDouble(klineOpenOrderBean.getAccAvgPx())));
            canvas.drawRoundRect(rectFAuCTel, 0.0f, 0.0f, this.RVsVBY);
        } else {
            if (klineOpenOrderBean.getMainPrice().isEmpty()) {
                return;
            }
            rectFAuCTel.set(0.0f, i, canvas.getWidth(), owc.AhwBna(java.lang.Double.parseDouble(klineOpenOrderBean.getMainPrice())));
            canvas.drawRoundRect(rectFAuCTel, 0.0f, 0.0f, this.RVsVBY);
        }
    }

    public final void copydefault(android.graphics.Paint paint, android.graphics.Paint paint2, boolean z) {
        if (z) {
            this.dUDNAs.setColor(this.sTzBva.fIwbmz());
            paint.setColor(this.sTzBva.fIwbmz());
            this.akftKQ.setColor(this.sTzBva.fIwbmz());
            paint2.setColor(this.sTzBva.fIwbmz());
            this.RVsVBY.setColor(this.sTzBva.fIwbmz());
            this.flVtFt.setColor(this.sTzBva.fIwbmz());
            return;
        }
        this.dUDNAs.setColor(this.sTzBva.fJNWhG());
        paint.setColor(this.sTzBva.fJNWhG());
        this.akftKQ.setColor(this.sTzBva.fJNWhG());
        paint2.setColor(this.sTzBva.fJNWhG());
        this.RVsVBY.setColor(this.sTzBva.fJNWhG());
        this.flVtFt.setColor(this.sTzBva.fJNWhG());
    }

    public final java.lang.String ejfBZ() {
        return C36246oUr.copydefault().AubY().getResources().getText(C32392mcI.Dialog.gUEfcq).toString();
    }

    public final boolean valueOf(KlineOpenOrderBean klineOpenOrderBean) {
        return !klineOpenOrderBean.isMainOrder() || (klineOpenOrderBean.isCostConnect() && !klineOpenOrderBean.getInstType().equals(oLT.isConnected()));
    }

    public final void copydefault(android.graphics.Canvas canvas, int i, int i2, int i3, android.graphics.Paint paint) {
        android.graphics.Path pathValues = values();
        float f = i;
        pathValues.moveTo(f, i2);
        pathValues.lineTo(f, i3);
        canvas.drawPath(pathValues, paint);
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, int i, int i2, int i3, int i4, int i5, android.graphics.Paint paint, android.graphics.Paint paint2, android.graphics.Paint paint3, int i6, java.lang.String str) {
        this.gmHjFq.set(i, i2, i3, i4);
        float f = i6;
        canvas.drawRoundRect(this.gmHjFq, f, f, paint);
        canvas.drawRoundRect(this.gmHjFq, f, f, paint2);
        canvas.drawText(str, i + this.fERRXa, i5 + this.dLBcXg, paint3);
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, int i, int i2, int i3, int i4, int i5, android.graphics.Paint paint, android.graphics.Paint paint2, int i6, java.lang.String str) {
        RectF rectFAuCTel = AuCTel();
        rectFAuCTel.set(i, i2, i3, i4);
        float f = i6;
        canvas.drawRoundRect(rectFAuCTel, f, f, paint);
        float f2 = i5;
        canvas.drawText(this.AEQbTJ, this.fERRXa + i, this.dLBcXg + f2, this.aHXSQp);
        KWHzl(paint2, str);
        canvas.drawText(str, i + this.fERRXa + this.aHXSQp.measureText(this.AEQbTJ), f2 + this.dLBcXg, paint2);
    }

    public final void EZpvd(KlineOpenOrderBean klineOpenOrderBean, android.graphics.Canvas canvas, int i, int i2, int i3, int i4, int i5, android.graphics.Paint paint, android.graphics.Paint paint2, android.graphics.Paint paint3, int i6, java.lang.String str) {
        RectF rectFAuCTel = AuCTel();
        rectFAuCTel.set(i, i2, i3, i4);
        float f = i6;
        canvas.drawRoundRect(rectFAuCTel, f, f, paint);
        canvas.drawRoundRect(rectFAuCTel, f, f, paint2);
        java.lang.String[] strArrSplit = str.split("   ");
        if (strArrSplit.length >= 2) {
            float f2 = i5;
            canvas.drawText(strArrSplit[0], this.fERRXa + i, this.dLBcXg + f2, paint3);
            if ((klineOpenOrderBean.isTemp() && klineOpenOrderBean.getSLLeft() > -1) || (klineOpenOrderBean.isTemp() && klineOpenOrderBean.getTPLeft() > -1)) {
                KWHzl(paint3, strArrSplit[1]);
            } else if (strArrSplit[1].contains(Marker.ANY_NON_NULL_MARKER)) {
                paint3.setColor(this.sTzBva.fIwbmz());
            } else if (strArrSplit[1].contains("-")) {
                paint3.setColor(this.sTzBva.fJNWhG());
            } else {
                paint3.setColor(this.sTzBva.getNewProxyInstance());
            }
            canvas.drawText(strArrSplit[1], i + this.fERRXa + OLrzqt(strArrSplit[0]), f2 + this.dLBcXg, paint3);
            return;
        }
        canvas.drawText(str, i + this.fERRXa, i5 + this.dLBcXg, paint3);
    }

    public final void KWHzl(android.graphics.Paint paint, java.lang.String str) {
        if (str.contains(Marker.ANY_NON_NULL_MARKER)) {
            paint.setColor(this.sTzBva.fIwbmz());
        } else if (str.contains("-")) {
            paint.setColor(this.sTzBva.fJNWhG());
        }
    }

    public final void copydefault(int i, android.graphics.Canvas canvas, int i2, int i3, int i4, android.graphics.Paint paint) {
        copydefault(canvas, i2 - this.AkhnZx, i3, i4, paint);
        int i5 = this.AkhnZx;
        int i6 = i5 / 4;
        copydefault(canvas, (i2 - i5) + i6, i3 + i6, i2 - i6, (i5 + i3) - i6);
        LinkedHashMap<java.lang.Integer, RectF> linkedHashMapZuBGHE = this.dvImUD.iwGUEr().zuBGHE();
        float f = i2 - this.AkhnZx;
        int i7 = this.ORxRYg;
        linkedHashMapZuBGHE.put(java.lang.Integer.valueOf(i), new RectF(f, i3 - i7, i2, i4 + i7));
    }

    public final void EZpvd(java.util.List<java.lang.Integer> list, KlineOpenOrderBean klineOpenOrderBean) {
        if (java.lang.Double.parseDouble(klineOpenOrderBean.getPrice()) > this.hlkKmr.DbNXlk()) {
            list.add(0);
        } else {
            list.add(java.lang.Integer.valueOf(this.hlkKmr.gEmmrt()));
        }
        if (!klineOpenOrderBean.getCostPrice().isEmpty() && C36246oUr.copydefault().run()) {
            list.add(java.lang.Integer.valueOf(this.hlkKmr.AhwBna(java.lang.Double.parseDouble(klineOpenOrderBean.getCostPrice()))));
        } else if (!klineOpenOrderBean.getAccAvgPx().isEmpty()) {
            list.add(java.lang.Integer.valueOf(this.hlkKmr.AhwBna(java.lang.Double.parseDouble(klineOpenOrderBean.getAccAvgPx()))));
        }
        if (!klineOpenOrderBean.getCostLiq().isEmpty() && C36246oUr.copydefault().DCUTEIddSDPG()) {
            copydefault(list, klineOpenOrderBean.getCostLiq());
        }
        if (klineOpenOrderBean.getCostBE().isEmpty() || !C36246oUr.copydefault().DCUTEIdCUTEI()) {
            return;
        }
        copydefault(list, klineOpenOrderBean.getCostBE());
    }

    public final void copydefault(java.util.List<java.lang.Integer> list, java.lang.String str) {
        if (java.lang.Double.parseDouble(str) > this.hlkKmr.DbNXlk()) {
            list.add(0);
        } else if (java.lang.Double.parseDouble(str) < this.hlkKmr.AkhnZx()) {
            list.add(java.lang.Integer.valueOf(this.hlkKmr.gEmmrt()));
        } else {
            list.add(java.lang.Integer.valueOf(this.hlkKmr.gEmmrt(java.lang.Double.parseDouble(str))));
        }
    }

    public final void AhwBna(android.graphics.Canvas canvas) {
        float f;
        if (this.apNbdB.isEmpty()) {
            return;
        }
        KlineOpenOrderBean klineOpenOrderBean = null;
        android.graphics.Point value = null;
        for (Map.Entry<KlineOpenOrderBean, android.graphics.Point> entry : this.apNbdB.entrySet()) {
            KlineOpenOrderBean key = entry.getKey();
            value = entry.getValue();
            klineOpenOrderBean = key;
        }
        if (klineOpenOrderBean == null || value == null) {
            return;
        }
        if (this.zDUObI == null) {
            android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(C36246oUr.copydefault().AubY());
            this.dxcTrN = layoutInflaterFrom;
            android.view.View viewInflate = layoutInflaterFrom.inflate(C32392mcI.StateListAnimator.AEQbTJ, (android.view.ViewGroup) null);
            this.fARcdN = viewInflate;
            this.zDUObI = (C39799pzE) viewInflate.findViewById(C32392mcI.TaskDescription.fJNWhG);
        }
        this.zDUObI.setData(klineOpenOrderBean);
        this.fARcdN.measure(canvas.getWidth(), canvas.getHeight());
        int measuredWidth = this.fARcdN.getMeasuredWidth();
        int measuredHeight = this.fARcdN.getMeasuredHeight();
        float f2 = value.y - measuredHeight;
        int iOLrzqt = OLrzqt(klineOpenOrderBean.getAmountNoSign()) / 2;
        this.zKcAg = iOLrzqt;
        value.x -= iOLrzqt;
        if (f2 < 0.0f) {
            float f3 = value.y + this.spnCvw;
            value.y = (int) f3;
            OLrzqt(canvas, this.fXHmeK, value, true);
            f = f3 + this.djSkpj;
        } else {
            OLrzqt(canvas, this.fXHmeK, value, false);
            f = f2 - this.djSkpj;
        }
        this.fARcdN.layout(0, 0, measuredWidth, measuredHeight);
        canvas.save();
        if (this.dvImUD.igXuih()) {
            canvas.translate((value.x - measuredWidth) + this.zKcAg, f);
        } else {
            canvas.translate(this.ORxRYg, f);
        }
        this.fARcdN.draw(canvas);
        canvas.restore();
    }

    public final void OLrzqt(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.Point point, boolean z) {
        android.graphics.Path pathValues = values();
        if (z) {
            pathValues.moveTo(point.x, point.y);
            pathValues.lineTo(point.x - this.RJOkX, point.y + this.djSkpj);
            pathValues.lineTo(point.x + this.RJOkX, point.y + this.djSkpj);
            pathValues.close();
            canvas.drawPath(pathValues, paint);
            return;
        }
        pathValues.moveTo(point.x, point.y);
        pathValues.lineTo(point.x - this.RJOkX, point.y - this.djSkpj);
        pathValues.lineTo(point.x + this.RJOkX, point.y - this.djSkpj);
        pathValues.close();
        canvas.drawPath(pathValues, paint);
    }

    public final java.lang.String AEQbTJ(KlineOpenOrderBean klineOpenOrderBean) {
        if (!klineOpenOrderBean.isShowTempPnl()) {
            return copydefault(klineOpenOrderBean.getOrdType());
        }
        if (klineOpenOrderBean.isMultipleOrder()) {
            return copydefault(klineOpenOrderBean.getOrdType()) + " #" + klineOpenOrderBean.getMultipleOrderNum() + "   " + klineOpenOrderBean.getAmountNoSign();
        }
        if (klineOpenOrderBean.isTpLimit().equals("true")) {
            return ejfBZ() + "   " + klineOpenOrderBean.getAmountNoSign();
        }
        return copydefault(klineOpenOrderBean.getOrdType()) + "   " + klineOpenOrderBean.getAmountNoSign();
    }

    public final java.lang.String EZpvd(KlineOpenOrderBean klineOpenOrderBean) {
        java.lang.String strCopydefault;
        if (this.dvImUD.QIZEnU() || klineOpenOrderBean.getInstType().equals(oLT.fetchVPNInfo()) || klineOpenOrderBean.getInstType().equals(oLT.isConnected())) {
            strCopydefault = copydefault(klineOpenOrderBean);
        } else {
            strCopydefault = OLrzqt(klineOpenOrderBean);
        }
        if (klineOpenOrderBean.isMultipleOrder()) {
            return copydefault(klineOpenOrderBean.getOrdType()) + " #" + klineOpenOrderBean.getMultipleOrderNum() + "   " + strCopydefault;
        }
        if (klineOpenOrderBean.isTpLimit().equals("true")) {
            return ejfBZ() + "   " + strCopydefault;
        }
        return copydefault(klineOpenOrderBean.getOrdType()) + "   " + strCopydefault;
    }

    public final java.lang.String KWHzl(KlineOpenOrderBean klineOpenOrderBean) {
        java.lang.String strKWHzl = pTB.KWHzl(klineOpenOrderBean.getPnl());
        if (C33129mqd.AEQbTJ(klineOpenOrderBean.getPnl(), 0)) {
            strKWHzl = Marker.ANY_NON_NULL_MARKER + strKWHzl;
        }
        java.lang.String strAEQbTJ = pTB.AEQbTJ(pTB.OLrzqt((java.lang.Object) klineOpenOrderBean.getPnlRatio()), 2, 2, RoundingMode.DOWN);
        if (klineOpenOrderBean.getPnlRatio().isEmpty()) {
            return strKWHzl;
        }
        return strKWHzl + " (" + strAEQbTJ + ")";
    }

    public final java.lang.String copydefault(KlineOpenOrderBean klineOpenOrderBean) {
        java.lang.String strKWHzl = pTB.KWHzl(klineOpenOrderBean.getPnl());
        if (!C33129mqd.AEQbTJ(klineOpenOrderBean.getPnl(), 0)) {
            return strKWHzl;
        }
        return Marker.ANY_NON_NULL_MARKER + strKWHzl;
    }

    public final java.lang.String OLrzqt(KlineOpenOrderBean klineOpenOrderBean) {
        return pTB.AEQbTJ(pTB.OLrzqt((java.lang.Object) klineOpenOrderBean.getPnlRatio()), 2, 2, RoundingMode.DOWN);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "move_order_stop":
                return C36246oUr.copydefault().AubY().getResources().getText(C32392mcI.Dialog.fIwbmz).toString();
            case "TP_SL":
                return ((java.lang.Object) C36246oUr.copydefault().AubY().getResources().getText(C32392mcI.Dialog.fJNWhG)) + "/" + ((java.lang.Object) C36246oUr.copydefault().AubY().getResources().getText(C32392mcI.Dialog.gEmmrt));
            case "limit":
                return C36246oUr.copydefault().AubY().getResources().getText(C32392mcI.Dialog.OLrzqt).toString();
            case "SL_Limit":
            case "SL_Market":
                return C36246oUr.copydefault().AubY().getResources().getText(C32392mcI.Dialog.gEmmrt).toString();
            case "TP_Limit":
            case "TP_Market":
                return C36246oUr.copydefault().AubY().getResources().getText(C32392mcI.Dialog.fJNWhG).toString();
            case "post_only":
                return C36246oUr.copydefault().AubY().getResources().getText(C32392mcI.Dialog.copydefault).toString();
            default:
                return C36246oUr.copydefault().AubY().getResources().getText(C32392mcI.Dialog.ejfBZ).toString();
        }
    }

    public final void copydefault(android.graphics.Canvas canvas, C36246oUr c36246oUr, oWN own) {
        java.lang.String str;
        com.okinc.kline.library.data.DataSource dataSource;
        int i;
        float f;
        int i2;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i3;
        VectorDrawable vectorDrawable;
        VectorDrawable vectorDrawable2;
        java.lang.String str2;
        java.lang.Object obj3;
        int i4;
        oWC owc = c36246oUr.iwGUEr().QVAiDq().get(EZpvd());
        com.okinc.kline.library.data.DataSource dataSource2 = c36246oUr.zLjUOn().getDataSources().get(copydefault());
        if (owc == null || dataSource2 == null || owc.AuCTel() == AudioStats.AUDIO_AMPLITUDE_NONE || dataSource2.gEmmrt() < 1) {
            return;
        }
        int iIsConnected = own.isConnected();
        float fAYXKKw = own.AYXKKw(iIsConnected);
        float fCopydefault = AbstractC36302oWt.copydefault(6.0f);
        float fAhwBna = own.AhwBna();
        int i5 = iIsConnected;
        float f2 = fAYXKKw - fCopydefault;
        for (int iEjfBZ = own.ejfBZ(); i5 < iEjfBZ; iEjfBZ = i) {
            DataSource.StateListAnimator stateListAnimator = dataSource2.AEQbTJ.get(i5);
            int iAhwBna = owc.AhwBna(stateListAnimator.AkhnZx()) - AbstractC36302oWt.copydefault(14.0f);
            int iAhwBna2 = owc.AhwBna(stateListAnimator.values()) + AbstractC36302oWt.copydefault(2.0f);
            if (stateListAnimator.fIwbmz().isEmpty() || "0".equals(stateListAnimator.fIwbmz()) || iAhwBna > owc.gEmmrt() || iAhwBna < 0) {
                str = "0";
                dataSource = dataSource2;
                i = iEjfBZ;
                f = fAhwBna;
                i2 = i5;
                obj = "lite_mode";
                obj2 = "defi_mode_dex";
                i3 = iAhwBna2;
            } else {
                if (Objects.equals(C36246oUr.copydefault().fZBcTu(), "defi_mode_dex")) {
                    vectorDrawable2 = stateListAnimator.DTwDnp != null ? this.iPSTqm : this.zsXlph;
                } else {
                    vectorDrawable2 = Objects.equals(C36246oUr.copydefault().fZBcTu(), "lite_mode") ? this.zsXlph : this.hvKCwS;
                }
                VectorDrawable vectorDrawable3 = vectorDrawable2;
                if (vectorDrawable3 != null) {
                    RectF rectFAuCTel = AuCTel();
                    str2 = "0";
                    float f3 = this.zLjUOn;
                    obj3 = "lite_mode";
                    i4 = iAhwBna2;
                    int i6 = (int) f2;
                    dataSource = dataSource2;
                    int i7 = this.QfsBiF;
                    i = iEjfBZ;
                    rectFAuCTel.set(f3 + f2, iAhwBna, i6 + i7, i7 + iAhwBna);
                    float f4 = this.heceqZ;
                    canvas.drawRoundRect(rectFAuCTel, f4, f4, this.hUfVAv);
                    int i8 = this.AwvSrB;
                    vectorDrawable3.setBounds(i6, iAhwBna, i6 + i8, i8 + iAhwBna);
                    vectorDrawable3.draw(canvas);
                } else {
                    str2 = "0";
                    obj3 = "lite_mode";
                    i4 = iAhwBna2;
                    dataSource = dataSource2;
                    i = iEjfBZ;
                }
                android.graphics.drawable.Drawable drawable = stateListAnimator.DTwDnp;
                if (drawable != null) {
                    int i9 = ((int) f2) + this.AxsJAY;
                    int i10 = iAhwBna + this.zLjUOn;
                    int i11 = this.QbewEr;
                    drawable.setBounds(i9, i10, i9 + i11, i11 + i10);
                    stateListAnimator.DTwDnp.draw(canvas);
                }
                if (vectorDrawable3 == null || !Objects.equals(C36246oUr.copydefault().fZBcTu(), "defi_mode_dex")) {
                    str = str2;
                    obj = obj3;
                    f = fAhwBna;
                    i2 = i5;
                    i3 = i4;
                    obj2 = "defi_mode_dex";
                } else {
                    str = str2;
                    obj = obj3;
                    i2 = i5;
                    obj2 = "defi_mode_dex";
                    f = fAhwBna;
                    i3 = i4;
                    EZpvd(canvas, stateListAnimator.QKVWgx, (android.graphics.drawable.Drawable) vectorDrawable3, -this.ORxRYg, this.sTzBva.fJNWhG(), true);
                }
            }
            if (!stateListAnimator.KWHzl().isEmpty()) {
                if (!str.equals(stateListAnimator.KWHzl()) && i3 <= owc.gEmmrt() + owc.ejfBZ() && i3 >= 0) {
                    if (Objects.equals(C36246oUr.copydefault().fZBcTu(), obj2)) {
                        vectorDrawable = stateListAnimator.DTwDnp != null ? this.DbNXlk : this.AubY;
                    } else {
                        vectorDrawable = Objects.equals(C36246oUr.copydefault().fZBcTu(), obj) ? this.AubY : this.values;
                    }
                    VectorDrawable vectorDrawable4 = vectorDrawable;
                    if (vectorDrawable4 != null) {
                        RectF rectFAuCTel2 = AuCTel();
                        int i12 = (int) f2;
                        rectFAuCTel2.set(this.zLjUOn + f2, i3 + this.DTwDnp, this.QfsBiF + i12, this.AwvSrB + i3);
                        float f5 = this.heceqZ;
                        canvas.drawRoundRect(rectFAuCTel2, f5, f5, this.hUfVAv);
                        int i13 = this.AwvSrB;
                        vectorDrawable4.setBounds(i12, i3, i12 + i13, i3 + i13);
                        vectorDrawable4.draw(canvas);
                    }
                    android.graphics.drawable.Drawable drawable2 = stateListAnimator.DTwDnp;
                    if (drawable2 != null) {
                        int i14 = ((int) f2) + this.AxsJAY;
                        int i15 = i3 + this.DTwDnp;
                        int i16 = this.QbewEr;
                        drawable2.setBounds(i14, i15, i14 + i16, i16 + i15);
                        stateListAnimator.DTwDnp.draw(canvas);
                    }
                    if (vectorDrawable4 != null && Objects.equals(C36246oUr.copydefault().fZBcTu(), obj2)) {
                        EZpvd(canvas, stateListAnimator.OcIXYQ, (android.graphics.drawable.Drawable) vectorDrawable4, this.wlaJM, this.sTzBva.fIwbmz(), false);
                    }
                }
            }
            f2 += f;
            i5 = i2 + 1;
            fAhwBna = f;
            dataSource2 = dataSource;
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas, java.lang.String str, android.graphics.drawable.Drawable drawable, float f, int i, boolean z) {
        float f2;
        android.graphics.Rect bounds = drawable.getBounds();
        float f3 = (bounds.left + bounds.right) / 2.0f;
        Paint.FontMetrics fontMetrics = this.aJFbMH.getFontMetrics();
        float f4 = fontMetrics.descent;
        float f5 = fontMetrics.ascent;
        float f6 = f4 - f5;
        if (z) {
            f2 = ((bounds.top + f) - (f6 / 2.0f)) - f5;
        } else {
            f2 = bounds.bottom + f + (f6 / 2.0f) + f5;
        }
        this.aJFbMH.setColor(i);
        if (str != null) {
            canvas.drawText(str, f3, f2, this.aJFbMH);
        }
    }

    public final void OLrzqt(android.graphics.Canvas canvas, C36246oUr c36246oUr) {
        oWN own = c36246oUr.DCJXGO().get(copydefault());
        oWC owc = c36246oUr.iwGUEr().QVAiDq().get(copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        oUG oug = c36246oUr.iwGUEr().AkhnZx().get(EZpvd() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        if (oug == null || own == null || owc == null || owc.AuCTel() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return;
        }
        if (c36246oUr.gHZMYf().equals("YScale") && !owc.EZpvd(oug.AhwBna())) {
            EZpvd(canvas, oug.AhwBna(), owc.AhwBna(oug.AhwBna()), oug.KWHzl(), own);
        }
        if (c36246oUr.gHZMYf().equals("YScale") && !owc.EZpvd(oug.gEmmrt())) {
            EZpvd(canvas, oug.gEmmrt(), owc.AhwBna(oug.gEmmrt()), oug.djBIcL(), own);
        }
        if (c36246oUr.gHZMYf().equals("NORMAL")) {
            EZpvd(canvas, oug.AhwBna(), owc.AhwBna(oug.AhwBna()), oug.KWHzl(), own);
        }
        if (c36246oUr.gHZMYf().equals("NORMAL")) {
            EZpvd(canvas, oug.gEmmrt(), owc.AhwBna(oug.gEmmrt()), oug.djBIcL(), own);
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas, double d, float f, int i, oWN own) {
        float f2;
        float f3;
        float fAYXKKw = own.AYXKKw(i);
        if (fAYXKKw > (C57676yms.AEQbTJ(C36246oUr.copydefault().AubY()) >> 1)) {
            this.fjfviF.setTextAlign(Paint.Align.RIGHT);
            f2 = fAYXKKw - this.gHZMYf;
            f3 = f2 - this.AxsJAY;
        } else {
            this.fjfviF.setTextAlign(Paint.Align.LEFT);
            f2 = this.gHZMYf + fAYXKKw;
            f3 = this.AxsJAY + f2;
        }
        canvas.drawLine(fAYXKKw, f, f2, f, this.fjfviF);
        canvas.drawText(AbstractC36302oWt.AYXKKw(d), f3, f + this.dLBcXg, this.fjfviF);
    }

    @Override // o.AbstractC36301oWs
    public int isConnected() {
        float fMeasureText;
        int i;
        int i2 = this.zuBGHE;
        if (this.dvKsVJ) {
            i2 = 0;
        }
        C36246oUr c36246oUr = this.dvImUD;
        if (c36246oUr == null || !c36246oUr.zLjUOn().isShowCountdown() || !this.dvImUD.KDccX()) {
            C36246oUr c36246oUr2 = this.dvImUD;
            if (c36246oUr2 != null && c36246oUr2.zLjUOn().isShowCountdown()) {
                fMeasureText = this.RlQdEF.measureText(this.dvImUD.iwGUEr().RcXXUw()) + this.fERRXa;
                i = this.igXuih;
            } else {
                fMeasureText = this.QIZEnU.measureText(uzCIH()) + this.fERRXa;
                i = this.igXuih;
            }
        } else if (this.QIZEnU.measureText(uzCIH()) > this.RlQdEF.measureText(this.dvImUD.iwGUEr().RcXXUw())) {
            fMeasureText = this.QIZEnU.measureText(uzCIH()) + this.fERRXa;
            i = this.igXuih;
        } else {
            fMeasureText = this.RlQdEF.measureText(this.dvImUD.iwGUEr().RcXXUw()) + this.fERRXa;
            i = this.igXuih;
        }
        return ((int) (fMeasureText + i)) + i2;
    }

    public int OLrzqt(java.lang.String str) {
        return (int) (this.akftKQ.measureText(str) + this.fERRXa + this.igXuih);
    }

    private java.lang.String uzCIH() {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        com.okinc.kline.library.data.DataSource dataSource = c36246oUrCopydefault.zLjUOn().getDataSources().get(copydefault());
        if (dataSource == null || dataSource.gEmmrt() < 1) {
            return "";
        }
        double dKWHzl = KWHzl(dataSource);
        if (!c36246oUrCopydefault.zLjUOn().isCompareKLine()) {
            double d = this.fetchVPNInfo;
            if (d > AudioStats.AUDIO_AMPLITUDE_NONE) {
                return AbstractC36302oWt.AYXKKw(d);
            }
            return AbstractC36302oWt.AYXKKw(dKWHzl);
        }
        oUG oug = c36246oUrCopydefault.iwGUEr().AkhnZx().get(EZpvd() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        oWN own = c36246oUrCopydefault.DCJXGO().get(copydefault());
        this.zAEkPU = own;
        if (own == null) {
            return "--";
        }
        try {
            if (oug instanceof oUM) {
                return pDQ.copydefault.copydefault(dKWHzl, ((oUM) oug).valueOf().get(this.zAEkPU.isConnected()).copydefault());
            }
            if (!(oug instanceof oUK)) {
                return "--";
            }
            return pDQ.copydefault.copydefault(dKWHzl, ((oUK) oug).valueOf().get(this.zAEkPU.isConnected()).copydefault());
        } catch (java.lang.Exception e) {
            pUU.copydefault("ChartView", e.toString());
            return "--";
        }
    }

    public static double KWHzl(com.okinc.kline.library.data.DataSource dataSource) {
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn = C36246oUr.copydefault().zLjUOn();
        if (chartViewOutSideConfigZLjUOn.isFastKLineMode() && chartViewOutSideConfigZLjUOn.getLastCandleItem() != null) {
            return chartViewOutSideConfigZLjUOn.getLastCandleItem().KWHzl;
        }
        return dataSource.AEQbTJ.get(dataSource.DbNXlk() - 1).copydefault();
    }

    public final android.graphics.Path values() {
        this.DBxZfM.reset();
        return this.DBxZfM;
    }

    public final java.util.ArrayList<java.lang.Integer> DbNXlk() {
        this.DGOPHZDGOPHZ.clear();
        return this.DGOPHZDGOPHZ;
    }

    public final <K> java.util.HashMap<K, android.graphics.Point> fetchVPNInfo() {
        this.DaRZkR.clear();
        return (java.util.HashMap<K, android.graphics.Point>) this.DaRZkR;
    }

    public final java.lang.StringBuilder fJNWhG() {
        this.DsrFlB.setLength(0);
        return this.DsrFlB;
    }

    public final java.util.HashMap<java.lang.String, java.lang.String> fIwbmz() {
        this.DGgnkA.clear();
        return this.DGgnkA;
    }

    public final RectF AEQbTJ(int i, int i2, int i3, int i4) {
        if (this.iRxXKY == null || this.RKDWNf != i || this.QSBOWP != i2 || this.QHmsKR != i3 || this.DCUTEI != i4) {
            this.iRxXKY = new RectF(i, i2, i3, i4);
            this.RKDWNf = i;
            this.QSBOWP = i2;
            this.QHmsKR = i3;
            this.DCUTEI = i4;
        }
        return this.iRxXKY;
    }

    public final RectF copydefault(int i, int i2, int i3, int i4) {
        if (this.gkJEwt == null || this.RdAHlO != i || this.OFhtUX != i2 || this.DLWbHP != i3 || this.dmfpNf != i4) {
            this.gkJEwt = new RectF(i, i2, i3, i4);
            this.RdAHlO = i;
            this.OFhtUX = i2;
            this.DLWbHP = i3;
            this.dmfpNf = i4;
        }
        return this.gkJEwt;
    }

    public final RectF EZpvd(int i, int i2, int i3, int i4) {
        if (this.AxsJAYaxsJAY == null || this.gwTjWJ != i || this.dHguZz != i2 || this.hBpjJd != i3 || this.QkdxfA != i4) {
            this.AxsJAYaxsJAY = new RectF(i, i2, i3, i4);
            this.gwTjWJ = i;
            this.dHguZz = i2;
            this.hBpjJd = i3;
            this.QkdxfA = i4;
        }
        return this.AxsJAYaxsJAY;
    }

    public final RectF OLrzqt(int i, int i2, int i3, int i4) {
        if (this.DAIeex == null || this.QCjLjM != i || this.OxVOHk != i2 || this.OJuSTm != i3 || this.OHqIaq != i4) {
            this.DAIeex = new RectF(i, i2, i3, i4);
            this.QCjLjM = i;
            this.OxVOHk = i2;
            this.OJuSTm = i3;
            this.OHqIaq = i4;
        }
        return this.DAIeex;
    }

    public final RectF KWHzl(int i, int i2, int i3, int i4) {
        if (this.accept == null || this.ODXsMY != i || this.QVsKAR != i2 || this.QSLkRj != i3 || this.hrNTAI != i4) {
            this.accept = new RectF(i, i2, i3, i4);
            this.ODXsMY = i;
            this.QVsKAR = i2;
            this.QSLkRj = i3;
            this.hrNTAI = i4;
        }
        return this.accept;
    }
}
