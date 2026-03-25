package com.reown.sign;

import com.reown.sign.sign.SignDatabaseImplKt;
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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56524yIo;
import o.ColorStateList;
import o.ComponentCallbacks2;
import o.IntentSender;
import o.PackageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface SignDatabase extends ComponentCallbacks2 {
    public static final Companion Companion = Companion.$$INSTANCE;

    AuthenticateResponseTopicDaoQueries getAuthenticateResponseTopicDaoQueries();

    LinkModeDaoQueries getLinkModeDaoQueries();

    NamespaceDaoQueries getNamespaceDaoQueries();

    OptionalNamespaceDaoQueries getOptionalNamespaceDaoQueries();

    ProposalDaoQueries getProposalDaoQueries();

    ProposalNamespaceDaoQueries getProposalNamespaceDaoQueries();

    SessionDaoQueries getSessionDaoQueries();

    TempNamespaceDaoQueries getTempNamespaceDaoQueries();

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final ColorStateList<IntentSender.Activity<Unit>> getSchema() {
            return SignDatabaseImplKt.getSchema(C56524yIo.AEQbTJ(SignDatabase.class));
        }

        public final SignDatabase invoke(@NotNull PackageManager packageManager, @NotNull NamespaceDao.Adapter adapter, @NotNull OptionalNamespaceDao.Adapter adapter2, @NotNull ProposalDao.Adapter adapter3, @NotNull ProposalNamespaceDao.Adapter adapter4, @NotNull SessionDao.Adapter adapter5, @NotNull TempNamespaceDao.Adapter adapter6) {
            Intrinsics.checkNotNullParameter(packageManager, "");
            Intrinsics.checkNotNullParameter(adapter, "");
            Intrinsics.checkNotNullParameter(adapter2, "");
            Intrinsics.checkNotNullParameter(adapter3, "");
            Intrinsics.checkNotNullParameter(adapter4, "");
            Intrinsics.checkNotNullParameter(adapter5, "");
            Intrinsics.checkNotNullParameter(adapter6, "");
            return SignDatabaseImplKt.newInstance(C56524yIo.AEQbTJ(SignDatabase.class), packageManager, adapter, adapter2, adapter3, adapter4, adapter5, adapter6);
        }
    }
}
