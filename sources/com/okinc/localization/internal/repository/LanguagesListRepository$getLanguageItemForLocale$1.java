package com.okinc.localization.internal.repository;

import com.okinc.localization.bean.LanguageItem;
import com.okinc.localization2.bean.LanguageUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LanguagesListRepository$getLanguageItemForLocale$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LanguagesListRepository this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguagesListRepository$getLanguageItemForLocale$1(LanguagesListRepository languagesListRepository, Continuation<? super LanguagesListRepository$getLanguageItemForLocale$1> continuation) {
        super(continuation);
        this.this$0 = languagesListRepository;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((LanguageUnit) null, (Continuation<? super LanguageItem>) this);
    }
}
