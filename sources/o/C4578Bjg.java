package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.retail_kline.FfiConverterOptionalString;
import uniffi.retail_kline.FfiConverterOptionalULong;
import uniffi.retail_kline.FfiConverterString;
import uniffi.retail_kline.FfiConverterTypeBuySellMarkerReq;
import uniffi.retail_kline.FfiConverterTypeCoinNewsReq;
import uniffi.retail_kline.FfiConverterTypeKlineEconEventReq;
import uniffi.retail_kline.FfiConverterTypeMarketCapReq;
import uniffi.retail_kline.FfiConverterTypeMarketEventReq;
import uniffi.retail_kline.FfiConverterTypeMarketEventsWsManagerWrapper;
import uniffi.retail_kline.FfiConverterTypeNewsCarouselReq;
import uniffi.retail_kline.FfiConverterTypeOKRustFutureBuySellMarkerResultWithOKFFIError;
import uniffi.retail_kline.FfiConverterTypeOKRustFutureCoinNewsResultWithOKFFIError;
import uniffi.retail_kline.FfiConverterTypeOKRustFutureKlineEconEventResultWithOKFFIError;
import uniffi.retail_kline.FfiConverterTypeOKRustFutureMarketCapResultWithOKFFIError;
import uniffi.retail_kline.FfiConverterTypeOKRustFutureMarketEventsResultWithOKFFIError;
import uniffi.retail_kline.FfiConverterTypeOKRustFutureNewsCarouselResultWithOKFFIError;
import uniffi.retail_kline.IntegrityCheckingUniffiLib;
import uniffi.retail_kline.UniffiLib;

/* JADX INFO: renamed from: o.Bjg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4578Bjg {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new StateListAnimator());

    /* JADX INFO: renamed from: o.Bjg$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_retail_kline_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_retail_kline_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_retail_kline_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    /* JADX INFO: renamed from: createCoinNewsReqCedefi-n2-KduU, reason: not valid java name */
    public static final C4528Bhk m8357createCoinNewsReqCedefin2KduU(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final C56396yDv c56396yDv, final C56396yDv c56396yDv2, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return (C4528Bhk) FfiConverterTypeCoinNewsReq.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bjt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4578Bjg.createCoinNewsReqCedefi_n2_KduU$lambda$0(str, str2, str3, c56396yDv, c56396yDv2, str4, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue createCoinNewsReqCedefi_n2_KduU$lambda$0(java.lang.String str, java.lang.String str2, java.lang.String str3, C56396yDv c56396yDv, C56396yDv c56396yDv2, java.lang.String str4, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        RustBuffer.ByValue byValueLower2 = ffiConverterString.lower2(str);
        RustBuffer.ByValue byValueLower22 = ffiConverterString.lower2(str2);
        RustBuffer.ByValue byValueLower23 = ffiConverterString.lower2(str3);
        FfiConverterOptionalULong ffiConverterOptionalULong = FfiConverterOptionalULong.INSTANCE;
        return uniffiLib.uniffi_retail_kline_fn_func_create_coin_news_req_cedefi(byValueLower2, byValueLower22, byValueLower23, ffiConverterOptionalULong.lower2(c56396yDv), ffiConverterOptionalULong.lower2(c56396yDv2), ffiConverterString.lower2(str4), uniffiRustCallStatus);
    }

    /* JADX INFO: renamed from: createCoinNewsReqCefi-nUOs2NE, reason: not valid java name */
    public static final C4528Bhk m8358createCoinNewsReqCefinUOs2NE(final C56396yDv c56396yDv, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final java.lang.String str3, final C56396yDv c56396yDv2, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return (C4528Bhk) FfiConverterTypeCoinNewsReq.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4578Bjg.createCoinNewsReqCefi_nUOs2NE$lambda$1(c56396yDv, str, str2, str3, c56396yDv2, str4, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue createCoinNewsReqCefi_nUOs2NE$lambda$1(C56396yDv c56396yDv, java.lang.String str, java.lang.String str2, java.lang.String str3, C56396yDv c56396yDv2, java.lang.String str4, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterOptionalULong ffiConverterOptionalULong = FfiConverterOptionalULong.INSTANCE;
        RustBuffer.ByValue byValueLower2 = ffiConverterOptionalULong.lower2(c56396yDv);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_retail_kline_fn_func_create_coin_news_req_cefi(byValueLower2, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), FfiConverterOptionalString.INSTANCE.lower2(str3), ffiConverterOptionalULong.lower2(c56396yDv2), ffiConverterString.lower2(str4), uniffiRustCallStatus);
    }

    public static final BhB createMarketEventsWsManager() {
        return FfiConverterTypeMarketEventsWsManagerWrapper.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bjo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4578Bjg.createMarketEventsWsManager$lambda$2((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long createMarketEventsWsManager$lambda$2(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_kline_fn_func_create_market_events_ws_manager(uniffiRustCallStatus);
    }

    /* JADX INFO: renamed from: createNewsCarouselReqCedefi-n2-KduU, reason: not valid java name */
    public static final BhO m8359createNewsCarouselReqCedefin2KduU(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final C56396yDv c56396yDv, final C56396yDv c56396yDv2, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return (BhO) FfiConverterTypeNewsCarouselReq.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bjq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4578Bjg.createNewsCarouselReqCedefi_n2_KduU$lambda$3(str, str2, str3, c56396yDv, c56396yDv2, str4, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue createNewsCarouselReqCedefi_n2_KduU$lambda$3(java.lang.String str, java.lang.String str2, java.lang.String str3, C56396yDv c56396yDv, C56396yDv c56396yDv2, java.lang.String str4, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        RustBuffer.ByValue byValueLower2 = ffiConverterString.lower2(str);
        RustBuffer.ByValue byValueLower22 = ffiConverterString.lower2(str2);
        RustBuffer.ByValue byValueLower23 = ffiConverterString.lower2(str3);
        FfiConverterOptionalULong ffiConverterOptionalULong = FfiConverterOptionalULong.INSTANCE;
        return uniffiLib.uniffi_retail_kline_fn_func_create_news_carousel_req_cedefi(byValueLower2, byValueLower22, byValueLower23, ffiConverterOptionalULong.lower2(c56396yDv), ffiConverterOptionalULong.lower2(c56396yDv2), ffiConverterString.lower2(str4), uniffiRustCallStatus);
    }

    /* JADX INFO: renamed from: createNewsCarouselReqCefi-lvvP0OE, reason: not valid java name */
    public static final BhO m8360createNewsCarouselReqCefilvvP0OE(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, final C56396yDv c56396yDv, final C56396yDv c56396yDv2, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return (BhO) FfiConverterTypeNewsCarouselReq.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bjs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4578Bjg.createNewsCarouselReqCefi_lvvP0OE$lambda$4(str, str2, str3, str4, c56396yDv, c56396yDv2, str5, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue createNewsCarouselReqCefi_lvvP0OE$lambda$4(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, C56396yDv c56396yDv, C56396yDv c56396yDv2, java.lang.String str5, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        RustBuffer.ByValue byValueLower2 = ffiConverterString.lower2(str);
        RustBuffer.ByValue byValueLower22 = ffiConverterString.lower2(str2);
        RustBuffer.ByValue byValueLower23 = ffiConverterString.lower2(str3);
        RustBuffer.ByValue byValueLower24 = ffiConverterString.lower2(str4);
        FfiConverterOptionalULong ffiConverterOptionalULong = FfiConverterOptionalULong.INSTANCE;
        return uniffiLib.uniffi_retail_kline_fn_func_create_news_carousel_req_cefi(byValueLower2, byValueLower22, byValueLower23, byValueLower24, ffiConverterOptionalULong.lower2(c56396yDv), ffiConverterOptionalULong.lower2(c56396yDv2), ffiConverterString.lower2(str5), uniffiRustCallStatus);
    }

    public static final BhS getBuySellMarker(@NotNull final C4524Bhg c4524Bhg) {
        Intrinsics.checkNotNullParameter(c4524Bhg, "");
        return FfiConverterTypeOKRustFutureBuySellMarkerResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bjp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4578Bjg.getBuySellMarker$lambda$5(c4524Bhg, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getBuySellMarker$lambda$5(C4524Bhg c4524Bhg, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_kline_fn_func_get_buy_sell_marker(FfiConverterTypeBuySellMarkerReq.INSTANCE.lower2((java.lang.Object) c4524Bhg), uniffiRustCallStatus);
    }

    public static final C4547Bic getCoinNews(@NotNull final C4528Bhk c4528Bhk) {
        Intrinsics.checkNotNullParameter(c4528Bhk, "");
        return FfiConverterTypeOKRustFutureCoinNewsResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bjr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4578Bjg.getCoinNews$lambda$6(c4528Bhk, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getCoinNews$lambda$6(C4528Bhk c4528Bhk, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_kline_fn_func_get_coin_news(FfiConverterTypeCoinNewsReq.INSTANCE.lower2((java.lang.Object) c4528Bhk), uniffiRustCallStatus);
    }

    public static final C4562Bir getEconomicCalendarEvents(@NotNull final C4529Bhl c4529Bhl) {
        Intrinsics.checkNotNullParameter(c4529Bhl, "");
        return FfiConverterTypeOKRustFutureKlineEconEventResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bjm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4578Bjg.getEconomicCalendarEvents$lambda$7(c4529Bhl, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getEconomicCalendarEvents$lambda$7(C4529Bhl c4529Bhl, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_kline_fn_func_get_economic_calendar_events(FfiConverterTypeKlineEconEventReq.INSTANCE.lower2((java.lang.Object) c4529Bhl), uniffiRustCallStatus);
    }

    public static final BiA getMarketCapTrend(@NotNull final C4533Bhp c4533Bhp) {
        Intrinsics.checkNotNullParameter(c4533Bhp, "");
        return FfiConverterTypeOKRustFutureMarketCapResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bjl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4578Bjg.getMarketCapTrend$lambda$8(c4533Bhp, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getMarketCapTrend$lambda$8(C4533Bhp c4533Bhp, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_kline_fn_func_get_market_cap_trend(FfiConverterTypeMarketCapReq.INSTANCE.lower2((java.lang.Object) c4533Bhp), uniffiRustCallStatus);
    }

    public static final BiL getMarketEvents(@NotNull final C4534Bhq c4534Bhq) {
        Intrinsics.checkNotNullParameter(c4534Bhq, "");
        return FfiConverterTypeOKRustFutureMarketEventsResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bjz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4578Bjg.getMarketEvents$lambda$9(c4534Bhq, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getMarketEvents$lambda$9(C4534Bhq c4534Bhq, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_kline_fn_func_get_market_events(FfiConverterTypeMarketEventReq.INSTANCE.lower2((java.lang.Object) c4534Bhq), uniffiRustCallStatus);
    }

    public static final BiZ getNewsCarousel(@NotNull final BhO bhO) {
        Intrinsics.checkNotNullParameter(bhO, "");
        return FfiConverterTypeOKRustFutureNewsCarouselResultWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bjn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4578Bjg.getNewsCarousel$lambda$10(bhO, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getNewsCarousel$lambda$10(BhO bhO, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_retail_kline_fn_func_get_news_carousel(FfiConverterTypeNewsCarouselReq.INSTANCE.lower2((java.lang.Object) bhO), uniffiRustCallStatus);
    }
}
