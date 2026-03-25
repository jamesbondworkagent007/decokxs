package o;

import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C44103sDl;
import o.C5098Eq;
import o.C5104Ew;
import o.ClassFormatError;
import o.InterfaceC5094Em;
import o.InterfaceC5097Ep;
import o.InterfaceC5106Ey;
import o.Short;
import o.YY;
import o.Zj;
import o.Zm;
import o.pUP;
import o.pUU;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes20.dex */
public final class SuppressWarnings {
    public static final byte[] AEQbTJ(DT dt, final Double r15) {
        EW ew = new EW();
        AbstractC5105Ex.TaskDescription taskDescription = AbstractC5105Ex.TaskDescription.OLrzqt;
        C5101Et c5101Et = new C5101Et(taskDescription, new EX("AllowClassicFlow"));
        C5101Et c5101Et2 = new C5101Et(taskDescription, new EX("AllowUnauthenticatedIdentities"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et3 = new C5101Et(fragment, new EX("CognitoIdentityProviders"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("DeveloperProviderName"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("IdentityPoolName"));
        AbstractC5105Ex.Dialog dialog = AbstractC5105Ex.Dialog.KWHzl;
        C5101Et c5101Et6 = new C5101Et(dialog, new EX("IdentityPoolTags"));
        C5101Et c5101Et7 = new C5101Et(fragment, new EX("OpenIdConnectProviderARNs"));
        C5101Et c5101Et8 = new C5101Et(fragment, new EX("SamlProviderARNs"));
        C5101Et c5101Et9 = new C5101Et(dialog, new EX("SupportedLoginProviders"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        activity.EZpvd(c5101Et8);
        activity.EZpvd(c5101Et9);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.Boolean boolAEQbTJ = r15.AEQbTJ();
        if (boolAEQbTJ != null) {
            ebEZpvd.OLrzqt(c5101Et, boolAEQbTJ.booleanValue());
        }
        java.lang.Boolean boolOLrzqt = r15.OLrzqt();
        if (boolOLrzqt != null) {
            ebEZpvd.OLrzqt(c5101Et2, boolOLrzqt.booleanValue());
        }
        if (r15.KWHzl() != null) {
            ebEZpvd.EZpvd(c5101Et3, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.serde.CreateIdentityPoolOperationSerializerKt$serializeCreateIdentityPoolOperationBody$1$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5094Em interfaceC5094Em) {
                    invoke2(interfaceC5094Em);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: aws.sdk.kotlin.services.cognitoidentity.serde.CreateIdentityPoolOperationSerializerKt$serializeCreateIdentityPoolOperationBody$1$3$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, ClassFormatError, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, Short.class, "serializeCognitoIdentityProviderDocument", "serializeCognitoIdentityProviderDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentity/model/CognitoIdentityProvider;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, ClassFormatError classFormatError) {
                        invoke2(interfaceC5106Ey, classFormatError);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ClassFormatError classFormatError) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(classFormatError, "");
                        Short.EZpvd(interfaceC5106Ey, classFormatError);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<ClassFormatError> it = r15.KWHzl().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        java.lang.String strEZpvd = r15.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strEZpvd);
        }
        java.lang.String strCopydefault = r15.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strCopydefault);
        }
        if (r15.AYXKKw() != null) {
            ebEZpvd.OLrzqt(c5101Et6, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.serde.CreateIdentityPoolOperationSerializerKt$serializeCreateIdentityPoolOperationBody$1$6
                private static short[] KWHzl;
                private static final byte[] $$c = {33, 84, 42, -62};
                private static final int $$d = 248;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {57, -113, 73, -4, -4, 7, -1, Ascii.GS, 7, 7, Ascii.CR, -12, 17, 0, Ascii.VT, -30, 0, 17, 5};
                private static final int $$b = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
                private static int valueOf = 0;
                private static int AhwBna = 1;
                private static int EZpvd = -1972864457;
                private static int AEQbTJ = 1640963086;
                private static int copydefault = 980687430;
                private static byte[] OLrzqt = {-12, Ascii.CR, -16, 6, -6, 8, -11, 39, -60, 3, 9, -12, -3, Ascii.VT, 0, Ascii.NAK, -60, Ascii.CR, 2, -13, -12, -12, -10, 2, -8, 3, 34, -46, 0, -25, 10, 9, 2, Ascii.CAN, -32, 3, -11, -10, Ascii.SO, 72, -89, 9, 8, -12, 0, Ascii.CAN, -27, -7, Ascii.SUB, -25, 37, -32, Ascii.SUB, -10, 0, -13, -2, 0, -16, Ascii.SO, 66, -89, Ascii.SO, 10, 69, -90, 1, 66, -78, -13, 40, -22, Ascii.ETB, Ascii.CR, 2, -13, -12, -12, -10, 2, -8, 3, 34, -46, 0, -25, 10, 9, 2, Ascii.CAN, -29, 46, -23, -14, Ascii.SO, -16, Ascii.VT, -14, 40, -44, 1, 2, -13, 46, -23, -7, Ascii.CAN, -10, 10, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT, Ascii.VT};
                private static int[] gEmmrt = {-165043905, -424039791, 1116764707, -1862276791, 94582667, 1764805359, -551563296, -671607616, -2107841168, 1385688554, -1242233994, -2109762955, 1444567903, -2096152289, 199855038, 778225982, 2090898453, 2117429620};

                /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static String $$e(int i, int i2, short s) {
                    int i3;
                    int i4;
                    byte[] bArr = $$c;
                    int i5 = 111 - i2;
                    int i6 = (s * 2) + 1;
                    int i7 = 4 - (i * 2);
                    byte[] bArr2 = new byte[i6];
                    if (bArr == null) {
                        int i8 = i6;
                        i4 = 0;
                        i5 += -i8;
                        i7++;
                        i3 = i4;
                        i4 = i3 + 1;
                        bArr2[i3] = (byte) i5;
                        if (i4 == i6) {
                            return new String(bArr2, 0);
                        }
                        i8 = bArr[i7];
                        i5 += -i8;
                        i7++;
                        i3 = i4;
                        i4 = i3 + 1;
                        bArr2[i3] = (byte) i5;
                        if (i4 == i6) {
                        }
                    } else {
                        i3 = 0;
                        i4 = i3 + 1;
                        bArr2[i3] = (byte) i5;
                        if (i4 == i6) {
                        }
                    }
                }

                {
                    super(1);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void c(int i, short s, int i2, Object[] objArr) {
                    int i3;
                    int i4;
                    int i5 = 14 - (s * 10);
                    int i6 = (i2 * 5) + 6;
                    byte[] bArr = $$a;
                    int i7 = 99 - (i * 20);
                    byte[] bArr2 = new byte[i6];
                    if (bArr == null) {
                        int i8 = i5;
                        int i9 = 0;
                        i5++;
                        i7 = i8 + (-i7) + 8;
                        i3 = i9;
                        int i10 = i5;
                        int i11 = i7;
                        bArr2[i3] = (byte) i11;
                        i4 = i3 + 1;
                        if (i4 == i6) {
                            objArr[0] = new String(bArr2, 0);
                            return;
                        }
                        i5 = i10;
                        i7 = bArr[i10];
                        i9 = i4;
                        i8 = i11;
                        i5++;
                        i7 = i8 + (-i7) + 8;
                        i3 = i9;
                        int i102 = i5;
                        int i112 = i7;
                        bArr2[i3] = (byte) i112;
                        i4 = i3 + 1;
                        if (i4 == i6) {
                        }
                    } else {
                        i3 = 0;
                        int i1022 = i5;
                        int i1122 = i7;
                        bArr2[i3] = (byte) i1122;
                        i4 = i3 + 1;
                        if (i4 == i6) {
                        }
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(InterfaceC5097Ep interfaceC5097Ep) {
                    int i = 2 % 2;
                    int i2 = valueOf + 77;
                    AhwBna = i2 % 128;
                    int i3 = i2 % 2;
                    invoke2(interfaceC5097Ep);
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5097Ep interfaceC5097Ep) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(interfaceC5097Ep, "");
                    Iterator<Map.Entry<String, String>> it = r15.AYXKKw().entrySet().iterator();
                    while (!(!it.hasNext())) {
                        int i2 = AhwBna + 31;
                        valueOf = i2 % 128;
                        int i3 = i2 % 2;
                        Map.Entry<String, String> next = it.next();
                        interfaceC5097Ep.KWHzl(next.getKey(), next.getValue());
                        int i4 = AhwBna + 25;
                        valueOf = i4 % 128;
                        int i5 = i4 % 2;
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [148=5, 97=4] */
                /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
                    int length;
                    int[] iArr2;
                    int i2 = 2;
                    int i3 = 2 % 2;
                    Zm zm = new Zm();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr3 = gEmmrt;
                    int i4 = 698602880;
                    Object obj = null;
                    if (iArr3 != null) {
                        int i5 = $10 + 91;
                        $11 = i5 % 128;
                        if (i5 % 2 == 0) {
                            length = iArr3.length;
                            iArr2 = new int[length];
                        } else {
                            length = iArr3.length;
                            iArr2 = new int[length];
                        }
                        int i6 = 0;
                        while (i6 < length) {
                            int i7 = $10 + 43;
                            $11 = i7 % 128;
                            if (i7 % i2 == 0) {
                                try {
                                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                                    Object objEZpvd = YY.EZpvd(i4);
                                    if (objEZpvd == null) {
                                        byte b = (byte) 0;
                                        byte b2 = (byte) (b + 1);
                                        objEZpvd = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$e(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                                    }
                                    iArr2[i6] = ((Integer) ((Method) objEZpvd).invoke(obj, objArr2)).intValue();
                                    i6++;
                                    i2 = 2;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } else {
                                Object[] objArr3 = {Integer.valueOf(iArr3[i6])};
                                Object objEZpvd2 = YY.EZpvd(i4);
                                if (objEZpvd2 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = (byte) (b3 + 1);
                                    objEZpvd2 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$e(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                                }
                                iArr2[i6] = ((Integer) ((Method) objEZpvd2).invoke(null, objArr3)).intValue();
                                i6++;
                                i2 = 2;
                                i4 = 698602880;
                                obj = null;
                            }
                        }
                        iArr3 = iArr2;
                    }
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    int[] iArr5 = gEmmrt;
                    if (iArr5 != null) {
                        int length3 = iArr5.length;
                        int[] iArr6 = new int[length3];
                        int i8 = 0;
                        while (i8 < length3) {
                            Object[] objArr4 = {Integer.valueOf(iArr5[i8])};
                            Object objEZpvd3 = YY.EZpvd(698602880);
                            if (objEZpvd3 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 + 1);
                                objEZpvd3 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE});
                            }
                            iArr6[i8] = ((Integer) ((Method) objEZpvd3).invoke(null, objArr4)).intValue();
                            i8++;
                            int i9 = $10 + 59;
                            $11 = i9 % 128;
                            int i10 = i9 % 2;
                        }
                        iArr5 = iArr6;
                    }
                    System.arraycopy(iArr5, 0, iArr4, 0, length2);
                    zm.OLrzqt = 0;
                    while (zm.OLrzqt < iArr.length) {
                        int i11 = $10 + 49;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        cArr[0] = (char) (iArr[zm.OLrzqt] >> 16);
                        cArr[1] = (char) iArr[zm.OLrzqt];
                        cArr[2] = (char) (iArr[zm.OLrzqt + 1] >> 16);
                        cArr[3] = (char) iArr[zm.OLrzqt + 1];
                        zm.copydefault = (cArr[0] << 16) + cArr[1];
                        zm.KWHzl = (cArr[2] << 16) + cArr[3];
                        Zm.EZpvd(iArr4);
                        int i13 = 0;
                        while (i13 < 16) {
                            int i14 = $10 + 57;
                            $11 = i14 % 128;
                            if (i14 % 2 == 0) {
                                zm.copydefault ^= iArr4[i13];
                                Object[] objArr5 = {zm, Integer.valueOf(Zm.AEQbTJ(zm.copydefault)), zm, zm};
                                Object objEZpvd4 = YY.EZpvd(984677556);
                                if (objEZpvd4 == null) {
                                    byte length4 = (byte) $$c.length;
                                    objEZpvd4 = YY.EZpvd(180, 4, (char) 19181, 1049637320, false, $$e((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objEZpvd4).invoke(null, objArr5)).intValue();
                                zm.copydefault = zm.KWHzl;
                                zm.KWHzl = iIntValue;
                                i13 += 95;
                            } else {
                                zm.copydefault ^= iArr4[i13];
                                Object[] objArr6 = {zm, Integer.valueOf(Zm.AEQbTJ(zm.copydefault)), zm, zm};
                                Object objEZpvd5 = YY.EZpvd(984677556);
                                if (objEZpvd5 == null) {
                                    byte length5 = (byte) $$c.length;
                                    objEZpvd5 = YY.EZpvd(180, 4, (char) 19181, 1049637320, false, $$e((byte) 0, length5, (byte) (length5 - 4)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                                }
                                int iIntValue2 = ((Integer) ((Method) objEZpvd5).invoke(null, objArr6)).intValue();
                                zm.copydefault = zm.KWHzl;
                                zm.KWHzl = iIntValue2;
                                i13++;
                            }
                        }
                        int i15 = zm.copydefault;
                        zm.copydefault = zm.KWHzl;
                        zm.KWHzl = i15;
                        zm.KWHzl ^= iArr4[16];
                        zm.copydefault ^= iArr4[17];
                        int i16 = zm.copydefault;
                        int i17 = zm.KWHzl;
                        cArr[0] = (char) (zm.copydefault >>> 16);
                        cArr[1] = (char) zm.copydefault;
                        cArr[2] = (char) (zm.KWHzl >>> 16);
                        cArr[3] = (char) zm.KWHzl;
                        Zm.EZpvd(iArr4);
                        cArr2[zm.OLrzqt * 2] = cArr[0];
                        cArr2[(zm.OLrzqt * 2) + 1] = cArr[1];
                        cArr2[(zm.OLrzqt * 2) + 2] = cArr[2];
                        cArr2[(zm.OLrzqt * 2) + 3] = cArr[3];
                        try {
                            Object[] objArr7 = {zm, zm};
                            Object objEZpvd6 = YY.EZpvd(-1770687495);
                            if (objEZpvd6 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = (byte) (b7 + 2);
                                objEZpvd6 = YY.EZpvd(600, 5, (char) 29201, -1839874427, false, $$e(b7, b8, (byte) (b8 - 2)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objEZpvd6).invoke(null, objArr7);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    objArr[0] = new String(cArr2, 0, i);
                }

                /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [235=4, 174=5] */
                /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                private static void a(int i, int i2, byte b, short s, int i3, Object[] objArr) throws Throwable {
                    boolean z;
                    int i4;
                    int i5;
                    int i6 = 2 % 2;
                    Zj zj = new Zj();
                    StringBuilder sb = new StringBuilder();
                    try {
                        Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(AEQbTJ)};
                        Object objEZpvd = YY.EZpvd(-1048485176);
                        if (objEZpvd == null) {
                            objEZpvd = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        int iIntValue = ((Integer) ((Method) objEZpvd).invoke(null, objArr2)).intValue();
                        if (iIntValue == -1) {
                            int i7 = $10 + 75;
                            $11 = i7 % 128;
                            int i8 = i7 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            int i9 = $10 + 61;
                            $11 = i9 % 128;
                            if (i9 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            byte[] bArr = OLrzqt;
                            if (bArr != null) {
                                int length = bArr.length;
                                byte[] bArr2 = new byte[length];
                                for (int i10 = 0; i10 < length; i10++) {
                                    int i11 = $11 + 107;
                                    $10 = i11 % 128;
                                    int i12 = i11 % 2;
                                    Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                                    Object objEZpvd2 = YY.EZpvd(1815080187);
                                    if (objEZpvd2 == null) {
                                        objEZpvd2 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i10] = ((Byte) ((Method) objEZpvd2).invoke(null, objArr3)).byteValue();
                                }
                                bArr = bArr2;
                            }
                            if (bArr != null) {
                                int i13 = $10 + 9;
                                $11 = i13 % 128;
                                if (i13 % 2 == 0) {
                                    byte[] bArr3 = OLrzqt;
                                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(EZpvd)};
                                    Object objEZpvd3 = YY.EZpvd(-1048485176);
                                    if (objEZpvd3 == null) {
                                        objEZpvd3 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    i5 = ((byte) (((long) bArr3[((Integer) ((Method) objEZpvd3).invoke(null, objArr4)).intValue()]) & (-2166281683126510581L))) - ((int) (((long) AEQbTJ) % (-2166281683126510581L)));
                                } else {
                                    byte[] bArr4 = OLrzqt;
                                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(EZpvd)};
                                    Object objEZpvd4 = YY.EZpvd(-1048485176);
                                    if (objEZpvd4 == null) {
                                        objEZpvd4 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    i5 = ((byte) (((long) bArr4[((Integer) ((Method) objEZpvd4).invoke(null, objArr5)).intValue()]) ^ (-2166281683126510581L))) + ((int) (((long) AEQbTJ) ^ (-2166281683126510581L)));
                                }
                                iIntValue = (byte) i5;
                            } else {
                                iIntValue = (short) (((short) (((long) KWHzl[i3 + ((int) (((long) EZpvd) ^ (-2166281683126510581L)))]) ^ (-2166281683126510581L))) + ((int) (((long) AEQbTJ) ^ (-2166281683126510581L))));
                            }
                        }
                        if (iIntValue > 0) {
                            int i14 = ((i3 + iIntValue) - 2) + ((int) (((long) EZpvd) ^ (-2166281683126510581L)));
                            if (z) {
                                int i15 = $10;
                                int i16 = i15 + 99;
                                $11 = i16 % 128;
                                int i17 = i16 % 2;
                                int i18 = i15 + 81;
                                $11 = i18 % 128;
                                int i19 = i18 % 2;
                                i4 = 1;
                            } else {
                                int i20 = $10 + 99;
                                $11 = i20 % 128;
                                int i21 = i20 % 2;
                                i4 = 0;
                            }
                            zj.OLrzqt = i14 + i4;
                            try {
                                Object[] objArr6 = {zj, Integer.valueOf(i), Integer.valueOf(copydefault), sb};
                                Object objEZpvd5 = YY.EZpvd(-2015189563);
                                if (objEZpvd5 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objEZpvd5 = YY.EZpvd(180, 4, (char) 19181, -2084411207, false, $$e(b2, b3, b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                                }
                                ((StringBuilder) ((Method) objEZpvd5).invoke(null, objArr6)).append(zj.EZpvd);
                                zj.AEQbTJ = zj.EZpvd;
                                byte[] bArr5 = OLrzqt;
                                if (bArr5 != null) {
                                    int i22 = $11 + 125;
                                    $10 = i22 % 128;
                                    int i23 = i22 % 2;
                                    int length2 = bArr5.length;
                                    byte[] bArr6 = new byte[length2];
                                    int i24 = 0;
                                    while (i24 < length2) {
                                        int i25 = $11 + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                                        $10 = i25 % 128;
                                        if (i25 % 2 != 0) {
                                            bArr6[i24] = (byte) (((long) bArr5[i24]) - (-2166281683126510581L));
                                        } else {
                                            bArr6[i24] = (byte) (((long) bArr5[i24]) ^ (-2166281683126510581L));
                                            i24++;
                                        }
                                    }
                                    bArr5 = bArr6;
                                }
                                boolean z2 = bArr5 != null;
                                zj.KWHzl = 1;
                                while (zj.KWHzl < iIntValue) {
                                    if (z2) {
                                        byte[] bArr7 = OLrzqt;
                                        zj.OLrzqt = zj.OLrzqt - 1;
                                        zj.EZpvd = (char) (zj.AEQbTJ + (((byte) (((byte) (((long) bArr7[r9]) ^ (-2166281683126510581L))) + s)) ^ b));
                                    } else {
                                        short[] sArr = KWHzl;
                                        zj.OLrzqt = zj.OLrzqt - 1;
                                        zj.EZpvd = (char) (zj.AEQbTJ + (((short) (((short) (((long) sArr[r9]) ^ (-2166281683126510581L))) + s)) ^ b));
                                    }
                                    sb.append(zj.EZpvd);
                                    zj.AEQbTJ = zj.EZpvd;
                                    zj.KWHzl++;
                                    int i26 = $10 + 29;
                                    $11 = i26 % 128;
                                    if (i26 % 2 == 0) {
                                        int i27 = 4 / 3;
                                    }
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        objArr[0] = sb.toString();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                public static void AEQbTJ(long j, long j2) throws Throwable {
                    int i = 2 % 2;
                    long j3 = j ^ (j2 << 32);
                    Object[] objArr = new Object[1];
                    a(-1538983434, 4, (byte) 0, (short) 0, 341350852, objArr);
                    Object obj = C44103sDl.class.getField((String) objArr[0]).get(null);
                    try {
                        Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        Object[] objArr2 = new Object[1];
                        a(-1538983430, 39, (byte) 0, (short) 0, 341350860, objArr2);
                        Object[] objArr3 = {(String) objArr2[0]};
                        Object[] objArr4 = new Object[1];
                        b(new int[]{-1964157409, 2048715243, -997709303, 1004118625}, 6, objArr4);
                        Method method = StringBuilder.class.getMethod((String) objArr4[0], String.class);
                        method.setAccessible(true);
                        method.invoke(objNewInstance, objArr3);
                        int i2 = AhwBna + 9;
                        valueOf = i2 % 128;
                        int i3 = i2 % 2;
                        Object[] objArr5 = {Long.valueOf(j3)};
                        Object[] objArr6 = new Object[1];
                        b(new int[]{-1964157409, 2048715243, -997709303, 1004118625}, 6, objArr6);
                        Method method2 = StringBuilder.class.getMethod((String) objArr6[0], Long.TYPE);
                        method2.setAccessible(true);
                        method2.invoke(objNewInstance, objArr5);
                        Object[] objArr7 = new Object[1];
                        b(new int[]{-315737275, -1076545354, 174672967, -237536403, 1787514464, 2010977946, -228178923, 1635860528, 1813112013, 1075989373, 1290033313, 1496490762}, 22, objArr7);
                        String str = (String) objArr7[0];
                        int i4 = AhwBna + 79;
                        valueOf = i4 % 128;
                        int i5 = i4 % 2;
                        Object[] objArr8 = new Object[1];
                        b(new int[]{-523551192, 1923133166, -45282459, -165403854}, 8, objArr8);
                        Method method3 = StringBuilder.class.getMethod((String) objArr8[0], null);
                        method3.setAccessible(true);
                        Object objInvoke = method3.invoke(objNewInstance, null);
                        Object[] objArr9 = new Object[1];
                        b(new int[]{-2009681700, 661664902}, 3, objArr9);
                        Object[] objArr10 = {objInvoke, (String) objArr9[0]};
                        Object[] objArr11 = new Object[1];
                        b(new int[]{822913947, -2129616897, 1549679633, 1147186021, 1127229306, 899021670, -188171160, 697062826, -1474864075, 1700276063, -403571402, 1750004784}, 21, objArr11);
                        Method method4 = Intrinsics.class.getMethod((String) objArr11[0], Object.class, String.class);
                        method4.setAccessible(true);
                        method4.invoke(null, objArr10);
                        if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                            Object[] objArr12 = new Object[1];
                            a(-1538983422, 18, (byte) 0, (short) 0, 341350903, objArr12);
                            String str2 = (String) objArr12[0];
                            Object[] objArr13 = new Object[1];
                            b(new int[]{-523551192, 1923133166, -45282459, -165403854}, 8, objArr13);
                            Method method5 = Object.class.getMethod((String) objArr13[0], null);
                            method5.setAccessible(true);
                            Object objInvoke2 = method5.invoke(str2, null);
                            int i6 = AhwBna;
                            int i7 = i6 + 103;
                            valueOf = i7 % 128;
                            int i8 = i7 % 2;
                            int i9 = i6 + 57;
                            valueOf = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr14 = {objInvoke2};
                            Constructor declaredConstructor2 = IllegalStateException.class.getDeclaredConstructor(String.class);
                            declaredConstructor2.setAccessible(true);
                            throw ((Throwable) declaredConstructor2.newInstance(objArr14));
                        }
                        Object obj2 = pUU.class.getField("copydefault").get(null);
                        Method method6 = Intrinsics.class.getMethod("copydefault", Object.class);
                        method6.setAccessible(true);
                        method6.invoke(null, obj2);
                        Object[] objArr15 = {str, objInvoke};
                        Method method7 = pUP.class.getMethod("OLrzqt", String.class, String.class);
                        method7.setAccessible(true);
                        method7.invoke(obj2, objArr15);
                        byte[] bArr = $$a;
                        byte b = bArr[13];
                        byte b2 = (byte) (-bArr[6]);
                        Object[] objArr16 = new Object[1];
                        c(b, b2, b2, objArr16);
                        Method method8 = C44103sDl.ActionBar.class.getMethod((String) objArr16[0], null);
                        method8.setAccessible(true);
                        Object objInvoke3 = method8.invoke(obj, null);
                        Object[] objArr17 = new Object[1];
                        a(-1538983396, 24, (byte) 0, (short) 0, 341350925, objArr17);
                        DetectionInfoBean.class.getField((String) objArr17[0]).setBoolean(objInvoke3, true);
                        int i11 = AhwBna + 105;
                        valueOf = i11 % 128;
                        int i12 = i11 % 2;
                        byte b3 = bArr[13];
                        byte b4 = (byte) (-bArr[6]);
                        Object[] objArr18 = new Object[1];
                        c(b3, b4, b4, objArr18);
                        Method method9 = C44103sDl.ActionBar.class.getMethod((String) objArr18[0], null);
                        method9.setAccessible(true);
                        Object objInvoke4 = method9.invoke(obj, null);
                        Long lValueOf = Long.valueOf(j3);
                        Object[] objArr19 = new Object[1];
                        a(-1538983401, 4, (byte) 0, (short) 0, 341350953, objArr19);
                        DetectionInfoBean.class.getField((String) objArr19[0]).set(objInvoke4, lValueOf);
                        int i13 = valueOf + 115;
                        AhwBna = i13 % 128;
                        if (i13 % 2 == 0) {
                            byte b5 = (byte) (-bArr[6]);
                            byte b6 = bArr[13];
                            Object[] objArr20 = new Object[1];
                            c(b5, b6, b6, objArr20);
                            Method method10 = C44103sDl.ActionBar.class.getMethod((String) objArr20[0], null);
                            method10.setAccessible(false);
                            method10.invoke(obj, null);
                            return;
                        }
                        byte b7 = (byte) (-bArr[6]);
                        byte b8 = bArr[13];
                        Object[] objArr21 = new Object[1];
                        c(b7, b8, b8, objArr21);
                        Method method11 = C44103sDl.ActionBar.class.getMethod((String) objArr21[0], null);
                        method11.setAccessible(true);
                        method11.invoke(obj, null);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            });
        }
        if (r15.AhwBna() != null) {
            ebEZpvd.EZpvd(c5101Et7, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.serde.CreateIdentityPoolOperationSerializerKt$serializeCreateIdentityPoolOperationBody$1$7
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5094Em interfaceC5094Em) {
                    invoke2(interfaceC5094Em);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<String> it = r15.AhwBna().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        if (r15.djBIcL() != null) {
            ebEZpvd.EZpvd(c5101Et8, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.serde.CreateIdentityPoolOperationSerializerKt$serializeCreateIdentityPoolOperationBody$1$8
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5094Em interfaceC5094Em) {
                    invoke2(interfaceC5094Em);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<String> it = r15.djBIcL().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        if (r15.gEmmrt() != null) {
            ebEZpvd.OLrzqt(c5101Et9, new Function1<InterfaceC5097Ep, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.serde.CreateIdentityPoolOperationSerializerKt$serializeCreateIdentityPoolOperationBody$1$9
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5097Ep interfaceC5097Ep) {
                    invoke2(interfaceC5097Ep);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5097Ep interfaceC5097Ep) {
                    Intrinsics.checkNotNullParameter(interfaceC5097Ep, "");
                    for (Map.Entry<String, String> entry : r15.gEmmrt().entrySet()) {
                        interfaceC5097Ep.KWHzl(entry.getKey(), entry.getValue());
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
