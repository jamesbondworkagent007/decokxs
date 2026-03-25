package com.okinc.business.market.data.model.watchlist;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class FavoriteAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FavoriteAction[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName("1")
    public static final FavoriteAction AddToWatchList = new FavoriteAction("AddToWatchList", 0, 1);

    @SerialName("0")
    public static final FavoriteAction RemoveFromWatchList = new FavoriteAction("RemoveFromWatchList", 1, 0);

    @SerialName(MultiTransferSignData.DEFAULT_INTERVAL)
    public static final FavoriteAction UpdateWatchList = new FavoriteAction("UpdateWatchList", 2, -1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FavoriteAction[] $values() {
        return new FavoriteAction[]{AddToWatchList, RemoveFromWatchList, UpdateWatchList};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FavoriteAction> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.watchlist.FavoriteAction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) FavoriteAction.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<FavoriteAction> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.data.model.watchlist.FavoriteAction", values(), new String[]{"1", "0", MultiTransferSignData.DEFAULT_INTERVAL}, new Annotation[][]{null, null, null}, null);
    }

    private FavoriteAction(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        FavoriteAction[] favoriteActionArr$values = $values();
        $VALUES = favoriteActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(favoriteActionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.jyY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FavoriteAction._init_$_anonymous_();
            }
        });
    }

    public static FavoriteAction valueOf(String str) {
        return (FavoriteAction) Enum.valueOf(FavoriteAction.class, str);
    }

    public static FavoriteAction[] values() {
        return (FavoriteAction[]) $VALUES.clone();
    }
}
