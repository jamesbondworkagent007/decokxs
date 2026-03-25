package com.amplifyframework.api.aws;

import com.amplifyframework.api.ApiCategory;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.Consumer;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ApiQueryKt {
    public static final <R> Object query(@NotNull ApiCategory apiCategory, @NotNull GraphQLRequest<R> graphQLRequest, String str, @NotNull Continuation<? super GraphQLResponse<R>> continuation) throws ApiException {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        if (str != null) {
            apiCategory.query(str, graphQLRequest, new Consumer() { // from class: com.amplifyframework.api.aws.ApiQueryKt$query$2$1
                /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                @Override // com.amplifyframework.core.Consumer
                public final void accept(@NotNull GraphQLResponse<R> graphQLResponse) {
                    Intrinsics.checkNotNullParameter(graphQLResponse, "");
                    Continuation<GraphQLResponse<R>> continuation2 = c56434yFf;
                    Result.Application application = Result.Companion;
                    continuation2.resumeWith(Result.m7377constructorimpl(graphQLResponse));
                }
            }, new Consumer() { // from class: com.amplifyframework.api.aws.ApiQueryKt$query$2$2
                /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                @Override // com.amplifyframework.core.Consumer
                public final void accept(@NotNull ApiException apiException) {
                    Intrinsics.checkNotNullParameter(apiException, "");
                    Continuation<GraphQLResponse<R>> continuation2 = c56434yFf;
                    Result.Application application = Result.Companion;
                    continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(apiException)));
                }
            });
        } else {
            apiCategory.query(graphQLRequest, new Consumer() { // from class: com.amplifyframework.api.aws.ApiQueryKt$query$2$3
                /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                @Override // com.amplifyframework.core.Consumer
                public final void accept(@NotNull GraphQLResponse<R> graphQLResponse) {
                    Intrinsics.checkNotNullParameter(graphQLResponse, "");
                    Continuation<GraphQLResponse<R>> continuation2 = c56434yFf;
                    Result.Application application = Result.Companion;
                    continuation2.resumeWith(Result.m7377constructorimpl(graphQLResponse));
                }
            }, new Consumer() { // from class: com.amplifyframework.api.aws.ApiQueryKt$query$2$4
                /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                @Override // com.amplifyframework.core.Consumer
                public final void accept(@NotNull ApiException apiException) {
                    Intrinsics.checkNotNullParameter(apiException, "");
                    Continuation<GraphQLResponse<R>> continuation2 = c56434yFf;
                    Result.Application application = Result.Companion;
                    continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(apiException)));
                }
            });
        }
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }
}
