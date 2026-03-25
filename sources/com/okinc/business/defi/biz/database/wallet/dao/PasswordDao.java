package com.okinc.business.defi.biz.database.wallet.dao;

import com.google.android.exoplayer2.C;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletPasswordError;
import com.okinc.business.defi.biz.database.extra.ExtraDatabase;
import com.okinc.business.defi.biz.database.extra.dao.PasswordKeyDao;
import com.okinc.business.defi.biz.database.wallet.entity.KVEntity;
import com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.wallet.core.encrypt.EncryptBean;
import com.okinc.wallet.core.encrypt.RandomSecretKey;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.security.Key;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.crypto.SecretKey;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C33514mxr;
import o.C54909xZv;
import o.C9678baC;
import o.xXW;
import o.xXX;
import o.xXZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface PasswordDao {

    /* JADX INFO: loaded from: classes14.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.HDWallet.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.TonWallet.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletType.AAWallet.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            KWHzl = iArr;
        }
    }

    long AEQbTJ(@NotNull KVEntity kVEntity);

    String AEQbTJ();

    List<KVEntity> AEQbTJ(@NotNull String str);

    void AYXKKw(@NotNull String str);

    boolean AYXKKw();

    int AhwBna();

    int EZpvd(@NotNull String str);

    List<MPCWalletEntity> EZpvd();

    void EZpvd(@NotNull String str, @NotNull String str2, boolean z);

    int KWHzl(@NotNull WalletEntity walletEntity);

    void KWHzl();

    boolean KWHzl(@NotNull String str);

    int OLrzqt(@NotNull MPCWalletEntity mPCWalletEntity);

    List<WalletEntity> OLrzqt();

    void OLrzqt(@NotNull String str);

    void OLrzqt(@NotNull String str, boolean z);

    String copydefault();

    String copydefault(@NotNull String str);

    boolean djBIcL();

    long gEmmrt(@NotNull String str);

    boolean gEmmrt();

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String AYXKKw(PasswordDao passwordDao) {
            return CrashHianalyticsData.TIME;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String DbNXlk(PasswordDao passwordDao) {
            return "time1234";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String OLrzqt(PasswordDao passwordDao) {
            return "time1";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String copydefault(PasswordDao passwordDao) {
            return "is_key_save_to_db";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String djBIcL(PasswordDao passwordDao) {
            return "time2";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String gEmmrt(PasswordDao passwordDao) {
            return "is_manual";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String valueOf(PasswordDao passwordDao) {
            return "walletPassword";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String values(PasswordDao passwordDao) {
            return "time123";
        }

        public static PasswordKeyDao fetchVPNInfo(PasswordDao passwordDao) {
            return ExtraDatabase.Companion.AEQbTJ(C9678baC.Companion.AEQbTJ()).ejfBZ();
        }

        public static void EZpvd(@NotNull PasswordDao passwordDao, @NotNull String str, boolean z) throws Throwable {
            Intrinsics.checkNotNullParameter(str, "");
            PasswordBean passwordBeanOLrzqt = OLrzqt(passwordDao, str, z);
            if (passwordDao.AYXKKw() && C33129mqd.KWHzl((Collection) passwordDao.OLrzqt())) {
                throw WalletPasswordError.Companion.OLrzqt();
            }
            OLrzqt(passwordDao, passwordBeanOLrzqt);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void KWHzl(@NotNull PasswordDao passwordDao, @NotNull String str, @NotNull String str2, boolean z) throws Throwable {
            boolean zEZpvd;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            PasswordBean passwordBeanOLrzqt = OLrzqt(passwordDao, str2, z);
            String strCopydefault = passwordDao.copydefault(str);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (str.length() != 0 && strCopydefault != null && strCopydefault.length() != 0) {
                Iterator<T> it = passwordDao.OLrzqt().iterator();
                while (true) {
                    boolean z2 = false;
                    if (it.hasNext()) {
                        WalletEntity walletEntity = (WalletEntity) it.next();
                        WalletType.Application application = WalletType.Companion;
                        WalletType walletTypeKWHzl = application.KWHzl(walletEntity.getType());
                        int[] iArr = TaskDescription.KWHzl;
                        int i = iArr[walletTypeKWHzl.ordinal()];
                        if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
                            if (application.KWHzl(walletEntity.getType()) == WalletType.AAWallet) {
                                int i2 = iArr[application.KWHzl(walletEntity.getEoaWalletType()).ordinal()];
                                if (i2 == 1) {
                                    continue;
                                } else {
                                    if (i2 != 2) {
                                    }
                                    xXW xxw = xXW.OLrzqt;
                                    String strAEQbTJ = xxw.AEQbTJ(str, strCopydefault, walletEntity.getData(), z2);
                                    String strAEQbTJ2 = xXX.EZpvd.AEQbTJ(str2, passwordBeanOLrzqt.getPwdHash(), strAEQbTJ, z2);
                                    String strAEQbTJ3 = xxw.AEQbTJ(str2, passwordBeanOLrzqt.getPwdHash(), strAEQbTJ2, z2);
                                    if (!z2) {
                                        zEZpvd = C54909xZv.OLrzqt.copydefault(C9678baC.Companion.AEQbTJ(), strAEQbTJ3, strAEQbTJ);
                                    } else {
                                        zEZpvd = Intrinsics.EZpvd((Object) strAEQbTJ3, (Object) strAEQbTJ);
                                    }
                                    if (zEZpvd || strAEQbTJ == null || strAEQbTJ.length() == 0) {
                                        break;
                                    }
                                    walletEntity.setData(strAEQbTJ2);
                                    arrayList.add(walletEntity);
                                }
                            }
                            z2 = true;
                            xXW xxw2 = xXW.OLrzqt;
                            String strAEQbTJ4 = xxw2.AEQbTJ(str, strCopydefault, walletEntity.getData(), z2);
                            String strAEQbTJ22 = xXX.EZpvd.AEQbTJ(str2, passwordBeanOLrzqt.getPwdHash(), strAEQbTJ4, z2);
                            String strAEQbTJ32 = xxw2.AEQbTJ(str2, passwordBeanOLrzqt.getPwdHash(), strAEQbTJ22, z2);
                            if (!z2) {
                            }
                            if (zEZpvd) {
                                break;
                            } else {
                                break;
                            }
                        }
                    } else {
                        for (MPCWalletEntity mPCWalletEntity : passwordDao.EZpvd()) {
                            xXW xxw3 = xXW.OLrzqt;
                            String strAEQbTJ5 = xxw3.AEQbTJ(str, strCopydefault, mPCWalletEntity.getEncryptShareKey(), false);
                            String strAEQbTJ6 = xXX.EZpvd.AEQbTJ(str2, passwordBeanOLrzqt.getPwdHash(), strAEQbTJ5, false);
                            if (Intrinsics.EZpvd((Object) xxw3.AEQbTJ(str2, passwordBeanOLrzqt.getPwdHash(), strAEQbTJ6, false), (Object) strAEQbTJ5) && strAEQbTJ5 != null && strAEQbTJ5.length() != 0) {
                                mPCWalletEntity.setEncryptShareKey(strAEQbTJ6);
                                arrayList2.add(mPCWalletEntity);
                            } else {
                                throw WalletPasswordError.Companion.copydefault();
                            }
                        }
                    }
                }
                throw WalletPasswordError.Companion.copydefault();
            }
            OLrzqt(passwordDao, passwordBeanOLrzqt);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                passwordDao.KWHzl((WalletEntity) it2.next());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                passwordDao.OLrzqt((MPCWalletEntity) it3.next());
            }
        }

        public static void copydefault(PasswordDao passwordDao, PasswordBean passwordBean) {
            passwordDao.AEQbTJ(new KVEntity(AYXKKw(passwordDao), passwordBean.getPwdHash()));
            String rawPwd = passwordBean.getRawPwd();
            if (rawPwd == null || rawPwd.length() == 0) {
                passwordDao.EZpvd(values(passwordDao));
            } else {
                passwordDao.AEQbTJ(new KVEntity(values(passwordDao), passwordBean.getRawPwd()));
            }
            passwordDao.AEQbTJ(new KVEntity(gEmmrt(passwordDao), String.valueOf(passwordBean.isManual())));
            passwordDao.AEQbTJ(new KVEntity(djBIcL(passwordDao), passwordBean.getIv()));
            if (passwordBean.getPasswordSecretKey().isKeySaveToDB()) {
                passwordDao.AEQbTJ(new KVEntity(DbNXlk(passwordDao), passwordBean.getPasswordSecretKey().getKeyEncrypt()));
            }
            passwordDao.AEQbTJ(new KVEntity(copydefault(passwordDao), String.valueOf(passwordBean.getPasswordSecretKey().isKeySaveToDB())));
        }

        public static void OLrzqt(PasswordDao passwordDao, PasswordBean passwordBean) throws Throwable {
            if (passwordBean.getPasswordSecretKey().isKeySaveToDB()) {
                fetchVPNInfo(passwordDao).EZpvd(new PasswordKeyDao.PasswordKey(passwordBean.getPasswordSecretKey().getKeyHash()));
                if (Intrinsics.EZpvd((Object) fetchVPNInfo(passwordDao).KWHzl().getKeyHash(), (Object) passwordBean.getPasswordSecretKey().getKeyHash())) {
                    copydefault(passwordDao, passwordBean);
                    return;
                }
                throw WalletPasswordError.Companion.AEQbTJ("save keyHash and keyEncrypt error");
            }
            copydefault(passwordDao, passwordBean);
        }

        public static void EZpvd(@NotNull PasswordDao passwordDao) {
            passwordDao.EZpvd(AYXKKw(passwordDao));
            passwordDao.EZpvd(values(passwordDao));
            passwordDao.EZpvd(DbNXlk(passwordDao));
            passwordDao.EZpvd(djBIcL(passwordDao));
            passwordDao.EZpvd(gEmmrt(passwordDao));
            passwordDao.EZpvd(OLrzqt(passwordDao));
            passwordDao.EZpvd(copydefault(passwordDao));
            fetchVPNInfo(passwordDao).OLrzqt();
        }

        public static PasswordBean OLrzqt(PasswordDao passwordDao, String str, boolean z) throws Throwable {
            String encryptedData;
            String strEZpvd = xXX.EZpvd.EZpvd(str);
            if (xXW.OLrzqt.AEQbTJ(str, strEZpvd)) {
                PasswordSecretKey passwordSecretKeyAhwBna = AhwBna(passwordDao);
                EncryptBean encryptBeanKWHzl = KWHzl(passwordDao, str, passwordSecretKeyAhwBna.getSecretKey());
                if (Intrinsics.EZpvd((Object) str, (Object) EZpvd(passwordDao, encryptBeanKWHzl.getEncryptedData(), encryptBeanKWHzl.getIv(), passwordSecretKeyAhwBna.getSecretKey()))) {
                    if (z) {
                        encryptedData = "";
                    } else {
                        encryptedData = encryptBeanKWHzl.getEncryptedData();
                    }
                    return new PasswordBean(strEZpvd, encryptedData, encryptBeanKWHzl.getIv(), z, passwordSecretKeyAhwBna);
                }
                throw WalletPasswordError.Companion.AEQbTJ();
            }
            throw WalletPasswordError.Companion.KWHzl();
        }

        public static void OLrzqt(@NotNull PasswordDao passwordDao, @NotNull String str) throws Throwable {
            Intrinsics.checkNotNullParameter(str, "");
            if (passwordDao.KWHzl(str)) {
                PasswordSecretKey passwordSecretKeyAhwBna = AhwBna(passwordDao);
                EncryptBean encryptBeanKWHzl = KWHzl(passwordDao, str, passwordSecretKeyAhwBna.getSecretKey());
                if (Intrinsics.EZpvd((Object) str, (Object) EZpvd(passwordDao, encryptBeanKWHzl.getEncryptedData(), encryptBeanKWHzl.getIv(), passwordSecretKeyAhwBna.getSecretKey()))) {
                    if (passwordSecretKeyAhwBna.isKeySaveToDB()) {
                        fetchVPNInfo(passwordDao).EZpvd(new PasswordKeyDao.PasswordKey(passwordSecretKeyAhwBna.getKeyHash()));
                        if (Intrinsics.EZpvd((Object) fetchVPNInfo(passwordDao).KWHzl().getKeyHash(), (Object) passwordSecretKeyAhwBna.getKeyHash())) {
                            copydefault(passwordDao, encryptBeanKWHzl, passwordSecretKeyAhwBna);
                            return;
                        }
                        throw WalletPasswordError.Companion.AEQbTJ("save keyHash and keyEncrypt error");
                    }
                    copydefault(passwordDao, encryptBeanKWHzl, passwordSecretKeyAhwBna);
                    return;
                }
                throw WalletPasswordError.Companion.AEQbTJ("save password raw error");
            }
        }

        public static void copydefault(PasswordDao passwordDao, EncryptBean encryptBean, PasswordSecretKey passwordSecretKey) {
            passwordDao.AEQbTJ(new KVEntity(values(passwordDao), encryptBean.getEncryptedData()));
            passwordDao.AEQbTJ(new KVEntity(djBIcL(passwordDao), encryptBean.getIv()));
            if (passwordSecretKey.isKeySaveToDB()) {
                passwordDao.AEQbTJ(new KVEntity(DbNXlk(passwordDao), passwordSecretKey.getKeyEncrypt()));
            }
            passwordDao.AEQbTJ(new KVEntity(copydefault(passwordDao), String.valueOf(passwordSecretKey.isKeySaveToDB())));
        }

        public static void EZpvd(@NotNull PasswordDao passwordDao, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (passwordDao.KWHzl(str)) {
                passwordDao.EZpvd(values(passwordDao));
            }
        }

        public static boolean KWHzl(@NotNull PasswordDao passwordDao, @NotNull String str) throws Throwable {
            Intrinsics.checkNotNullParameter(str, "");
            if (xXW.OLrzqt.AEQbTJ(str, passwordDao.copydefault(str))) {
                if (passwordDao.djBIcL() || Intrinsics.EZpvd((Object) str, (Object) passwordDao.AEQbTJ())) {
                    return true;
                }
                throw WalletPasswordError.Companion.AEQbTJ();
            }
            throw WalletPasswordError.Companion.KWHzl();
        }

        public static String AkhnZx(@NotNull PasswordDao passwordDao) {
            String str;
            List<KVEntity> listAEQbTJ = passwordDao.AEQbTJ(values(passwordDao));
            String str2 = "";
            if (listAEQbTJ == null || listAEQbTJ.isEmpty()) {
                return "";
            }
            String str3 = ((KVEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(listAEQbTJ)).get_value();
            KVEntity kVEntity = (KVEntity) CollectionsKt___CollectionsKt.firstOrNull(passwordDao.AEQbTJ(djBIcL(passwordDao)));
            if (kVEntity != null && (str = kVEntity.get_value()) != null) {
                str2 = str;
            }
            return EZpvd(passwordDao, str3, str2, AhwBna(passwordDao).getSecretKey());
        }

        public static String AEQbTJ(@NotNull PasswordDao passwordDao, @NotNull String str) throws Throwable {
            String strCopydefault = "";
            Intrinsics.checkNotNullParameter(str, "");
            List<KVEntity> listAEQbTJ = passwordDao.AEQbTJ(AYXKKw(passwordDao));
            if (listAEQbTJ != null && !listAEQbTJ.isEmpty()) {
                strCopydefault = copydefault(passwordDao, ((KVEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(listAEQbTJ)).get_value());
                if (!xXW.OLrzqt.AEQbTJ(str, strCopydefault)) {
                    throw WalletPasswordError.Companion.EZpvd();
                }
            }
            return strCopydefault;
        }

        public static boolean fIwbmz(@NotNull PasswordDao passwordDao) {
            if (passwordDao.djBIcL()) {
                return fJNWhG(passwordDao);
            }
            return ejfBZ(passwordDao);
        }

        public static boolean fJNWhG(PasswordDao passwordDao) {
            return C33129mqd.KWHzl((Collection) passwordDao.AEQbTJ(AYXKKw(passwordDao)));
        }

        public static boolean ejfBZ(PasswordDao passwordDao) {
            return C33129mqd.KWHzl((Collection) passwordDao.AEQbTJ(values(passwordDao)));
        }

        public static boolean AuCTel(@NotNull PasswordDao passwordDao) {
            List<KVEntity> listAEQbTJ = passwordDao.AEQbTJ(gEmmrt(passwordDao));
            if (listAEQbTJ == null || listAEQbTJ.isEmpty()) {
                return true;
            }
            return Boolean.parseBoolean(((KVEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(listAEQbTJ)).get_value());
        }

        public static String KWHzl(@NotNull PasswordDao passwordDao) {
            String str;
            KVEntity kVEntity = (KVEntity) CollectionsKt___CollectionsKt.firstOrNull(passwordDao.AEQbTJ(OLrzqt(passwordDao)));
            return (kVEntity == null || (str = kVEntity.get_value()) == null) ? "" : str;
        }

        public static long valueOf(@NotNull PasswordDao passwordDao, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return passwordDao.AEQbTJ(new KVEntity(OLrzqt(passwordDao), str));
        }

        public static int iwGUEr(@NotNull PasswordDao passwordDao) {
            return passwordDao.EZpvd(OLrzqt(passwordDao));
        }

        public static String EZpvd(PasswordDao passwordDao, String str, String str2, SecretKey secretKey) throws Exception {
            if (str2.length() == 0) {
                String strCopydefault = C33514mxr.copydefault(str, C.UTF8_NAME, BouncyCastleKeyManagementRepository.AES, "!@#$%^&123456789");
                Intrinsics.copydefault((Object) strCopydefault);
                return strCopydefault;
            }
            return xXZ.EZpvd.OLrzqt(new EncryptBean(str, str2), secretKey);
        }

        public static EncryptBean KWHzl(PasswordDao passwordDao, String str, SecretKey secretKey) {
            return xXZ.EZpvd.KWHzl(str, secretKey);
        }

        public static String copydefault(PasswordDao passwordDao, String str) {
            String string;
            String str2;
            JsonElement string2 = JsonParser.parseString(str);
            if (string2 instanceof JsonPrimitive) {
                string = ((JsonPrimitive) string2).getAsString();
                str2 = "getAsString(...)";
            } else {
                string = string2.toString();
                str2 = "toString(...)";
            }
            Intrinsics.checkNotNullExpressionValue(string, str2);
            return string;
        }

        public static PasswordSecretKey AhwBna(PasswordDao passwordDao) {
            if (passwordDao.AEQbTJ(djBIcL(passwordDao)).isEmpty()) {
                return AEQbTJ(passwordDao);
            }
            return isConnected(passwordDao);
        }

        public static PasswordSecretKey AEQbTJ(PasswordDao passwordDao) throws Throwable {
            xXZ xxz = xXZ.EZpvd;
            KeyStore keyStoreAEQbTJ = xxz.AEQbTJ();
            if (keyStoreAEQbTJ == null) {
                RandomSecretKey randomSecretKeyEZpvd = xxz.EZpvd();
                if (randomSecretKeyEZpvd == null) {
                    throw WalletPasswordError.Companion.AEQbTJ("create random secret key error");
                }
                return new PasswordSecretKey(true, randomSecretKeyEZpvd.getKeyHash(), randomSecretKeyEZpvd.getKeyEncrypt(), xxz.OLrzqt(randomSecretKeyEZpvd.getKey()));
            }
            return new PasswordSecretKey(false, "", "", xxz.copydefault(valueOf(passwordDao), keyStoreAEQbTJ, false));
        }

        public static boolean fARcdN(@NotNull PasswordDao passwordDao) throws Throwable {
            KeyStore keyStoreAEQbTJ = xXZ.EZpvd.AEQbTJ();
            if (keyStoreAEQbTJ == null) {
                throw WalletPasswordError.Companion.AEQbTJ("get android key store error for data migration");
            }
            Key key = keyStoreAEQbTJ.getKey(valueOf(passwordDao), null);
            if (key != null) {
                return key instanceof SecretKey;
            }
            return false;
        }

        public static PasswordSecretKey isConnected(PasswordDao passwordDao) throws Throwable {
            String str;
            KVEntity kVEntity = (KVEntity) CollectionsKt___CollectionsKt.firstOrNull(passwordDao.AEQbTJ(copydefault(passwordDao)));
            String str2 = kVEntity != null ? kVEntity.get_value() : null;
            if (Boolean.parseBoolean(str2)) {
                String keyHash = fetchVPNInfo(passwordDao).KWHzl().getKeyHash();
                KVEntity kVEntity2 = (KVEntity) CollectionsKt___CollectionsKt.firstOrNull(passwordDao.AEQbTJ(DbNXlk(passwordDao)));
                if (kVEntity2 == null || (str = kVEntity2.get_value()) == null) {
                    throw WalletPasswordError.Companion.AEQbTJ("get key encrypt null");
                }
                if (keyHash.length() > 0 && str.length() > 0) {
                    return new PasswordSecretKey(true, keyHash, str, xXZ.EZpvd.OLrzqt(xXW.OLrzqt.KWHzl(str, keyHash)));
                }
                throw WalletPasswordError.Companion.AEQbTJ("get keyHash and keyEncrypt error");
            }
            xXZ xxz = xXZ.EZpvd;
            String strValueOf = valueOf(passwordDao);
            KeyStore keyStoreAEQbTJ = xxz.AEQbTJ();
            if (keyStoreAEQbTJ != null) {
                return new PasswordSecretKey(false, "", "", xxz.copydefault(strValueOf, keyStoreAEQbTJ, (str2 == null || Boolean.parseBoolean(str2)) ? false : true));
            }
            throw WalletPasswordError.Companion.AEQbTJ("get android key store error");
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class PasswordBean {
        public static final int $stable = 8;
        private boolean isManual;
        private String iv;
        private PasswordSecretKey passwordSecretKey;
        private String pwdHash;
        private String rawPwd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PasswordBean copy$default(PasswordBean passwordBean, String str, String str2, String str3, boolean z, PasswordSecretKey passwordSecretKey, int i, Object obj) {
            if ((i & 1) != 0) {
                str = passwordBean.pwdHash;
            }
            if ((i & 2) != 0) {
                str2 = passwordBean.rawPwd;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = passwordBean.iv;
            }
            String str5 = str3;
            if ((i & 8) != 0) {
                z = passwordBean.isManual;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                passwordSecretKey = passwordBean.passwordSecretKey;
            }
            return passwordBean.copy(str, str4, str5, z2, passwordSecretKey);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.pwdHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.rawPwd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.iv;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component4() {
            return this.isManual;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PasswordSecretKey component5() {
            return this.passwordSecretKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PasswordBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull PasswordSecretKey passwordSecretKey) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(passwordSecretKey, "");
            return new PasswordBean(str, str2, str3, z, passwordSecretKey);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasswordBean)) {
                return false;
            }
            PasswordBean passwordBean = (PasswordBean) obj;
            return Intrinsics.EZpvd((Object) this.pwdHash, (Object) passwordBean.pwdHash) && Intrinsics.EZpvd((Object) this.rawPwd, (Object) passwordBean.rawPwd) && Intrinsics.EZpvd((Object) this.iv, (Object) passwordBean.iv) && this.isManual == passwordBean.isManual && Intrinsics.EZpvd(this.passwordSecretKey, passwordBean.passwordSecretKey);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIv() {
            return this.iv;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PasswordSecretKey getPasswordSecretKey() {
            return this.passwordSecretKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPwdHash() {
            return this.pwdHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRawPwd() {
            return this.rawPwd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.pwdHash.hashCode() * 31) + this.rawPwd.hashCode()) * 31) + this.iv.hashCode()) * 31) + Boolean.hashCode(this.isManual)) * 31) + this.passwordSecretKey.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isManual() {
            return this.isManual;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setIv(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.iv = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setManual(boolean z) {
            this.isManual = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPasswordSecretKey(@NotNull PasswordSecretKey passwordSecretKey) {
            Intrinsics.checkNotNullParameter(passwordSecretKey, "");
            this.passwordSecretKey = passwordSecretKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPwdHash(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.pwdHash = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRawPwd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.rawPwd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PasswordBean(pwdHash=" + this.pwdHash + ", rawPwd=" + this.rawPwd + ", iv=" + this.iv + ", isManual=" + this.isManual + ", passwordSecretKey=" + this.passwordSecretKey + ")";
        }

        public PasswordBean(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull PasswordSecretKey passwordSecretKey) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(passwordSecretKey, "");
            this.pwdHash = str;
            this.rawPwd = str2;
            this.iv = str3;
            this.isManual = z;
            this.passwordSecretKey = passwordSecretKey;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class PasswordSecretKey {
        public static final int $stable = 8;
        private boolean isKeySaveToDB;
        private final String keyEncrypt;
        private final String keyHash;
        private final SecretKey secretKey;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PasswordSecretKey copy$default(PasswordSecretKey passwordSecretKey, boolean z, String str, String str2, SecretKey secretKey, int i, Object obj) {
            if ((i & 1) != 0) {
                z = passwordSecretKey.isKeySaveToDB;
            }
            if ((i & 2) != 0) {
                str = passwordSecretKey.keyHash;
            }
            if ((i & 4) != 0) {
                str2 = passwordSecretKey.keyEncrypt;
            }
            if ((i & 8) != 0) {
                secretKey = passwordSecretKey.secretKey;
            }
            return passwordSecretKey.copy(z, str, str2, secretKey);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.isKeySaveToDB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.keyHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.keyEncrypt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SecretKey component4() {
            return this.secretKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PasswordSecretKey copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull SecretKey secretKey) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(secretKey, "");
            return new PasswordSecretKey(z, str, str2, secretKey);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasswordSecretKey)) {
                return false;
            }
            PasswordSecretKey passwordSecretKey = (PasswordSecretKey) obj;
            return this.isKeySaveToDB == passwordSecretKey.isKeySaveToDB && Intrinsics.EZpvd((Object) this.keyHash, (Object) passwordSecretKey.keyHash) && Intrinsics.EZpvd((Object) this.keyEncrypt, (Object) passwordSecretKey.keyEncrypt) && Intrinsics.EZpvd(this.secretKey, passwordSecretKey.secretKey);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getKeyEncrypt() {
            return this.keyEncrypt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getKeyHash() {
            return this.keyHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SecretKey getSecretKey() {
            return this.secretKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Boolean.hashCode(this.isKeySaveToDB) * 31) + this.keyHash.hashCode()) * 31) + this.keyEncrypt.hashCode()) * 31) + this.secretKey.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isKeySaveToDB() {
            return this.isKeySaveToDB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setKeySaveToDB(boolean z) {
            this.isKeySaveToDB = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PasswordSecretKey(isKeySaveToDB=" + this.isKeySaveToDB + ", keyHash=" + this.keyHash + ", keyEncrypt=" + this.keyEncrypt + ", secretKey=" + this.secretKey + ")";
        }

        public PasswordSecretKey(boolean z, @NotNull String str, @NotNull String str2, @NotNull SecretKey secretKey) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(secretKey, "");
            this.isKeySaveToDB = z;
            this.keyHash = str;
            this.keyEncrypt = str2;
            this.secretKey = secretKey;
        }
    }
}
