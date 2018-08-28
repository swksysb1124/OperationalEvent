# OperationalEvent
本專案收集一些 Android 裝置常見的操作事件處理，包含手勢事件、系統鍵事件、螢幕轉向事件

手勢(Gesture)事件

使用 GestureDetector 物件偵測手勢事件發生，
並實作 GestureDetector.OnGestureListener \ GestureDetector.OnDoubleTapListener 承接事件並處理。

實作事件有：
- 單點擊 (Single Tap)
- 雙點擊 (Double Tap)
- 滑動 (Fling)
- 長按 (Long Press)


系統鍵事件

偵測 Android 裝置的實體按鍵的操作事件

實作事件有：
- Home鍵
- Back鍵
- Volume鍵


螢幕轉向事件

偵測裝置轉向操作事件
