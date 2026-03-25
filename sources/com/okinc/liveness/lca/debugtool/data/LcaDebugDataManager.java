package com.okinc.liveness.lca.debugtool.data;

import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaDebugDataManager {
    public static String error;
    public static String qcScoreResultJson;
    public static LivenessResponse response;
    public static File videoTempFile;
    public static final LcaDebugDataManager INSTANCE = new LcaDebugDataManager();
    public static String requestRawJson = "";
    public static String responseRawJson = "";
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getError() {
        return error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQcScoreResultJson() {
        return qcScoreResultJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestRawJson() {
        return requestRawJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessResponse getResponse() {
        return response;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResponseRawJson() {
        return responseRawJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final File getVideoTempFile() {
        return videoTempFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setError(String str) {
        error = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQcScoreResultJson(String str) {
        qcScoreResultJson = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestRawJson(String str) {
        requestRawJson = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResponse(LivenessResponse livenessResponse) {
        response = livenessResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResponseRawJson(String str) {
        responseRawJson = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVideoTempFile(File file) {
        videoTempFile = file;
    }

    private LcaDebugDataManager() {
    }
}
