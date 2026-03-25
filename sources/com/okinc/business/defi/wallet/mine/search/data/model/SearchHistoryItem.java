package com.okinc.business.defi.wallet.mine.search.data.model;

import com.google.errorprone.annotations.Keep;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Serializable
public abstract class SearchHistoryItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.frv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SearchHistoryItem.isConnected();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SearchHistoryItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void copydefault(SearchHistoryItem searchHistoryItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public abstract String AYXKKw();

    public abstract long AhwBna();

    public abstract String EZpvd();

    public abstract String KWHzl();

    public abstract SearchType gEmmrt();

    public abstract String valueOf();

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) SearchHistoryItem.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SearchHistoryItem> serializer() {
            return OLrzqt();
        }
    }

    private SearchHistoryItem() {
    }

    public /* synthetic */ SearchHistoryItem(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    public static final /* synthetic */ KSerializer isConnected() {
        return new SealedClassSerializer("com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem", C56524yIo.AEQbTJ(SearchHistoryItem.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(AddressSearchHistory.class), C56524yIo.AEQbTJ(DAppSearchHistory.class), C56524yIo.AEQbTJ(DeFiAssetHistory.class), C56524yIo.AEQbTJ(NFTAssetHistory.class), C56524yIo.AEQbTJ(TokenAssetHistory.class), C56524yIo.AEQbTJ(TokenSearchHistory.class), C56524yIo.AEQbTJ(WebsiteSearchHistory.class)}, new KSerializer[]{AddressSearchHistory$$serializer.INSTANCE, DAppSearchHistory$$serializer.INSTANCE, DeFiAssetHistory$$serializer.INSTANCE, NFTAssetHistory$$serializer.INSTANCE, TokenAssetHistory$$serializer.INSTANCE, TokenSearchHistory$$serializer.INSTANCE, WebsiteSearchHistory$$serializer.INSTANCE}, new Annotation[0]);
    }
}
