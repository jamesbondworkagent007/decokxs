package com.okinc.business.defi.biz.database.extra.dao;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.biz.core.error.WalletPasswordError;
import com.okinc.business.defi.biz.database.extra.entity.KeyValueEntity;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public interface PasswordKeyDao {
    int EZpvd(@NotNull String str);

    void EZpvd(@NotNull PasswordKey passwordKey);

    PasswordKey KWHzl();

    long OLrzqt(@NotNull KeyValueEntity keyValueEntity);

    List<KeyValueEntity> OLrzqt(@NotNull String str);

    void OLrzqt();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String KWHzl(PasswordKeyDao passwordKeyDao) {
            return CrashHianalyticsData.TIME;
        }

        public static void copydefault(@NotNull PasswordKeyDao passwordKeyDao, @NotNull PasswordKey passwordKey) {
            Intrinsics.checkNotNullParameter(passwordKey, "");
            passwordKeyDao.OLrzqt(new KeyValueEntity(KWHzl(passwordKeyDao), passwordKey.getKeyHash()));
        }

        public static PasswordKey OLrzqt(@NotNull PasswordKeyDao passwordKeyDao) throws Throwable {
            String value;
            KeyValueEntity keyValueEntity = (KeyValueEntity) CollectionsKt___CollectionsKt.firstOrNull(passwordKeyDao.OLrzqt(KWHzl(passwordKeyDao)));
            if (keyValueEntity != null && (value = keyValueEntity.getValue()) != null) {
                return new PasswordKey(value);
            }
            throw WalletPasswordError.Companion.AEQbTJ("get key hash null");
        }

        public static void copydefault(@NotNull PasswordKeyDao passwordKeyDao) {
            passwordKeyDao.EZpvd(KWHzl(passwordKeyDao));
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class PasswordKey {
        public static final int $stable = 0;
        private final String keyHash;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PasswordKey copy$default(PasswordKey passwordKey, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = passwordKey.keyHash;
            }
            return passwordKey.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.keyHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PasswordKey copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new PasswordKey(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PasswordKey) && Intrinsics.EZpvd((Object) this.keyHash, (Object) ((PasswordKey) obj).keyHash);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getKeyHash() {
            return this.keyHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.keyHash.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PasswordKey(keyHash=" + this.keyHash + ")";
        }

        public PasswordKey(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.keyHash = str;
        }
    }
}
