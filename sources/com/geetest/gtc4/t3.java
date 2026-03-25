package com.geetest.gtc4;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes21.dex */
public abstract class t3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void a(final int i, SharedPreferences sharedPreferences) {
        s3 s3Var = new s3() { // from class: com.geetest.gtc4.t3$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.geetest.gtc4.s3
            public final void a(SharedPreferences.Editor editor) {
                editor.putInt("gt_scr_st", i);
            }
        };
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        s3Var.a(editorEdit);
        editorEdit.apply();
    }

    public static void a(SharedPreferences sharedPreferences) {
        s3 s3Var = new s3() { // from class: com.geetest.gtc4.t3$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.geetest.gtc4.s3
            public final void a(SharedPreferences.Editor editor) {
                editor.remove("gt_scr_st");
            }
        };
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        s3Var.a(editorEdit);
        editorEdit.apply();
    }
}
