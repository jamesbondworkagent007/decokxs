package com.okinc.network.okg.dns.executor;

import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.dns.DomainsUtils;
import com.okinc.network.request.SchemeType;
import com.okinc.network.request.Uri;
import com.okinc.requests.ProtocolConstants;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43372rnz;
import o.InterfaceC43328rnH;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class OKDohConfig implements InterfaceC43328rnH {
    private static final String KEY_PREFIX_HOST_BACKUP = "dns_host_backup_sp";
    private static final String KEY_PREFIX_HOST_MAIN = "dns_host_sp";
    private static final String KEY_PREFIX_IP = "dns_ip_sp";
    private static final String TAG = "OKDohConfig";
    private final String corUserSite;
    private boolean isActive;
    private final String queryHost;
    private final SchemeType schemeType;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final String getHostNameWithType(@NotNull DohTypeEnum dohTypeEnum, boolean z) {
        return Companion.OLrzqt(dohTypeEnum, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final String getOKXGlobalDomain(@NotNull DohTypeEnum dohTypeEnum) {
        return Companion.KWHzl(dohTypeEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43328rnH
    public String getCORUserSite() {
        return this.corUserSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43328rnH
    public String getQueryHost() {
        return this.queryHost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43328rnH
    public SchemeType getQueryScheme() {
        return this.schemeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43328rnH
    public boolean isActive() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43328rnH
    public boolean isConfigForCOR() {
        return this.corUserSite != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [20=4] */
    public OKDohConfig(@NotNull Uri uri, String str) {
        SchemeType schemeType;
        Intrinsics.checkNotNullParameter(uri, "");
        this.corUserSite = str;
        this.queryHost = uri.getHost();
        String scheme = uri.getScheme();
        int iHashCode = scheme.hashCode();
        if (iHashCode == 3804) {
            if (scheme.equals("ws")) {
                schemeType = SchemeType.WS;
                this.schemeType = schemeType;
                this.isActive = true;
                return;
            }
            String str2 = "queryUrl.scheme is invalid. scheme:" + uri.getScheme();
            pUU.valueOf(TAG, str2);
            throw new IllegalArgumentException(str2);
        }
        if (iHashCode == 118039) {
            if (scheme.equals(ProtocolConstants.WSS)) {
                schemeType = SchemeType.WS;
                this.schemeType = schemeType;
                this.isActive = true;
                return;
            }
            String str22 = "queryUrl.scheme is invalid. scheme:" + uri.getScheme();
            pUU.valueOf(TAG, str22);
            throw new IllegalArgumentException(str22);
        }
        if (iHashCode == 3213448) {
            if (scheme.equals("http")) {
                schemeType = SchemeType.HTTP;
                this.schemeType = schemeType;
                this.isActive = true;
                return;
            }
            String str222 = "queryUrl.scheme is invalid. scheme:" + uri.getScheme();
            pUU.valueOf(TAG, str222);
            throw new IllegalArgumentException(str222);
        }
        if (iHashCode == 99617003 && scheme.equals("https")) {
            schemeType = SchemeType.HTTP;
            this.schemeType = schemeType;
            this.isActive = true;
            return;
        }
        String str2222 = "queryUrl.scheme is invalid. scheme:" + uri.getScheme();
        pUU.valueOf(TAG, str2222);
        throw new IllegalArgumentException(str2222);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.network.request.Uri)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(com.okinc.network.request.Uri, java.lang.String):void (m)] (LINE:17) call: com.okinc.network.okg.dns.executor.OKDohConfig.<init>(com.okinc.network.request.Uri, java.lang.String):void type: THIS */
    public /* synthetic */ OKDohConfig(Uri uri, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, (i & 2) != 0 ? null : str);
    }

    @Override // o.InterfaceC43328rnH
    public String logTag() {
        String str = this.corUserSite;
        if (str == null) {
            str = "GLOBAL";
        }
        String upperCase = (str + "-" + this.queryHost).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    @Override // o.InterfaceC43328rnH
    public String dohHostKey() {
        return Companion.EZpvd(this.schemeType, this.queryHost);
    }

    @Override // o.InterfaceC43328rnH
    public String dohBackupHostKey() {
        return Companion.AEQbTJ(this.schemeType, this.queryHost);
    }

    @Override // o.InterfaceC43328rnH
    public String dohIpKey() {
        return Companion.KWHzl(this.schemeType);
    }

    @Override // o.InterfaceC43328rnH
    public void setActive(boolean z) {
        if (isConfigForCOR()) {
            this.isActive = z;
        }
    }

    public static final class StateListAnimator {

        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[DohTypeEnum.values().length];
                try {
                    iArr[DohTypeEnum.HTTP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DohTypeEnum.V5.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DohTypeEnum.DEXPRI.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.dns.executor.OKDohConfig.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String KWHzl(@NotNull DohTypeEnum dohTypeEnum) {
            Intrinsics.checkNotNullParameter(dohTypeEnum, "");
            int i = Application.copydefault[dohTypeEnum.ordinal()];
            if (i == 1) {
                return DomainsUtils.INSTANCE.getOkxHttpMain().getTarget().getHost();
            }
            if (i == 2) {
                return DomainsUtils.INSTANCE.getOkxWsV5().getTarget().getHost();
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return DomainsUtils.INSTANCE.getWeb3WsDex().getTarget().getHost();
        }

        public final String OLrzqt(@NotNull DohTypeEnum dohTypeEnum, boolean z) {
            Intrinsics.checkNotNullParameter(dohTypeEnum, "");
            if (z) {
                return C43372rnz.getCORHost$OKNetwork_network$default(C43372rnz.copydefault, dohTypeEnum, null, 2, null);
            }
            return KWHzl(dohTypeEnum);
        }

        public final String EZpvd(@NotNull SchemeType schemeType, @NotNull String str) {
            Intrinsics.checkNotNullParameter(schemeType, "");
            Intrinsics.checkNotNullParameter(str, "");
            return schemeType + "_dns_host_sp_" + str;
        }

        public final String AEQbTJ(@NotNull SchemeType schemeType, @NotNull String str) {
            Intrinsics.checkNotNullParameter(schemeType, "");
            Intrinsics.checkNotNullParameter(str, "");
            return schemeType + "_dns_host_backup_sp_" + str;
        }

        public final String KWHzl(@NotNull SchemeType schemeType) {
            Intrinsics.checkNotNullParameter(schemeType, "");
            return schemeType + "_dns_ip_sp";
        }
    }
}
