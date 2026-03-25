package o;

import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.business.market.data.model.websocket.WebsocketListWrapper;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingTokenData;
import com.okinc.business.market.features.scanner.surge.trending.repo.SurgeTrendingRepositoryImpl$getTrendingConfig$2;
import com.okinc.business.market.features.scanner.surge.trending.repo.SurgeTrendingRepositoryImpl$getTrendingRankingList$2;
import com.okinc.business.market.features.scanner.surge.trending.repo.SurgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.scanner.surge.trending.repo.SurgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.scanner.surge.trending.repo.SurgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import o.C44103sDl;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.kqE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29253kqE implements InterfaceC29249kqA {
    public final Json EZpvd;
    public final C27640jyx KWHzl;
    public final C27592jyB<TrendingTokenData> OLrzqt;
    public final InterfaceC27595jyE copydefault;

    @yCM
    public C29253kqE(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C27640jyx c27640jyx, @NotNull C27592jyB<TrendingTokenData> c27592jyB, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c27592jyB, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.copydefault = interfaceC27595jyE;
        this.KWHzl = c27640jyx;
        this.OLrzqt = c27592jyB;
        this.EZpvd = json;
    }

    @Override // o.InterfaceC29249kqA
    public java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<TrendingConfigData, OKServerException>> continuation) {
        return kAB.EZpvd(new SurgeTrendingRepositoryImpl$getTrendingConfig$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: o.kqE$Application */
    public static final class Application implements Flow<WebsocketListWrapper<TrendingTokenData>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C29253kqE OLrzqt;

        /* JADX INFO: renamed from: o.kqE$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C29253kqE OLrzqt;
            private static final byte[] $$c = {95, 45, -118, 121};
            private static final int $$d = CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {32, -31, 56, 81, 4, -7, 1, -29, -7, -7, -13, Ascii.FF, -17, 0, -11, Ascii.RS, 0, -17, -5};
            private static final int $$b = CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA;
            private static int copydefault = 0;
            private static int gEmmrt = 1;
            private static long KWHzl = 7319341880146533611L;
            private static int[] EZpvd = {-1175863151, 1331112367, -963631539, 1013152193, 1338924926, -425180740, -357104393, -754241254, -1707851645, 411853998, -573774675, 1163755449, -853653664, -2106908951, -147319972, -1116196220, -2118401396, 916229371};

            /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(byte b, short s, byte b2) {
                int i;
                int i2 = (b2 * 3) + 4;
                int i3 = s * 2;
                int i4 = 110 - b;
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[i3 + 1];
                if (bArr == 0) {
                    int i5 = i2;
                    i = 0;
                    i2++;
                    i4 += -i5;
                    bArr2[i] = (byte) i4;
                    if (i == i3) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i++;
                    i5 = bArr[i2];
                    i2++;
                    i4 += -i5;
                    bArr2[i] = (byte) i4;
                    if (i == i3) {
                    }
                } else {
                    i = 0;
                    bArr2[i] = (byte) i4;
                    if (i == i3) {
                    }
                }
            }

            public AnonymousClass4(FlowCollector flowCollector, C29253kqE c29253kqE) {
                this.AEQbTJ = flowCollector;
                this.OLrzqt = c29253kqE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(int i, int i2, int i3, java.lang.Object[] objArr) {
                int i4;
                int i5 = i * 5;
                int i6 = i2 + 4;
                int i7 = (i3 * 20) + 79;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i5 + 6];
                int i8 = i5 + 5;
                if (bArr == null) {
                    int i9 = i7;
                    int i10 = 0;
                    i7 = i8;
                    i7 = i7 + i9 + 8;
                    i4 = i10;
                    i6++;
                    bArr2[i4] = (byte) i7;
                    i10 = i4 + 1;
                    if (i4 == i8) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i9 = bArr[i6];
                    i7 = i7 + i9 + 8;
                    i4 = i10;
                    i6++;
                    bArr2[i4] = (byte) i7;
                    i10 = i4 + 1;
                    if (i4 == i8) {
                    }
                } else {
                    i4 = 0;
                    i6++;
                    bArr2[i4] = (byte) i7;
                    i10 = i4 + 1;
                    if (i4 == i8) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SurgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1 surgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1;
                WebsocketListWrapper websocketListWrapper;
                int i = 2 % 2;
                if (continuation instanceof SurgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1) {
                    surgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1 = (SurgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1) continuation;
                    int i2 = surgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        surgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                        int i3 = copydefault + 69;
                        gEmmrt = i3 % 128;
                        int i4 = i3 % 2;
                    } else {
                        surgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1 = new SurgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = surgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i5 = surgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1.label;
                if (i5 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.lang.String str = (java.lang.String) obj;
                    try {
                        Json json = this.OLrzqt.EZpvd;
                        json.getSerializersModule();
                        websocketListWrapper = (WebsocketListWrapper) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) json.decodeFromString(new ArrayListSerializer(WebsocketListWrapper.Companion.serializer(TrendingTokenData.Companion.serializer())), str));
                    } catch (java.lang.Throwable unused) {
                        websocketListWrapper = null;
                    }
                    if (websocketListWrapper != null) {
                        int i6 = copydefault + 103;
                        gEmmrt = i6 % 128;
                        int i7 = i6 % 2;
                        surgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(websocketListWrapper, surgeTrendingRepositoryImpl$subscribeTrendingRankingMetricsWs$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                Unit unit = Unit.INSTANCE;
                int i8 = copydefault + 69;
                gEmmrt = i8 % 128;
                if (i8 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [73=5, 77=4] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void a(char[] cArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i2 = 2 % 2;
                Zi zi = new Zi();
                zi.OLrzqt = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                zi.AEQbTJ = 0;
                while (zi.AEQbTJ < cArr.length) {
                    int i3 = $11 + 19;
                    $10 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = zi.AEQbTJ;
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[zi.AEQbTJ]), zi, zi};
                            java.lang.Object objEZpvd = YY.EZpvd(-295504478);
                            if (objEZpvd == null) {
                                byte b = (byte) 0;
                                objEZpvd = YY.EZpvd(217, 4, (char) 0, -364758818, false, $$e((byte) ($$d & 62), b, b), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                            }
                            jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).longValue() ^ (KWHzl % 5439468278228498061L);
                            java.lang.Object[] objArr3 = {zi, zi};
                            java.lang.Object objEZpvd2 = YY.EZpvd(1444313200);
                            if (objEZpvd2 == null) {
                                byte b2 = (byte) 0;
                                objEZpvd2 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e((byte) 12, b2, b2), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i5 = zi.AEQbTJ;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr[zi.AEQbTJ]), zi, zi};
                        java.lang.Object objEZpvd3 = YY.EZpvd(-295504478);
                        if (objEZpvd3 == null) {
                            byte b3 = (byte) 0;
                            objEZpvd3 = YY.EZpvd(217, 4, (char) 0, -364758818, false, $$e((byte) ($$d & 62), b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                        }
                        jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).longValue() ^ (KWHzl ^ 5439468278228498061L);
                        java.lang.Object[] objArr5 = {zi, zi};
                        java.lang.Object objEZpvd4 = YY.EZpvd(1444313200);
                        if (objEZpvd4 == null) {
                            byte b4 = (byte) 0;
                            objEZpvd4 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e((byte) 12, b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
                    }
                }
                char[] cArr2 = new char[length];
                zi.AEQbTJ = 0;
                while (zi.AEQbTJ < cArr.length) {
                    int i6 = $10 + 37;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr2[zi.AEQbTJ] = (char) jArr[zi.AEQbTJ];
                        java.lang.Object[] objArr6 = {zi, zi};
                        java.lang.Object objEZpvd5 = YY.EZpvd(1444313200);
                        if (objEZpvd5 == null) {
                            byte b5 = (byte) 0;
                            objEZpvd5 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e((byte) 12, b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr6);
                        throw null;
                    }
                    cArr2[zi.AEQbTJ] = (char) jArr[zi.AEQbTJ];
                    try {
                        java.lang.Object[] objArr7 = {zi, zi};
                        java.lang.Object objEZpvd6 = YY.EZpvd(1444313200);
                        if (objEZpvd6 == null) {
                            byte b6 = (byte) 0;
                            objEZpvd6 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e((byte) 12, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd6).invoke(null, objArr7);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                java.lang.String str = new java.lang.String(cArr2);
                int i7 = $10 + 61;
                $11 = i7 % 128;
                if (i7 % 2 != 0) {
                    objArr[0] = str;
                } else {
                    int i8 = 90 / 0;
                    objArr[0] = str;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [148=6] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void b(int[] iArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i2 = 2 % 2;
                Zm zm = new Zm();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = EZpvd;
                int i3 = 698602880;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i4 = 0;
                    while (i4 < length) {
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr2[i4])};
                            java.lang.Object objEZpvd = YY.EZpvd(i3);
                            if (objEZpvd == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objEZpvd = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            iArr3[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).intValue();
                            i4++;
                            i3 = 698602880;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = EZpvd;
                if (iArr5 != null) {
                    int i5 = $10 + 73;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i7 = 0;
                    while (i7 < length3) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr5[i7])};
                        java.lang.Object objEZpvd2 = YY.EZpvd(698602880);
                        if (objEZpvd2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objEZpvd2 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$e(b3, b4, b4), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        iArr6[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).intValue();
                        i7++;
                        int i8 = $11 + 65;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    int i10 = $10 + 107;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    iArr5 = iArr6;
                }
                java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
                zm.OLrzqt = 0;
                while (zm.OLrzqt < iArr.length) {
                    int i12 = $11 + 121;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr[0] = (char) (iArr[zm.OLrzqt] >> 16);
                    cArr[1] = (char) iArr[zm.OLrzqt];
                    cArr[2] = (char) (iArr[zm.OLrzqt + 1] >> 16);
                    cArr[3] = (char) iArr[zm.OLrzqt + 1];
                    zm.copydefault = (cArr[0] << 16) + cArr[1];
                    zm.KWHzl = (cArr[2] << 16) + cArr[3];
                    Zm.EZpvd(iArr4);
                    for (int i14 = 0; i14 < 16; i14++) {
                        int i15 = $10 + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        zm.copydefault ^= iArr4[i14];
                        java.lang.Object[] objArr4 = {zm, java.lang.Integer.valueOf(Zm.AEQbTJ(zm.copydefault)), zm, zm};
                        java.lang.Object objEZpvd3 = YY.EZpvd(984677556);
                        if (objEZpvd3 == null) {
                            byte b5 = (byte) ($$d & 7);
                            byte b6 = (byte) (b5 - 3);
                            objEZpvd3 = YY.EZpvd(180, 4, (char) 19181, 1049637320, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                        }
                        int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue();
                        zm.copydefault = zm.KWHzl;
                        zm.KWHzl = iIntValue;
                    }
                    int i17 = zm.copydefault;
                    zm.copydefault = zm.KWHzl;
                    zm.KWHzl = i17;
                    zm.KWHzl ^= iArr4[16];
                    zm.copydefault ^= iArr4[17];
                    int i18 = zm.copydefault;
                    int i19 = zm.KWHzl;
                    cArr[0] = (char) (zm.copydefault >>> 16);
                    cArr[1] = (char) zm.copydefault;
                    cArr[2] = (char) (zm.KWHzl >>> 16);
                    cArr[3] = (char) zm.KWHzl;
                    Zm.EZpvd(iArr4);
                    cArr2[zm.OLrzqt * 2] = cArr[0];
                    cArr2[(zm.OLrzqt * 2) + 1] = cArr[1];
                    cArr2[(zm.OLrzqt * 2) + 2] = cArr[2];
                    cArr2[(zm.OLrzqt * 2) + 3] = cArr[3];
                    java.lang.Object[] objArr5 = {zm, zm};
                    java.lang.Object objEZpvd4 = YY.EZpvd(-1770687495);
                    if (objEZpvd4 == null) {
                        byte b7 = (byte) ($$d & 5);
                        byte b8 = (byte) (b7 - 1);
                        objEZpvd4 = YY.EZpvd(600, 5, (char) 29201, -1839874427, false, $$e(b7, b8, b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
                }
                objArr[0] = new java.lang.String(cArr2, 0, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            public static void AEQbTJ(long j, long j2) throws java.lang.Throwable {
                java.lang.Object objNewInstance;
                java.lang.String str;
                int i = 2 % 2;
                long j3 = j ^ (j2 << 32);
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(new char[]{43557, 25078, 15861, 51691, 34299, 20979, 28149, 14832, 62960}, 52223, objArr);
                java.lang.Object obj = C44103sDl.class.getField((java.lang.String) objArr[0]).get(null);
                int i2 = copydefault + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                gEmmrt = i2 % 128;
                try {
                    if (i2 % 2 == 0) {
                        java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        objNewInstance = declaredConstructor.newInstance(null);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(new char[]{43553, 40396, 50617, 3465, 30078, 48495, 58681, 11535, 5361, 23747, 33956, 52435, 13425, 31837, 42033, 60436, 55293, 8191, 18337, 36761, 63358, 16216, 26413, 44803, 38603, 57039, 1718, 20106, 46704, 65098, 9770, 28170, 20963, 39351, 49548, 2392, 29019, 47409, 57616, 10493, 4319, 22706, 32923, 51241}, 13306, objArr2);
                        str = (java.lang.String) objArr2[0];
                    } else {
                        java.lang.reflect.Constructor declaredConstructor2 = java.lang.StringBuilder.class.getDeclaredConstructor(null);
                        declaredConstructor2.setAccessible(true);
                        objNewInstance = declaredConstructor2.newInstance(null);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(new char[]{43553, 40396, 50617, 3465, 30078, 48495, 58681, 11535, 5361, 23747, 33956, 52435, 13425, 31837, 42033, 60436, 55293, 8191, 18337, 36761, 63358, 16216, 26413, 44803, 38603, 57039, 1718, 20106, 46704, 65098, 9770, 28170, 20963, 39351, 49548, 2392, 29019, 47409, 57616, 10493, 4319, 22706, 32923, 51241}, 14303, objArr3);
                        str = (java.lang.String) objArr3[0];
                    }
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b(new int[]{-741320579, -1305376275, -536086720, -258494057}, 6, objArr4);
                    java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr4[0], java.lang.String.class);
                    method.setAccessible(true);
                    method.invoke(objNewInstance, str);
                    int i3 = copydefault + 123;
                    gEmmrt = i3 % 128;
                    int i4 = i3 % 2;
                    java.lang.Object[] objArr5 = {java.lang.Long.valueOf(j3)};
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(new int[]{-741320579, -1305376275, -536086720, -258494057}, 6, objArr6);
                    java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr6[0], java.lang.Long.TYPE);
                    method2.setAccessible(true);
                    method2.invoke(objNewInstance, objArr5);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(new int[]{1773962533, -612557019, 244800006, 397096418, 554129707, -124535051, -112533335, -1598457710, 503367048, -1751299922, 902032545, 430426267}, 22, objArr7);
                    java.lang.String str2 = (java.lang.String) objArr7[0];
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(new int[]{-702131626, -876861863, 324228243, 1793783450}, 8, objArr8);
                    java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr8[0], null);
                    method3.setAccessible(true);
                    java.lang.Object objInvoke = method3.invoke(objNewInstance, null);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(new char[]{43531, 38460, 53843}, 15401, objArr9);
                    java.lang.String str3 = (java.lang.String) objArr9[0];
                    int i5 = copydefault + 19;
                    gEmmrt = i5 % 128;
                    int i6 = i5 % 2;
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    b(new int[]{1456686883, 301609981, -259049710, -1080765033, -142188870, -992073052, 1747192360, 1836262643, 12476051, 513774350, -598905440, -2100244327}, 21, objArr10);
                    java.lang.reflect.Method method4 = Intrinsics.class.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.String.class);
                    method4.setAccessible(true);
                    method4.invoke(null, objInvoke, str3);
                    if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        a(new char[]{43561, 49774, 31468, 37664, 2957, 41897, 55389, 28832, 59742, 371, 47575, 54867, 20194, 59144, 8034, 47042, 11298, 17564, 64753, 5459, 36275, 14851, 21121}, 26723, objArr11);
                        java.lang.Object[] objArr12 = {((java.lang.String) objArr11[0]).toString()};
                        java.lang.reflect.Constructor declaredConstructor3 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                        declaredConstructor3.setAccessible(true);
                        throw ((java.lang.Throwable) declaredConstructor3.newInstance(objArr12));
                    }
                    int i7 = copydefault + 1;
                    gEmmrt = i7 % 128;
                    int i8 = i7 % 2;
                    java.lang.Object obj2 = pUU.class.getField("copydefault").get(null);
                    int i9 = copydefault + 69;
                    gEmmrt = i9 % 128;
                    if (i9 % 2 == 0) {
                        java.lang.Object[] objArr13 = new java.lang.Object[0];
                        objArr13[1] = obj2;
                        java.lang.Class[] clsArr = new java.lang.Class[1];
                        clsArr[1] = java.lang.Object.class;
                        java.lang.reflect.Method method5 = Intrinsics.class.getMethod("copydefault", clsArr);
                        method5.setAccessible(true);
                        method5.invoke(null, objArr13);
                    } else {
                        java.lang.reflect.Method method6 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
                        method6.setAccessible(true);
                        method6.invoke(null, obj2);
                    }
                    java.lang.Object[] objArr14 = {str2, objInvoke};
                    java.lang.reflect.Method method7 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
                    method7.setAccessible(true);
                    method7.invoke(obj2, objArr14);
                    int i10 = gEmmrt + 123;
                    copydefault = i10 % 128;
                    int i11 = i10 % 2;
                    byte[] bArr = $$a;
                    byte b = bArr[6];
                    byte b2 = b;
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    c(b2, (byte) (-b2), b, objArr15);
                    java.lang.reflect.Method method8 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr15[0], null);
                    method8.setAccessible(true);
                    java.lang.Object objInvoke2 = method8.invoke(obj, null);
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    b(new int[]{820583762, 643125162, -832882829, 140236189, 982436553, 1595557295, -731301019, -1523278575, 700946885, 1170495964, 1558072950, 8116312, 66530548, 798681113, -1480670658, -516366830}, 29, objArr16);
                    DetectionInfoBean.class.getField((java.lang.String) objArr16[0]).setBoolean(objInvoke2, true);
                    byte b3 = bArr[6];
                    byte b4 = b3;
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    c(b4, (byte) (-b4), b3, objArr17);
                    java.lang.reflect.Method method9 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr17[0], null);
                    method9.setAccessible(true);
                    java.lang.Object objInvoke3 = method9.invoke(obj, null);
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    b(new int[]{-2012644734, -1394565681, -962812923, 659678079, 1027510342, 1682540052}, 9, objArr18);
                    DetectionInfoBean.class.getField((java.lang.String) objArr18[0]).set(objInvoke3, lValueOf);
                    byte b5 = bArr[13];
                    byte b6 = b5;
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    c(b6, (byte) (b6 | 9), b5, objArr19);
                    java.lang.reflect.Method method10 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr19[0], null);
                    method10.setAccessible(true);
                    method10.invoke(obj, null);
                    int i12 = gEmmrt + 73;
                    copydefault = i12 % 128;
                    int i13 = i12 % 2;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        public Application(Flow flow, C29253kqE c29253kqE) {
            this.AEQbTJ = flow;
            this.OLrzqt = c29253kqE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super WebsocketListWrapper<TrendingTokenData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kqE$ActionBar */
    public static final class ActionBar implements Flow<WebsocketListWrapper<TrendingTokenData>> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ C29253kqE OLrzqt;

        /* JADX INFO: renamed from: o.kqE$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ C29253kqE copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, C29253kqE c29253kqE) {
                this.KWHzl = flowCollector;
                this.copydefault = c29253kqE;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SurgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1 surgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1;
                WebsocketListWrapper websocketListWrapper;
                if (continuation instanceof SurgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1) {
                    surgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1 = (SurgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1) continuation;
                    int i = surgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        surgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        surgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1 = new SurgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = surgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = surgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.lang.String str = (java.lang.String) obj;
                    try {
                        Json json = this.copydefault.EZpvd;
                        json.getSerializersModule();
                        websocketListWrapper = (WebsocketListWrapper) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) json.decodeFromString(new ArrayListSerializer(WebsocketListWrapper.Companion.serializer(TrendingTokenData.Companion.serializer())), str));
                    } catch (java.lang.Throwable unused) {
                        websocketListWrapper = null;
                    }
                    if (websocketListWrapper != null) {
                        surgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(websocketListWrapper, surgeTrendingRepositoryImpl$subscribeTrendingRankingListWs$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow, C29253kqE c29253kqE) {
            this.KWHzl = flow;
            this.OLrzqt = c29253kqE;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super WebsocketListWrapper<TrendingTokenData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass1(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kqE$TaskDescription */
    public static final class TaskDescription implements Flow<CandlesticksBean> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.kqE$TaskDescription$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SurgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1 surgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1;
                CandlesticksBean candlesticksBeanEZpvd;
                if (continuation instanceof SurgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1) {
                    surgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1 = (SurgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1) continuation;
                    int i = surgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        surgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        surgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1 = new SurgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = surgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = surgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    try {
                        candlesticksBeanEZpvd = C21950hSi.OLrzqt.EZpvd((java.lang.String) obj);
                    } catch (java.lang.Throwable unused) {
                        candlesticksBeanEZpvd = null;
                    }
                    if (candlesticksBeanEZpvd != null) {
                        surgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(candlesticksBeanEZpvd, surgeTrendingRepositoryImpl$subscribeTokenKLineWs$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super CandlesticksBean> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC29249kqA
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TrendingTokenData>, OKServerException>> continuation) {
        return kAB.EZpvd(new SurgeTrendingRepositoryImpl$getTrendingRankingList$2(this, str, str2, null), continuation);
    }

    @Override // o.InterfaceC29249kqA
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<? extends java.util.List<TrendingTokenData>>> continuation) {
        return C27591jyA.OLrzqt(new ActionBar(this.KWHzl.KWHzl(str, yDY.copydefault(new WsArgV5ForWeb3(str, null, str2, null, null, 26, null))), this), continuation);
    }

    @Override // o.InterfaceC29249kqA
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<? extends java.util.List<TrendingTokenData>>> continuation) {
        return C27591jyA.OLrzqt(new Application(this.KWHzl.KWHzl("dex-market-trending-update-metrics", yDY.copydefault(new WsArgV5ForWeb3("dex-market-trending-update-metrics", null, str, null, null, 26, null))), this), continuation);
    }

    @Override // o.InterfaceC29249kqA
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<CandlesticksBean>> continuation) {
        return new TaskDescription(this.KWHzl.KWHzl("dex-token-candle1s", yDY.copydefault(new WsArgV5ForWeb3("dex-token-candle1s", null, str, str2, null, 18, null))));
    }

    @Override // o.InterfaceC29249kqA
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) {
        this.OLrzqt.KWHzl();
        this.KWHzl.AEQbTJ();
        return Unit.INSTANCE;
    }
}
