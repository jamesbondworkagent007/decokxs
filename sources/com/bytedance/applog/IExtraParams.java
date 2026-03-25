package com.bytedance.applog;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface IExtraParams {
    HashMap<String, String> getExtraParams(@NonNull Level level);
}
