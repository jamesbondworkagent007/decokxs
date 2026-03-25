package o;

import com.okinc.business.market.common.marketconfig.domain.EmojiAddressConfig;
import com.okinc.business.market.data.model.EmojiAddressData;
import com.okinc.business.market.features.emoji_address.repo.EmojiAddressRepoImpl$getRemoteEmojiAddressMapping$1;
import com.okinc.business.market.features.emoji_address.repo.EmojiAddressRepoImpl$getRemoteEmojiAddressMapping$result$1;
import com.okinc.core.util.SPUtils;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jRM implements jRO {
    public final InterfaceC27595jyE OLrzqt;

    public jRM(@NotNull InterfaceC27595jyE interfaceC27595jyE) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        this.OLrzqt = interfaceC27595jyE;
    }

    @Override // o.jRO
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super java.util.Map<java.lang.String, java.lang.String>> continuation) {
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> mapCopydefault;
        java.util.Map<java.lang.String, java.lang.String> map;
        if (str.length() == 0) {
            return C56424yEw.KWHzl();
        }
        if (z) {
            return OLrzqt(str, continuation);
        }
        EmojiAddressConfig emojiAddressConfigAEQbTJ = AEQbTJ();
        return (emojiAddressConfigAEQbTJ == null || (mapCopydefault = emojiAddressConfigAEQbTJ.copydefault()) == null || (map = mapCopydefault.get(str)) == null) ? OLrzqt(str, continuation) : map;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.Map<java.lang.String, java.lang.String>> continuation) throws java.lang.Throwable {
        EmojiAddressRepoImpl$getRemoteEmojiAddressMapping$1 emojiAddressRepoImpl$getRemoteEmojiAddressMapping$1;
        jRM jrm;
        EmojiAddressConfig emojiAddressConfigAEQbTJ;
        java.util.Map<java.lang.String, java.lang.String> mapKWHzl;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> mapCopydefault;
        if (continuation instanceof EmojiAddressRepoImpl$getRemoteEmojiAddressMapping$1) {
            emojiAddressRepoImpl$getRemoteEmojiAddressMapping$1 = (EmojiAddressRepoImpl$getRemoteEmojiAddressMapping$1) continuation;
            int i = emojiAddressRepoImpl$getRemoteEmojiAddressMapping$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                emojiAddressRepoImpl$getRemoteEmojiAddressMapping$1.label = i - Integer.MIN_VALUE;
            } else {
                emojiAddressRepoImpl$getRemoteEmojiAddressMapping$1 = new EmojiAddressRepoImpl$getRemoteEmojiAddressMapping$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = emojiAddressRepoImpl$getRemoteEmojiAddressMapping$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = emojiAddressRepoImpl$getRemoteEmojiAddressMapping$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                EmojiAddressRepoImpl$getRemoteEmojiAddressMapping$result$1 emojiAddressRepoImpl$getRemoteEmojiAddressMapping$result$1 = new EmojiAddressRepoImpl$getRemoteEmojiAddressMapping$result$1(this, str, null);
                emojiAddressRepoImpl$getRemoteEmojiAddressMapping$1.L$0 = this;
                emojiAddressRepoImpl$getRemoteEmojiAddressMapping$1.L$1 = str;
                emojiAddressRepoImpl$getRemoteEmojiAddressMapping$1.label = 1;
                objEZpvd = kAB.EZpvd(emojiAddressRepoImpl$getRemoteEmojiAddressMapping$result$1, emojiAddressRepoImpl$getRemoteEmojiAddressMapping$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                jrm = this;
            } catch (java.lang.Exception unused) {
                jrm = this;
                emojiAddressConfigAEQbTJ = jrm.AEQbTJ();
                if (emojiAddressConfigAEQbTJ != null) {
                    mapKWHzl = C56424yEw.KWHzl();
                }
                return mapKWHzl;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) emojiAddressRepoImpl$getRemoteEmojiAddressMapping$1.L$1;
            jrm = (jRM) emojiAddressRepoImpl$getRemoteEmojiAddressMapping$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Exception unused2) {
                emojiAddressConfigAEQbTJ = jrm.AEQbTJ();
                if (emojiAddressConfigAEQbTJ != null || (mapCopydefault = emojiAddressConfigAEQbTJ.copydefault()) == null || (mapKWHzl = mapCopydefault.getOrDefault(str, C56424yEw.KWHzl())) == null) {
                    mapKWHzl = C56424yEw.KWHzl();
                }
                return mapKWHzl;
            }
        }
        java.util.List<EmojiAddressData> list = (java.util.List) ((AbstractC43419rot) objEZpvd).AEQbTJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
        for (EmojiAddressData emojiAddressData : list) {
            java.lang.String strCopydefault = emojiAddressData.copydefault();
            java.lang.String strOLrzqt = emojiAddressData.OLrzqt();
            if (strOLrzqt == null || strOLrzqt.length() == 0) {
                strOLrzqt = "";
            }
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(strCopydefault, strOLrzqt);
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        EmojiAddressConfig emojiAddressConfigAEQbTJ2 = jrm.AEQbTJ();
        if (emojiAddressConfigAEQbTJ2 == null) {
            emojiAddressConfigAEQbTJ2 = new EmojiAddressConfig(null, 1, null);
        }
        java.util.Map mapIsConnected = C56424yEw.isConnected(emojiAddressConfigAEQbTJ2.copydefault());
        mapIsConnected.put(str, linkedHashMap);
        jrm.OLrzqt(new EmojiAddressConfig(mapIsConnected));
        return linkedHashMap;
    }

    public EmojiAddressConfig AEQbTJ() {
        return (EmojiAddressConfig) SPUtils.getObject("dex_market_emoji_address_mapping", EmojiAddressConfig.class, "dex_market");
    }

    public void OLrzqt(@NotNull EmojiAddressConfig emojiAddressConfig) {
        Intrinsics.checkNotNullParameter(emojiAddressConfig, "");
        SPUtils.put("dex_market_emoji_address_mapping", emojiAddressConfig, "dex_market");
    }
}
