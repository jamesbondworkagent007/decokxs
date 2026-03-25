package org.spongycastle.util.test;

/* JADX INFO: loaded from: classes25.dex */
public class TestFailedException extends RuntimeException {
    private TestResult _result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TestResult getResult() {
        return this._result;
    }

    public TestFailedException(TestResult testResult) {
        this._result = testResult;
    }
}
