package com.reown.sign.storage.authenticate;

import android.database.sqlite.SQLiteException;
import com.reown.sign.storage.data.dao.authenticatereponse.AuthenticateResponseTopicDaoQueries;
import com.reown.sign.storage.data.dao.authenticatereponse.GetListOfTopics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class AuthenticateResponseTopicRepository {
    public final AuthenticateResponseTopicDaoQueries authenticateResponseTopicDaoQueries;

    public AuthenticateResponseTopicRepository(@NotNull AuthenticateResponseTopicDaoQueries authenticateResponseTopicDaoQueries) {
        Intrinsics.checkNotNullParameter(authenticateResponseTopicDaoQueries, "");
        this.authenticateResponseTopicDaoQueries = authenticateResponseTopicDaoQueries;
    }

    public final /* synthetic */ Object insertOrAbort(String str, String str2, Continuation continuation) throws SQLiteException {
        this.authenticateResponseTopicDaoQueries.insertOrAbort(str, str2);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Object delete(String str, Continuation continuation) throws SQLiteException {
        this.authenticateResponseTopicDaoQueries.deleteByPairingTopic(str);
        return Unit.INSTANCE;
    }

    public final /* synthetic */ Object getResponseTopics(Continuation continuation) throws SQLiteException {
        List<GetListOfTopics> listExecuteAsList = this.authenticateResponseTopicDaoQueries.getListOfTopics().executeAsList();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listExecuteAsList, 10));
        Iterator<T> it = listExecuteAsList.iterator();
        while (it.hasNext()) {
            arrayList.add(((GetListOfTopics) it.next()).getResponseTopic());
        }
        return arrayList;
    }
}
