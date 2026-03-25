package com.reown.android.internal.common.di;

import com.huawei.hms.framework.common.ContainerUtils;
import com.reown.android.di.AndroidBuildVariantDITags;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.model.TelemetryEnabled;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.Validation;
import com.reown.android.internal.common.storage.events.EventsRepository;
import com.reown.android.internal.common.storage.identity.IdentitiesStorageRepository;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepository;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.common.storage.pairing.PairingStorageRepository;
import com.reown.android.internal.common.storage.pairing.PairingStorageRepositoryInterface;
import com.reown.android.internal.common.storage.push_messages.PushMessagesRepository;
import com.reown.android.internal.common.storage.rpc.JsonRpcHistory;
import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import com.reown.android.sdk.core.AndroidCoreDatabase;
import com.reown.android.sdk.storage.data.dao.EventDao;
import com.reown.android.sdk.storage.data.dao.EventQueries;
import com.reown.android.sdk.storage.data.dao.IdentitiesQueries;
import com.reown.android.sdk.storage.data.dao.JsonRpcHistoryDao;
import com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries;
import com.reown.android.sdk.storage.data.dao.MetaData;
import com.reown.android.sdk.storage.data.dao.MetaDataQueries;
import com.reown.android.sdk.storage.data.dao.PairingQueries;
import com.reown.android.sdk.storage.data.dao.PushMessageQueries;
import com.reown.android.sdk.storage.data.dao.VerifyContext;
import com.reown.android.sdk.storage.data.dao.VerifyContextQueries;
import com.reown.android.sdk.storage.data.dao.VerifyPublicKeyQueries;
import com.reown.foundation.util.Logger;
import com.reown.utils.UtilFunctionsKt;
import com.squareup.moshi.Moshi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC59982ztK;
import o.C56390yDp;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56524yIo;
import o.C56529yIt;
import o.C56548yJl;
import o.C59976ztE;
import o.C59978ztG;
import o.C59990ztS;
import o.C59991ztT;
import o.C60053zuc;
import o.C60055zue;
import o.C60058zuh;
import o.C60059zui;
import o.C60060zuj;
import o.C60064zun;
import o.InterfaceC59997ztZ;
import o.LoaderManager;
import o.PackageManager;
import o.SharedElementCallback;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes12.dex */
public final class BaseStorageModuleKt {

    /* JADX INFO: renamed from: com.reown.android.internal.common.di.BaseStorageModuleKt$baseStorageModule$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Lambda implements Function1<C59991ztT, Unit> {
        public final /* synthetic */ String $packageName;
        public final /* synthetic */ String $storagePrefix;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2) {
            super(1);
            this.$packageName = str;
            this.$storagePrefix = str2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
            invoke2(c59991ztT);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull C59991ztT c59991ztT) {
            Intrinsics.checkNotNullParameter(c59991ztT, "");
            InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(AndroidCommonDITags.COLUMN_ADAPTER_LIST);
            C06891 c06891 = new Function2<C60060zuj, C60053zuc, LoaderManager<List<? extends String>, String>>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: o.LoaderManager<java.util.List<? extends java.lang.String>, java.lang.String>, o.LoaderManager<java.util.List<java.lang.String>, java.lang.String> */
                @Override // kotlin.jvm.functions.Function2
                public final LoaderManager<List<String>, String> invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new LoaderManager<List<? extends String>, String>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.1.1
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // o.LoaderManager
                        public /* bridge */ /* synthetic */ String encode(List<? extends String> list) {
                            return encode2((List<String>) list);
                        }

                        /* JADX DEBUG: Method merged with bridge method: decode(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // o.LoaderManager
                        public List<String> decode(@NotNull String str) {
                            Intrinsics.checkNotNullParameter(str, "");
                            if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                                return yDY.AhwBna();
                            }
                            return StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
                        }

                        /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
                        public String encode2(@NotNull List<String> list) {
                            Intrinsics.checkNotNullParameter(list, "");
                            return CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
                        }
                    };
                }
            };
            C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
            C60055zue c60055zueKWHzl = taskDescription.KWHzl();
            Kind kind = Kind.Singleton;
            C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(LoaderManager.class), interfaceC59997ztZOLrzqt, c06891, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS);
            }
            new C59976ztE(c59991ztT, c59990ztS);
            InterfaceC59997ztZ interfaceC59997ztZOLrzqt2 = C60058zuh.OLrzqt(AndroidCommonDITags.COLUMN_ADAPTER_MAP);
            AnonymousClass2 anonymousClass2 = new Function2<C60060zuj, C60053zuc, LoaderManager<Map<String, ? extends String>, String>>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.2
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: o.LoaderManager<java.util.Map<java.lang.String, ? extends java.lang.String>, java.lang.String>, o.LoaderManager<java.util.Map<java.lang.String, java.lang.String>, java.lang.String> */
                @Override // kotlin.jvm.functions.Function2
                public final LoaderManager<Map<String, String>, String> invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new LoaderManager<Map<String, ? extends String>, String>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.2.1
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // o.LoaderManager
                        public /* bridge */ /* synthetic */ String encode(Map<String, ? extends String> map) {
                            return encode2((Map<String, String>) map);
                        }

                        /* JADX DEBUG: Method merged with bridge method: decode(Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // o.LoaderManager
                        public Map<String, String> decode(@NotNull String str) {
                            Intrinsics.checkNotNullParameter(str, "");
                            if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                                return C56424yEw.KWHzl();
                            }
                            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
                            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listSplit$default, 10)), 16));
                            Iterator it = listSplit$default.iterator();
                            while (it.hasNext()) {
                                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 0, 6, (Object) null);
                                Pair pairOLrzqt = C56390yDp.OLrzqt(StringsKt__StringsKt.hDKMBd((CharSequence) CollectionsKt___CollectionsKt.AuCTelauCTel(listSplit$default2)).toString(), StringsKt__StringsKt.hDKMBd((CharSequence) CollectionsKt___CollectionsKt.AubY(listSplit$default2)).toString());
                                linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                            }
                            return linkedHashMap;
                        }

                        /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
                        public String encode2(@NotNull Map<String, String> map) {
                            Intrinsics.checkNotNullParameter(map, "");
                            return CollectionsKt___CollectionsKt.joinToString$default(map.entrySet(), null, null, null, 0, null, null, 63, null);
                        }
                    };
                }
            };
            C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(LoaderManager.class), interfaceC59997ztZOLrzqt2, anonymousClass2, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS2);
            }
            new C59976ztE(c59991ztT, c59990ztS2);
            InterfaceC59997ztZ interfaceC59997ztZOLrzqt3 = C60058zuh.OLrzqt(AndroidCommonDITags.COLUMN_ADAPTER_APPMETADATATYPE);
            AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, LoaderManager<AppMetaDataType, String>>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.3
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final LoaderManager<AppMetaDataType, String> invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new SharedElementCallback(AppMetaDataType.values());
                }
            };
            C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(LoaderManager.class), interfaceC59997ztZOLrzqt3, anonymousClass3, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS3);
            }
            new C59976ztE(c59991ztT, c59990ztS3);
            InterfaceC59997ztZ interfaceC59997ztZOLrzqt4 = C60058zuh.OLrzqt(AndroidCommonDITags.COLUMN_ADAPTER_TRANSPORT_TYPE);
            AnonymousClass4 anonymousClass4 = new Function2<C60060zuj, C60053zuc, LoaderManager<TransportType, String>>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.4
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final LoaderManager<TransportType, String> invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new SharedElementCallback(TransportType.values());
                }
            };
            C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(LoaderManager.class), interfaceC59997ztZOLrzqt4, anonymousClass4, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS4);
            }
            new C59976ztE(c59991ztT, c59990ztS4);
            InterfaceC59997ztZ interfaceC59997ztZOLrzqt5 = C60058zuh.OLrzqt(AndroidCommonDITags.COLUMN_ADAPTER_VALIDATION);
            AnonymousClass5 anonymousClass5 = new Function2<C60060zuj, C60053zuc, LoaderManager<Validation, String>>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.5
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final LoaderManager<Validation, String> invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new SharedElementCallback(Validation.values());
                }
            };
            C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(LoaderManager.class), interfaceC59997ztZOLrzqt5, anonymousClass5, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS5);
            }
            new C59976ztE(c59991ztT, c59990ztS5);
            InterfaceC59997ztZ interfaceC59997ztZOLrzqt6 = C60058zuh.OLrzqt(AndroidBuildVariantDITags.ANDROID_CORE_DATABASE);
            AnonymousClass6 anonymousClass6 = new Function2<C60060zuj, C60053zuc, AndroidCoreDatabase>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.6
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final AndroidCoreDatabase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    try {
                        AndroidCoreDatabase androidCoreDatabaseInvoke$createCoreDB = AnonymousClass1.invoke$createCoreDB(c60060zuj);
                        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new BaseStorageModuleKt$baseStorageModule$1$6$1$1(androidCoreDatabaseInvoke$createCoreDB, c60060zuj, null), 3, null);
                        return androidCoreDatabaseInvoke$createCoreDB;
                    } catch (Exception unused) {
                        DatabaseConfigKt.deleteDatabase(c60060zuj, ((DatabaseConfig) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(DatabaseConfig.class), null, null)).getANDROID_CORE_DB_NAME());
                        return AnonymousClass1.invoke$createCoreDB(c60060zuj);
                    }
                }
            };
            C59990ztS<?> c59990ztS6 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(AndroidCoreDatabase.class), interfaceC59997ztZOLrzqt6, anonymousClass6, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS6);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS6);
            }
            new C59976ztE(c59991ztT, c59990ztS6);
            AnonymousClass7 anonymousClass7 = new Function2<C60060zuj, C60053zuc, JsonRpcHistoryQueries>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.7
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final JsonRpcHistoryQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((AndroidCoreDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AndroidCoreDatabase.class), C60058zuh.OLrzqt(AndroidBuildVariantDITags.ANDROID_CORE_DATABASE), null)).getJsonRpcHistoryQueries();
                }
            };
            C59990ztS<?> c59990ztS7 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(JsonRpcHistoryQueries.class), null, anonymousClass7, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS7);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS7);
            }
            new C59976ztE(c59991ztT, c59990ztS7);
            AnonymousClass8 anonymousClass8 = new Function2<C60060zuj, C60053zuc, PairingQueries>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.8
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final PairingQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((AndroidCoreDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AndroidCoreDatabase.class), C60058zuh.OLrzqt(AndroidBuildVariantDITags.ANDROID_CORE_DATABASE), null)).getPairingQueries();
                }
            };
            C59990ztS<?> c59990ztS8 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(PairingQueries.class), null, anonymousClass8, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS8);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS8);
            }
            new C59976ztE(c59991ztT, c59990ztS8);
            AnonymousClass9 anonymousClass9 = new Function2<C60060zuj, C60053zuc, MetaDataQueries>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.9
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final MetaDataQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((AndroidCoreDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AndroidCoreDatabase.class), C60058zuh.OLrzqt(AndroidBuildVariantDITags.ANDROID_CORE_DATABASE), null)).getMetaDataQueries();
                }
            };
            C59990ztS<?> c59990ztS9 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(MetaDataQueries.class), null, anonymousClass9, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS9);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS9);
            }
            new C59976ztE(c59991ztT, c59990ztS9);
            AnonymousClass10 anonymousClass10 = new Function2<C60060zuj, C60053zuc, IdentitiesQueries>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.10
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final IdentitiesQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((AndroidCoreDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AndroidCoreDatabase.class), C60058zuh.OLrzqt(AndroidBuildVariantDITags.ANDROID_CORE_DATABASE), null)).getIdentitiesQueries();
                }
            };
            C59990ztS<?> c59990ztS10 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(IdentitiesQueries.class), null, anonymousClass10, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS10);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS10);
            }
            new C59976ztE(c59991ztT, c59990ztS10);
            AnonymousClass11 anonymousClass11 = new Function2<C60060zuj, C60053zuc, VerifyContextQueries>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.11
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final VerifyContextQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((AndroidCoreDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AndroidCoreDatabase.class), C60058zuh.OLrzqt(AndroidBuildVariantDITags.ANDROID_CORE_DATABASE), null)).getVerifyContextQueries();
                }
            };
            C59990ztS<?> c59990ztS11 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(VerifyContextQueries.class), null, anonymousClass11, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS11);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS11);
            }
            new C59976ztE(c59991ztT, c59990ztS11);
            AnonymousClass12 anonymousClass12 = new Function2<C60060zuj, C60053zuc, PushMessageQueries>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.12
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final PushMessageQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((AndroidCoreDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AndroidCoreDatabase.class), C60058zuh.OLrzqt(AndroidBuildVariantDITags.ANDROID_CORE_DATABASE), null)).getPushMessageQueries();
                }
            };
            C59990ztS<?> c59990ztS12 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(PushMessageQueries.class), null, anonymousClass12, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS12);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS12);
            }
            new C59976ztE(c59991ztT, c59990ztS12);
            AnonymousClass13 anonymousClass13 = new Function2<C60060zuj, C60053zuc, EventQueries>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.13
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final EventQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((AndroidCoreDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AndroidCoreDatabase.class), C60058zuh.OLrzqt(AndroidBuildVariantDITags.ANDROID_CORE_DATABASE), null)).getEventQueries();
                }
            };
            C59990ztS<?> c59990ztS13 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(EventQueries.class), null, anonymousClass13, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS13);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS13);
            }
            new C59976ztE(c59991ztT, c59990ztS13);
            AnonymousClass14 anonymousClass14 = new Function2<C60060zuj, C60053zuc, VerifyPublicKeyQueries>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.14
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final VerifyPublicKeyQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((AndroidCoreDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AndroidCoreDatabase.class), C60058zuh.OLrzqt(AndroidBuildVariantDITags.ANDROID_CORE_DATABASE), null)).getVerifyPublicKeyQueries();
                }
            };
            C59990ztS<?> c59990ztS14 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(VerifyPublicKeyQueries.class), null, anonymousClass14, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS14);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS14);
            }
            new C59976ztE(c59991ztT, c59990ztS14);
            AnonymousClass15 anonymousClass15 = new Function2<C60060zuj, C60053zuc, MetadataStorageRepositoryInterface>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.15
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final MetadataStorageRepositoryInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new MetadataStorageRepository((MetaDataQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(MetaDataQueries.class), null, null));
                }
            };
            C59990ztS<?> c59990ztS15 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(MetadataStorageRepositoryInterface.class), null, anonymousClass15, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS15);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS15);
            }
            new C59976ztE(c59991ztT, c59990ztS15);
            AnonymousClass16 anonymousClass16 = new Function2<C60060zuj, C60053zuc, PairingStorageRepositoryInterface>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.16
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final PairingStorageRepositoryInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new PairingStorageRepository((PairingQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PairingQueries.class), null, null));
                }
            };
            C59990ztS<?> c59990ztS16 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(PairingStorageRepositoryInterface.class), null, anonymousClass16, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS16);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS16);
            }
            new C59976ztE(c59991ztT, c59990ztS16);
            AnonymousClass17 anonymousClass17 = new Function2<C60060zuj, C60053zuc, JsonRpcHistory>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.17
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final JsonRpcHistory invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new JsonRpcHistory((JsonRpcHistoryQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcHistoryQueries.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), null, null));
                }
            };
            C59990ztS<?> c59990ztS17 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(JsonRpcHistory.class), null, anonymousClass17, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS17);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS17);
            }
            new C59976ztE(c59991ztT, c59990ztS17);
            AnonymousClass18 anonymousClass18 = new Function2<C60060zuj, C60053zuc, IdentitiesStorageRepository>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.18
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final IdentitiesStorageRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new IdentitiesStorageRepository((IdentitiesQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(IdentitiesQueries.class), null, null), (Moshi.Builder) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Moshi.Builder.class), C60058zuh.OLrzqt(AndroidCommonDITags.MOSHI), null));
                }
            };
            C59990ztS<?> c59990ztS18 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(IdentitiesStorageRepository.class), null, anonymousClass18, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS18);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS18);
            }
            new C59976ztE(c59991ztT, c59990ztS18);
            AnonymousClass19 anonymousClass19 = new Function2<C60060zuj, C60053zuc, VerifyContextStorageRepository>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.19
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final VerifyContextStorageRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new VerifyContextStorageRepository((VerifyContextQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyContextQueries.class), null, null));
                }
            };
            C59990ztS<?> c59990ztS19 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(VerifyContextStorageRepository.class), null, anonymousClass19, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS19);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS19);
            }
            new C59976ztE(c59991ztT, c59990ztS19);
            AnonymousClass20 anonymousClass20 = new Function2<C60060zuj, C60053zuc, PushMessagesRepository>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.20
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final PushMessagesRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new PushMessagesRepository((PushMessageQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PushMessageQueries.class), null, null));
                }
            };
            C59990ztS<?> c59990ztS20 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(PushMessagesRepository.class), null, anonymousClass20, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS20);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS20);
            }
            new C59976ztE(c59991ztT, c59990ztS20);
            final String str = this.$packageName;
            Function2<C60060zuj, C60053zuc, EventsRepository> function2 = new Function2<C60060zuj, C60053zuc, EventsRepository>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.21
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final EventsRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new EventsRepository((EventQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(EventQueries.class), null, null), str, ((TelemetryEnabled) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(TelemetryEnabled.class), C60058zuh.OLrzqt(AndroidCommonDITags.TELEMETRY_ENABLED), null)).m7252unboximpl(), null, 8, null);
                }
            };
            C59990ztS<?> c59990ztS21 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(EventsRepository.class), null, function2, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS21);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS21);
            }
            new C59976ztE(c59991ztT, c59990ztS21);
            final String str2 = this.$storagePrefix;
            Function2<C60060zuj, C60053zuc, DatabaseConfig> function22 = new Function2<C60060zuj, C60053zuc, DatabaseConfig>() { // from class: com.reown.android.internal.common.di.BaseStorageModuleKt.baseStorageModule.1.22
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final DatabaseConfig invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new DatabaseConfig(str2);
                }
            };
            C59990ztS<?> c59990ztS22 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(DatabaseConfig.class), null, function22, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS22);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS22);
            }
            new C59976ztE(c59991ztT, c59990ztS22);
        }

        public static final AndroidCoreDatabase invoke$createCoreDB(C60060zuj c60060zuj) {
            AndroidCoreDatabase.Companion companion = AndroidCoreDatabase.Companion;
            PackageManager packageManager = (PackageManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PackageManager.class), C60058zuh.OLrzqt(AndroidBuildVariantDITags.ANDROID_CORE_DATABASE_DRIVER), null);
            AndroidCommonDITags androidCommonDITags = AndroidCommonDITags.COLUMN_ADAPTER_LIST;
            MetaData.Adapter adapter = new MetaData.Adapter((LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null), (LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(AndroidCommonDITags.COLUMN_ADAPTER_APPMETADATATYPE), null));
            VerifyContext.Adapter adapter2 = new VerifyContext.Adapter((LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(AndroidCommonDITags.COLUMN_ADAPTER_VALIDATION), null));
            return companion.invoke(packageManager, new EventDao.Adapter((LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null)), new JsonRpcHistoryDao.Adapter((LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(AndroidCommonDITags.COLUMN_ADAPTER_TRANSPORT_TYPE), null)), adapter, adapter2);
        }
    }

    public static final C59991ztT baseStorageModule(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C60064zun.module$default(false, new AnonymousClass1(str2, str), 1, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.reown.utils.UtilFunctionsKt.getEmpty(o.yIt):java.lang.String */
    public static /* synthetic */ C59991ztT baseStorageModule$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
        return baseStorageModule(str, str2);
    }
}
