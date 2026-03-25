package com.amplifyframework.core.model;

import com.amplifyframework.core.model.Model;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface LoadedModelList<M extends Model> extends ModelList<M> {
    List<M> getItems();
}
