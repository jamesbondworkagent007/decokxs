package o;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.immomo.mls.InitData;
import com.immomo.mls.ScriptStateListener;
import com.immomo.mls.adapter.MLSThreadAdapter;
import com.immomo.mls.fun.globals.UDLuaView;
import com.immomo.mls.log.ErrorType;
import com.immomo.mls.utils.AssertUtils;
import com.immomo.mls.utils.ERROR;
import com.immomo.mls.utils.ScriptLoadException;
import com.immomo.mls.utils.UrlParams;
import com.okinc.components.report.EventAction;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.bean.EventParam;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C43049rhu;
import o.C7324ahg;
import o.C7343ahz;
import o.C7793aqY;
import o.InterfaceC7297ahF;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.ahk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7328ahk implements C7793aqY.Activity, InterfaceC7915aso, C7324ahg.Application {
    public C7824arC AEQbTJ;
    public final java.util.HashMap<java.lang.String, java.lang.Object> AYXKKw;
    public TaskDescription AhwBna;
    public C7322ahe AkhnZx;
    public C7322ahe AuCTel;
    public C43045rhq AuCTelauCTel;
    public C7921asu AubY;
    public com.okinc.mln.miniapp.Config AwvSrB;
    public C7933atF AxsJAY;
    public InterfaceC7305ahN DTwDnp;
    public C7392aiv DbNXlk;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public boolean OLrzqt;
    public java.util.HashMap ORxRYg;
    public ScriptStateListener OcIXYQ;
    public C7937atJ QKVWgx;
    public final boolean QOLQEE;
    public C7850arc QbewEr;
    public AtomicBoolean QfsBiF;
    public android.app.Dialog RJOkX;
    public java.io.PrintStream copydefault;
    public android.view.View djBIcL;
    public long ejfBZ;
    public final boolean fARcdN;
    public boolean fIwbmz;
    public InitData fJNWhG;
    public ScriptStateListener fetchVPNInfo;
    public InterfaceC7297ahF.Application gEmmrt;
    public AbstractC42536rWm gHZMYf;
    public android.view.ViewGroup getFieldNames;
    public volatile short getNewProxyInstance;
    public android.content.Context hDKMBd;
    public Globals isConnected;
    public volatile C7392aiv iwGUEr;
    public View.OnClickListener sSMYrx;
    public android.view.ViewGroup uzCIH;
    public int valueOf;
    public volatile Globals values;
    public boolean wlaJM;
    public boolean zLjUOn;
    public InterfaceC7336ahs zsXlph;
    public java.util.List<InterfaceC7336ahs> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public boolean DTwDnp() {
        return (this.getNewProxyInstance & 256) == 256;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(ScriptStateListener scriptStateListener) {
        this.OcIXYQ = scriptStateListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitData AYXKKw() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AxsJAY() {
        return (this.getNewProxyInstance & 32) == 32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(AbstractC42536rWm abstractC42536rWm) {
        this.gHZMYf = abstractC42536rWm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd(short s) {
        return (this.getNewProxyInstance & s) == s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(short s) {
        this.getNewProxyInstance = s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(short s) {
        this.getNewProxyInstance = (short) (s | this.getNewProxyInstance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(short s) {
        this.getNewProxyInstance = (short) ((~s) & this.getNewProxyInstance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Globals djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fARcdN() {
        return (this.getNewProxyInstance & 128) == 128;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fJNWhG() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hDKMBd() {
        return (this.getNewProxyInstance & 64) == 64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C43045rhq isConnected() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7824arC valueOf() {
        return this.AEQbTJ;
    }

    public C7328ahk(@androidx.annotation.NonNull android.content.Context context) {
        this(context, false, C7326ahi.EZpvd);
    }

    public C7328ahk(@androidx.annotation.NonNull android.content.Context context, boolean z, boolean z2) {
        this.fIwbmz = true;
        this.OLrzqt = false;
        this.getNewProxyInstance = (short) 0;
        this.EZpvd = "";
        this.AYXKKw = new java.util.HashMap<>();
        this.ORxRYg = null;
        this.AEQbTJ = new C7824arC();
        this.wlaJM = false;
        this.ejfBZ = 0L;
        this.zLjUOn = false;
        this.sSMYrx = new View.OnClickListener() { // from class: o.ahk.6
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (C7328ahk.this.DTwDnp()) {
                    return;
                }
                if (C7328ahk.this.fARcdN() || C7328ahk.this.AxsJAY()) {
                    if (C7328ahk.this.getFieldNames()) {
                        C43047rhs c43047rhs = C43047rhs.AEQbTJ;
                        c43047rhs.OLrzqt().KWHzl(C7328ahk.this.OLrzqt(), false);
                        C7328ahk c7328ahk = C7328ahk.this;
                        c7328ahk.AuCTelauCTel = c43047rhs.AEQbTJ(c7328ahk.OLrzqt());
                    } else {
                        C7788aqT.AEQbTJ().AEQbTJ(false);
                    }
                    C7328ahk c7328ahk2 = C7328ahk.this;
                    c7328ahk2.EZpvd(C7914asn.AEQbTJ(C7914asn.OLrzqt(c7328ahk2.fJNWhG.OLrzqt, 2), 1));
                    return;
                }
                if (C7326ahi.EZpvd) {
                    C7323ahf.fIwbmz().copydefault(C7328ahk.this.hDKMBd.getString(C7343ahz.Fragment.AhwBna));
                }
            }
        };
        this.QfsBiF = new AtomicBoolean(false);
        AssertUtils.AEQbTJ(context);
        this.hDKMBd = context;
        copydefault();
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        if (interfaceC7298ahGKWHzl != null) {
            TaskDescription taskDescription = new TaskDescription();
            this.AhwBna = taskDescription;
            interfaceC7298ahGKWHzl.EZpvd("debugButtonEvent", taskDescription, "KEY_DEBUG_BUTTON_EVENT");
        }
        this.fARcdN = z;
        this.QOLQEE = z2;
        if (C7326ahi.EZpvd) {
            OLrzqt(context);
        }
        this.OcIXYQ = new ScriptStateListener() { // from class: o.ahk.1
            @Override // com.immomo.mls.ScriptStateListener
            public void OLrzqt() {
                C7328ahk.this.AEQbTJ("0", (java.lang.String) null, (ScriptStateListener.Reason) null);
                C7906asf.copydefault("1", null);
                ScriptStateListener scriptStateListener = C7328ahk.this.fetchVPNInfo;
                if (scriptStateListener != null) {
                    scriptStateListener.OLrzqt();
                }
            }

            @Override // com.immomo.mls.ScriptStateListener
            public void copydefault(ScriptStateListener.Reason reason, java.lang.String str) {
                pUU.copydefault("logtag", str);
                C7328ahk.this.AEQbTJ("1", str, reason);
                C7906asf.copydefault("0", C7326ahi.EZpvd ? null : str);
                C6777aVl.EZpvd(new java.lang.Exception(str), null, java.lang.Boolean.TRUE);
                ScriptStateListener scriptStateListener = C7328ahk.this.fetchVPNInfo;
                if (scriptStateListener != null) {
                    scriptStateListener.copydefault(reason, str);
                }
                if (C7326ahi.EZpvd || !C7831arJ.EZpvd.copydefault(C7328ahk.this.OLrzqt())) {
                    return;
                }
                C7328ahk.this.AEQbTJ((ScriptStateListener) null);
            }
        };
    }

    public void AEQbTJ(java.lang.String str, java.lang.String str2, ScriptStateListener.Reason reason) {
        EventData eventData = new EventData();
        eventData.setAct(EventAction.MINIAPP.getType());
        eventData.setSource(OLrzqt());
        eventData.setTime(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        eventData.setCode(str);
        eventData.setPath(AhwBna());
        if (!android.text.TextUtils.isEmpty(str2)) {
            eventData.setMsg(str2);
        }
        java.lang.String strGEmmrt = C7326ahi.gEmmrt();
        java.lang.String str3 = android.text.TextUtils.isEmpty(this.KWHzl) ? strGEmmrt : this.EZpvd;
        C7791aqW c7791aqWAEQbTJ = C7788aqT.AEQbTJ();
        java.lang.String strAEQbTJ = c7791aqWAEQbTJ != null ? c7791aqWAEQbTJ.AEQbTJ(this.hDKMBd, "") : "";
        boolean zOLrzqt = C43457rpe.OLrzqt(this.hDKMBd).OLrzqt();
        java.util.HashMap map = new java.util.HashMap();
        if (str3 == null) {
            str3 = "";
        }
        map.put("bundleVer", str3);
        map.put(MetricsSQLiteCacheKt.METRICS_PARAMS, DbNXlk());
        if (strGEmmrt == null) {
            strGEmmrt = "";
        }
        map.put("luaVer", strGEmmrt);
        map.put("luaLocation", strAEQbTJ != null ? strAEQbTJ : "");
        map.put("attr_5", java.lang.Boolean.valueOf(zOLrzqt).booleanValue() ? "1" : "0");
        map.put("duration", java.lang.String.valueOf(java.lang.System.currentTimeMillis() - this.ejfBZ));
        map.put("attr_4", this.zLjUOn ? "1" : "0");
        if (reason != null) {
            map.put("attr_3", java.lang.String.valueOf(reason.ordinal()));
        }
        eventData.setAttrs(map);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap map) {
        java.lang.String strOLrzqt = OLrzqt();
        EventData eventData = new EventData();
        eventData.setAct(str);
        eventData.setSource(strOLrzqt);
        eventData.setTime(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        eventData.setCode(str2);
        eventData.setPath(AhwBna());
        if (!android.text.TextUtils.isEmpty(str3)) {
            eventData.setMsg(str3);
        }
        java.lang.String strGEmmrt = C7326ahi.gEmmrt();
        java.lang.String strOLrzqt2 = android.text.TextUtils.isEmpty(strOLrzqt) ? strGEmmrt : C43047rhs.AEQbTJ.valueOf(strOLrzqt).OLrzqt();
        C7791aqW c7791aqWAEQbTJ = C7788aqT.AEQbTJ();
        java.lang.String strAEQbTJ = c7791aqWAEQbTJ != null ? c7791aqWAEQbTJ.AEQbTJ(this.hDKMBd, "") : "";
        java.util.HashMap map2 = new java.util.HashMap();
        if (strOLrzqt2 == null) {
            strOLrzqt2 = "";
        }
        map2.put("bundleVer", strOLrzqt2);
        map2.put(MetricsSQLiteCacheKt.METRICS_PARAMS, DbNXlk());
        if (strGEmmrt == null) {
            strGEmmrt = "";
        }
        map2.put("luaVer", strGEmmrt);
        map2.put("luaLocation", strAEQbTJ != null ? strAEQbTJ : "");
        if (map != null) {
            map2.putAll(map);
        }
        eventData.setAttrs(map2);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final java.lang.String DbNXlk() {
        java.util.HashMap map;
        InitData initData = this.fJNWhG;
        return (initData == null || (map = initData.KWHzl) == null) ? "" : map.toString();
    }

    public java.lang.String OLrzqt() {
        return android.text.TextUtils.isEmpty(this.KWHzl) ? "universal" : this.KWHzl;
    }

    public final void OLrzqt(android.content.Context context) {
        java.lang.String strKWHzl = C7324ahg.KWHzl();
        if (strKWHzl == null || strKWHzl.equalsIgnoreCase("unknown")) {
            C7324ahg.EZpvd(C7323ahf.EZpvd().OLrzqt("android_serial", "unknown"));
        }
    }

    public void EZpvd(@androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        AssertUtils.AEQbTJ(viewGroup);
        this.uzCIH = viewGroup;
        this.getFieldNames = (android.view.ViewGroup) android.view.LayoutInflater.from(this.hDKMBd).inflate(C7343ahz.Activity.valueOf, viewGroup, true).findViewById(C7343ahz.TaskDescription.OcIXYQ);
        if (!getNewProxyInstance()) {
            copydefault(true);
            return;
        }
        if (ejfBZ()) {
            AuCTel();
        }
        ORxRYg();
    }

    public boolean getFieldNames() {
        InitData initData = this.fJNWhG;
        return initData != null && initData.AEQbTJ(256);
    }

    public void AEQbTJ(InitData initData) {
        java.lang.Integer statusBarStyle;
        if (getNewProxyInstance()) {
            AssertUtils.AEQbTJ(initData);
            java.util.HashMap map = initData.KWHzl;
            if (map != null) {
                this.AYXKKw.putAll(map);
            }
            this.fJNWhG = new InitData(initData);
            java.lang.String str = (java.lang.String) this.AYXKKw.get("appid");
            this.KWHzl = str;
            AEQbTJ("appId:", str);
            final java.lang.String str2 = this.fJNWhG.EZpvd;
            if (android.text.TextUtils.isEmpty(str2)) {
                this.ejfBZ = java.lang.System.currentTimeMillis();
                this.zLjUOn = false;
                if (getFieldNames()) {
                    new C43049rhu(this.hDKMBd, this.AYXKKw, new AnonymousClass4()).EZpvd();
                    return;
                }
                return;
            }
            C7870arw.copydefault("[MiniApp]", "start to load", str2);
            C7838arQ.KWHzl(str2);
            C7844arW c7844arW = new C7844arW(str2);
            if (c7844arW.AYXKKw() == 0) {
                return;
            }
            copydefault();
            if (this.DTwDnp == null) {
                this.DTwDnp = C7323ahf.fetchVPNInfo().OLrzqt(str2);
            }
            if (!this.AYXKKw.containsKey("url")) {
                this.AYXKKw.put("url", str2);
            }
            if (!this.AYXKKw.containsKey("LuaSource")) {
                if (!android.webkit.URLUtil.isNetworkUrl(str2)) {
                    this.AYXKKw.put("LuaSource", C7836arO.copydefault(str2));
                } else {
                    this.AYXKKw.put("LuaSource", str2);
                }
            }
            UrlParams urlParamsCopydefault = c7844arW.copydefault();
            InitData initData2 = this.fJNWhG;
            initData2.AEQbTJ(initData2.AEQbTJ(16) && urlParamsCopydefault.showLoading());
            int minSdkVersion = urlParamsCopydefault.getMinSdkVersion();
            if (43 <= minSdkVersion && minSdkVersion != -1 && C7326ahi.EZpvd) {
                C7323ahf.fIwbmz().copydefault(this.hDKMBd.getString(C7343ahz.Fragment.AYXKKw));
            }
            ORxRYg();
            this.AYXKKw.put("urlParams", urlParamsCopydefault);
            if ((this.hDKMBd instanceof android.app.Activity) && (statusBarStyle = urlParamsCopydefault.getStatusBarStyle()) != null) {
                int iIntValue = statusBarStyle.intValue();
                if (iIntValue == 0) {
                    C7857arj.KWHzl(false, (android.app.Activity) this.hDKMBd);
                } else if (iIntValue == 1) {
                    C7857arj.KWHzl(true, (android.app.Activity) this.hDKMBd);
                }
            }
            if (ejfBZ()) {
                AuCTel();
            }
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.ahk.9
                @Override // java.lang.Runnable
                public void run() {
                    if (C7328ahk.this.DTwDnp()) {
                        return;
                    }
                    C7328ahk c7328ahk = C7328ahk.this;
                    if (c7328ahk.getFieldNames == null || c7328ahk.hDKMBd == null) {
                        return;
                    }
                    C7838arQ.KWHzl(str2);
                    C7328ahk c7328ahk2 = C7328ahk.this;
                    c7328ahk2.KWHzl((java.lang.String) null, c7328ahk2.fJNWhG.OLrzqt);
                }
            };
            if (this.fJNWhG.AEQbTJ(128)) {
                C7840arS.copydefault(runnable);
            } else {
                this.getFieldNames.post(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: o.ahk$4, reason: invalid class name */
    public class AnonymousClass4 implements C43049rhu.TaskDescription {
        public int copydefault = 0;

        public AnonymousClass4() {
        }

        @Override // o.C43049rhu.TaskDescription
        public void EZpvd() {
            C7328ahk.this.zLjUOn = true;
            C7328ahk.this.fJNWhG.AEQbTJ(true);
            C7328ahk.this.ORxRYg();
        }

        @Override // o.C43049rhu.TaskDescription
        public void EZpvd(long j, long j2) {
            int i = (int) ((j * 100) / j2);
            if (i <= this.copydefault) {
                return;
            }
            this.copydefault = i;
            C7840arS.copydefault(new java.lang.Runnable() { // from class: o.ahr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.copydefault.copydefault();
                }
            });
        }

        public final /* synthetic */ void copydefault() {
            if (C7328ahk.this.DTwDnp() || C7328ahk.this.AxsJAY == null) {
                return;
            }
            C7328ahk.this.AxsJAY.OLrzqt(this.copydefault);
        }

        @Override // o.C43049rhu.TaskDescription
        public void EZpvd(ScriptStateListener.Reason reason, @androidx.annotation.NonNull java.lang.String str) {
            C7870arw.EZpvd("[MiniApp]", "load error:", str);
            if (C7328ahk.this.OcIXYQ != null) {
                C7328ahk.this.OcIXYQ.copydefault(reason, "MLN ERROR: " + str);
            }
            C7840arS.copydefault(new java.lang.Runnable() { // from class: o.ahq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.EZpvd.OLrzqt();
                }
            });
        }

        public final /* synthetic */ void OLrzqt() {
            if (C7328ahk.this.DTwDnp()) {
                return;
            }
            C7328ahk.this.copydefault((short) 4);
            C7328ahk.this.OLrzqt((short) 128);
            C7328ahk.this.AEQbTJ(false);
            C7328ahk.this.copydefault(true);
        }

        @Override // o.C43049rhu.TaskDescription
        public void AEQbTJ(@androidx.annotation.NonNull final C43045rhq c43045rhq, @androidx.annotation.NonNull final java.lang.String str, @androidx.annotation.NonNull final java.lang.String str2, @androidx.annotation.Nullable final com.okinc.mln.miniapp.Config config, @androidx.annotation.NonNull final java.util.Map<java.lang.String, java.lang.String> map) {
            C7840arS.copydefault(new java.lang.Runnable() { // from class: o.ahp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.OLrzqt.AEQbTJ(c43045rhq, str, str2, map, config);
                }
            });
        }

        public final /* synthetic */ void AEQbTJ(C43045rhq c43045rhq, java.lang.String str, java.lang.String str2, java.util.Map map, com.okinc.mln.miniapp.Config config) {
            if (C7328ahk.this.DTwDnp()) {
                return;
            }
            C7328ahk.this.copydefault((short) 4);
            C7328ahk.this.fJNWhG.AEQbTJ(false);
            C7328ahk.this.AEQbTJ(true);
            C7328ahk.this.AuCTelauCTel = c43045rhq;
            C7328ahk.this.EZpvd = str;
            C7328ahk.this.fJNWhG.EZpvd = C7328ahk.this.AuCTelauCTel.AEQbTJ(str2, true);
            C7328ahk.this.fJNWhG.KWHzl.put("pageParams", map);
            C7328ahk.this.AwvSrB = config;
            C7328ahk.this.KWHzl(false);
            C7328ahk c7328ahk = C7328ahk.this;
            c7328ahk.AEQbTJ(c7328ahk.fJNWhG);
        }
    }

    public final void KWHzl(boolean z) {
        if (this.AubY == null) {
            this.AubY = (C7921asu) this.uzCIH.findViewById(C7343ahz.TaskDescription.copydefault);
        }
        this.AubY.setup(this.AwvSrB, z);
    }

    public boolean iwGUEr() {
        InitData initData;
        return (!getNewProxyInstance() || (initData = this.fJNWhG) == null || android.text.TextUtils.isEmpty(initData.EZpvd) || this.DTwDnp == null) ? false : true;
    }

    public void zLjUOn() {
        android.content.Context context = this.hDKMBd;
        if (context != null) {
            C7865arr.EZpvd(context);
        }
        OLrzqt((short) 64);
        if (this.iwGUEr != null) {
            this.iwGUEr.copydefault();
        }
        if (C7326ahi.EZpvd) {
            C7324ahg.AEQbTJ(this);
        }
    }

    public void zsXlph() {
        copydefault((short) 64);
        if (this.iwGUEr != null) {
            this.iwGUEr.AEQbTJ();
        }
        if (C7326ahi.EZpvd) {
            C7324ahg.KWHzl(this);
        }
    }

    public void gHZMYf() {
        if (this.iwGUEr != null) {
            this.iwGUEr.OLrzqt();
        }
    }

    public void EZpvd(android.view.KeyEvent keyEvent) {
        if (this.iwGUEr != null) {
            this.iwGUEr.OLrzqt(keyEvent);
        }
    }

    public boolean EZpvd() {
        if (this.iwGUEr != null) {
            return this.iwGUEr.KWHzl();
        }
        return true;
    }

    public boolean EZpvd(int i, int i2, android.content.Intent intent) {
        InterfaceC7339ahv interfaceC7339ahvKWHzl;
        C7322ahe c7322ahe = this.AuCTel;
        if (c7322ahe == null || (interfaceC7339ahvKWHzl = c7322ahe.KWHzl(i)) == null) {
            return false;
        }
        if (!interfaceC7339ahvKWHzl.OLrzqt(i2, intent)) {
            return true;
        }
        this.AuCTel.EZpvd(i);
        return true;
    }

    public void AubY() {
        if (C7326ahi.EZpvd) {
            C7324ahg.KWHzl(this);
        }
        KWHzl((short) 256);
        if (this.iwGUEr != null) {
            this.iwGUEr.EZpvd();
        }
        if (this.values != null) {
            this.values.destroy();
        }
        Globals globals = this.isConnected;
        if (globals != null) {
            globals.destroy();
        }
        MLSThreadAdapter mLSThreadAdapterIsConnected = C7323ahf.isConnected();
        InterfaceC7305ahN interfaceC7305ahN = this.DTwDnp;
        if (interfaceC7305ahN != null) {
            mLSThreadAdapterIsConnected.copydefault(interfaceC7305ahN.EZpvd());
        }
        mLSThreadAdapterIsConnected.copydefault(values());
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        if (interfaceC7298ahGKWHzl != null) {
            interfaceC7298ahGKWHzl.AEQbTJ("debugButtonEvent", this.AhwBna);
        }
        InterfaceC7295ahD interfaceC7295ahDOLrzqt = C7323ahf.OLrzqt();
        if (interfaceC7295ahDOLrzqt instanceof C7837arP) {
            ((C7837arP) interfaceC7295ahDOLrzqt).OLrzqt = null;
        }
        this.DTwDnp = null;
        this.fJNWhG = null;
        this.OcIXYQ = null;
        this.iwGUEr = null;
        this.DbNXlk = null;
        this.hDKMBd = null;
        this.getFieldNames = null;
        this.AuCTel = null;
        this.AkhnZx = null;
        this.AYXKKw.clear();
    }

    public void EZpvd(int i) {
        if (getNewProxyInstance()) {
            if (AxsJAY() || fARcdN()) {
                this.ejfBZ = java.lang.System.currentTimeMillis();
                this.zLjUOn = false;
                KWHzl((short) 256);
                if (this.iwGUEr != null) {
                    copydefault(this.iwGUEr);
                    this.iwGUEr.EZpvd();
                }
                if (this.values != null) {
                    this.values.destroy();
                }
                this.AuCTel = null;
                this.values = null;
                this.iwGUEr = null;
                copydefault(false);
                KWHzl((short) 0);
                OLrzqt((short) 64);
                if (android.text.TextUtils.isEmpty(this.fJNWhG.EZpvd) && getFieldNames()) {
                    AEQbTJ(this.fJNWhG);
                    return;
                }
                copydefault();
                ORxRYg();
                this.ORxRYg = null;
                C7838arQ.KWHzl(this.fJNWhG.EZpvd);
                KWHzl((java.lang.String) null, i);
            }
        }
    }

    public void OLrzqt(java.util.HashMap map) {
        this.AYXKKw.putAll(map);
        if (this.iwGUEr != null) {
            this.iwGUEr.copydefault(this.AYXKKw);
        }
    }

    public java.lang.String AkhnZx() {
        InterfaceC7305ahN interfaceC7305ahN;
        return (this.fJNWhG == null || (interfaceC7305ahN = this.DTwDnp) == null) ? "0" : interfaceC7305ahN.KWHzl();
    }

    public java.lang.String AhwBna() {
        InitData initData = this.fJNWhG;
        if (initData != null) {
            return initData.EZpvd;
        }
        return null;
    }

    public final void copydefault() {
        C7322ahe c7322ahe = this.AuCTel;
        if (c7322ahe == null) {
            C7322ahe c7322ahe2 = new C7322ahe(this.hDKMBd);
            this.AuCTel = c7322ahe2;
            c7322ahe2.copydefault = this;
        } else {
            InitData initData = this.fJNWhG;
            c7322ahe.valueOf = initData != null ? initData.EZpvd : null;
        }
    }

    public final void copydefault(C7392aiv c7392aiv) {
        C7937atJ c7937atJ = this.QKVWgx;
        if (c7937atJ != null) {
            c7937atJ.removeView(c7392aiv);
        } else {
            this.getFieldNames.removeView(c7392aiv);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    public final C7392aiv AEQbTJ(Globals globals) {
        if (DTwDnp()) {
            return null;
        }
        C7322ahe c7322ahe = EZpvd((short) 512) ? this.AkhnZx : this.AuCTel;
        if (c7322ahe != null && c7322ahe.AEQbTJ != null) {
            long jNanoTime = java.lang.System.nanoTime();
            C7326ahi.AhwBna.OLrzqt(globals, true);
            if (C7326ahi.EZpvd) {
                C7870arw.KWHzl(java.lang.String.format("create single instance cast : %.2fms", java.lang.Float.valueOf((java.lang.System.nanoTime() - jNanoTime) / 1000000.0f)));
            }
            if (this.fJNWhG == null) {
                copydefault(true);
                return null;
            }
            try {
                C7392aiv c7392aiv = (C7392aiv) ((UDLuaView) globals.copydefault("window", "__WINDOW", new LuaValue[0])).f_();
                c7392aiv.copydefault(this.AYXKKw);
                java.util.HashMap map = this.ORxRYg;
                if (map != null) {
                    c7392aiv.copydefault(map);
                }
                OLrzqt((short) 2);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                C7937atJ c7937atJ = this.QKVWgx;
                if (c7937atJ != null) {
                    c7937atJ.addView(c7392aiv, layoutParams);
                } else {
                    this.getFieldNames.addView(c7392aiv, layoutParams);
                }
                android.view.View view = this.djBIcL;
                if (view != null) {
                    view.bringToFront();
                }
                c7322ahe.KWHzl = this.copydefault;
                C7850arc c7850arc = this.QbewEr;
                if (c7850arc != null) {
                    ((android.view.View) ((android.view.View) c7850arc.AEQbTJ()).getParent()).bringToFront();
                }
                if (C7326ahi.EZpvd) {
                    InterfaceC7295ahD interfaceC7295ahDOLrzqt = C7323ahf.OLrzqt();
                    if (interfaceC7295ahDOLrzqt instanceof C7837arP) {
                        ((C7837arP) interfaceC7295ahDOLrzqt).OLrzqt = this.copydefault;
                    }
                }
                return c7392aiv;
            } catch (java.lang.RuntimeException unused) {
                copydefault(true);
            }
        }
        return null;
    }

    public final void wlaJM() {
        AEQbTJ(true);
        copydefault(false);
        ScriptStateListener scriptStateListener = this.OcIXYQ;
        if (scriptStateListener != null) {
            scriptStateListener.OLrzqt();
        }
        if (EZpvd((short) 512)) {
            AEQbTJ();
            C7392aiv c7392aiv = this.DbNXlk;
            this.DbNXlk = this.iwGUEr;
            this.iwGUEr = c7392aiv;
            copydefault(this.DbNXlk);
            this.DbNXlk.EZpvd();
            this.DbNXlk = null;
            Globals globals = this.isConnected;
            this.isConnected = this.values;
            this.values = globals;
            this.isConnected.destroy();
            this.isConnected = null;
            this.AuCTel = this.AkhnZx;
            this.AkhnZx = null;
        }
        if (hDKMBd() && this.iwGUEr != null) {
            C7840arS.copydefault(new java.lang.Runnable() { // from class: o.ahk.8
                @Override // java.lang.Runnable
                public void run() {
                    if (C7328ahk.this.iwGUEr != null) {
                        C7328ahk.this.iwGUEr.copydefault();
                    }
                }
            });
        }
        copydefault((short) 512);
    }

    public final Globals EZpvd(C7322ahe c7322ahe) {
        Globals globalsCopydefault = C7337aht.copydefault();
        if (globalsCopydefault == null) {
            globalsCopydefault = Globals.copydefault(C7326ahi.djBIcL());
            C7337aht.AEQbTJ(globalsCopydefault);
        }
        globalsCopydefault.OLrzqt(c7322ahe);
        InterfaceC7336ahs interfaceC7336ahs = this.zsXlph;
        if (interfaceC7336ahs != null) {
            interfaceC7336ahs.AEQbTJ(globalsCopydefault);
        }
        KWHzl(globalsCopydefault);
        return globalsCopydefault;
    }

    public final void KWHzl(Globals globals) {
        java.util.List<InterfaceC7336ahs> list = this.zuBGHE;
        if (list == null) {
            return;
        }
        java.util.Iterator<InterfaceC7336ahs> it = list.iterator();
        while (it.hasNext()) {
            it.next().AEQbTJ(globals);
        }
    }

    public final void KWHzl(java.lang.String str, int i) {
        if (!iwGUEr() || EZpvd((short) 4) || DTwDnp()) {
            return;
        }
        OLrzqt((short) 4);
        if (EZpvd((short) 512)) {
            if (this.isConnected == null) {
                this.isConnected = EZpvd(this.AkhnZx);
            }
        } else if (this.values == null) {
            this.values = EZpvd(this.AuCTel);
        }
        C7838arQ.OLrzqt(this.fJNWhG.EZpvd);
        if (!android.text.TextUtils.isEmpty(str)) {
            AEQbTJ("path:", str);
        } else {
            AEQbTJ("path:", this.fJNWhG.EZpvd);
        }
        C7919ass c7919assOLrzqt = new C7919ass(this.fJNWhG).copydefault(i).OLrzqt(this).OLrzqt(str);
        if (EZpvd((short) 512)) {
            c7919assOLrzqt.EZpvd(this.isConnected);
        } else {
            c7919assOLrzqt.EZpvd(this.values);
        }
        this.OLrzqt = false;
        this.DTwDnp.AEQbTJ(c7919assOLrzqt);
    }

    public final boolean ejfBZ() {
        if (this.QOLQEE) {
            return true;
        }
        InitData initData = this.fJNWhG;
        return initData != null && initData.AEQbTJ(64);
    }

    public final void AuCTel() {
        if (this.copydefault == null) {
            this.copydefault = new C7263agY(null);
        }
        if (this.djBIcL == null) {
            this.djBIcL = C7323ahf.AkhnZx().KWHzl(this.getFieldNames, this).copydefault(this.fARcdN);
        }
        fIwbmz();
    }

    public final void fIwbmz() {
        if (this.QKVWgx == null) {
            C7937atJ c7937atJ = new C7937atJ(this.hDKMBd);
            this.QKVWgx = c7937atJ;
            c7937atJ.setLayerInteractionEnabled(false);
            this.QKVWgx.setDrawViews(true);
            this.QKVWgx.setDrawViewNames(true);
            this.QKVWgx.setDrawIds(false);
            this.getFieldNames.addView(this.QKVWgx, 0, new ViewGroup.LayoutParams(-1, -1));
            if (this.iwGUEr != null) {
                this.getFieldNames.removeView(this.iwGUEr);
                this.QKVWgx.addView(this.iwGUEr);
            }
        }
    }

    public final void ORxRYg() {
        InitData initData = this.fJNWhG;
        if (initData == null || !initData.AEQbTJ(16)) {
            return;
        }
        if (this.AxsJAY == null) {
            this.AxsJAY = new C7933atF(this.hDKMBd);
        }
        int i = this.valueOf;
        if (i != 0) {
            this.AxsJAY.AEQbTJ(this.getFieldNames, i);
        } else {
            this.AxsJAY.EZpvd(this.getFieldNames, (java.lang.String) this.AYXKKw.get("loadingBgColor"));
        }
        if (this.fIwbmz) {
            KWHzl(true);
        }
    }

    public final void AEQbTJ(boolean z) {
        C7933atF c7933atF = this.AxsJAY;
        if (c7933atF != null) {
            c7933atF.copydefault(this.getFieldNames);
        }
    }

    public final boolean getNewProxyInstance() {
        C8010aue c8010aue;
        if (!Globals.AEQbTJ() || !C7788aqT.OLrzqt() || (c8010aue = C7326ahi.AhwBna) == null || !c8010aue.copydefault()) {
            return false;
        }
        C7326ahi.AhwBna.KWHzl();
        return C7326ahi.AhwBna.AEQbTJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: o.ahF$Application */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean copydefault(boolean z) {
        android.view.View view;
        java.lang.Object obj = this.gEmmrt;
        boolean z2 = false;
        if (obj == null) {
            if (!z || this.hDKMBd == null || DTwDnp()) {
                return false;
            }
            InterfaceC7297ahF interfaceC7297ahFCopydefault = C7323ahf.copydefault();
            if (interfaceC7297ahFCopydefault != null) {
                InterfaceC7297ahF.Application application = (InterfaceC7297ahF.Application) interfaceC7297ahFCopydefault.AEQbTJ(this.hDKMBd);
                this.gEmmrt = application;
                view = (android.view.View) application;
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.gEmmrt.setRetryListener(this.sSMYrx);
            } else {
                view = null;
            }
        } else {
            view = (android.view.View) obj;
        }
        if (this.gEmmrt == null) {
            return false;
        }
        if (z) {
            if (view.getParent() == null) {
                this.getFieldNames.addView(view);
            }
            view.setVisibility(0);
            QOLQEE();
        } else {
            view.setVisibility(8);
        }
        if (z && this.wlaJM) {
            z2 = true;
        }
        KWHzl(z2);
        return true;
    }

    public final void AEQbTJ() {
        this.QfsBiF.set(false);
        android.app.Dialog dialog = this.RJOkX;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.RJOkX.dismiss();
    }

    @Override // o.C7793aqY.Activity
    public void copydefault(final int i, @androidx.annotation.Nullable final java.lang.String str) {
        copydefault((short) 4);
        if (i != 0) {
            OLrzqt((short) 128);
            if (this.OcIXYQ != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("MLN ERROR: onScriptExecuted, code:");
                sb.append(i);
                sb.append(str == null ? "" : str);
                this.OcIXYQ.copydefault(ScriptStateListener.Reason.EXCUTE_FAILED, sb.toString());
            }
            C7840arS.copydefault(new java.lang.Runnable() { // from class: o.ahk.5
                @Override // java.lang.Runnable
                public void run() {
                    C7328ahk.this.OLrzqt((short) 32);
                    C7328ahk.this.AEQbTJ(true);
                    if (!C7328ahk.this.EZpvd((short) 512)) {
                        if (C7326ahi.EZpvd) {
                            C7323ahf.fIwbmz().copydefault(str, 1);
                            if (C7328ahk.this.copydefault != null) {
                                ((InterfaceC7851ard) C7328ahk.this.copydefault).OLrzqt(ErrorType.ERROR.getErrorPrefix() + str);
                            }
                        }
                        C7328ahk.this.copydefault(true);
                        return;
                    }
                    C7328ahk.this.AEQbTJ();
                    if (C7326ahi.EZpvd && i == 1 && C7328ahk.this.copydefault != null) {
                        ((InterfaceC7851ard) C7328ahk.this.copydefault).OLrzqt(str);
                    }
                    if (C7328ahk.this.DbNXlk != null) {
                        C7328ahk c7328ahk = C7328ahk.this;
                        c7328ahk.copydefault(c7328ahk.DbNXlk);
                        C7328ahk.this.DbNXlk = null;
                    }
                    C7328ahk.this.isConnected.destroy();
                    C7328ahk.this.isConnected = null;
                    C7328ahk.this.DbNXlk = null;
                    C7328ahk.this.AkhnZx = null;
                    C7328ahk.this.copydefault((short) 512);
                }
            });
        } else {
            OLrzqt((short) 32);
            wlaJM();
        }
        InitData initData = this.fJNWhG;
        if (initData != null) {
            C7838arQ.AEQbTJ(initData.EZpvd, i == 0);
        }
    }

    @Override // o.InterfaceC7915aso
    public void KWHzl(final C8016auk c8016auk) {
        OLrzqt((short) 8);
        OLrzqt((short) 1);
        if (DTwDnp()) {
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.ahk.3
            @Override // java.lang.Runnable
            public void run() {
                C7322ahe c7322ahe;
                if (C7328ahk.this.DTwDnp()) {
                    return;
                }
                C7328ahk.this.copydefault(false);
                Globals globals = C7328ahk.this.EZpvd((short) 512) ? C7328ahk.this.isConnected : C7328ahk.this.values;
                C7392aiv c7392aivAEQbTJ = C7328ahk.this.AEQbTJ(globals);
                if (c7392aivAEQbTJ == null) {
                    return;
                }
                if (c8016auk.gEmmrt() != null) {
                    c7392aivAEQbTJ.copydefault(c8016auk.gEmmrt());
                }
                globals.OLrzqt(c8016auk.copydefault(), false);
                globals.AEQbTJ(new C7953atZ(C7328ahk.this.hDKMBd));
                if (c8016auk.djBIcL()) {
                    globals.AEQbTJ(new C60043zuS(c8016auk.copydefault()));
                    globals.KWHzl(new C8013auh(c8016auk));
                } else {
                    globals.KWHzl(new C60043zuS(c8016auk.copydefault()));
                }
                if (C7328ahk.this.EZpvd((short) 512)) {
                    c7322ahe = C7328ahk.this.AkhnZx;
                    C7328ahk.this.DbNXlk = c7392aivAEQbTJ;
                } else {
                    c7322ahe = C7328ahk.this.AuCTel;
                    C7328ahk.this.iwGUEr = c7392aivAEQbTJ;
                }
                c7322ahe.gEmmrt = C7328ahk.this.AkhnZx();
                c7322ahe.EZpvd = c8016auk.copydefault();
                if (C7328ahk.this.fJNWhG != null) {
                    C7838arQ.EZpvd(C7328ahk.this.fJNWhG.EZpvd, c8016auk);
                }
                C7793aqY.EZpvd(c8016auk, globals, C7328ahk.this);
                if (C7326ahi.EZpvd) {
                    C7324ahg.AEQbTJ(C7328ahk.this);
                }
            }
        };
        if (C7840arS.KWHzl()) {
            runnable.run();
        } else {
            C7840arS.copydefault(runnable);
        }
    }

    @Override // o.InterfaceC7915aso
    public void AEQbTJ(final ScriptLoadException scriptLoadException) {
        if (this.values == null || this.values.isDestroyed() || scriptLoadException.getCode() == ERROR.GLOBALS_DESTROY.getCode()) {
            return;
        }
        OLrzqt((short) 128);
        copydefault((short) 4);
        if (this.OcIXYQ != null) {
            this.OcIXYQ.copydefault(ScriptStateListener.Reason.LOAD_FAILED, "MLN ERROR: onScriptLoadFailed " + scriptLoadException.getMsg());
        }
        InitData initData = this.fJNWhG;
        if (initData != null) {
            C7838arQ.KWHzl(initData.EZpvd, scriptLoadException);
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.ahk.2
            @Override // java.lang.Runnable
            public void run() {
                C7328ahk.this.AEQbTJ(true);
                if (!C7328ahk.this.EZpvd((short) 512) && C7328ahk.this.copydefault(true)) {
                    C7328ahk.this.AEQbTJ(java.lang.String.valueOf(scriptLoadException.getCode()));
                }
                if (C7326ahi.EZpvd) {
                    java.lang.String string = C7328ahk.this.hDKMBd.getString(C7343ahz.Fragment.gEmmrt, scriptLoadException.getCode() + "", scriptLoadException.getMsg(), scriptLoadException.getCause(), "MLSInstance");
                    C7323ahf.AEQbTJ().AEQbTJ("MLSInstance", scriptLoadException, string, new java.lang.Object[0]);
                    if (C7328ahk.this.copydefault != null) {
                        ((InterfaceC7851ard) C7328ahk.this.copydefault).OLrzqt(scriptLoadException.getMsg());
                    }
                    if (C7328ahk.this.EZpvd((short) 512)) {
                        C7328ahk.this.AEQbTJ();
                        C7328ahk.this.isConnected.destroy();
                        C7328ahk.this.isConnected = null;
                        C7328ahk.this.AkhnZx = null;
                        C7328ahk.this.DbNXlk = null;
                        C7328ahk.this.copydefault((short) 512);
                        return;
                    }
                    C7323ahf.fIwbmz().copydefault(string);
                }
            }
        };
        if (C7840arS.KWHzl()) {
            runnable.run();
        } else {
            C7840arS.copydefault(runnable);
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new EventParam("android_version", EZpvd(this.hDKMBd), false));
        arrayList.add(new EventParam("lua_version", C7326ahi.gEmmrt(), false));
        arrayList.add(new EventParam("error_code", str, false));
        C32866mlf.OLrzqt("mln_script_load_failed", arrayList);
    }

    public static java.lang.String EZpvd(android.content.Context context) {
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (java.lang.Exception unused) {
        }
        return i + "";
    }

    public InterfaceC7854arg fetchVPNInfo() {
        C7850arc c7850arc = this.QbewEr;
        if (c7850arc != null) {
            return c7850arc.AEQbTJ();
        }
        return null;
    }

    public boolean uzCIH() {
        java.lang.Object objFetchVPNInfo = fetchVPNInfo();
        return objFetchVPNInfo != null && ((android.view.View) ((android.view.View) objFetchVPNInfo).getParent()).getVisibility() == 0;
    }

    public void EZpvd(boolean z) {
        java.lang.Object objFetchVPNInfo = fetchVPNInfo();
        if (objFetchVPNInfo == null) {
            return;
        }
        android.view.View view = (android.view.View) ((android.view.View) objFetchVPNInfo).getParent();
        if (z) {
            view.setVisibility(0);
            view.bringToFront();
        } else {
            view.setVisibility(4);
            this.OLrzqt = true;
        }
    }

    public void KWHzl(InterfaceC7854arg interfaceC7854arg) {
        C7850arc c7850arc = new C7850arc(interfaceC7854arg);
        this.QbewEr = c7850arc;
        java.io.PrintStream printStream = this.copydefault;
        if (printStream == null) {
            this.copydefault = new C7263agY(this.QbewEr);
        } else {
            ((C7263agY) printStream).AEQbTJ = c7850arc;
        }
        C7322ahe c7322ahe = this.AuCTel;
        if (c7322ahe != null) {
            c7322ahe.KWHzl = this.copydefault;
        }
    }

    public final java.lang.Object values() {
        return "MLSInstance" + hashCode();
    }

    public void AuCTelauCTel() {
        if (AwvSrB()) {
            this.DTwDnp = null;
            AEQbTJ(this.fJNWhG);
            EZpvd(C7914asn.OLrzqt(this.fJNWhG.OLrzqt, 2));
        }
    }

    public final boolean AwvSrB() {
        if (getFieldNames()) {
            return false;
        }
        java.lang.String strCopydefault = C7864arq.copydefault(this.fJNWhG.EZpvd);
        if (android.text.TextUtils.equals(C7864arq.AEQbTJ(this.fJNWhG.EZpvd), C7864arq.AEQbTJ(C7788aqT.AEQbTJ().AEQbTJ(this.hDKMBd, "")))) {
            return false;
        }
        this.fJNWhG.EZpvd = C7788aqT.AEQbTJ().AEQbTJ(this.hDKMBd, strCopydefault);
        return true;
    }

    /* JADX INFO: renamed from: o.ahk$TaskDescription */
    public class TaskDescription implements InterfaceC7835arN {
        @Override // o.InterfaceC8024aus
        public void OLrzqt() {
        }

        public TaskDescription() {
        }

        @Override // o.InterfaceC7835arN
        public boolean EZpvd(@androidx.annotation.Nullable java.lang.Object... objArr) {
            if (C7328ahk.this.DTwDnp() || C7328ahk.this.getFieldNames == null || objArr == null || objArr.length == 0) {
                return true;
            }
            java.lang.Object obj = objArr[0];
            if (!(obj instanceof java.util.Map)) {
                return true;
            }
            try {
                java.lang.Object obj2 = ((java.util.Map) obj).get("open");
                if (obj2 != null && java.lang.Boolean.parseBoolean(obj2.toString())) {
                    C7328ahk.this.AuCTel();
                    C7328ahk.this.QOLQEE();
                } else if (C7328ahk.this.djBIcL != null) {
                    C7328ahk.this.djBIcL.setVisibility(8);
                }
                return true;
            } catch (java.lang.Throwable unused) {
                return true;
            }
        }
    }

    public final void QOLQEE() {
        android.view.View view = this.djBIcL;
        if (view == null || !C7326ahi.EZpvd) {
            return;
        }
        view.setVisibility(0);
        this.djBIcL.bringToFront();
    }

    public final void AEQbTJ(java.lang.String... strArr) {
        if (C7326ahi.EZpvd) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (strArr != null) {
                for (java.lang.String str : strArr) {
                    sb.append((java.lang.Object) str);
                    sb.append(" ");
                }
            }
            this.copydefault.print(sb.toString());
            this.copydefault.println();
        }
    }

    public java.lang.String toString() {
        InitData initData = this.fJNWhG;
        return initData != null ? initData.toString() : "NoneInitInstance";
    }

    public java.lang.String gEmmrt() {
        InitData initData = this.fJNWhG;
        if (initData == null) {
            return "";
        }
        if (android.text.TextUtils.isEmpty(initData.EZpvd)) {
            return C7836arO.KWHzl(this.fJNWhG);
        }
        int iLastIndexOf = this.fJNWhG.EZpvd.lastIndexOf("/");
        return iLastIndexOf == this.fJNWhG.EZpvd.length() + (-1) ? this.fJNWhG.EZpvd : this.fJNWhG.EZpvd.substring(iLastIndexOf + 1);
    }

    public void sSMYrx() {
        AbstractC42536rWm abstractC42536rWm = this.gHZMYf;
        if (abstractC42536rWm == null) {
            return;
        }
        abstractC42536rWm.copydefault(QPLType.LIFE_CYCLE, QPLMarker.PAGE_LOADED, gEmmrt(), java.lang.System.currentTimeMillis());
    }

    public void zuBGHE() {
        AbstractC42536rWm abstractC42536rWm = this.gHZMYf;
        if (abstractC42536rWm == null) {
            return;
        }
        abstractC42536rWm.copydefault(QPLType.LIFE_CYCLE, QPLMarker.PAGE_NOT_LOADED, gEmmrt(), java.lang.System.currentTimeMillis());
    }
}
