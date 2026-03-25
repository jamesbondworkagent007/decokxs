package com.okinc.preference.data.model;

import com.okinc.preference.data.model.FuturesSettings;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;
import o.C56392yDr;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class FuturesSettings {
    public static final int $stable = 0;
    public static final String PREFS_FILENAME = "FuturesSettings";
    public static final int PRICES_USD = 0;
    public static final String SETTING_CURRENCIES = "setting_currencies";
    public static final int UNKOWN = -1;
    public static final FuturesSettings INSTANCE = new FuturesSettings();
    private static final /* synthetic */ InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tXx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return FuturesSettings._init_$_anonymous_();
        }
    });

    private FuturesSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new ObjectSerializer("com.okinc.preference.data.model.FuturesSettings", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ KSerializer get$cachedSerializer() {
        return $cachedSerializer$delegate.getValue();
    }

    public final KSerializer<FuturesSettings> serializer() {
        return get$cachedSerializer();
    }
}
