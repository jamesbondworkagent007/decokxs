package o;

import android.content.SharedPreferences;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.SplitMessageCache;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ebo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16009ebo {
    public final android.content.SharedPreferences AEQbTJ;
    public final java.lang.String KWHzl;
    public final Json copydefault;

    public C16009ebo(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = "SplitMessageCacheManager";
        this.AEQbTJ = context.getSharedPreferences("okx_connect_split_message_cache", 0);
        this.copydefault = JsonKt.Json$default(null, new Function1() { // from class: o.ebn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16009ebo.EZpvd((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        return str + "_" + str2;
    }

    public final void EZpvd(@NotNull SplitMessageCache splitMessageCache) {
        Intrinsics.checkNotNullParameter(splitMessageCache, "");
        try {
            SharedPreferences.Editor editorEdit = this.AEQbTJ.edit();
            java.lang.String strAEQbTJ = AEQbTJ(splitMessageCache.getTopic(), splitMessageCache.getPackageGroupId());
            Json json = this.copydefault;
            json.getSerializersModule();
            editorEdit.putString(strAEQbTJ, json.encodeToString(SplitMessageCache.Companion.serializer(), splitMessageCache)).apply();
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.KWHzl, "Error saving SplitMessageCache: " + e.getMessage());
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.SplitMessageCache.copy$default(com.okinc.business.defi.wallet.common.okxconnect.network.rpc.SplitMessageCache, java.lang.String, java.lang.String, int, java.util.List, java.util.Set, long, int, java.lang.Object):com.okinc.business.defi.wallet.common.okxconnect.network.rpc.SplitMessageCache */
    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            SplitMessageCache splitMessageCacheEZpvd = EZpvd(str, str2);
            if (splitMessageCacheEZpvd == null) {
                return;
            }
            EZpvd(SplitMessageCache.copy$default(splitMessageCacheEZpvd, null, null, 0, null, yEJ.OLrzqt(splitMessageCacheEZpvd.getSentPackages(), java.lang.Integer.valueOf(i)), 0L, 47, null));
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.KWHzl, "Error updating sent package: " + e.getMessage());
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            this.AEQbTJ.edit().remove(AEQbTJ(str, str2)).apply();
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.KWHzl, "Error deleting SplitMessageCache: " + e.getMessage());
        }
    }

    public final SplitMessageCache EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            java.lang.String string = this.AEQbTJ.getString(AEQbTJ(str, str2), null);
            if (string == null) {
                return null;
            }
            Json json = this.copydefault;
            json.getSerializersModule();
            return (SplitMessageCache) json.decodeFromString(BuiltinSerializersKt.getNullable(SplitMessageCache.Companion.serializer()), string);
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.KWHzl, "Error getting SplitMessageCache: " + e.getMessage());
            return null;
        }
    }

    public final java.util.List<SplitMessageCache> AEQbTJ() {
        try {
            java.util.Map<java.lang.String, ?> all = this.AEQbTJ.getAll();
            Intrinsics.checkNotNullExpressionValue(all, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<Map.Entry<java.lang.String, ?>> it = all.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Object value = it.next().getValue();
                SplitMessageCache splitMessageCache = null;
                try {
                    java.lang.String str = value instanceof java.lang.String ? (java.lang.String) value : null;
                    if (str != null) {
                        Json json = this.copydefault;
                        json.getSerializersModule();
                        splitMessageCache = (SplitMessageCache) json.decodeFromString(BuiltinSerializersKt.getNullable(SplitMessageCache.Companion.serializer()), str);
                    }
                } catch (java.lang.Exception e) {
                    pUU.copydefault(this.KWHzl, "Error decoding SplitMessageCache: " + e.getMessage());
                }
                if (splitMessageCache != null) {
                    arrayList.add(splitMessageCache);
                }
            }
            return arrayList;
        } catch (java.lang.Exception e2) {
            pUU.copydefault(this.KWHzl, "Error getting all SplitMessageCaches: " + e2.getMessage());
            return yDY.AhwBna();
        }
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            SharedPreferences.Editor editorEdit = this.AEQbTJ.edit();
            java.util.Set<java.lang.String> setKeySet = this.AEQbTJ.getAll().keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : setKeySet) {
                java.lang.String str2 = (java.lang.String) obj;
                Intrinsics.copydefault((java.lang.Object) str2);
                if (C59449zhJ.startsWith$default(str2, str, false, 2, null)) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                editorEdit.remove((java.lang.String) it.next());
            }
            editorEdit.apply();
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.KWHzl, "Error deleting SplitMessageCaches by topic: " + e.getMessage());
        }
    }
}
