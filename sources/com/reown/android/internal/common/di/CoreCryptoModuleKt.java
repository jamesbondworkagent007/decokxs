package com.reown.android.internal.common.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.google.android.gms.stats.CodePackage;
import com.google.common.base.Ascii;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.reown.android.internal.common.crypto.codec.ChaChaPolyCodec;
import com.reown.android.internal.common.crypto.codec.Codec;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.jwt.clientid.ClientIdJwtRepositoryAndroid;
import com.reown.android.internal.common.storage.key_chain.KeyChain;
import com.reown.foundation.crypto.data.repository.ClientIdJwtRepository;
import com.reown.foundation.util.Logger;
import java.lang.reflect.Method;
import java.security.KeyStore;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59982ztK;
import o.C56524yIo;
import o.C59930zsL;
import o.C59976ztE;
import o.C59978ztG;
import o.C59990ztS;
import o.C59991ztT;
import o.C60053zuc;
import o.C60055zue;
import o.C60058zuh;
import o.C60059zui;
import o.C60060zuj;
import o.C60064zun;
import o.YY;
import o.Zj;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes12.dex */
public final class CoreCryptoModuleKt {
    public static final String ANDROID_KEY_STORE = "AndroidKeyStore";
    public static final int KEY_SIZE = 256;
    public static final String KEY_STORE_ALIAS = "wc_keystore_key";
    public static final String SHARED_PREFS_FILE = "wc_key_store";

    public static final /* synthetic */ C59991ztT coreCryptoModule(final String str, final String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.internal.common.di.CoreCryptoModuleKt.coreCryptoModule.1
            private static short[] EZpvd;
            private static final byte[] $$a = {7, -78, 44, 117};
            private static final int $$b = 192;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int valueOf = 0;
            private static int AhwBna = 1;
            private static int copydefault = -1584793554;
            private static int KWHzl = 1640963152;
            private static int OLrzqt = 1601604962;
            private static byte[] AEQbTJ = {-65, 35, 51, 59, 93, 4, 66, 68, Ascii.ETB, 59, 36, 57, 72, 32, 105};

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(byte b, int i, int i2) {
                int i3;
                int i4;
                int i5 = 3 - (i * 2);
                int i6 = b * 4;
                byte[] bArr = $$a;
                int i7 = (i2 * 2) + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                byte[] bArr2 = new byte[i6 + 1];
                if (bArr == null) {
                    int i8 = i5;
                    int i9 = 0;
                    i5 += i7;
                    i4 = i8;
                    i3 = i9;
                    bArr2[i3] = (byte) i5;
                    if (i3 == i6) {
                        return new String(bArr2, 0);
                    }
                    int i10 = i4 + 1;
                    int i11 = i3 + 1;
                    i8 = i10;
                    i7 = bArr[i10];
                    i9 = i11;
                    i5 += i7;
                    i4 = i8;
                    i3 = i9;
                    bArr2[i3] = (byte) i5;
                    if (i3 == i6) {
                    }
                } else {
                    i3 = 0;
                    i4 = i5;
                    i5 = i7;
                    bArr2[i3] = (byte) i5;
                    if (i3 == i6) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public static final /* synthetic */ SharedPreferences access$invoke$createSharedPreferences(C60060zuj c60060zuj, String str3, String str4) {
                int i = 2 % 2;
                int i2 = valueOf + 61;
                AhwBna = i2 % 128;
                int i3 = i2 % 2;
                SharedPreferences sharedPreferencesInvoke$createSharedPreferences = invoke$createSharedPreferences(c60060zuj, str3, str4);
                if (i3 == 0) {
                    int i4 = 57 / 0;
                }
                int i5 = valueOf + 73;
                AhwBna = i5 % 128;
                if (i5 % 2 != 0) {
                    return sharedPreferencesInvoke$createSharedPreferences;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static final /* synthetic */ void access$invoke$deleteMasterKey(String str3) {
                int i = 2 % 2;
                int i2 = valueOf + 27;
                AhwBna = i2 % 128;
                int i3 = i2 % 2;
                invoke$deleteMasterKey(str3);
                int i4 = AhwBna + 27;
                valueOf = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            public static final /* synthetic */ void access$invoke$deleteSharedPreferences(C60060zuj c60060zuj, String str3) {
                int i = 2 % 2;
                int i2 = valueOf + 35;
                AhwBna = i2 % 128;
                int i3 = i2 % 2;
                invoke$deleteSharedPreferences(c60060zuj, str3);
                if (i3 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                int i = 2 % 2;
                int i2 = valueOf + 121;
                AhwBna = i2 % 128;
                int i3 = i2 % 2;
                invoke2(c59991ztT);
                Unit unit = Unit.INSTANCE;
                int i4 = valueOf + 15;
                AhwBna = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 48 / 0;
                }
                return unit;
            }

            public static final SharedPreferences invoke$createSharedPreferences(C60060zuj c60060zuj, String str3, String str4) {
                SharedPreferences sharedPreferencesCreate;
                synchronized (AnonymousClass1.class) {
                    KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str3, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
                    Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
                    MasterKey masterKeyBuild = new MasterKey.Builder(C59930zsL.AEQbTJ(c60060zuj), str3).setKeyGenParameterSpec(keyGenParameterSpecBuild).build();
                    Intrinsics.checkNotNullExpressionValue(masterKeyBuild, "");
                    sharedPreferencesCreate = EncryptedSharedPreferences.create(C59930zsL.AEQbTJ(c60060zuj), str4, masterKeyBuild, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
                    Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "");
                }
                return sharedPreferencesCreate;
            }

            public static final void invoke$deleteMasterKey(String str3) {
                synchronized (AnonymousClass1.class) {
                    Object[] objArr = new Object[1];
                    a(-1052348712, -92, (byte) 0, (short) -53, 1069095899, objArr);
                    KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
                    keyStore.load(null);
                    keyStore.deleteEntry(str3);
                }
            }

            public static final void invoke$deleteSharedPreferences(C60060zuj c60060zuj, String str3) {
                Context contextAEQbTJ;
                synchronized (AnonymousClass1.class) {
                    try {
                        contextAEQbTJ = C59930zsL.AEQbTJ(c60060zuj);
                    } catch (Exception e) {
                        ((Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null)).error("Occurred when trying to reset encrypted shared prefs: " + e);
                    }
                    if (contextAEQbTJ.getSharedPreferences(str3, 0) != null) {
                        contextAEQbTJ.deleteSharedPreferences(str3);
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [235=4, 221=5] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            /* JADX WARN: Removed duplicated region for block: B:65:0x020f  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0233  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, int i2, byte b, short s, int i3, Object[] objArr) throws Throwable {
                long j;
                boolean z;
                int i4 = 2 % 2;
                Zj zj = new Zj();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(KWHzl)};
                    Object objEZpvd = YY.EZpvd(-1048485176);
                    if (objEZpvd == null) {
                        objEZpvd = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objEZpvd).invoke(null, objArr2)).intValue();
                    int i5 = iIntValue == -1 ? 1 : 0;
                    if ((i5 ^ 1) == 1) {
                        j = -2166281683126510581L;
                    } else {
                        byte[] bArr = AEQbTJ;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i6 = 0;
                            while (i6 < length) {
                                int i7 = $10 + 103;
                                $11 = i7 % 128;
                                if (i7 % 2 == 0) {
                                    Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                                    Object objEZpvd2 = YY.EZpvd(1815080187);
                                    if (objEZpvd2 == null) {
                                        objEZpvd2 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i6] = ((Byte) ((Method) objEZpvd2).invoke(null, objArr3)).byteValue();
                                    i6 <<= 1;
                                } else {
                                    Object[] objArr4 = {Integer.valueOf(bArr[i6])};
                                    Object objEZpvd3 = YY.EZpvd(1815080187);
                                    if (objEZpvd3 == null) {
                                        objEZpvd3 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i6] = ((Byte) ((Method) objEZpvd3).invoke(null, objArr4)).byteValue();
                                    i6++;
                                }
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = AEQbTJ;
                            Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(copydefault)};
                            Object objEZpvd4 = YY.EZpvd(-1048485176);
                            if (objEZpvd4 == null) {
                                objEZpvd4 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objEZpvd4).invoke(null, objArr5)).intValue()]) ^ (-2166281683126510581L))) + ((int) (((long) KWHzl) ^ (-2166281683126510581L))));
                            j = -2166281683126510581L;
                        } else {
                            j = -2166281683126510581L;
                            iIntValue = (short) (((short) (((long) EZpvd[i3 + ((int) (((long) copydefault) ^ (-2166281683126510581L)))]) ^ (-2166281683126510581L))) + ((int) (((long) KWHzl) ^ (-2166281683126510581L))));
                        }
                    }
                    if (iIntValue > 0) {
                        zj.OLrzqt = ((i3 + iIntValue) - 2) + ((int) (((long) copydefault) ^ j)) + i5;
                        Object[] objArr6 = {zj, Integer.valueOf(i), Integer.valueOf(OLrzqt), sb};
                        Object objEZpvd5 = YY.EZpvd(-2015189563);
                        if (objEZpvd5 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objEZpvd5 = YY.EZpvd(180, 4, (char) 19181, -2084411207, false, $$c(b2, b3, b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objEZpvd5).invoke(null, objArr6)).append(zj.EZpvd);
                        zj.AEQbTJ = zj.EZpvd;
                        byte[] bArr4 = AEQbTJ;
                        if (bArr4 != null) {
                            int i8 = $10 + 109;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i10 = 0; i10 < length2; i10++) {
                                bArr5[i10] = (byte) (((long) bArr4[i10]) ^ (-2166281683126510581L));
                            }
                            bArr4 = bArr5;
                        }
                        if (bArr4 != null) {
                            int i11 = $11 + 65;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        zj.KWHzl = 1;
                        while (zj.KWHzl < iIntValue) {
                            int i13 = $11 + 29;
                            $10 = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i14 = 6 / 0;
                                if (z) {
                                    byte[] bArr6 = AEQbTJ;
                                    zj.OLrzqt = zj.OLrzqt - 1;
                                    zj.EZpvd = (char) (zj.AEQbTJ + (((byte) (((byte) (((long) bArr6[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                                } else {
                                    short[] sArr = EZpvd;
                                    zj.OLrzqt = zj.OLrzqt - 1;
                                    zj.EZpvd = (char) (zj.AEQbTJ + (((short) (((short) (((long) sArr[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                                }
                            } else if (z) {
                            }
                            sb.append(zj.EZpvd);
                            zj.AEQbTJ = zj.EZpvd;
                            zj.KWHzl++;
                        }
                    }
                    String string = sb.toString();
                    int i15 = $10 + 39;
                    $11 = i15 % 128;
                    if (i15 % 2 != 0) {
                        objArr[0] = string;
                    } else {
                        int i16 = 97 / 0;
                        objArr[0] = string;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                final String str3 = str2;
                final String str4 = str;
                Function2<C60060zuj, C60053zuc, SharedPreferences> function2 = new Function2<C60060zuj, C60053zuc, SharedPreferences>() { // from class: com.reown.android.internal.common.di.CoreCryptoModuleKt.coreCryptoModule.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final SharedPreferences invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        try {
                            return AnonymousClass1.access$invoke$createSharedPreferences(c60060zuj, str3, str4);
                        } catch (Exception e) {
                            ((Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null)).error(e);
                            AnonymousClass1.access$invoke$deleteMasterKey(str3);
                            AnonymousClass1.access$invoke$deleteSharedPreferences(c60060zuj, str4);
                            DatabaseConfigKt.deleteDatabases(c60060zuj);
                            return AnonymousClass1.access$invoke$createSharedPreferences(c60060zuj, str3, str4);
                        }
                    }
                };
                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                Kind kind = Kind.Singleton;
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(SharedPreferences.class), null, function2, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(com.reown.android.internal.common.storage.key_chain.KeyStore.class), null, new Function2<C60060zuj, C60053zuc, com.reown.android.internal.common.storage.key_chain.KeyStore>() { // from class: com.reown.android.internal.common.di.CoreCryptoModuleKt.coreCryptoModule.1.2
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final com.reown.android.internal.common.storage.key_chain.KeyStore invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new KeyChain((SharedPreferences) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SharedPreferences.class), null, null));
                    }
                }, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                if (c59991ztT.OLrzqt()) {
                    int i2 = valueOf + 7;
                    AhwBna = i2 % 128;
                    int i3 = i2 % 2;
                    c59991ztT.KWHzl(c59990ztS2);
                }
                new C59976ztE(c59991ztT, c59990ztS2);
                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ClientIdJwtRepository.class), null, new Function2<C60060zuj, C60053zuc, ClientIdJwtRepository>() { // from class: com.reown.android.internal.common.di.CoreCryptoModuleKt.coreCryptoModule.1.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final ClientIdJwtRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new ClientIdJwtRepositoryAndroid((com.reown.android.internal.common.storage.key_chain.KeyStore) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(com.reown.android.internal.common.storage.key_chain.KeyStore.class), null, null));
                    }
                }, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                if (!(!c59991ztT.OLrzqt())) {
                    int i4 = AhwBna + 79;
                    valueOf = i4 % 128;
                    int i5 = i4 % 2;
                    c59991ztT.KWHzl(c59990ztS3);
                }
                new C59976ztE(c59991ztT, c59990ztS3);
                C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(KeyManagementRepository.class), null, new Function2<C60060zuj, C60053zuc, KeyManagementRepository>() { // from class: com.reown.android.internal.common.di.CoreCryptoModuleKt.coreCryptoModule.1.4
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final KeyManagementRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new BouncyCastleKeyManagementRepository((com.reown.android.internal.common.storage.key_chain.KeyStore) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(com.reown.android.internal.common.storage.key_chain.KeyStore.class), null, null));
                    }
                }, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS4);
                }
                new C59976ztE(c59991ztT, c59990ztS4);
                C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Codec.class), null, new Function2<C60060zuj, C60053zuc, Codec>() { // from class: com.reown.android.internal.common.di.CoreCryptoModuleKt.coreCryptoModule.1.5
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Codec invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new ChaChaPolyCodec((KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null));
                    }
                }, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
                if (c59991ztT.OLrzqt()) {
                    int i6 = valueOf + 35;
                    AhwBna = i6 % 128;
                    int i7 = i6 % 2;
                    c59991ztT.KWHzl(c59990ztS5);
                    int i8 = valueOf + 25;
                    AhwBna = i8 % 128;
                    int i9 = i8 % 2;
                }
                new C59976ztE(c59991ztT, c59990ztS5);
            }
        }, 1, null);
    }

    public static /* synthetic */ C59991ztT coreCryptoModule$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = SHARED_PREFS_FILE;
        }
        if ((i & 2) != 0) {
            str2 = KEY_STORE_ALIAS;
        }
        return coreCryptoModule(str, str2);
    }
}
