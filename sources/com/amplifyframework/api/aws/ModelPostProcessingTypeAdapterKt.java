package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelIdentifier;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelPostProcessingTypeAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Serializable> getSortedIdentifiers(Model model) {
        Serializable serializableResolveIdentifier = model.resolveIdentifier();
        Intrinsics.checkNotNullExpressionValue(serializableResolveIdentifier, "");
        if (!(serializableResolveIdentifier instanceof ModelIdentifier)) {
            return C56402yEa.EZpvd(serializableResolveIdentifier.toString());
        }
        ModelIdentifier modelIdentifier = (ModelIdentifier) serializableResolveIdentifier;
        List listEZpvd = C56402yEa.EZpvd(modelIdentifier.key());
        List<? extends Serializable> listSortedKeys = modelIdentifier.sortedKeys();
        Intrinsics.checkNotNullExpressionValue(listSortedKeys, "");
        return CollectionsKt___CollectionsKt.djBIcL((Collection) listEZpvd, (Iterable) listSortedKeys);
    }
}
