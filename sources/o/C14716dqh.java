package o;

import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14716dqh {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final java.lang.Object AEQbTJ = new java.lang.Object();
    public java.util.List<java.lang.String> OLrzqt;

    /* JADX INFO: renamed from: o.dqh$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dqh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C14716dqh getInstance$default(Activity activity, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return activity.KWHzl(context);
        }

        public final C14716dqh KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).iwGUEr();
        }
    }

    public final java.util.List<java.lang.String> AEQbTJ() {
        java.util.List<java.lang.String> listKWHzl;
        synchronized (this.AEQbTJ) {
            listKWHzl = this.OLrzqt;
            if (listKWHzl == null) {
                listKWHzl = KWHzl();
            }
        }
        return listKWHzl;
    }

    public final java.util.List<java.lang.String> KWHzl() {
        java.util.List<java.lang.String> listAhwBna;
        try {
            java.lang.String string = SPUtils.getString("dex_referral_rejected_codes", "", "REFERRAL_MANAGER_SP_CACHE_FILENAME");
            Intrinsics.copydefault((java.lang.Object) string);
            if (string.length() > 0) {
                Json.Default r1 = Json.Default;
                r1.getSerializersModule();
                listAhwBna = (java.util.List) r1.decodeFromString(new ArrayListSerializer(StringSerializer.INSTANCE), string);
            } else {
                listAhwBna = yDY.AhwBna();
            }
            this.OLrzqt = listAhwBna;
            return listAhwBna;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ReferralRejectedCodeManager", "Failed to get rejected codes from SP", e);
            return yDY.AhwBna();
        }
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        java.util.List<java.lang.String> listFJNWhG;
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this.AEQbTJ) {
            try {
                listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) AEQbTJ());
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("ReferralRejectedCodeManager", "Failed to add rejected code: " + str, e);
            }
            if (!listFJNWhG.contains(str)) {
                listFJNWhG.add(str);
                OLrzqt(listFJNWhG);
                this.OLrzqt = listFJNWhG;
                pUU.EZpvd("ReferralRejectedCodeManager", "Added rejected code: " + str);
                Unit unit = Unit.INSTANCE;
            } else {
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void OLrzqt(java.util.List<java.lang.String> list) {
        try {
            Json.Default r1 = Json.Default;
            r1.getSerializersModule();
            SPUtils.put("dex_referral_rejected_codes", r1.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list), "REFERRAL_MANAGER_SP_CACHE_FILENAME");
            pUU.EZpvd("ReferralRejectedCodeManager", "Saved rejected codes to SP");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ReferralRejectedCodeManager", "Failed to save rejected codes to SP", e);
        }
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ().contains(str);
    }
}
