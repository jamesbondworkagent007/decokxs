package com.reown.sign.di;

import com.reown.android.di.CoreStorageModuleKt;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.di.AndroidCommonDITags;
import com.reown.android.internal.common.di.DatabaseConfigKt;
import com.reown.sign.SignDatabase;
import com.reown.sign.storage.authenticate.AuthenticateResponseTopicRepository;
import com.reown.sign.storage.data.dao.authenticatereponse.AuthenticateResponseTopicDaoQueries;
import com.reown.sign.storage.data.dao.linkmode.LinkModeDaoQueries;
import com.reown.sign.storage.data.dao.namespace.NamespaceDao;
import com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries;
import com.reown.sign.storage.data.dao.optionalnamespaces.OptionalNamespaceDao;
import com.reown.sign.storage.data.dao.optionalnamespaces.OptionalNamespaceDaoQueries;
import com.reown.sign.storage.data.dao.proposal.ProposalDao;
import com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries;
import com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDao;
import com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries;
import com.reown.sign.storage.data.dao.session.SessionDao;
import com.reown.sign.storage.data.dao.session.SessionDaoQueries;
import com.reown.sign.storage.data.dao.temp.TempNamespaceDao;
import com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries;
import com.reown.sign.storage.link_mode.LinkModeStorageRepository;
import com.reown.sign.storage.proposal.ProposalStorageRepository;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC59982ztK;
import o.C56524yIo;
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
import o.LoaderManager;
import o.PackageManager;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class StorageModuleKt {

    /* JADX INFO: renamed from: com.reown.sign.di.StorageModuleKt$storageModule$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Lambda implements Function1<C59991ztT, Unit> {
        public final /* synthetic */ String $dbName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$dbName = str;
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
            c59991ztT.OLrzqt(CoreStorageModuleKt.sdkBaseStorageModule(SignDatabase.Companion.getSchema(), this.$dbName));
            final String str = this.$dbName;
            Function2<C60060zuj, C60053zuc, SignDatabase> function2 = new Function2<C60060zuj, C60053zuc, SignDatabase>() { // from class: com.reown.sign.di.StorageModuleKt.storageModule.1.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final SignDatabase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    try {
                        SignDatabase signDatabaseInvoke$createSignDB = AnonymousClass1.invoke$createSignDB(c60060zuj, str);
                        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new StorageModuleKt$storageModule$1$1$1$1(signDatabaseInvoke$createSignDB, c60060zuj, str, null), 3, null);
                        return signDatabaseInvoke$createSignDB;
                    } catch (Exception unused) {
                        DatabaseConfigKt.deleteDatabase(c60060zuj, str);
                        return AnonymousClass1.invoke$createSignDB(c60060zuj, str);
                    }
                }
            };
            C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
            C60055zue c60055zueKWHzl = taskDescription.KWHzl();
            Kind kind = Kind.Singleton;
            C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(SignDatabase.class), null, function2, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS);
            }
            new C59976ztE(c59991ztT, c59990ztS);
            C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(SessionDaoQueries.class), null, new Function2<C60060zuj, C60053zuc, SessionDaoQueries>() { // from class: com.reown.sign.di.StorageModuleKt.storageModule.1.2
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final SessionDaoQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((SignDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SignDatabase.class), null, null)).getSessionDaoQueries();
                }
            }, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS2);
            }
            new C59976ztE(c59991ztT, c59990ztS2);
            C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(NamespaceDaoQueries.class), null, new Function2<C60060zuj, C60053zuc, NamespaceDaoQueries>() { // from class: com.reown.sign.di.StorageModuleKt.storageModule.1.3
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final NamespaceDaoQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((SignDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SignDatabase.class), null, null)).getNamespaceDaoQueries();
                }
            }, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS3);
            }
            new C59976ztE(c59991ztT, c59990ztS3);
            C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(TempNamespaceDaoQueries.class), null, new Function2<C60060zuj, C60053zuc, TempNamespaceDaoQueries>() { // from class: com.reown.sign.di.StorageModuleKt.storageModule.1.4
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final TempNamespaceDaoQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((SignDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SignDatabase.class), null, null)).getTempNamespaceDaoQueries();
                }
            }, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS4);
            }
            new C59976ztE(c59991ztT, c59990ztS4);
            C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ProposalNamespaceDaoQueries.class), null, new Function2<C60060zuj, C60053zuc, ProposalNamespaceDaoQueries>() { // from class: com.reown.sign.di.StorageModuleKt.storageModule.1.5
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final ProposalNamespaceDaoQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((SignDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SignDatabase.class), null, null)).getProposalNamespaceDaoQueries();
                }
            }, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS5);
            }
            new C59976ztE(c59991ztT, c59990ztS5);
            C59990ztS<?> c59990ztS6 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OptionalNamespaceDaoQueries.class), null, new Function2<C60060zuj, C60053zuc, OptionalNamespaceDaoQueries>() { // from class: com.reown.sign.di.StorageModuleKt.storageModule.1.6
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final OptionalNamespaceDaoQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((SignDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SignDatabase.class), null, null)).getOptionalNamespaceDaoQueries();
                }
            }, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS6);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS6);
            }
            new C59976ztE(c59991ztT, c59990ztS6);
            C59990ztS<?> c59990ztS7 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ProposalDaoQueries.class), null, new Function2<C60060zuj, C60053zuc, ProposalDaoQueries>() { // from class: com.reown.sign.di.StorageModuleKt.storageModule.1.7
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final ProposalDaoQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((SignDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SignDatabase.class), null, null)).getProposalDaoQueries();
                }
            }, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS7);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS7);
            }
            new C59976ztE(c59991ztT, c59990ztS7);
            C59990ztS<?> c59990ztS8 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(AuthenticateResponseTopicDaoQueries.class), null, new Function2<C60060zuj, C60053zuc, AuthenticateResponseTopicDaoQueries>() { // from class: com.reown.sign.di.StorageModuleKt.storageModule.1.8
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final AuthenticateResponseTopicDaoQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((SignDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SignDatabase.class), null, null)).getAuthenticateResponseTopicDaoQueries();
                }
            }, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS8);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS8);
            }
            new C59976ztE(c59991ztT, c59990ztS8);
            C59990ztS<?> c59990ztS9 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(LinkModeDaoQueries.class), null, new Function2<C60060zuj, C60053zuc, LinkModeDaoQueries>() { // from class: com.reown.sign.di.StorageModuleKt.storageModule.1.9
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final LinkModeDaoQueries invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return ((SignDatabase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SignDatabase.class), null, null)).getLinkModeDaoQueries();
                }
            }, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS9);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS9);
            }
            new C59976ztE(c59991ztT, c59990ztS9);
            C59990ztS<?> c59990ztS10 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(SessionStorageRepository.class), null, new Function2<C60060zuj, C60053zuc, SessionStorageRepository>() { // from class: com.reown.sign.di.StorageModuleKt.storageModule.1.10
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final SessionStorageRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new SessionStorageRepository((SessionDaoQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SessionDaoQueries.class), null, null), (NamespaceDaoQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(NamespaceDaoQueries.class), null, null), (ProposalNamespaceDaoQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProposalNamespaceDaoQueries.class), null, null), (OptionalNamespaceDaoQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OptionalNamespaceDaoQueries.class), null, null), (TempNamespaceDaoQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(TempNamespaceDaoQueries.class), null, null));
                }
            }, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS10);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS10);
            }
            new C59976ztE(c59991ztT, c59990ztS10);
            C59990ztS<?> c59990ztS11 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ProposalStorageRepository.class), null, new Function2<C60060zuj, C60053zuc, ProposalStorageRepository>() { // from class: com.reown.sign.di.StorageModuleKt.storageModule.1.11
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final ProposalStorageRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new ProposalStorageRepository((ProposalDaoQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProposalDaoQueries.class), null, null), (ProposalNamespaceDaoQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProposalNamespaceDaoQueries.class), null, null), (OptionalNamespaceDaoQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OptionalNamespaceDaoQueries.class), null, null));
                }
            }, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS11);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS11);
            }
            new C59976ztE(c59991ztT, c59990ztS11);
            C59990ztS<?> c59990ztS12 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(AuthenticateResponseTopicRepository.class), null, new Function2<C60060zuj, C60053zuc, AuthenticateResponseTopicRepository>() { // from class: com.reown.sign.di.StorageModuleKt.storageModule.1.12
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final AuthenticateResponseTopicRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new AuthenticateResponseTopicRepository((AuthenticateResponseTopicDaoQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AuthenticateResponseTopicDaoQueries.class), null, null));
                }
            }, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS12);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS12);
            }
            new C59976ztE(c59991ztT, c59990ztS12);
            C59990ztS<?> c59990ztS13 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(LinkModeStorageRepository.class), null, new Function2<C60060zuj, C60053zuc, LinkModeStorageRepository>() { // from class: com.reown.sign.di.StorageModuleKt.storageModule.1.13
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final LinkModeStorageRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new LinkModeStorageRepository((LinkModeDaoQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LinkModeDaoQueries.class), null, null));
                }
            }, kind, yDY.AhwBna()));
            c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS13);
            if (c59991ztT.OLrzqt()) {
                c59991ztT.KWHzl(c59990ztS13);
            }
            new C59976ztE(c59991ztT, c59990ztS13);
        }

        public static final SignDatabase invoke$createSignDB(C60060zuj c60060zuj, String str) {
            SignDatabase.Companion companion = SignDatabase.Companion;
            PackageManager packageManager = (PackageManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PackageManager.class), C60058zuh.AEQbTJ(str), null);
            AndroidCommonDITags androidCommonDITags = AndroidCommonDITags.COLUMN_ADAPTER_LIST;
            NamespaceDao.Adapter adapter = new NamespaceDao.Adapter((LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null), (LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null), (LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null), (LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null));
            TempNamespaceDao.Adapter adapter2 = new TempNamespaceDao.Adapter((LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null), (LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null), (LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null), (LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null));
            ProposalNamespaceDao.Adapter adapter3 = new ProposalNamespaceDao.Adapter((LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null), (LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null), (LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null));
            OptionalNamespaceDao.Adapter adapter4 = new OptionalNamespaceDao.Adapter((LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null), (LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null), (LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null));
            AndroidCommonDITags androidCommonDITags2 = AndroidCommonDITags.COLUMN_ADAPTER_MAP;
            return companion.invoke(packageManager, adapter, adapter4, new ProposalDao.Adapter((LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags), null), (LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags2), null)), adapter3, new SessionDao.Adapter((LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(androidCommonDITags2), null), (LoaderManager) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(LoaderManager.class), C60058zuh.OLrzqt(AndroidCommonDITags.COLUMN_ADAPTER_TRANSPORT_TYPE), null)), adapter2);
        }
    }

    public static final /* synthetic */ C59991ztT storageModule(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C60064zun.module$default(false, new AnonymousClass1(str), 1, null);
    }
}
