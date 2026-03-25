package uniffi.retail_kline;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C4578Bjg;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_retail_kline_uniffi_contract_version();

    public final native short uniffi_retail_kline_checksum_func_create_coin_news_req_cedefi();

    public final native short uniffi_retail_kline_checksum_func_create_coin_news_req_cefi();

    public final native short uniffi_retail_kline_checksum_func_create_market_events_ws_manager();

    public final native short uniffi_retail_kline_checksum_func_create_news_carousel_req_cedefi();

    public final native short uniffi_retail_kline_checksum_func_create_news_carousel_req_cefi();

    public final native short uniffi_retail_kline_checksum_func_get_buy_sell_marker();

    public final native short uniffi_retail_kline_checksum_func_get_coin_news();

    public final native short uniffi_retail_kline_checksum_func_get_economic_calendar_events();

    public final native short uniffi_retail_kline_checksum_func_get_market_cap_trend();

    public final native short uniffi_retail_kline_checksum_func_get_market_events();

    public final native short uniffi_retail_kline_checksum_func_get_news_carousel();

    public final native short uniffi_retail_kline_checksum_method_marketeventspushlistener_on_event_push();

    public final native short uniffi_retail_kline_checksum_method_marketeventswsmanagerwrapper_is_subscribed();

    public final native short uniffi_retail_kline_checksum_method_marketeventswsmanagerwrapper_subscribe();

    public final native short uniffi_retail_kline_checksum_method_marketeventswsmanagerwrapper_unsubscribe();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturebuysellmarkerresultwithokffierror_cancel();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturebuysellmarkerresultwithokffierror_get_error();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturebuysellmarkerresultwithokffierror_get_result_status();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturebuysellmarkerresultwithokffierror_get_success_result();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturebuysellmarkerresultwithokffierror_is_finished();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturebuysellmarkerresultwithokffierror_start_with_callback();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturecoinnewsresultwithokffierror_cancel();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturecoinnewsresultwithokffierror_get_error();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturecoinnewsresultwithokffierror_get_result_status();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturecoinnewsresultwithokffierror_get_success_result();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturecoinnewsresultwithokffierror_is_finished();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturecoinnewsresultwithokffierror_start_with_callback();

    public final native short uniffi_retail_kline_checksum_method_okrustfutureklineeconeventresultwithokffierror_cancel();

    public final native short uniffi_retail_kline_checksum_method_okrustfutureklineeconeventresultwithokffierror_get_error();

    public final native short uniffi_retail_kline_checksum_method_okrustfutureklineeconeventresultwithokffierror_get_result_status();

    public final native short uniffi_retail_kline_checksum_method_okrustfutureklineeconeventresultwithokffierror_get_success_result();

    public final native short uniffi_retail_kline_checksum_method_okrustfutureklineeconeventresultwithokffierror_is_finished();

    public final native short uniffi_retail_kline_checksum_method_okrustfutureklineeconeventresultwithokffierror_start_with_callback();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturemarketcapresultwithokffierror_cancel();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturemarketcapresultwithokffierror_get_error();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturemarketcapresultwithokffierror_get_result_status();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturemarketcapresultwithokffierror_get_success_result();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturemarketcapresultwithokffierror_is_finished();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturemarketcapresultwithokffierror_start_with_callback();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturemarketeventsresultwithokffierror_cancel();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturemarketeventsresultwithokffierror_get_error();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturemarketeventsresultwithokffierror_get_result_status();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturemarketeventsresultwithokffierror_get_success_result();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturemarketeventsresultwithokffierror_is_finished();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturemarketeventsresultwithokffierror_start_with_callback();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturenewscarouselresultwithokffierror_cancel();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturenewscarouselresultwithokffierror_get_error();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturenewscarouselresultwithokffierror_get_result_status();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturenewscarouselresultwithokffierror_get_success_result();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturenewscarouselresultwithokffierror_is_finished();

    public final native short uniffi_retail_kline_checksum_method_okrustfuturenewscarouselresultwithokffierror_start_with_callback();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("retail_kline");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("retail_kline"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        C4578Bjg.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
