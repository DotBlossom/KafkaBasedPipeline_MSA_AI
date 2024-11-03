### 정리용 다이어그램
추후 Backend, Devops, AI 구독자에 각각 필요한 Diagram 제공


![제목 없는 다이어그램 drawio (1)](https://github.com/user-attachments/assets/b1351fdc-c500-4b4d-b38d-e7661b7f5beb)


#### MSA 1차 케이스 분류

![dddd drawio](https://github.com/user-attachments/assets/ef11b990-a548-42af-a516-d223dd64c680)

#### Async Listener - Callable 구조

![defeer drawio](https://github.com/user-attachments/assets/fd8385dc-7c11-475b-ae01-b6f2619a446f)



### 주의사항:
Config 객체를 형성할때, bean annotation을 사용할 필요가없음.
CustonConfig 여러개를 관리하게되면, 상이한 이름이라도, 동일한 config객체로 인식함.


### Test: 서로 다른 팩토리Context객체를 각자 독립적으로 실행가능.
![afaffaafafafaf](https://github.com/user-attachments/assets/9a7d970d-5010-4dbe-913b-74ef06de9bcf)
